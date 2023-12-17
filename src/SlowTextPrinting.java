package LawGame;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlowTextPrinting extends JPanel {
    private JLabel label;
    private String textToPrint;
    private int currentIndex = 0;
    private Timer timer;
    private boolean htmlTagsAdded = false;

    public SlowTextPrinting(JLayeredPane layeredPane, String textToPrint) {
        this.textToPrint = textToPrint;
        label = new JLabel();
        label.setBounds(130, 580, 700, 200);
        Font customFont = new Font("Monospaced", Font.PLAIN, 18);
        label.setFont(customFont);
        label.setForeground(Color.BLACK);
        layeredPane.add(label, Integer.valueOf(5));

        timer = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addHtmlTags();

                if (currentIndex < textToPrint.length()) {
                    char currentChar = textToPrint.charAt(currentIndex);

                    if (currentChar == '\n') {
                        label.setText(label.getText() + "<br>");
                    } else {
                        label.setText(label.getText() + currentChar);
                    }

                    currentIndex++;
                } else {
                    timer.stop();
                    closeHtmlTags();
                }
            }
        });
    }

    public void startPrinting() {
        timer.start();
    }

    private void addHtmlTags() {
        if (!htmlTagsAdded) {
            label.setText("<html>");
            htmlTagsAdded = true;
        }
    }

    private void closeHtmlTags() {
        if (htmlTagsAdded) {
            label.setText(label.getText() + "</html>");
            htmlTagsAdded = false;
        }
    }

    // Expose the label if needed
    public JLabel getLabel() {
        return label;
    }
}
