package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene7_1 extends Scene6_1{
	JLabel label = new JLabel("Scene 7-1");
	
	String text1 = "Very well then. We agree with the judgment of Judge Papadoumian. This court allows the appeal on the issue of fraudulent misrepresentation in the lower court. ";
	String text2 = "However, the previous judgement on negligent misrepresentation is upheld. We will move on to determining costs.  ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	
	JButton option1 = new JButton("Sure");
	
	Integer btn_count = 2;
	
	Scene7_3 scene7_3;

	public Scene7_1() {
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
	    
	    kun.setBounds(300, 550, 1000, 50);
	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
	    kun.setFont(txt);
	    kun.setForeground(Color.BLACK);
	    layeredPane.add(kun, Integer.valueOf(5));
		Image_label12.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label12, Integer.valueOf(10));
        
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
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(next);
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 7-3
        	scene7_3 = new Scene7_3();
        	scene7_3.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(label);
        }
	}

}
