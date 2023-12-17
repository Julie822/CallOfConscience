package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_9 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-9");
	
	String text1 = "Absolutely, your honour. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	
	JButton option1 = new JButton("Can you simplify your point from the second case you are citing?");
	JButton option2 = new JButton("What do you mean by “allowed to make this kind of auctions?");
	JButton option3 = new JButton("That’s all for me. Are there any other submissions you would like to make?");
	
	Integer btn_count = 2;
	
	Scene4_10 scene4_10;
	Scene4_11 scene4_11;
	Scene4_12 scene4_12;

	public Scene4_9() {
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
        		layeredPane.remove(cinders);
        		layeredPane.remove(Image_label9);
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
        	}
        	btn_count++;
        }
        if(e.getSource() == option1) {
        	//proceed to Scene 4-10
        	scene4_10 = new Scene4_10();
        	scene4_10.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(label);
        }
        if(e.getSource() == option2) {
        	//proceed to Scene 4-11
        	scene4_11 = new Scene4_11();
        	scene4_11.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(label);
        }
        if(e.getSource() == option3) {
        	//proceed to Scene 4-12
        	scene4_12 = new Scene4_12();
        	scene4_11.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(option3);
        	layeredPane.remove(label);
        }
	}
}
