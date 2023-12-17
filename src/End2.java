package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class End2 extends Scene7_3{
	JLabel label = new JLabel("Ending 2");
	
	String text1 = "Why is everything so dark.. I’m so hungry, is it lunch time yet?... ";
	String text2 = "Man, I feel so numb and weak... oh wait, where’s Justice Ku- ";
	String text3 = "Hey... hey! Are you okay? ";
	String text4 = "Uhh.. HUH.. JUSTICE KUUUUN! ";
	String text5 = "I’m not Justice Kun, but they must've been quite a hottie for you to keep yelling her name for the last 5 minutes. Well, good morning sleepy head! Did you have fun, Judge Papadomian? We just brought you back. ";
	String text6 = "What time is this.... my whole body hurts... ";
	String text7 = "Today is the 15th of March 2157!  You were in there for the whole day, no wonder you feel numb! It’ll wear off soon, don’t worry. ";
	String text8 = "Do you remember what you’re here for? ";
	String text9 = "…uhh a one-day judge simulator game? ";
	String text10 = "No, silly! You were on a very special mission to retrieve past law from the year 2016 in our Mementex Program! ";
	String text11 = "Well done! Your contribution is much appreciated, and I am sure that our current society will benefit from our first ever finding of a completed court judgment data. ";
	String text12 = "Is that it? I looked out the carbonized window of the laboratory. What is the meaning of law? What is society without a law? What is the relatinoship between man and law? ...... ";
	String text13 = "[END] ";

	greyTextPrinting slow1 = new greyTextPrinting(layeredPane, text1);
	greyTextPrinting slow2 = new greyTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	SlowTextPrinting slow6 = new SlowTextPrinting(layeredPane, text6);
	SlowTextPrinting slow7 = new SlowTextPrinting(layeredPane, text7);
	SlowTextPrinting slow8 = new SlowTextPrinting(layeredPane, text8);
	SlowTextPrinting slow9 = new SlowTextPrinting(layeredPane, text9);
	SlowTextPrinting slow10 = new SlowTextPrinting(layeredPane, text10);
	SlowTextPrinting slow11 = new SlowTextPrinting(layeredPane, text11);
	greyTextPrinting slow12 = new greyTextPrinting(layeredPane, text12);
	greyTextPrinting slow13 = new greyTextPrinting(layeredPane, text13);
	
	Integer btn_count = 2;
	
	public End2() {
		super();
	}
	
	public void start_Scene() {
		layeredPane.remove(Image_label1);
		layeredPane.remove(Image_label4);
		layeredPane.remove(next);
	        
		label.setBounds(100, 50, 1000, 50);
	    Font titleFont = new Font("Monospaced", Font.ITALIC, 24);
	    label.setFont(titleFont);
	    label.setForeground(Color.WHITE);

	    // Remove existing components
	    layeredPane.remove(logo_label);
	    layeredPane.remove(start);
	    
	    layeredPane.revalidate();
	    layeredPane.repaint();
	    
	    next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(15));
	    next.addActionListener(this);
	    
	    Image_label1.setBounds(-245, -170, 1920, 1080);
        layeredPane.add(Image_label1, Integer.valueOf(0));
        Image_label4.setBounds(-450, 120, 1920, 1080);
        layeredPane.add(Image_label4, Integer.valueOf(3));

	    // Add new components
	    layeredPane.add(label, Integer.valueOf(3));
        
        slow1.startPrinting();
	}
	
	public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == next) {
        	if (btn_count == 2) {
        		layeredPane.remove(slow1.getLabel());
        		slow2.startPrinting();
        	}
        	if (btn_count == 3) {
        		layeredPane.remove(slow2.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    teresa.setFont(txt);
        	    teresa.setForeground(Color.BLACK);
        	    layeredPane.add(teresa, Integer.valueOf(5));
        		Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(10));
                slow3.startPrinting();
        	}
        	if (btn_count == 4) {
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.remove(slow3.getLabel());
        		layeredPane.repaint();
        		slow4.startPrinting();
        	}
        	if (btn_count == 5) {
        		layeredPane.remove(slow4.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    teresa.setFont(txt);
        	    teresa.setForeground(Color.BLACK);
        	    layeredPane.add(teresa, Integer.valueOf(5));
        		Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(10));
                slow5.startPrinting();
        	}
        	if (btn_count == 6) {
        		layeredPane.remove(slow5.getLabel());
        		slow6.startPrinting();
        	}
        	if (btn_count == 7) {
        		layeredPane.remove(slow6.getLabel());
        		slow7.startPrinting();
        	}
        	if (btn_count == 8) {
        		layeredPane.remove(slow7.getLabel());
        		slow8.startPrinting();
        	}
        	if (btn_count == 9) {
        		layeredPane.remove(slow8.getLabel());
        		slow9.startPrinting();
        	}
        	if (btn_count == 10) {
        		layeredPane.remove(slow9.getLabel());
        		slow10.startPrinting();
        	}
        	if (btn_count == 11) {
        		layeredPane.remove(slow10.getLabel());
        		slow11.startPrinting();
        	}
        	if (btn_count == 12) {
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.remove(slow12.getLabel());
        		slow13.startPrinting();
        	}
        	btn_count++;
        }
	}

}
