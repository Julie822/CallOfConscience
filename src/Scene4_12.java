package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_12 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-12");
	
	String text1 = "Yes. In fact, regarding Mr Kimpembe not testifying in front of the court, there is a very important point that we have yet to submit. ";
	String text2 = "Which is? ";
	String text3 = "The judge drew an adverse inference against the Defendant, saying that since Kimpembe was not called to testify, his evidence would be detrimental to the defendant’s case of lack of knowledge. ";
	String text4 = "However, with reference to the new evidence we introduced to this appeal, admitted into this court, the real reason that Kimpembe did not testify is because he had already passed away. It was impossible for him to testify. ";
	String text5 = "No, that knowledge was thought to be irrelevant. It was a fact that neither the judge nor the Plaintiff in the lower court made inquiries on why Kimpembe was not giving evidence.";

	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	
	JButton option1 = new JButton("I’m confused. Did the lower court judge not know the manager had passed away");
	JButton option2 = new JButton("Do not say anything.");
	
	Integer btn_count = 2;
	
	Scene4_13 scene3_13;

	public Scene4_12() {
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
        		layeredPane.remove(cinders);
        		layeredPane.remove(Image_label9);
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
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(slow2.getLabel());
        		cinders.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    cinders.setFont(txt);
        	    cinders.setForeground(Color.BLACK);
        	    layeredPane.add(cinders, Integer.valueOf(5));
        		Image_label9.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label9, Integer.valueOf(10));
                slow3.startPrinting();
        	}
        	if (btn_count == 4) {
        		layeredPane.remove(slow3.getLabel());
        		slow4.startPrinting();
        	}
        	if (btn_count == 5) {
        		layeredPane.remove(slow4.getLabel());
        		option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	}
        	if (btn_count == 7) {
        		//proceed to Scene 4-13
            	scene3_13 = new Scene4_13();
            	scene3_13.start_Scene();
            	layeredPane.remove(option1);
            	layeredPane.remove(option2);
            	layeredPane.remove(next);
            	layeredPane.remove(label);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//continue scene 4-12
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(next);
        	layeredPane.remove(label);
        	cinders.setBounds(300, 550, 1000, 50);
    	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
    	    cinders.setFont(txt);
    	    cinders.setForeground(Color.BLACK);
    	    layeredPane.add(cinders, Integer.valueOf(5));
    		Image_label9.setBounds(850, 10, 800, 1000);
            layeredPane.add(Image_label9, Integer.valueOf(10));
            slow5.startPrinting();
            btn_count++;
        }
        if(e.getSource() == option2) {
        	//proceed to Scene 4-13
        	scene3_13 = new Scene4_13();
        	scene3_13.start_Scene();
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.remove(next);
        	layeredPane.remove(label);
        }
	}
}
