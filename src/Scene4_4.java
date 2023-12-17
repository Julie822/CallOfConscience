package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_4 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-4");
	
	String text1 = "Certainly, your honour. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	
	JButton option1 = new JButton("Can you explain what innocent, negligent, and fraudulent misrepresentation each mean?");
	JButton option2 = new JButton("Can you explain what the different kinds of damages, like reliance and expectation, that you referred to mean?");
	JButton option3 = new JButton("Can you explain what the different kinds of damages, like reliance and expectation, that you referred to mean?");
	JButton option4 = new JButton("I understand now. Defendant counsel, what do you have to say?");
	
	Integer btn_count = 2;
	
	Scene4_5 scene4_5;
	Scene4_6 scene4_6;
	Scene4_7 scene4_7;
	Scene4_8 scene4_8;

	public Scene4_4() {
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
	    layeredPane.add(next, Integer.valueOf(15));
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
        layeredPane.add(Image_label10, Integer.valueOf(10));
        
        slow1.startPrinting();
	}
	
	public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == next) {
        	if (btn_count == 2) {
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(slow1.getLabel());
        		layeredPane.remove(next);
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 20);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 650, 700, 20);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	    option3.setBounds(120, 680, 700, 20);
        	    layeredPane.add(option3, Integer.valueOf(5));
        	    option3.addActionListener(this);
        	    option4.setBounds(120, 710, 700, 20);
        	    layeredPane.add(option4, Integer.valueOf(5));
        	    option4.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 4-5
        	scene4_5 = new Scene4_5();
        	scene4_5.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(option4);
        	layeredPane.remove(label);
        } 
        if (e.getSource() == option2) {
        	//proceed to Scene 4-6
        	scene4_6 = new Scene4_6();
        	scene4_6.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(option4);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option3) {
        	//proceed to Scene 4-7
        	scene4_7 = new Scene4_7();
        	scene4_7.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(option4);
        	layeredPane.remove(label);
        }
        if (e.getSource() == option4) {
        	//proceed to Scene 4-8
        	scene4_8 = new Scene4_8();
        	scene4_8.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(option4);
        	layeredPane.remove(label);
        }
	}

}
