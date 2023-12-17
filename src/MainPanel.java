package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
    public static JLayeredPane layeredPane = new JLayeredPane();
    public static JFrame frame = new JFrame();
    public int score = 0;

    public static final int START_GAME_STATE = 0;
    public static final int GAME_PLAYING_STATE = 1;
    public static final int GAME_LOCK_STATE = 2;
    public int gameState = START_GAME_STATE;

    public MainPanel() {
    	
    }

    public static void main(String[] args) {
        layeredPane.setBounds(0, 0, 1920, 1080);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Law Game @Julie");
        frame.setSize(1920, 1080);
        frame.setVisible(true);

        start_scene startScene = new start_scene();
    }
}
