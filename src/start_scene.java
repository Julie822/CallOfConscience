package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class start_scene extends MainPanel implements ActionListener {
    MainPanel mainPanel = new MainPanel();
    static ImageIcon Image1 = new ImageIcon("data/courtroom.png");
    static ImageIcon Image2 = new ImageIcon("data/name.png");
    static ImageIcon Image3 = new ImageIcon("data/option.png");
    static ImageIcon Image4 = new ImageIcon("data/textbox.png");
    static ImageIcon Image5 = new ImageIcon("data/Subject.png");
    static ImageIcon Image6 = new ImageIcon("data/teresa.png");
    static ImageIcon Image7 = new ImageIcon("data/unknown_lawyer.png");
    static ImageIcon Image8 = new ImageIcon("data/unknown_judge.png");
    static ImageIcon Image9 = new ImageIcon("data/Cinders.png");
    static ImageIcon Image10 = new ImageIcon("data/wynn.png");
    static ImageIcon Image11 = new ImageIcon("data/unknown_lawyer2.png");
    static ImageIcon Image12 = new ImageIcon("data/Judge.png");
    static ImageIcon Image13 = new ImageIcon("data/lee.png");
    static ImageIcon Image14 = new ImageIcon("data/Logo.png");
    static ImageIcon Image15 = new ImageIcon("data/Lee_Guy_S.png");
    static ImageIcon Image16 = new ImageIcon("data/Dianoor_Rep_S.png");
    static ImageIcon Image17 = new ImageIcon("data/Dianoor.png");
    static ImageIcon Image18 = new ImageIcon("data/liquidator.png");
    static ImageIcon Image19 = new ImageIcon("data/Liquidator2.png");
    static ImageIcon Image20 = new ImageIcon("data/Liquidator3.png");
    
    static JLabel Image_label1 = new JLabel(Image1);
    static JLabel Image_label2 = new JLabel(Image2);
    static JLabel Image_label3 = new JLabel(Image3);
    static JLabel Image_label4 = new JLabel(Image4);
    static JLabel Image_label5 = new JLabel(Image5);
    static JLabel Image_label6 = new JLabel(Image6);	//resize 500
    static JLabel Image_label7 = new JLabel(Image7);
    static JLabel Image_label8 = new JLabel(Image8);
    static JLabel Image_label9 = new JLabel(Image9);
    static JLabel Image_label10 = new JLabel(Image10);
    static JLabel Image_label11 = new JLabel(Image11);
    static JLabel Image_label12 = new JLabel(Image12);
    static JLabel Image_label13 = new JLabel(Image13);
    static JLabel logo_label = new JLabel(Image14);
    static JLabel Image_label15 = new JLabel(Image15);
    static JLabel Image_label16 = new JLabel(Image16);
    static JLabel Image_label17 = new JLabel(Image17);
    static JLabel Image_liquidator = new JLabel(Image18);
    static JLabel Image_liquidator2 = new JLabel(Image19);
    static JLabel Image_liquidator3 = new JLabel(Image20);
    
    static JLabel title = new JLabel("Call of Conscience");
    static JLabel disclaimer = new JLabel("Disclaimer:");
    static JLabel d1 = new JLabel("this game is not legal advice, it is a student-made interactive game aimed at");
    static JLabel d2 = new JLabel("increasing awareness on various legal knowledge and promote legal education. The court procedures ");
    static JLabel d3 = new JLabel("and interpretation of the law within the game are not to be considered as legal advice, and may be ");
    static JLabel d4 = new JLabel("subject to inaccuracies. ");
    
    private Disclaimer disclaimer_scene;
    public MenuPanel menuPanel;
    public terminology Terminology;

    static JButton start = new JButton("Start");
    static JButton menu = new JButton("Menu");
    static JButton terminology = new JButton("Terminologies");
    
    Scene3_3 scene3_3;

    public start_scene() {
        Image_label1.setBounds(-245, -170, 1920, 1080);
        layeredPane.add(Image_label1, Integer.valueOf(0));
        
        logo_label.setBounds(450, 50, 500, 693);
        layeredPane.add(logo_label, Integer.valueOf(3));

        start.setBounds(650, 600, 100, 50);
        layeredPane.add(start, Integer.valueOf(3));
        
        menu.setBounds(10, 10, 100, 50);
        layeredPane.add(menu, Integer.valueOf(3));
        
        terminology.setBounds(120, 10, 110, 50);
        layeredPane.add(terminology, Integer.valueOf(3));

        start.addActionListener(this);
        menu.addActionListener(this);
        terminology.addActionListener(this);

        frame.add(layeredPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button actions here
        if (e.getSource() == start) {
        	layeredPane.repaint();
            disclaimer_scene = new Disclaimer();
            disclaimer_scene.startScene();
        	//scene3_3 = new Scene3_3();
        	//scene3_3.startScene();
            layeredPane.revalidate();
            layeredPane.repaint();
        }
        if (e.getSource() == menu) {
        	menuPanel = new MenuPanel();
        }
        
        if (e.getSource() == terminology) {
        	Terminology = new terminology();
        }
    }

}
