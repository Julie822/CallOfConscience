package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene1_2 extends Scene1_1{
    JLabel label1_2 = new JLabel("Scene 1-2");
    JLabel player = new JLabel("Player");

    String text1 = "Good question! You must know that during World War 4, our computer systems were gravely damaged by hackers and the database archives were mostly corrupted beyond repair.  ";
    String text2 = "The case judgment we have at hand here, is part of the only legal documents we possess right now, not to mention the judgment itself is also incomplete. ";
    String text3 = "We intend to utilize our bio-tech advancements nowadays to recover legal doctrines from the past, in order to refill the massive gap in law history we have as of now. You, Mr. Law, will be a vital component in this effort. ";

    SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
    SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
    SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);

    JButton option4 = new JButton("I’m up for the task. Plug me in.");
    JButton option5 = new JButton("I refuse to participate in this non-sense. I’ll be leaving now. Goodbye. ");

    Integer btn_count = 2;
    
    Scene1_3 scene1_3;

    public Scene1_2() {
        super();
    }

    public void startScene() {
        // Call the startScene of the superclass to ensure base components are added
        
    	layeredPane.remove(logo_label);
        layeredPane.remove(start);
        layeredPane.remove(next);
        
        layeredPane.revalidate();
        layeredPane.repaint();

        // Additional components specific to Scene1_2
        label1_2.setBounds(100, 50, 1000, 50);
        Font titleFont = new Font("Monospaced", Font.ITALIC, 24);
        label1_2.setFont(titleFont);
        label1_2.setForeground(Color.BLACK);
        layeredPane.add(label1_2, Integer.valueOf(3));
        
        layeredPane.revalidate();
        layeredPane.repaint();

        Image_label4.setBounds(-450, 120, 1920, 1080);
        layeredPane.add(Image_label4, Integer.valueOf(3)); 

        next.setBounds(950, 700, 100, 50);
        layeredPane.add(next, Integer.valueOf(3));
        next.addActionListener(this);
        
        teresa.setBounds(300, 550, 1000, 50);
        Font txt = new Font("Monospaced", Font.ITALIC, 24);
        teresa.setFont(txt);
        teresa.setForeground(Color.BLACK);
        layeredPane.add(teresa, Integer.valueOf(4));
        
        Image_label6.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label6, Integer.valueOf(5));

        slow1.startPrinting();
    } 

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            if (btn_count == 2) {
                layeredPane.remove(slow1.getLabel());
                slow2.startPrinting();
            }
            if (btn_count == 3) {
                layeredPane.remove(slow2.getLabel());
                slow3.startPrinting();
            }
            if (btn_count == 4) {
                layeredPane.remove(teresa);
                layeredPane.remove(next);
                layeredPane.remove(slow3.getLabel());
                layeredPane.remove(Image_label6);
                layeredPane.revalidate();
                layeredPane.repaint();
                player.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                player.setFont(txt);
                player.setForeground(Color.BLACK);
                layeredPane.add(player, Integer.valueOf(4));
                option4.setBounds(120, 620, 700, 50);
                layeredPane.add(option4, Integer.valueOf(4));
                option4.addActionListener(this);
                option5.setBounds(120, 680, 700, 50);
                layeredPane.add(option5, Integer.valueOf(4));
                option5.addActionListener(this);
            }
            btn_count++;
        }
        if (e.getSource() == option4) {
        	//proceed to Scene 1-3
        	scene1_3 = new Scene1_3();
        	scene1_3.startScene();
        	layeredPane.remove(option4);
        	layeredPane.remove(option5);
        	layeredPane.remove(player);
        	layeredPane.remove(label1_2);
        	layeredPane.remove(Image_label6);
        }
        if (e.getSource() == option4) {
        	//proceed to Ending 1
        	layeredPane.remove(option4);
        	layeredPane.remove(option5);
        	layeredPane.remove(player);
        	layeredPane.remove(label1_2);
        	layeredPane.remove(Image_label6);
        }
    }
}
