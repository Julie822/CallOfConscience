package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_13 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-13");
	
	String text1 = "Therefore, it is unreasonable for the previous judge to then conclude an adverse inference could be drawn. ";
	String text2 = "That is the end of my submission on this issue, your honour. ";
	String text3 = "Counsel for the Plaintiff, do you have anything else to add? ";
	String text4 = "Mr Wynn seemed hesitant when he was asked to make a response. He hastily skimmed through the bundle on his desk and exchanged a few words with his partner sitting next to him, before finally standing up. ";
	String text5 = "Yes, your honour. We would just like to raise a final point.  ";
	String text6 = "It is a reasonable inference to be drawn that the defendant was guilty of positive wrongful conduct.  ";
	String text7 = "They consciously permitted Kylian Co. and Altera.Inc to remain ignorant of the truth, preventing them from disclosing it to the Plaintiff. ";
	String text8 = "We do also believe that Kylian Co. and Altera.Inc making these kinds of false representations were acting within the scope that the Defendant had allowed them to make. ";
	String text9 = "That is all of my submissions for this issue. Thank you, your honour. ";
	String text10 = "I thank both counsels for their contributions to the discussion of this issue. ";
	String text11 = "Justice Kun and the other judge turned to my direction.  ";
	String text12 = "Justice Papadoumian. After listening to their discussion, it is time to make a decision on this issue: the actual knowledge element of fraudulent misrepresentation. ";
	String text13 = "The two parties have also submitted the summary of the authorities they have listed. Check them if you need to refresh your memory. ";
	String text14 = "What do you think?";
	
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
	
	JButton option1 = new JButton("The conditions are met. The Defendant did have actual knowledge regarding the misrepresentation. ");
	JButton option2 = new JButton("The conditions are not met. The Defendant did not have actual knowledge regarding the misrepresentation. ");
	
	Integer btn_count = 2;
	
	public Boolean choice_A = false;
	
	Scene4_14 scene4_14;
			
	public Scene4_13() {
		super();
	}

	public void start_Scene() {
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
	    layeredPane.add(next, Integer.valueOf(21));
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
        		layeredPane.remove(cinders);
        		layeredPane.remove(Image_label9);
        		layeredPane.repaint();
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
        		layeredPane.remove(slow3.getLabel());
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		slow4.startPrinting();
        	}
        	if (btn_count == 5) {
        		layeredPane.remove(slow4.getLabel());
        		wynn.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    wynn.setFont(txt);
        	    wynn.setForeground(Color.BLACK);
        	    layeredPane.add(wynn, Integer.valueOf(5));
        		Image_label10.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label10, Integer.valueOf(10));
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
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.repaint();
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
                slow10.startPrinting();
        	}
        	if (btn_count == 11) {
        		layeredPane.remove(slow10.getLabel());
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.repaint();
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
        		layeredPane.remove(slow12.getLabel());
        		slow13.startPrinting();
        	}
        	if (btn_count == 14) {
        		layeredPane.remove(slow13.getLabel());
        		slow14.startPrinting();
        	}
        	if (btn_count == 15) {
        		layeredPane.remove(slow14.getLabel());
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	}
        	if (btn_count ==16) {
        		//proceed to Scene 4-14
        		scene4_14 = new Scene4_14();
        		scene4_14.start_Scene();
        		layeredPane.remove(label);
        		layeredPane.remove(animation_label);
        		layeredPane.repaint();
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.repaint();
        	animation_label.setBounds(450, 50, 1152, 648);
            layeredPane.add(animation_label, Integer.valueOf(3));
        }
        if (e.getSource() == option2) {
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.repaint();
        	animation_label.setBounds(450, 50, 1152, 648);
            layeredPane.add(animation_label, Integer.valueOf(3));
            choice_A = true;
        }
	}
}
