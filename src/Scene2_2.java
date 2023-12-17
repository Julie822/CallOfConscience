package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene2_2 extends Scene2_1{
	JLabel label = new JLabel("Scene 2-2");
    JLabel unknown_lawyer = new JLabel("Unknown lawyer");
    JLabel player = new JLabel("Player");
    JLabel cinders = new JLabel("Cinders");
    
    String text1 = "The court fell silent after my interruption.  Everyone’s gaze focused onto my face like sun rays converging from a magnifier. That brief second felt like an eternity.  ";
    String text2 = "The next thing I noticed: the professional-looking counsels reached to the dark, thick bundles and flipped through the pages. Within just a few seconds, they are ready to present again. ";
    String text3 = "Certainly, Justice Papadoumian. ";
    String text4 = "The defendant is- ";
    String text5 = "Sorry, what’s your name, again? ";
    String text6 = "The young intellectual is initially taken back by the question, but recomposes herself within a split second. On her face she wears a professional, but convincing smile. ";
    String text7 = "Your honour, I am Dominique Cinders, counsel representing the defendant of this case. ";
    
    greyTextPrinting slow1 = new greyTextPrinting(layeredPane, text1);
    greyTextPrinting slow2 = new greyTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	greyTextPrinting slow6 = new greyTextPrinting(layeredPane, text6);
	SlowTextPrinting slow7 = new SlowTextPrinting(layeredPane, text7);
	
	Integer btn_count = 2;
	
	Scene3_1 scene3_1;
	
	public Scene2_2() {
		super();
    }
    
    public void startScene() {
        label.setBounds(100, 50, 1000, 50);
        Font titleFont = new Font("Monospaced", Font.ITALIC, 24);
        label.setFont(titleFont);
        label.setForeground(Color.BLACK);

        // Remove existing components
        layeredPane.remove(logo_label);
        layeredPane.remove(start);
        layeredPane.remove(next);

        // Add new components
        layeredPane.add(label, Integer.valueOf(3));
        
        next.setBounds(950, 700, 100, 50);
        layeredPane.add(next, Integer.valueOf(6));
        next.addActionListener(this);
        
        slow1.startPrinting();  
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
        	if(btn_count == 2) {
	        	layeredPane.remove(slow1.getLabel());
	        	Image_label8.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label8, Integer.valueOf(3));
        	    Image_label11.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_label11, Integer.valueOf(3));
        	    Image_label15.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_label15, Integer.valueOf(3));
	        	slow2.startPrinting();  
        	}
        	if(btn_count == 3) {
	        	layeredPane.remove(slow2.getLabel());
	        	layeredPane.remove(Image_label8);
	        	layeredPane.remove(Image_label11);
	        	layeredPane.remove(Image_label15);
	        	layeredPane.repaint();
	        	unknown_lawyer.setBounds(300, 550, 1000, 50);
	            Font txt = new Font("Monospaced", Font.ITALIC, 24);
	            unknown_lawyer.setFont(txt);
	            unknown_lawyer.setForeground(Color.BLACK);
	            layeredPane.add(unknown_lawyer, Integer.valueOf(5));
	            Image_label7.setBounds(850, 10, 800, 1000);
	            layeredPane.add(Image_label7, Integer.valueOf(3));
	        	slow3.startPrinting();  
        	}
        	if(btn_count == 4) {
	        	layeredPane.remove(slow3.getLabel());
	        	slow4.startPrinting();  
        	}
        	if(btn_count == 5) {
        		layeredPane.remove(unknown_lawyer);
        		layeredPane.remove(Image_label7);
        		layeredPane.repaint();
	        	layeredPane.remove(slow4.getLabel());
                Image_label8.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label8, Integer.valueOf(3));
        	    Image_label11.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_label11, Integer.valueOf(3));
        	    Image_label15.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_label15, Integer.valueOf(3));
	        	slow5.startPrinting();  
        	}
        	if(btn_count == 6) {
	        	layeredPane.remove(slow5.getLabel());
	        	layeredPane.remove(Image_label8);
	        	layeredPane.remove(Image_label11);
	        	layeredPane.remove(Image_label15);
	        	layeredPane.repaint();
	        	slow6.startPrinting();  
        	}
        	if(btn_count == 7) {
        		layeredPane.remove(player);
	        	layeredPane.remove(slow6.getLabel());
	        	layeredPane.repaint();
	        	cinders.setBounds(300, 550, 1000, 50);
	            Font txt = new Font("Monospaced", Font.ITALIC, 24);
	            cinders.setFont(txt);
	            cinders.setForeground(Color.BLACK);
	            layeredPane.add(cinders, Integer.valueOf(5));
	            Image_label9.setBounds(850, 10, 800, 1000);
	            layeredPane.add(Image_label9, Integer.valueOf(10));
	            Image_label8.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label8, Integer.valueOf(3));
        	    Image_label11.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_label11, Integer.valueOf(3));
        	    Image_label15.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_label15, Integer.valueOf(3));
	        	slow7.startPrinting();  
        	}
        	if (btn_count == 8) {
        		//proceed to Scene 3-1
        		scene3_1 = new Scene3_1();
        		scene3_1.startScene();
        		layeredPane.remove(cinders);
        		layeredPane.remove(unknown_lawyer);
        		layeredPane.remove(label);
        		layeredPane.remove(next);
        		layeredPane.remove(Image_label8);
	        	layeredPane.remove(Image_label11);
	        	layeredPane.remove(Image_label15);
        		layeredPane.repaint();
        		layeredPane.remove(slow7.getLabel());
        	}
        	btn_count++;
        }
    }

}
