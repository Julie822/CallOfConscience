package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Disclaimer extends start_scene{
	JButton next = new JButton("Next");
	static ImageIcon Image = new ImageIcon("data/Disclaimer.png");
    static JLabel Image_dis = new JLabel(Image);
    private Scene1_1 scene1_1;
	
	public Disclaimer() {
		super();
	}
	
	public void startScene() {
		layeredPane.remove(logo_label);
		layeredPane.remove(start);
        
        Image_dis.setBounds(-245, -170, 1920, 1080);
        layeredPane.add(Image_dis, Integer.valueOf(1));
		
        next.setBounds(650, 600, 100, 50);
        layeredPane.add(next, Integer.valueOf(3));
        
        menu.setBounds(10, 10, 100, 50);
        layeredPane.add(menu, Integer.valueOf(3));

        next.addActionListener(this);
        menu.addActionListener(this);

        frame.add(layeredPane);

	}
	
	public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == next) {
            scene1_1 = new Scene1_1();
            scene1_1.startScene();
            layeredPane.remove(Image_dis);
            layeredPane.remove(next);
            layeredPane.revalidate();
            layeredPane.repaint();
        }
	}

}
