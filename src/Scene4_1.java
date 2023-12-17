package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_1 extends Scene3_3{
	JLabel label = new JLabel("Scene 4-1");
	JLabel issue1 = new JLabel("<html><center>“ISSUE 1 <br>FRAUDULENT MISREPRESENTATION – ACTUAL KNOWLEDGE”</center></html>");

	static ImageIcon animation = new ImageIcon("data/animation.gif");
	static JLabel animation_label = new JLabel(animation);
	
	String text1 = "As we all know, misrepresentation is an unambiguous, false, statement of fact, which is addressed to the plaintiff and induces the plaintiff to enter into a contract. ";
	String text2 = "For example, in a case named Dick Bentley v Harold Smith, a car dealer made a false statement to a private buyer about the mileage of the car since its engine replacement. ";
	String text3 = "He described the mileage as 20,000 miles, instead of the truth: 100,000 miles. This fulfils the “unambiguous, false, statement of fact” element. ";
	String text4 = "He made this statement to a private buyer. This fulfils the “addressed to plaintiff” element. ";
	String text5 = "This statement led to the private buyer buying the car, which fulfils the “induce to enter into contract” element. Therefore, misrepresentation was found. ";
	
	JButton option1 = new JButton("Hold on. What do you mean by “this element is fulfilled”? What does element mean here?");
	JButton option2 = new JButton("I see. Please continue.");
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	
	Integer btn_count = 1;
	
	Scene4_3 scene4_3;
	Scene4_2 scene4_2;
	
	public Scene4_1() {
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
                
        issue1.setBounds(200, 120, 2000, 200);
        Font issuefont = new Font("Monospaced", Font.BOLD, 35);
        issue1.setFont(issuefont);
        issue1.setForeground(Color.WHITE);
        layeredPane.add(issue1, Integer.valueOf(11));
        
        Image_label7.setBounds(-200, 10, 800, 1000);
	    layeredPane.add(Image_label7, Integer.valueOf(3));
	    Image_label8.setBounds(200, 10, 800, 1000);
	    layeredPane.add(Image_label8, Integer.valueOf(3));
	    Image_label13.setBounds(600, 10, 800, 1000);
        layeredPane.add(Image_label13, Integer.valueOf(3));
        
        next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(20));
	    next.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == next) {
        	if (btn_count == 1) {
        		layeredPane.remove(issue1);
        		layeredPane.remove(Image_label7);
        		layeredPane.remove(Image_label8);
        		layeredPane.remove(Image_label13);
        		layeredPane.repaint();
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
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label10);
        		layeredPane.remove(next);
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
            // proceed to Scene 4-2
        	scene4_2 = new Scene4_2();
            scene4_2.start_Scene();
            layeredPane.remove(option1);
            layeredPane.remove(option2);
            layeredPane.remove(label);
        }
        if (e.getSource() == option2) {
            // proceed to Scene 4-3
        	scene4_3 = new Scene4_3();
            scene4_3.start_Scene();
            layeredPane.remove(option1);
            layeredPane.remove(option2);
            layeredPane.remove(label);
        }
    }

}
