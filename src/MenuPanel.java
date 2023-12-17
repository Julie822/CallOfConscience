package LawGame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MenuPanel {
	public static JLayeredPane layeredPane = new JLayeredPane();
    public static JFrame menuframe = new JFrame("Menu");
    
    static ImageIcon Image1 = new ImageIcon("data/character_map.png");
    static JLabel Image_label1 = new JLabel(Image1);
    
	public MenuPanel() {
		layeredPane.setBounds(10, 10, 500, 500);
        menuframe.add(layeredPane);
        menuframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuframe.setTitle("Menu Panel");
        menuframe.setSize(500, 500);
        menuframe.setVisible(true);
        
        menuframe.add(Image_label1);
	}
	
	public void showMenu() {
        // Logic to show the menu
		menuframe.setVisible(true);
    }

}
