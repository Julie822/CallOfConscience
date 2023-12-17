package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_8 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-8");
	
	String text1 = "Your honour. We believe that there are multiple reasons why the conclusion of adverse inference could not be drawn. Moreover, the finding that the Defendant knew the representations were wrong should not have been made. ";
	String text2 = "Firstly, we would like to cite the case Nina Kung v Wong Din Shin. ";
	String text3 = "The case explained: with an allegation of fraud, we must remember the inherent degree of unlikeliness it happens, compared to it only being an innocent misunderstanding. Thus, a lot of evidence is required to prove there was actually fraudulent behaviour. ";
	String text4 = "While it is possible to find fraud based on inference, the court must avoid drawing an inference where there is not a clearly logical and reasonable justification for the inference. ";
	String text5 = "In the same reasoning, the fact that the stones must have been kept in the vault by Kimpembe does not lead to a reasonable and definite inference that he knew the stones were not rough diamonds. ";
	String text6 = "It was equally possible that Kimpembe did believe they were rough diamonds, or else they would not have been kept locked up securely with other genuine items of valuable jewellery. ";
	String text7 = "It is not permissible for the court to choose between the more likely of two guesses, when neither would give rise to a reasonable and definite inference. ";
	String text8 = "Secondly, we’ll cite the case Armstrong v Strain. The judge in this case clearly said: ";
	String text9 = "“There is no way of combining an innocent principal and agent to product dishonesty. You may add knowledge to knowledge, state of mind to state of mind...... ";
	String text10 = "But you cannot add an innocent state of mind to an innocent state of mind and get a result of a dishonest state of mind.” ";
	String text11 = "In the background, we see that it is not the Defendant who made the representation to the Plaintiff, but the Liquidator or the Auctioneer.  ";
	String text12 = "In the case where the Defendant knows the circumstances that makes the representation false, but does not know that representation was being made, there is no deceit. ";
	String text13 = "The fact that if the Defendant knew the presentation was being made, they would have the fraudulent state of mind, does not make them fraudulent now. ";
	String text14 = "In the same vein, it is also insufficient to prove fraudulent misrepresentation by simply showing that Kylian Co. and Altera.Inc were allowed to make this kind of auctions. ";
	String text15 = "It must be established that the Defendant actually knew that this particular representation – rough diamonds, not cubic zirconia – was made. ";
	String text16 = "Allow me to repeat, “you cannot add an innocent state of mind to an innocent state of mind and get a result of a dishonest state of mind.” ";
	
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
	SlowTextPrinting slow12 = new SlowTextPrinting(layeredPane, text12);
	SlowTextPrinting slow13 = new SlowTextPrinting(layeredPane, text13);
	SlowTextPrinting slow14 = new SlowTextPrinting(layeredPane, text14);
	SlowTextPrinting slow15 = new SlowTextPrinting(layeredPane, text15);
	SlowTextPrinting slow16 = new SlowTextPrinting(layeredPane, text16);
	
	JButton option1 = new JButton("Thank you. I have some questions.");
	JButton option2 = new JButton("I see. Are there any other submissions you would like to make?");
	
	Integer btn_count = 2;
	
	Scene4_9 scene4_9;
	Scene4_12 scene4_12;

	public Scene4_8() {
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
	    
	    next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(11));
	    next.addActionListener(this);
	    
	    Image_label1.setBounds(-245, -170, 1920, 1080);
        layeredPane.add(Image_label1, Integer.valueOf(0));
        Image_label4.setBounds(-450, 120, 1920, 1080);
        layeredPane.add(Image_label4, Integer.valueOf(3));
                
	    cinders.setBounds(300, 550, 1000, 50);
	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
	    cinders.setFont(txt);
	    cinders.setForeground(Color.BLACK);
	    layeredPane.add(cinders, Integer.valueOf(5));
		Image_label9.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label9, Integer.valueOf(10));
        
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
        		layeredPane.remove(slow9.getLabel());
        		slow10.startPrinting();
        	}
        	if (btn_count == 11) {
        		layeredPane.remove(slow10.getLabel());
        		slow11.startPrinting();
        	}
        	if (btn_count == 12) {
        		layeredPane.remove(slow11.getLabel());
        		slow12.startPrinting();
        	}
        	if (btn_count == 13) {
        		layeredPane.remove(slow12.getLabel());
        		slow13.startPrinting();
        	}
        	if (btn_count == 14) {
        		layeredPane.remove(slow13.getLabel());
        		slow14.startPrinting();
        	}
        	if (btn_count == 15) {
        		layeredPane.remove(slow14.getLabel());
        		slow15.startPrinting();
        	}
        	if (btn_count == 16) {
        		layeredPane.remove(slow15.getLabel());
        		slow16.startPrinting();
        	}
        	if (btn_count == 17) {
        		layeredPane.remove(cinders);
        		layeredPane.remove(Image_label9);
        		layeredPane.remove(slow16.getLabel());
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
        	//proceed to Scene 4-9
        	scene4_9 = new Scene4_9();
        	scene4_9.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        	layeredPane.repaint();
        }
        if (e.getSource() == option2) {
        	//proceed to Scene 4-12
        	scene4_12 = new Scene4_12();
	        scene4_12.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        	layeredPane.repaint();
        }
	}
}
