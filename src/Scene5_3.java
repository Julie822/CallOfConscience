package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene5_3 extends Scene4_14{
	JLabel label = new JLabel("Scene 5-3");
	
	String text1 = "Thank you, your honour. ";
	String text2 = "Our submission is that the judge of the previous court was incorrect with their interpretation of the law, and thus their ruling and reasoning should not be followed here. ";
	String text3 = "We would like to go back to the case our learned friend, Mr Wynn, had just cited - MFI Warehouses v Nattrass. ";
	String text4 = "The context is the key here. The context in which the judge of that case summarized criteria of recklessness is much different than the context of the current case we are dealing with.";
	String text5 = "The MFI case was concerned with a criminal prosecution, and the judge of that case was attempting to interpret a section in the Trade Descriptions Act 1968, which made it a criminal offense by recklessly making false statements in an advertisement. ";
	String text6 = "The judge there thus explained that: the advertiser did not need to have regard to the truth or falsity of the advertisement for that kind of misinformation to be counted as a reckless action because the statement being made was already intentionally false in nature ";
	String text7 = "Despite sharing the same word – recklessness – what was being explained in the MFI case was wholly unrelated to what we are trying to figure out here. ";
	String text8 = "The former is about making recklessly misinforming advertisements, while the latter is about meeting the requirement of recklessness in determining misrepresentation. ";
	String text9 = "Therefore, it is wrong to rely on the MFI case to test for recklessness. The proper test, that has not been disputed throughout time, is the principles set out in Derry v Peek. ";
	String text10 = "This case says that a representor is fraudulent if they made the statement recklessly, without caring whether it is true or false. ";
	String text11 = "“Without caring” as cited here does not mean that the court does not need to consider whether they cared about the authencity, which is the point our learned friend, the Plaintiff’s counsel, had made. ";
	String text12 = "It is instead saying: the representor had to have reached a mental stage where they did not care about the authenticity of the stones in their own heart and conscience.  ";
	String text13 = "In other words, a degree of dishonesty or wickedness has to be present in the representor’s mind. ";
	String text14 = "We therefore submit that, even if Demidov Diamonds were grossly incautious, that cannot be stretched to determine that they were reckless. Thus, the recklessness requirement is not fulfilled. ";
	
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
	
	JButton option1 = new JButton("Just one question. How come Demidov Diamonds is considered incautious however does not relate to them being reckless?");
	JButton option2 = new JButton("Thank you, counsel. I have no questions.");
	
	Scene5_4 scene5_4;
	Scene5_5 scene5_5;

	public Scene5_3() {
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
        		layeredPane.remove(cinders);
        		layeredPane.remove(Image_label9);
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
        	//proceed to Scene 5-4
        	scene5_4 = new Scene5_4();
        	scene5_4.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option2) {
        	//proceed to Scene 5-5
        	scene5_5 = new Scene5_5();
        	scene5_5.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
	}

}
