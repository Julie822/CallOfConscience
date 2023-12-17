package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Scene7_3 extends Scene7_1{
	JLabel label = new JLabel("Scene 7-3");
	
	String text1 = "Let’s continue on the argument of costs. ";
	String text2 = "Sure";
	String text3 = "Based on the current judgement to set aside the previous judge’s finding on fraudulent misrepresentation for the purpose of deceit, ";
	String text4 = "I would order the defendant to pay the plaintiff 60% of the costs of this appeal. ";
	String text5 = "Even though the plaintiff is still the successful party in proving the act of misrepresentation by the Defendant,  ";
	String text6 = "it is to note that the retraction of the previous judgements from fraudulent to negligent misrepresentation would make the plaintiff party responsible for the damages, ";
	String text7 = "which in this case, I would surmise to be 60% of the overall costs relevant to the current app- ";
	String text8 = "Wait what’s happening? ...... ";
	String text9 = "I’m losing consciousness agai- ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	SlowTextPrinting slow6 = new SlowTextPrinting(layeredPane, text6);
	SlowTextPrinting slow7 = new SlowTextPrinting(layeredPane, text7);
	greyTextPrinting slow8 = new greyTextPrinting(layeredPane, text8);
	greyTextPrinting slow9 = new greyTextPrinting(layeredPane, text9);
	
	Integer btn_count = 2;

	public Scene7_3() {
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
	    
	    kun.setBounds(300, 550, 1000, 50);
	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
	    kun.setFont(txt);
	    kun.setForeground(Color.BLACK);
	    layeredPane.add(kun, Integer.valueOf(5));
		Image_label12.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label12, Integer.valueOf(10));
        
        slow1.startPrinting();
	}
	
	public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == next) {
        	if (btn_count == 2) {
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(slow1.getLabel());
        		layeredPane.repaint();
        		slow2.startPrinting();
        	}
        	if (btn_count == 3) {
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
                slow3.startPrinting();
        	}
        	if (btn_count == 4) {
        		layeredPane.remove(slow3);
        		slow4.startPrinting();
        	}
        	if (btn_count == 5) {
        		layeredPane.remove(slow4);
        		slow5.startPrinting();
        	}
        	if (btn_count == 6) {
        		layeredPane.remove(slow5);
        		slow6.startPrinting();
        	}
        	if (btn_count == 7) {
        		layeredPane.remove(slow6);
        		slow7.startPrinting();
        	}
        	if (btn_count == 8) {
        		layeredPane.remove(slow7.getLabel());
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.repaint();
        		slow8.startPrinting();
        	}
        	if (btn_count == 9) {
        		layeredPane.remove(slow8.getLabel());
        		slow9.startPrinting();
        	}
        	if (btn_count == 10) {
        		//proceed to Ending 2
        	}
        }
	}

}
