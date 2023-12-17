package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene1_1 extends start_scene implements ActionListener{
	JLabel label1_1 = new JLabel("Scene 1-1");
	JButton next = new JButton("Next");
	JButton option1 = new JButton("Why do we need that memory? Isn’t the whole trial like you said, already recorded onto the court judgment?");
	JButton option2 = new JButton("I understand. You can start the experiment now. ");
	JButton option3 = new JButton("I refuse to participate in this non-sense. I’ll be leaving now. Goodbye.");
	
	JLabel unknown = new JLabel("Unknown");
	JLabel teresa = new JLabel("Teresa");
	
	String text1 = "Hold on… Let me record this session for the sake of future reference… It is the 15th of March, 2157, 2:32 in the p.m.  ";
	String text2 = "I am archaeologist research assistant D. Teresa, employee ID B-284D. In front of me is experiment MP-A participant Ashley D. Law. ";
	String text3 = "Thank you for agreeing to participate in the Mementex Program. Our goal is to utilize the newly-developed Mementex technology - short for Memento Lex - remember law.";
	String text4 = "This technology accesses the ancient memories stored in our body, muscles and brains in the form of miniscule electrical signals. ";
	String text5 = "Believe it or not, we inherit a vast amount of memories of our ancestors, we just don’t realize it and cannot pinpoint these memories in an ocean of complex neural networks.  ";
	String text6 = "This changes however, after we have developed the technology of something like a search engine; so that by inputting a string of words or passages into our biological bodies, we can briefly relive and re-experience that part of memory at the time it was formed, inside our heads. ";
	String text7 = "For today’s session, we are planning to input a court judgment dated in 2016 in order to retrieve legal doctrines related to consumer protection law from the 19-21st century common law jurisdiction. ";
	
    SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
    SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
    SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
    SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
    SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
    SlowTextPrinting slow6 = new SlowTextPrinting(layeredPane, text6);
    SlowTextPrinting slow7 = new SlowTextPrinting(layeredPane, text7);
    
    static ImageIcon Image1 = new ImageIcon("data/lab.png");
    static JLabel Image_lab = new JLabel(Image1);
	
	Integer btn_count = 2;
	
	private Scene1_2 scene1_2;
	private Scene1_3 scene1_3;
	End1 end1;
	
    public Scene1_1() {
    	super();
    }

    public void startScene() {
    	Image_lab.setBounds(-245, -170, 1920, 1080);
        layeredPane.add(Image_lab, Integer.valueOf(1));
    	
    	label1_1.setBounds(100, 50, 1000, 50);
        Font titleFont = new Font("Monospaced", Font.ITALIC, 24);
        label1_1.setFont(titleFont);
        label1_1.setForeground(Color.BLACK);

        // Remove existing components
        layeredPane.remove(logo_label);
        layeredPane.remove(start);

        // Add new components
        layeredPane.add(label1_1, Integer.valueOf(2));
        
        unknown.setBounds(300, 550, 1000, 50);
        Font txt = new Font("Monospaced", Font.ITALIC, 24);
        unknown.setFont(txt);
        unknown.setForeground(Color.BLACK);
        layeredPane.add(unknown, Integer.valueOf(3));

        Image_label4.setBounds(-450, 120, 1920, 1080);
        layeredPane.add(Image_label4, Integer.valueOf(3));
        
        next.setBounds(950, 700, 100, 50);
        layeredPane.add(next, Integer.valueOf(3));
        next.addActionListener(this);
        
        Image_label6.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label6, Integer.valueOf(3));
        
        slow1.startPrinting();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
        	if(btn_count == 2) {
        		layeredPane.remove(slow1.getLabel());
        		slow2.startPrinting();
        	}
        	if(btn_count == 3) {
        		layeredPane.remove(unknown);
        		layeredPane.remove(slow2.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                teresa.setFont(txt);
                teresa.setForeground(Color.BLACK);
                layeredPane.add(teresa, Integer.valueOf(4));
                Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(5));
        		slow3.startPrinting();
        	}
        	if(btn_count == 4) {
        		layeredPane.remove(slow3.getLabel());
        		slow4.startPrinting();
        	}
        	if(btn_count == 5) {
        		layeredPane.remove(slow4.getLabel());
        		slow5.startPrinting();
        	}
        	if(btn_count == 6) {
        		layeredPane.remove(slow5.getLabel());
        		slow6.startPrinting();
        	}
        	if(btn_count == 7) {
        		layeredPane.remove(slow6.getLabel());
        		slow7.startPrinting();
        	}
        	if(btn_count == 8) {
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.remove(slow7.getLabel());
        		layeredPane.remove(next);
        		layeredPane.revalidate();
        		layeredPane.repaint();
        		option1.setBounds(120, 620, 700, 30);
                layeredPane.add(option1, Integer.valueOf(4));
                option1.addActionListener(this);
                option2.setBounds(120, 650, 700, 30);
                layeredPane.add(option2, Integer.valueOf(4));
                option2.addActionListener(this);
                option3.setBounds(120, 680, 700, 30);
                layeredPane.add(option3, Integer.valueOf(4));
                option3.addActionListener(this);
        	}
        	btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 1-2
        	scene1_2 = new Scene1_2();
            scene1_2.startScene();
            layeredPane.revalidate();
            layeredPane.repaint();
            layeredPane.remove(label1_1);
            layeredPane.remove(option1);
            layeredPane.remove(option2);
            layeredPane.remove(option3);
        }
        if (e.getSource() == option2) {
        	//proceed to Scene 1-3
        	scene1_3 = new Scene1_3();
        	scene1_3.startScene();
            layeredPane.revalidate();
            layeredPane.repaint();
            layeredPane.remove(label1_1);
            layeredPane.remove(option1);
            layeredPane.remove(option2);
            layeredPane.remove(option3);
        }
        if (e.getSource() == option3) {
        	//Ending 1
        	end1 = new End1();
        	end1.start_Scene();
        	layeredPane.remove(label1_1);
            layeredPane.remove(option1);
            layeredPane.remove(option2);
            layeredPane.remove(option3);
        }
    }
}