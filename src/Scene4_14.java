package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Scene4_14 extends Scene4_1{
	JLabel label = new JLabel("Scene 4-14");
	
	String text1 = "I see. ";
	String text2 = "The two judges turned back to face the court. ";
	String text3 = "Now, let us move on to the second issue – the recklessness element of fraudulent misrepresentation. Counsel for the Plaintiff? ";
	String text4 = "Yes, your honour. ";
	
	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	greyTextPrinting slow2 = new greyTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);

	Integer btn_count = 2;

	public Scene4_14() {
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
	    
	    Image_label1.setBounds(-245, -170, 1920, 1080);
        layeredPane.add(Image_label1, Integer.valueOf(0));
        Image_label4.setBounds(-450, 120, 1920, 1080);
        layeredPane.add(Image_label4, Integer.valueOf(3));
                
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
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(slow1.getLabel());
        		layeredPane.repaint();
        		slow2.startPrinting();
        	}
        	if (btn_count == 3) {
        		layeredPane.remove(slow2.getLabel());
        		kun.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(kun, Integer.valueOf(5));
        		Image_label12.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label12, Integer.valueOf(10));
                slow3.startPrinting();
        	}
        	if (btn_count == 4) {
        		layeredPane.remove(kun);
        		layeredPane.remove(Image_label12);
        		layeredPane.remove(slow3.getLabel());
        		layeredPane.repaint();
        		wynn.setBounds(300, 550, 1000, 50);
        	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
        	    kun.setFont(txt);
        	    kun.setForeground(Color.BLACK);
        	    layeredPane.add(wynn, Integer.valueOf(5));
        		Image_label13.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label13, Integer.valueOf(10));
        		slow4.startPrinting();
        	}
        	if (btn_count == 5) {
        		//proceed tp Scene 5-1
        		layeredPane.remove(wynn);
        		layeredPane.remove(Image_label13);
        		layeredPane.remove(slow4.getLabel());
        		layeredPane.remove(label);
        	}
        }
	}

}
