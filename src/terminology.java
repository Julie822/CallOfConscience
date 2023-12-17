package LawGame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class terminology {
	public static JLayeredPane layeredPane = new JLayeredPane();
    public static JFrame menuframe = new JFrame("Termnologies");
    
    static ImageIcon Image1 = new ImageIcon("data/terminology.png");
    static JLabel Image_label1 = new JLabel(Image1);
    	
	public terminology() {
		layeredPane.setBounds(100, 10, 450, 636);
        menuframe.add(layeredPane);
        menuframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuframe.setTitle("Terminologies");
        menuframe.setSize(450, 636);
        menuframe.setVisible(true);
        
        menuframe.add(Image_label1);
	}

}
