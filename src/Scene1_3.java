package LawGame;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Scene1_3 extends Scene1_2{
	JLabel label1_3 = new JLabel("Scene 1-3");
	
	String text1 = "I try to make myself comfortable on the chair. It is made of nano-plastic materials, or something similar. Numerous wirings and chilling adhesive electro-nodes are being installed all over my skin. ";
	String text2 = "You’re doing a good job so far. Let me just put these two big boys around your head. ";
	String text3 = "Teresa attaches two metallic cylinders to the areas just below my ears. I can hear a quiet rhythmic pulse of whirling sounds with minor vibrations, as if they were calming breathing and resting on the edge of my skull. ";
	String text4 = "Okay. Now we’ll conduct a simple preliminary test: count the number of pulses you hear from the device from one. ";
	String text5 = "Yeah. One, two...... three...... free....... ";
	String text6 = "Why do my eyes suddenly feel so heavy? My consciousness, it’s trying to escape from me into a very, very, far place...... Wait...... is it already starting......";
	
	greyTextPrinting slow1 = new greyTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	greyTextPrinting slow6 = new greyTextPrinting(layeredPane, text6);
	
	Scene2_1 scene2_1;

	public Scene1_3() {
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
        label1_3.setBounds(100, 50, 1000, 50);
        Font titleFont = new Font("Monospaced", Font.ITALIC, 24);
        label1_3.setFont(titleFont);
        label1_3.setForeground(Color.BLACK);
        layeredPane.add(label1_3, Integer.valueOf(3));
        
        layeredPane.revalidate();
        layeredPane.repaint();

        // Adjusted bounds and layer index for Image_label4
        Image_label4.setBounds(-450, 120, 1920, 1080);
        layeredPane.add(Image_label4, Integer.valueOf(4));

        next.setBounds(950, 700, 100, 50);
        layeredPane.add(next, Integer.valueOf(2));
        next.addActionListener(this);
        
        player.setBounds(300, 550, 1000, 50);
        Font txt = new Font("Monospaced", Font.ITALIC, 24);
        player.setFont(txt);
        player.setForeground(Color.BLACK);
        layeredPane.add(player, Integer.valueOf(5));

        slow1.startPrinting();
    } 

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            if (btn_count == 2) {
            	layeredPane.remove(player);
                layeredPane.remove(slow1.getLabel());
                teresa.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                teresa.setFont(txt);
                teresa.setForeground(Color.BLACK);
                layeredPane.add(teresa, Integer.valueOf(5));
                Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(5));
                slow2.startPrinting();
            }
            if (btn_count == 3) {
            	layeredPane.remove(teresa);
            	layeredPane.remove(Image_label6);
            	layeredPane.repaint();
                layeredPane.remove(slow2.getLabel());
                slow3.startPrinting();
            }
            if (btn_count == 4) {
            	layeredPane.remove(slow3.getLabel());
            	teresa.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                teresa.setFont(txt);
                teresa.setForeground(Color.BLACK);
                layeredPane.add(teresa, Integer.valueOf(5));
                Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(5));
                slow4.startPrinting();
            }
            if (btn_count == 5) {
            	layeredPane.remove(slow4.getLabel());
            	layeredPane.remove(teresa);
            	layeredPane.remove(Image_label6);
            	layeredPane.repaint();
            	player.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                player.setFont(txt);
                player.setForeground(Color.BLACK);
                layeredPane.add(player, Integer.valueOf(5));
                slow5.startPrinting();
            }
            if (btn_count == 6) {
            	layeredPane.remove(player);
                layeredPane.remove(slow5.getLabel());
                layeredPane.repaint();
                slow6.startPrinting();
            }
            if (btn_count == 7) {
            	scene2_1 = new Scene2_1();
                scene2_1.startScene();
                layeredPane.remove(slow6.getLabel());
                layeredPane.remove(label1_3);
            }
            btn_count++;
        }
    }
}
