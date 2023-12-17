package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_3 extends Scene3_3{
	JLabel label = new JLabel("Scene 4-3");
	
	String text1 = "Misrepresentation also features multiple levels of severity, from innocent misrepresentation, negligent misrepresentation, and fraudulent misrepresentation.  ";
	String text2= "Proving fraudulent misrepresentation of the defendant is the most difficult, but can potentially bring the plaintiff the highest amount of money claims, including reliance damages, expectation damages, and restitution when its available. ";
	String text3 = "We believe the judge in the lower court succinctly summarized the related principles. ";
	String text4 = "For the plaintiff to succeed in fraudulent misrepresentation or deceit, he would need to establish that the defendant had knowledge of the falsity of the representations or was reckless as to the falsity, not caring whether the representations were true or not. ";
	String text5 = "Yes your honour. The previous judge brought up the point that there was no explanation given by the Liquidator as to why the Defendant lacked knowledge of the nature of the stones. ";
	String text6 = "One of the defendant’s managers, Kimpembe, was largely responsible for the company’s daily operations and was an attendant of the auction. He was also responsible for keeping the stones in the company vault. ";
	String text7 = "For some reason, Kylian Co. never made any enquiries about the stones to Kimpembe, and Kimpembe never provided any information about the stones. ";
	String text8 = "The previous judge thought that Kimpembe must have been able to explain the Defendant company’s knowledge about the stones, or at least explain the company does not have knowledge about it. ";
	String text9 = "What was strange was that the Defendant did not call him to testify on what he knows in the previous court. ";
	String text10 = "Thus, the previous judge used the principle of adverse inference to conclude that the Defendant knew the stones were not rough diamond stones. Therefore, they had actual knowledge. ";
	String text11 = "We, representing the plaintiff, agree and would like to uphold that line of reasoning from the lower court. ";
	String text12 = "Certainly, your honour. ";
	
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

	
	JButton option1 = new JButton("Can you tell me further what the previous judge said in his decision? ");
	JButton option2 = new JButton("Thank you, counsel. I have some questions.");
	JButton option3 = new JButton("Thank you, counsel. Defendant counsel, what do you have to say?");
	JButton option4 = new JButton("Can you explain what innocent, negligent, and fraudulent misrepresentation each mean? ");
	JButton option5 = new JButton("Can you explain what the different kinds of damages, like reliance and expectation, that you referred to mean?");
	JButton option6 = new JButton("Can you explain what is adverse inference?");
	JButton option7 = new JButton("I understand now. Defendant counsel, what do you have to say?");
	
	Integer btn_count = 2;
	
	Scene4_5 scene4_5;
	Scene4_4 scene4_4;
	Scene4_6 scene4_6;
	Scene4_7 scene4_7;
	Scene4_8 scene4_8;

	public Scene4_3() {
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
	    layeredPane.add(next, Integer.valueOf(20));
	    next.addActionListener(this);
	    
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
        layeredPane.add(Image_label10, Integer.valueOf(15));
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
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	}
        	if (btn_count == 7) {
        		layeredPane.remove(slow5.getLabel());
        		wynn.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    wynn.setFont(txt);
        	    wynn.setForeground(Color.BLACK);
        	    layeredPane.add(wynn, Integer.valueOf(5));
        		Image_label10.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label10, Integer.valueOf(15));
                slow6.startPrinting();
        	}
        	if (btn_count == 8) {
        		layeredPane.remove(slow6.getLabel());
        		slow7.startPrinting();
        	}
        	if (btn_count == 9) {
        		layeredPane.remove(slow7.getLabel());
        		slow8.startPrinting();
        	}
        	if (btn_count == 10) {
        		layeredPane.remove(slow8.getLabel());
        		slow9.startPrinting();
        	}
        	if (btn_count == 11) {
        		layeredPane.remove(slow9.getLabel());
        		slow10.startPrinting();
        	}
        	if (btn_count == 12) {
        		layeredPane.remove(slow10.getLabel());
        		slow11.startPrinting();
        	}
        	if (btn_count == 13) {
        		layeredPane.remove(slow11.getLabel());
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(next);
        		option2.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	    option3.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option3, Integer.valueOf(5));
        	    option3.addActionListener(this);
        	}
        	if (btn_count == 15) {
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(slow12);
        		layeredPane.remove(next);
        		option4.setBounds(120, 620, 700, 20);
        	    layeredPane.add(option4, Integer.valueOf(5));
        	    option4.addActionListener(this);
        	    option5.setBounds(120, 650, 700, 20);
        	    layeredPane.add(option5, Integer.valueOf(5));
        	    option5.addActionListener(this);
        	    option6.setBounds(120, 680, 700, 20);
        	    layeredPane.add(option6, Integer.valueOf(5));
        	    option6.addActionListener(this);
        	    option7.setBounds(120, 710, 700, 20);
        	    layeredPane.add(option7, Integer.valueOf(5));
        	    option7.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	layeredPane.remove(option1);
        	layeredPane.repaint();
        	wynn.setBounds(300, 550, 1000, 50);
    	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
    	    wynn.setFont(txt);
    	    wynn.setForeground(Color.BLACK);
    	    layeredPane.add(wynn, Integer.valueOf(5));
    		Image_label10.setBounds(850, 10, 800, 1000);
            layeredPane.add(Image_label10, Integer.valueOf(15));
        	slow5.startPrinting();
        	next.setBounds(950, 700, 100, 50);
    	    layeredPane.add(next, Integer.valueOf(25));
    	    next.addActionListener(this);
        }
        if (e.getSource() == option2) {
        	//proceed to Scene 4-4
        	scene4_4 = new Scene4_4();
        	scene4_4.start_Scene();
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(label);
        	layeredPane.repaint();
        }
        if (e.getSource() == option3) {
        	//proceed to Scene 4-8
        	scene4_8 = new Scene4_8();
        	scene4_8.start_Scene();
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option4) {
        	//proceed to Scene 4-5
        	scene4_5 = new Scene4_5();
        	scene4_5.start_Scene();
        	layeredPane.remove(option4);
        	layeredPane.remove(option5);
        	layeredPane.remove(option6);
        	layeredPane.remove(option7);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option5) {
        	//proceed to Scene 4-6
        	scene4_6 = new Scene4_6();
        	scene4_6.start_Scene();
        	layeredPane.remove(option4);
        	layeredPane.remove(option5);
        	layeredPane.remove(option6);
        	layeredPane.remove(option7);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option6) {
        	//proceed to Scene 4-7
        	scene4_7 = new Scene4_7();
        	scene4_7.start_Scene();
        	layeredPane.remove(option4);
        	layeredPane.remove(option5);
        	layeredPane.remove(option6);
        	layeredPane.remove(option7);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option7) {
        	//proceed to Scene 4-8
        	scene4_8 = new Scene4_8();
        	scene4_8.start_Scene();
        	layeredPane.remove(option4);
        	layeredPane.remove(option5);
        	layeredPane.remove(option6);
        	layeredPane.remove(option7);
        	layeredPane.remove(label);
        }
	}
}
