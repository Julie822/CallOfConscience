package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene3_2 extends Scene3_1{
	JLabel label = new JLabel("Scene 3-2");
	JLabel wynn = new JLabel("Wynn");
	
	String text1 = "Yes, your honour. I am Anton Wynn representing the plaintiff, Guy Lee, for your information. ";
	String text2 = "In the present case, the plaintiff paid over $1 million for seven lots of goods described as “rough diamond stones” at an auction. ";
	String text3 = "The auction was conducted at a Tsim Sha Tsui hotel to liquidate the assets \n"
			+ "of defendant company. ";
	String text4 = "Before bidding commenced, the auctioneer allowed potential bidders five minutes to read the catalogue, the Notice to Bidders and Conditions of Sale. He also went through the main terms and conditions which could possibly restrict liability. ";
	String text5 = "Before commencing the bidding for each item, a picture of the item was \n"
			+ "projected on the screen and the auctioneer gave a short description.  ";
	String text6 = "The items purchased by plaintiff were described as “rough diamond stones” and their reserve prices turned out to be around 60 to 70% of the final bid prices. ";
	String text7 = "I would like to further add that the items were on display but were placed inside two layers of sealed transparent plastic bags which made visual inspection impossible. Plaintiff asked to examine the stones using a diamond testing pen he brought along but was refused permission. ";
	String text8 = "The items purchased were later found to be cubic zirconia. Thus, the plaintiff is suing to recover the purchase price. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	SlowTextPrinting slow6 = new SlowTextPrinting(layeredPane, text6);
	SlowTextPrinting slow7 = new SlowTextPrinting(layeredPane, text7);
	SlowTextPrinting slow8 = new SlowTextPrinting(layeredPane, text8);
	
	JButton option1 = new JButton("Very well. What should be the next step, then?");
	
	Scene3_3 scene3_3;
	
	public Scene3_2() {
		super();
	}
	
	public void startScene() {
		label.setBounds(100, 50, 1000, 50);
	    Font titleFont = new Font("Monospaced", Font.ITALIC, 24);
	    label.setFont(titleFont);
	    label.setForeground(Color.BLACK);

	    // Remove existing components
	    layeredPane.remove(logo_label);
	    layeredPane.remove(next);
	    layeredPane.remove(start);

	    // Add new components
	    layeredPane.add(label, Integer.valueOf(3));
	    
	    next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(6));
	    next.addActionListener(this);
	    
	    unknown_lawyer.setBounds(300, 550, 1000, 50);
	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
	    unknown_lawyer.setFont(txt);
	    unknown_lawyer.setForeground(Color.BLACK);
	    layeredPane.add(unknown_lawyer, Integer.valueOf(5));
	    
	    Image_label11.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label11, Integer.valueOf(10));
        
        Image_label7.setBounds(-200, 10, 800, 1000);
	    layeredPane.add(Image_label7, Integer.valueOf(3));
	    Image_label8.setBounds(200, 10, 800, 1000);
	    layeredPane.add(Image_label8, Integer.valueOf(3));
	    Image_label13.setBounds(600, 10, 800, 1000);
        layeredPane.add(Image_label13, Integer.valueOf(3));
	    
	    slow1.startPrinting();
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
        	if(btn_count == 2) {
        		layeredPane.remove(slow1.getLabel());
        		layeredPane.remove(unknown_lawyer);
        		layeredPane.remove(Image_label11);
        		layeredPane.repaint();
        		wynn.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    wynn.setFont(txt);
        	    wynn.setForeground(Color.BLACK);
        	    layeredPane.add(wynn, Integer.valueOf(5));
        		Image_label10.setBounds(850, 10, 800, 1000);
	            layeredPane.add(Image_label10, Integer.valueOf(10));
        		slow2.startPrinting();
        	}
        	if (btn_count == 3) {
        		layeredPane.remove(slow2.getLabel());
        		layeredPane.remove(Image_label7);
        		layeredPane.remove(Image_label8);
        		layeredPane.remove(Image_label13);
        		layeredPane.repaint();
        		slow3.startPrinting();
        	}
        	if (btn_count == 4) {
        		layeredPane.remove(slow3.getLabel());
        		slow4.startPrinting();
        	}
        	if (btn_count == 5) {
        		layeredPane.remove(slow4.getLabel());
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
        		layeredPane.remove(next);
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		option1.setBounds(120, 650, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 3-3
        	scene3_3 = new Scene3_3();
        	scene3_3.startScene();
        	layeredPane.remove(option1);
        	layeredPane.remove(label);
        	layeredPane.revalidate();
        	layeredPane.repaint();
        }
	}
}
