package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene4_11 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-11");
	
	String text1 = "Thank you for the question, Your Honour,";
	String text2 = "Please let me speak in simpler terms. It seems to be that one of evidence put forward for allegations of fraudulent misrepresentation assumes Kylian Co and Altera Inc’s opinion of the stone’s identity to be the same or to be an extension of the Defendant’s knowledge of the stone’s identity. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	
	JButton option1 = new JButton("Understood. Are there any other submissions you would like to make?");
	
	Integer btn_count = 2;
	
	Scene4_12 scene4_12;

	public Scene4_11() {
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
	            layeredPane.remove(cinders);
	            layeredPane.remove(Image_label9);
	            layeredPane.remove(slow2.getLabel());
	            layeredPane.remove(next);
	            layeredPane.repaint();
	            option1.setBounds(120, 620, 700, 50);
	            layeredPane.add(option1, Integer.valueOf(5));
	            option1.addActionListener(this);
	        }
	        btn_count++;
	    } else if (e.getSource() == option1) {
	        // Proceed to Scene 4-12
	        scene4_12 = new Scene4_12();
	        scene4_12.start_Scene();
	        layeredPane.remove(option1);
	        layeredPane.remove(label);
	    }
	}

}
