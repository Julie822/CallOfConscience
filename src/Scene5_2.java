package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene5_2 extends Scene4_14{
	JLabel label = new JLabel("Scene 5-2");
	
	String text1 = "An act is considered negligent misrepresentation when a party does not put effort into caring whether the course of action they took may prove to be harmful for the plaintiff. Simply, negligent is associated with carelessness of the defendant. ";
	String text2 = "Whereas reckless misrepresentation goes beyond negligence. The defendant in this case would also know the potential harm that their action would bring for the plaintiff, however, still executes it, nonetheless. ";
	String text3 = "The difference between these two misrepresentations lies in the amount of damage that needs to be charged towards the Defendant. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	
	JButton option1 = new JButton("Very well. Let’s move on to the Defendant’s counsel.");
	
	Integer btn_count = 2;
	
	Scene5_3 scene5_3;

	public Scene5_2() {
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
                
	    wynn.setBounds(300, 550, 1000, 50);
	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
	    wynn.setFont(txt);
	    wynn.setForeground(Color.BLACK);
	    layeredPane.add(wynn, Integer.valueOf(5));
		Image_label10.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label10, Integer.valueOf(10));
        
        next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(20));
	    next.addActionListener(this);
	    
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
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(next);
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 5-3
        	scene5_3 = new Scene5_3();
        	scene5_3.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(label);
        }
	}

}
