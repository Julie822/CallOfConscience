package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_6 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-6");
	
	String text1 = "The award of reliance damages is given when there is wasted expenditure from the process of entering the contract. In simple terms, the money reimbursed covers the amount of damages incurred due to reliance of what the contract should have become. ";
	String text2 = "Whilst the award of expectation damages seeks to reimburse the plaintiff of their expectations upon entering the contract. In most cases, expectation damages would represent the value difference between what the defendant has done, and what the defendant should have done. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	
	JButton option1 = new JButton("Right, I see. I have some other questions.");
	
	Integer btn_count = 2;
	
	Scene4_4 scene4_4;

	public Scene4_6() {
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
        		slow2.startPrinting();
        	}
        	if (btn_count == 3) {
        		layeredPane.remove(slow2.getLabel());
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
