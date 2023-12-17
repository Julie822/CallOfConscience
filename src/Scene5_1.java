package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene5_1 extends Scene4_14{
	JLabel label = new JLabel("Scene 5-1");
	JLabel issue1 = new JLabel("<html><center>“ISSUE 2<br>FRAUDULENT MISREPRESENTATION – RECKLESSNESS”</center></html>");
	
	String text1 = "We would like to raise that the judge in the lower court has made the correct analysis of recklessness. ";
	String text2 = "He cited the case of MFI Warehouses v Nattrass. In this case, the judgment related recklessness was as follows: ";
	String text3 = "“A party can be found to have acted recklessly if it did not have regard to the truth or falsity, regardless of whether they were deliberately closing their eyes to the truth, or whether they had any kind of dishonest mind.” ";
	String text4 = "In other words, we only need to find out whether Demidov Diamonds – the Defendants – did or did not care about the stones being actually rough diamonds. ";
	String text5 = "Regarding this question, we submit that Ms Anderson, one of the liquidators, showed that they could not care less about the stones’ authenticity.  ";
	String text6 = "The liquidators thought they had adequately protected themselves and the Defendant by carefully drafting documentation and exclusion clauses in the auction contracts, so that they could get away with it no matter the stones were real or not. ";
	String text7 = "We concur with the judge of the lower court that, the liquidators were not just being negligent with their trade, but went far beyond the extent of ‘gross negligence.’ ";
	String text8 = "They were really, in fact, being reckless. Your honour. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	SlowTextPrinting slow6 = new SlowTextPrinting(layeredPane, text6);
	
	JButton option1 = new JButton("What do you mean by negligent in this case? Is it different from being reckless?");
	JButton option2 = new JButton("Thank you, counsel. Let’s move on to the Defendant’s counsel.");
	
	Integer btn_count = 1;
	
	Scene5_2 scene5_2;
	Scene5_3 scene5_3;
			

	public Scene5_1() {
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
        	if (btn_count ==3) {
        		layeredPane.remove(slow2.getLabel());
        		slow3.startPrinting();
        	}
        	if (btn_count ==4) {
        		layeredPane.remove(slow3.getLabel());
        		slow4.startPrinting();
        	}
        	if (btn_count ==5) {
        		layeredPane.remove(slow4.getLabel());
        		slow5.startPrinting();
        	}
        	if (btn_count ==6) {
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
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(slow8.getLabel());
        		layeredPane.remove(next);
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 5-2
        	scene5_2 = new Scene5_2();
        	scene5_2.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
        if(e.getSource() == option2) {
        	//proceed to Scene 5-3
        	scene5_3 = new Scene5_3();
        	scene5_3.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
	}
}
