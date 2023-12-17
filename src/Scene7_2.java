package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene7_2 extends Scene7_1{
	JLabel label = new JLabel("Scene 7-2");
	
	String text1 = "Very well then. Very we- Ver- V- V...... We...... ";
	String text2 = "There is an audible vibration crashing underneath my desk, almost as if there was a train roaring pass the courtroom. Was that an earthquake? No...... There is something happening within my mind, my memories. ";
	String text3 = "Lex! There are huge instability readings coming from your head. Syntax errors, confusing data...... There is something wrong! ";
	String text4 = "Yeah? I know there’s something wrong! What is it then? ";
	String text5 = "Ah, I got it! The choices you made must have been different to the choices actually made in the past. There is a disruption in the memory flow, causing everything to glitch, because there is no memory of this actually happening in the past. ";
	String text6 = "What should I do then? ";
	String text7 = "You’ll have to pull the timeline back to its original place! Ask Justice Kun now to know how they actually adjudicated it back in 2016! Otherwise, this whole memory sequence may collapse and we won’t be able to pull you back out. ";
	String text8 = "You’ll be trapped in your own mind for the rest of your biological life! ";
	String text9 = "NO! Okay, okay...... Let me talk to her. ";
	String text10 = "Justice Kun. I would really appreciate your input on this case.";
	String text11 = "The trembling vibrations suddenly stopped. Nothing changed in the courtroom, but it seems everything has already changed. ";
	String text12 = "Hmm. I’m glad you asked for my opinion, as I was unsure about some of the decisions you have made, to be perfectly frank. ";
	String text13 = "In my opinion: the evidential threshold for fraudulent misrepresentation is considerably high.  ";
	String text14 = "Think this way: the law wishes to provide extra support and remedies to victims of a scam. But we will need a lot of evidence to prove the party making the false claims are actually being scammers. ";
	String text15 = "In this case, from all the evidence and arguments the counsels have provided, that threshold has not been surpassed. ";
	String text16 = "However, for negligent misrepresentation, there is a considerable lower threshold. The law wishes for seller s making the representations to to their job properly. ";
	String text17 = "This includes asking for professional opinion when needed, ensuring the information you provide to buyers is accurate, et cetera. ";
	String texy18 = "And in this regards, I think the Defendants were indeed being negligent when they allowed theses misrepresentations to be made. ";
	String text19 = "Ahh. I see. So you mean the right judgment should be there being no fraudulent misrepresentation but that negligent misrepresentation does exist here.";
	String text20 = "Rather than saying what is the right judgment, I would say that is the more correct way of applying the law in this scenario. ";
	String text21 = "After all, we are only human and there would be no way of reaching the absolute truth of a case. We can only use our best effort to ensure a fair trial and full assessment of all the relevant evidence have been made. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	greyTextPrinting slow2 = new greyTextPrinting(layeredPane, text2);
	greyTextPrinting slow3 = new greyTextPrinting(layeredPane, text3);
	greyTextPrinting slow4 = new greyTextPrinting(layeredPane, text4);
	greyTextPrinting slow5 = new greyTextPrinting(layeredPane, text5);
	greyTextPrinting slow6 = new greyTextPrinting(layeredPane, text6);
	greyTextPrinting slow7 = new greyTextPrinting(layeredPane, text7);
	greyTextPrinting slow8 = new greyTextPrinting(layeredPane, text8);
	greyTextPrinting slow9 = new greyTextPrinting(layeredPane, text9);
	SlowTextPrinting slow10 = new SlowTextPrinting(layeredPane, text10);
	SlowTextPrinting slow11 = new SlowTextPrinting(layeredPane, text11);
	greyTextPrinting slow12 = new greyTextPrinting(layeredPane, text12);
	SlowTextPrinting slow13 = new SlowTextPrinting(layeredPane, text13);
	greyTextPrinting slow14 = new greyTextPrinting(layeredPane, text14);
	SlowTextPrinting slow15 = new SlowTextPrinting(layeredPane, text15);
	greyTextPrinting slow16 = new greyTextPrinting(layeredPane, text16);
	SlowTextPrinting slow17 = new SlowTextPrinting(layeredPane, text17);
	greyTextPrinting slow18 = new greyTextPrinting(layeredPane, text18);
	greyTextPrinting slow19 = new greyTextPrinting(layeredPane, text19);
	SlowTextPrinting slow20 = new SlowTextPrinting(layeredPane, text20);
	SlowTextPrinting slow21 = new SlowTextPrinting(layeredPane, text21);
	
	JButton option1 = new JButton("Thank you for letting me know of this principle, Justice Kun.");
	
	Integer btn_count = 2;
	
	Scene7_3 scene7_3;

	public Scene7_2() {
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
        		layeredPane.remove(slow3.getLabel());
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
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
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
        		slow6.startPrinting();
        	}
        	if (btn_count == 7) {
        		layeredPane.remove(slow6.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    teresa.setFont(txt);
        	    teresa.setForeground(Color.BLACK);
        	    layeredPane.add(teresa, Integer.valueOf(5));
        		Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(10));
                slow7.startPrinting();
        	}
        	if (btn_count == 8) {
        		layeredPane.remove(slow7.getLabel());
        		slow8.startPrinting();
        	}
        	if (btn_count == 9) {
        		layeredPane.remove(slow8.getLabel());
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
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
        		layeredPane.remove(slow11.getLabel());
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
                slow12.startPrinting();
        	}
        	if (btn_count == 13) {
        		layeredPane.remove(slow12);
        		slow13.startPrinting();
        	}
        	if (btn_count == 14) {
        		layeredPane.remove(slow13);
        		slow14.startPrinting();
        	}
        	if (btn_count == 15) {
        		layeredPane.remove(slow14);
        		slow15.startPrinting();
        	}
        	if (btn_count == 16) {
        		layeredPane.remove(slow15);
        		slow16.startPrinting();
        	}
        	if (btn_count == 17) {
        		layeredPane.remove(slow1);
        		slow17.startPrinting();
        	}
        	if (btn_count == 18) {
        		layeredPane.remove(slow17);
        		slow18.startPrinting();
        	}
        	if (btn_count == 19) {
        		layeredPane.remove(slow18);
        		slow19.startPrinting();
        	}
        	if (btn_count == 20) {
        		layeredPane.remove(slow19);
        		slow20.startPrinting();
        	}
        	if (btn_count == 21) {
        		layeredPane.remove(slow20);
        		slow21.startPrinting();
        	}
        	if (btn_count == 22) {
        		layeredPane.remove(slow21.getLabel());
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(next);
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 7-3
        	scene7_3 = new Scene7_3();
        	scene7_3.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(label);
        }
	}

}
