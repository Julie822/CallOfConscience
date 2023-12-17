package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class greyTextPrinting extends JPanel{
	private JLabel label;
    private String textToPrint;
    private int currentIndex = 0;
    private Timer timer;
    private boolean htmlTagsAdded = false;

	public greyTextPrinting(JLayeredPane layeredPane, String textToPrint) {
		this.textToPrint = textToPrint;
        label = new JLabel();
        label.setBounds(130, 580, 700, 200);
        Font customFont = new Font("Monospaced", Font.ITALIC, 18);
        label.setFont(customFont);
        label.setForeground(Color.GRAY);
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
