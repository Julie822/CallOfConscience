package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Scene5_5 extends Scene4_14{
	JLabel label = new JLabel("Scene 5-5");
	
	String text1 = "Justice Kun and the other judge turned to my direction.  ";
	String text2 = "Justice Papadoumian. You know the drill, it is time to make a decision on this issue: the recklessness element of fraudulent misrepresentation.  ";
	String text3 = "In these kinds of legal doctrines, all of the elements have to be satisfied for us to definitively adjudicate that this doctrine applies. ";
	String text4 = "In this case, either one of the elements of actual knowledge or recklessness has to be fulfilled to prove there had been fraudulent misrepresentation on the Defendant’s part. ";
	String text5 = "You can also refer to the updated case summary for assistance. ";
	String text6 = "So, what do you think? ";
	
	greyTextPrinting slow1 = new greyTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	SlowTextPrinting slow6 = new SlowTextPrinting(layeredPane, text6);
	
	Integer btn_count = 2;
	
	public Boolean choice_B = false;
	
	Scene5_6 scene5_6;
	
	public Scene5_5() {
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
        
        slow1.startPrinting();
	}
	
	public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == next) {
        	if (btn_count == 2) {
        		layeredPane.remove(slow1.getLabel());
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
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
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
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
        	//proceed to Scene 5-6
        	scene5_6 = new Scene5_6();
        	scene5_6.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option2) {
        	//proceed to Scene 5-6
        	scene5_6 = new Scene5_6();
        	scene5_6.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        	choice_B = true;
        }
	}

}
