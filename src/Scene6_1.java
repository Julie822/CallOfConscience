package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene6_1 extends Scene5_6{
	JLabel label = new JLabel("Scene 6-1");
	JLabel issue1 = new JLabel("<html><center>“ISSUE 3 <br>NEGLIGENT MISREPRESENTATION”</center></html>");
	
	String text1 = "The judge from the lower court held that the plaintiff has proved the elements required to support a claim for negligent misrepresentation. We submit that this decision should be upheld by the court. ";
	String text2 = "The liquidators had done nothing or nothing adequate to ensure no representations or warranties as to the authenticity of the items to be auctioned were given. ";
	String text3 = "The liquidators simply assumed that they were diamond stones and allowed their staff to inform Altera.inc of the same. ";
	String text4 = "The liquidators could easily have made enquiries of the stones from the persons who were given access to the vault or from other members of the staff. ";
	String text5 = "Specifically, Mr Kimpembe, who was heavily involved with day-to-day operation of the Defendant should have made enquiries. ";
	String text6 = "We would further submit that an argument from the Defendants that the liquidators found it too costly to obtain an expert valuation is nothing but a mere excuse. ";
	String text7 = "The purported price for the eight stones, if they really were rough diamonds, would by up to $1,130,000. They deserved to be tested for authenticity and properly valued. ";
	String text8 = "Thus, the liquidators had not exercised common sense and prudence, and could not care less to obtain a proper valuation, while boldly assuming they were diamond stones.  ";
	String text9 = "In doing so, the liquidators were grossly negligent. ";
	String text10 = "Thank you, counsel. Counsel for the Defendant?";
	String text11 = "Yes, your honour. We contend that the judge of the lower court failed to pt emphasis to a number of factors.  ";
	String text12 = "For example, there was a gemmologist, Choi, who did an analysis on the stones and told the liquidators that the stones were ‘rough diamond stones.’ ";
	String text13 = "It was because of the liquidators having no expertise in assessing and valuing the jewellery items, that they left it to Altera.inc to identify and evaluate each item for the purpose of establishing an auction price and preparing the auction catalogue. ";
	String text14 = "Thu Notice to Bidders document at the auction, given to participants, also made it clear that all auction items were sold “As Is, With All Faults” and that any representation as to the genuineness was only a statement of opinion. ";
	String text15 = "This means the liquidators intended for the buyer to exercise and rely on their own judgment. That is all, your honour. ";
	String text16 = "Thank you, counsel. Does the plaintiff counsel wish to provide supplementary submissions? ";
	String text17 = "Yes, your honour. It is paramount to note that from the case China Gold Finance v CIL Holdings, ";
	String text18 = "The appeal court can only intervene when it is satisfied that the findings are plainly wrong. ";
	String text19 = "This means that simply thinking a matter CAN be judged in a different way is not sufficient. Your honours will have to agree that the previous judge in the lower court had made plainly wrong applications of the law. ";
	String text20 = "We submit that the points raised by the defendant counsel, our learned friends, just now had not been able to surmount the high hurdles required to appeal the previous decision on this issue. ";
	String text21 = "Furthermore, we would like to add that the analysis conducted by the gemmologist, Choi, was purely gratuitous in nature. It is clear from the facts that the liquidators did not pay for a full, official valuation of the stones. ";
	String text23 = "Instead, they just relied on the gratuitous opinions of Choi, who only provided an estimation of the total value of the stones, assuming that they were rough diamonds. ";
	String text24 = "The liquidators also knew Choi only gave a valuation on the assumption that the jewellery items were genuine and did not vouch for their authenticity. ";
	String text25 = "Justice Kun and the other judge turned to my direction.  ";
	String text26 = "Justice Papadoumian. What do you think on this regard? Remember, the threshold to prove NEGLIGENT MISREPRESENTATION is significantly lower than that of FRAUDULENT MISREPRESENTATION. ";
	String text27 = "You just have to think about whether the submissions by both parties just now and consider: did the defendants fail to take proper care in their job in making this misrepresentation? ";
	String text28 = "So. What do you think? ";
	
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
	SlowTextPrinting slow23 = new SlowTextPrinting(layeredPane, text23);
	SlowTextPrinting slow24 = new SlowTextPrinting(layeredPane, text24);
	greyTextPrinting slow25 = new greyTextPrinting(layeredPane, text25);
	SlowTextPrinting slow26 = new SlowTextPrinting(layeredPane, text26);
	SlowTextPrinting slow27 = new SlowTextPrinting(layeredPane, text27);
	SlowTextPrinting slow28 = new SlowTextPrinting(layeredPane, text28);
	
	JButton option1 = new JButton("The conditions for negligent misrepresentation are met.");
	JButton option2 = new JButton("The conditions for negligent misrepresentation are not met.");
	
	public Boolean choice_C = false;
	
	Integer btn_count = 1;
	
	Scene5_5 scene5_5;
	Scene4_13 scene4_13;
	Scene7_1 scene7_1;
	Scene7_2 scene7_2;

	public Scene6_1() {
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

	    // Add new components
	    layeredPane.add(label, Integer.valueOf(3));
                
        issue1.setBounds(200, 120, 2000, 200);
        Font issuefont = new Font("Monospaced", Font.BOLD, 35);
        issue1.setFont(issuefont);
        issue1.setForeground(Color.WHITE);
        layeredPane.add(issue1, Integer.valueOf(11));
        
        next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(20));
	    next.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == next) {
        	if (btn_count == 1) {
        		layeredPane.remove(issue1);
        		layeredPane.repaint();
            	Image_label1.setBounds(-245, -170, 1920, 1080);
                layeredPane.add(Image_label1, Integer.valueOf(0));
                Image_label4.setBounds(-450, 120, 1920, 1080);
                layeredPane.add(Image_label4, Integer.valueOf(3));
                wynn.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    wynn.setFont(txt);
        	    wynn.setForeground(Color.BLACK);
        	    layeredPane.add(wynn, Integer.valueOf(5));
        		Image_label10.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label10, Integer.valueOf(10));
                slow1.startPrinting();
        	}
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
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.repaint();
        		layeredPane.remove(slow9.getLabel());
        		slow10.startPrinting();
        	}
        	if (btn_count == 11) {
        		cinders.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    cinders.setFont(txt);
        	    cinders.setForeground(Color.BLACK);
        	    layeredPane.add(cinders, Integer.valueOf(5));
        		Image_label9.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label9, Integer.valueOf(10));
                slow11.startPrinting();
        	}
        	if (btn_count == 12) {
        		layeredPane.remove(slow8.getLabel());
        		slow12.startPrinting();
        	}
        	if (btn_count == 13) {
        		layeredPane.remove(slow8.getLabel());
        		slow13.startPrinting();
        	}
        	if (btn_count == 14) {
        		layeredPane.remove(slow8.getLabel());
        		slow14.startPrinting();
        	}
        	if (btn_count == 15) {
        		layeredPane.remove(slow8.getLabel());
        		slow15.startPrinting();
        	}
        	if (btn_count == 16) {
        		layeredPane.remove(cinders);
        		layeredPane.remove(Image_label9);
        		layeredPane.remove(slow15.getLabel());
        		layeredPane.repaint();
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
                slow16.startPrinting();
        	}
        	if (btn_count == 17) {
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label13);
        		layeredPane.remove(slow16.getLabel());
        		layeredPane.repaint();
        		wynn.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    wynn.setFont(txt);
        	    wynn.setForeground(Color.BLACK);
        	    layeredPane.add(wynn, Integer.valueOf(5));
        		Image_label10.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label10, Integer.valueOf(10));
                slow17.startPrinting();
        	}
        	if (btn_count == 18) {
        		layeredPane.remove(slow17.getLabel());
        		slow18.startPrinting();
        	}
        	if (btn_count == 19) {
        		layeredPane.remove(slow18.getLabel());
        		slow19.startPrinting();
        	}
        	if (btn_count == 20) {
        		layeredPane.remove(slow19.getLabel());
        		slow20.startPrinting();
        	}
        	if (btn_count == 21) {
        		layeredPane.remove(slow20.getLabel());
        		slow21.startPrinting();
        	}
        	if (btn_count == 22) {
        		layeredPane.remove(slow21.getLabel());
        		slow22.startPrinting();
        	}
        	if (btn_count == 23) {
        		layeredPane.remove(slow22.getLabel());
        		slow23.startPrinting();
        	}
        	if (btn_count == 25) {
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(slow23.getLabel());
        		layeredPane.repaint();
        		slow25.startPrinting();
        	}
        	if (btn_count == 26) {
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
                slow26.startPrinting();
        	}
        	if (btn_count == 27) {
        		layeredPane.remove(slow26.getLabel());
        		slow27.startPrinting();
        	}
        	if (btn_count == 28) {
        		layeredPane.remove(slow27.getLabel());
        		slow28.startPrinting();
        	}
        	if (btn_count == 29) {
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(slow28.getLabel());
        		layeredPane.remove(next);
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	}
        	if (btn_count == 30) {
        		if (scene4_13.choice_A == true && scene5_5.choice_B == true && choice_C == true) {
        			//proceed to Scene 7-1
        			scene7_1 = new Scene7_1();
        			scene7_1.start_Scene();
        		}
        		else {
        			//proceed to Scene 7-2
        			scene7_2 = new Scene7_2();
        			scene7_2.start_Scene();
        		}
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	choice_C = true;
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option2) {
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
	}
}
