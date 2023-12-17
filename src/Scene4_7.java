package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_7 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-7");
	
	String text1 = "Adverse inference is a conclusion, which may be drawn from facts in evidence or the conduct or statements of a party either in or out of court, that may operate to the disadvantage of one of the parties in proceedings. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	
	JButton option1 = new JButton("Right, I see. I have some other questions");
	
	Integer btn_count = 2;
	
	Scene4_4 scene4_4;

	public Scene4_7() {
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
        		layeredPane.remove(slow1.getLabel());
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
        	//proceed to Scene 4-4
        	scene4_4 = new Scene4_4();
        	scene4_4.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(label);
        }
	}

}
