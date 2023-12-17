package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene3_3 extends Scene3_2{
	JLabel label = new JLabel("Scene 3-3");
	JLabel kun = new JLabel("Justice Kun");
	
	String text1 = "Your honour, I have also submitted a fact summary note for further review purposes.  ";
	String text2 = "Now, I believe it would be crucial to mention the major areas of contention in this case, in other words, what are the two parties arguing about. ";
	String text3 = "This case has already gone through the Court of First Instance (CFI). The plaintiff’s claim is to retrieve the purchase price of $1,050,000 he used to buy the stones at the auction. ";
	String text4 = "The judge in the Court of First Instance decided the case in favour of the plaintiff and awarded the money damages he claimed. ";
	String text5 = "However, the defendants have decided to appeal the decisions made in the lower court to the Court of Appeal, the court we are in right now.  ";
	String text6 = "Defendant counsel, what are the issues that you are raising?";
	String text7 = "Your honour, we are raising 4 issues. ";
	String text8 = "One, regarding the claim in fraudulent misrepresentation: whether there was actual knowledge of the falsehood of the stones; ";
	String text9 = "Two, regarding the claim in fraudulent misrepresentation: whether there was recklessness as to the falsehood; ";
	String text10 = "Three, whether the claim in negligent misrepresentation is valid; ";
	String text11 = "Finally, four, whether the claim in the contractual provisions is valid. ";
	String text12 = "Woah woah woah. What are they saying now? Fraud representation? Negligent? Recklessness? Teresa, any help? ";
	String text13 = "Aye, aye. This is your brain speaking. Beep-boop beep-boop. ";
	String text14 = "Hey. Don’t mess around now. They’re waiting for me to say something! How am I supposed to judge the case without knowing these terms? ";
	String text15 = "Relax Lex! Don’t get intimidated by these scary-looking words. Your mission here is to decipher as much legal knowledge from the past as you can. So just take things one-at-a-time, think through the issues separately, and try to solve this complex puzzle! ";
	String text16 = "Okay, okay. Jeez...... I’m starting to regret getting into this. How am I supposed to comb through all of these different facts and legal topics? Who do these lab people think I am...... ";
	String text17 = "Hey, I’m still here! Are you giving up already? ";
	String text18 = "Stop stalking my thoughts, Teresa! ";
	String text19 = "The usually solemn-looking Justice Kun turned her head towards me. I saw a faint layer of confusion and concern on her face. ";
	String text20 = "Justice Papadoumian. Are you feeling under the weather today? Should we adjourn today’s court? ";
	String text21 = "I understand. Remember to get enough rest. Plaintiff counsel, you may continue.";
	String text22 = "Of course your honour. Allow me to start the discussion on fraudulent misrepresentation. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
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
	SlowTextPrinting slow13 = new SlowTextPrinting(layeredPane, text13);
	greyTextPrinting slow14 = new greyTextPrinting(layeredPane, text14);
	SlowTextPrinting slow15 = new SlowTextPrinting(layeredPane, text15);
	greyTextPrinting slow16 = new greyTextPrinting(layeredPane, text16);
	SlowTextPrinting slow17 = new SlowTextPrinting(layeredPane, text17);
	greyTextPrinting slow18 = new greyTextPrinting(layeredPane, text18);
	greyTextPrinting slow19 = new greyTextPrinting(layeredPane, text19);
	SlowTextPrinting slow20 = new SlowTextPrinting(layeredPane, text20);
	SlowTextPrinting slow21 = new SlowTextPrinting(layeredPane, text21);
	SlowTextPrinting slow22 = new SlowTextPrinting(layeredPane, text22);
	
	JButton option1 = new JButton("<html><center>*Clear throat* Yes. Let’s start with the discussion of the first issue. What is it again? Fraudulent knowledge or something?</center></html>");
	JButton option2 = new JButton("I’ve heard enough. Fellow judges, let’s give the final judgment now?");
	JButton option3 = new JButton("No, I was just focusing hard on our first issue at hand! ");
	JButton option4 = new JButton("I am fine, please continue. ");
	JButton option5 = new JButton("No, I just spent some time preparing for the case last night and had a little less sleep, don’t mind me. ");
	
	
	Integer btn_count = 2;
	
	Scene4_1 scene4_1;

	public Scene3_3() {
		super();
	}
	
	public void startScene() {
		label.setBounds(100, 50, 1000, 50);
	    Font titleFont = new Font("Monospaced", Font.ITALIC, 24);
	    label.setFont(titleFont);
	    label.setForeground(Color.BLACK);

	    // Remove existing components
	    layeredPane.remove(logo_label);
	    layeredPane.remove(start);
	    layeredPane.remove(next);
	    
	    layeredPane.revalidate();
	    layeredPane.repaint();

	    // Add new components
	    layeredPane.add(label, Integer.valueOf(3));
	    
	    next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(6));
	    next.addActionListener(this);
	    
	    wynn.setBounds(300, 550, 1000, 50);
	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
	    wynn.setFont(txt);
	    wynn.setForeground(Color.BLACK);
	    layeredPane.add(wynn, Integer.valueOf(5));
		Image_label10.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label10, Integer.valueOf(10));
	    
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
        		layeredPane.remove(slow3.getLabel());
        		slow4.startPrinting();
        	}
        	if (btn_count == 5) {
        		layeredPane.remove(slow4.getLabel());
        		slow5.startPrinting();
        	}
        	if (btn_count == 6) {
        		layeredPane.remove(slow5.getLabel());
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.repaint();
        		slow6.startPrinting();
        	}
        	if (btn_count == 7) {
        		layeredPane.remove(slow6.getLabel());
        		cinders.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    cinders.setFont(txt);
        	    cinders.setForeground(Color.BLACK);
        	    layeredPane.add(cinders, Integer.valueOf(5));
        		Image_label9.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label9, Integer.valueOf(10));
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
        		layeredPane.remove(slow11.getLabel());
        		layeredPane.remove(cinders);
        		layeredPane.remove(Image_label9);
        		layeredPane.repaint();
        		slow12.startPrinting();
        	}
        	if (btn_count == 13) {
        		layeredPane.remove(slow12.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    teresa.setFont(txt);
        	    teresa.setForeground(Color.BLACK);
        	    layeredPane.add(teresa, Integer.valueOf(5));
        		Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(10));
                slow13.startPrinting();
        	}
        	if (btn_count == 14) {
        		layeredPane.remove(slow13.getLabel());
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
        		slow14.startPrinting();
        	}
        	if (btn_count == 15) {
        		layeredPane.remove(slow14.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    teresa.setFont(txt);
        	    teresa.setForeground(Color.BLACK);
        	    layeredPane.add(teresa, Integer.valueOf(5));
        		Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(10));
                slow15.startPrinting();
        	}
        	if (btn_count == 16) {
        		layeredPane.remove(slow15.getLabel());
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
        		slow16.startPrinting();
        	}
        	if (btn_count == 17) {
        		layeredPane.remove(slow16.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    teresa.setFont(txt);
        	    teresa.setForeground(Color.BLACK);
        	    layeredPane.add(teresa, Integer.valueOf(5));
        		Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(10));
                slow17.startPrinting();
        	}
        	if (btn_count == 18) {
        		layeredPane.remove(slow17.getLabel());
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
        		slow18.startPrinting();
        	}
        	if (btn_count == 19) {
        		layeredPane.remove(slow18.getLabel());
        		layeredPane.remove(next);
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	}
        	if (btn_count == 21) {
        		layeredPane.remove(slow19.getLabel());
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
                Image_label10.setBounds(-200, 10, 800, 1000);
                layeredPane.add(Image_label10, Integer.valueOf(3));
                Image_label9.setBounds(150, 10, 800, 1000);
                layeredPane.add(Image_label9, Integer.valueOf(3));
                Image_label13.setBounds(500, 10, 800, 1000);
                layeredPane.add(Image_label13, Integer.valueOf(3));
                slow20.startPrinting();
        	}
        	if (btn_count == 22) {
        		layeredPane.remove(slow20.getLabel());
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(next);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(Image_label9);
        		layeredPane.remove(Image_label13);
        		layeredPane.repaint();
        		option3.setBounds(120, 620, 700, 30);
        	    layeredPane.add(option3, Integer.valueOf(5));
        	    option3.addActionListener(this);
        	    option4.setBounds(120, 650, 700, 30);
        	    layeredPane.add(option4, Integer.valueOf(5));
        	    option4.addActionListener(this);
        	    option5.setBounds(120, 680, 700, 30);
        	    layeredPane.add(option5, Integer.valueOf(5));
        	    option5.addActionListener(this);
        	}
        	if(btn_count == 24) {
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(Image_label9);
        		layeredPane.remove(Image_label13);
        		layeredPane.remove(slow21.getLabel());
        		layeredPane.repaint();
        		wynn.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    wynn.setFont(txt);
        	    wynn.setForeground(Color.BLACK);
        	    layeredPane.add(wynn, Integer.valueOf(5));
        		Image_label10.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label10, Integer.valueOf(10));
                slow22.startPrinting();
        	}
        	if (btn_count == 25) {
        		//proceed to Scene 4-1
        		scene4_1 = new Scene4_1();
        		scene4_1.start_Scene();
        		layeredPane.remove(slow22.getLabel());
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(Image_label13);
        		layeredPane.remove(label);
        		layeredPane.repaint();
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//continue Scene 3-3
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.repaint();
        	slow19.startPrinting();
        	btn_count++;
        	next.setBounds(950, 700, 100, 50);
    	    layeredPane.add(next, Integer.valueOf(6));
    	    next.addActionListener(this);
        }
        if (e.getSource() == option2) {
        	//proceed to Ending 2
        }
        if (e.getSource() == option3 | e.getSource() == option4) {
        	layeredPane.remove(option3);
        	layeredPane.remove(option4);
        	layeredPane.remove(option5);
        	layeredPane.repaint();
        	kun.setBounds(300, 550, 1000, 50);
    	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
    	    kun.setFont(txt);
    	    kun.setForeground(Color.BLACK);
    	    layeredPane.add(kun, Integer.valueOf(5));
    	    Image_label12.setBounds(850, 10, 800, 1000);
            layeredPane.add(Image_label12, Integer.valueOf(10));
            Image_label10.setBounds(-200, 10, 800, 1000);
            layeredPane.add(Image_label10, Integer.valueOf(3));
            Image_label9.setBounds(150, 10, 800, 1000);
            layeredPane.add(Image_label9, Integer.valueOf(3));
            Image_label13.setBounds(500, 10, 800, 1000);
            layeredPane.add(Image_label13, Integer.valueOf(3));
    	    slow21.startPrinting();
    	    next.setBounds(950, 700, 100, 50);
    	    layeredPane.add(next, Integer.valueOf(11));
    	    next.addActionListener(this);
    	    btn_count++;
        }
	}
        
}
