package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene3_1 extends Scene2_2{
	JLabel label = new JLabel("Scene 3-1");
	JButton option1 = new JButton("<html><center>What? That was such a long chain of events. How am I supposed to remember all of- Ah! Counsel for the plaintiff, could you please summarize these case facts again?</center></html>");
	JButton option2 = new JButton("Very well. What should be the next step, then?");
	
	static ImageIcon Image_dia = new ImageIcon("data/diamonds.jpeg");
    static JLabel diamonds_label = new JLabel(Image_dia);
	
	String text1 = "The defendant is a member of a group of companies known as the Demidov Diamonds. which used to carry on a very successful jewellery business with offices in London, Hong Kong and other parts of the world. ";
	String text2 = " The Hong Kong division of the Demidov Diamonds was made up of the defendant and two other companies. ";
	String text3 = "On 25 April 2014, the Hong Kong court appointed Ms Carrie Anderson,  Mr Jacky Hildegarde, and Mr Dustin Valkyrie from Kylian Co., an accounting firm, as the receivers and managers of those three companies. ";
	String text4 = "In December 2014, the employees petitioned for the winding up of the companies for non-payment of wages. The same individuals were appointed as provisional liquidators of the companies in December 2015. ";
	String text5 = "Upon the appointment of the receivers, Ms Anderson secured the assets of the defendant. On 2 May 2014, she and her staff arranged for the opening of the vault in the defendant’s office. ";
	String text6 = "An inventory of various items of jewellery in the vault was taken by them in the presence of an independent solicitor, Mr Damien Laracroft. ";
	String text7 = "Among the jewellery was a collection of eight stones inside a piece of folded paper. Kylian Co. was not able to identify any entry in the defendant’s books and stock inventory referable to the eight stones. ";
	String text8 = "On 3 May 2014, a staff of Kylian Co. arranged for a gratuitous survey of the jewellery items in the vault by Ms Verena Choi. Choi is a graduated gemmologist and an assistant manager of a branch office of Chan Man Man Jewellery Co Ltd. ";
	String text9 = "Ms Choi wrote to KPMG giving a rough estimate of all the jewellery items at $7 million, but did not give a breakdown of the individual items. ";
	String text10 = "In mid April 2016, Ms Anderson decided to sell all the jewellery items and appointed Altera.inc as the auctioneer.  ";
	String text11 = "Delivery of all the jewellery items to Altera.inc was completed on 6 September 2016, with a collection list prepared by Kylian Co. in which the eight stones were described as \"diamond stones (8 pcs) 70. 59 carats\". ";
	String text12 = "Ms Anderson left it to Altera.inc to identify and evaluate each item for the purpose of establishing a reserved price and for the preparation of the auction catalogue. ";
	String text13 = "In the catalogue, the eight stones were identified as Lots 94 to 101 and each was described as \"Rough Diamond Stone\" with an approximate weight. Attached to the catalogue was the Notice to Bidders and Conditions of Sale. ";
	String text14 = "The jewellery items for auction stated in the advertisements included \"eight rough diamond stones of a total weight of 70. 59 carat\". ";
	String text15 = "In the morning of 24 November 2016, the plaintiff of this case, Guy Lee, attended the hotel. He operated a small jewellery business. ";
	String text16 = "At the auction, the auctioneer asked the persons attending if they had any difficulty understanding English. ";
	String text17 = "The plaintiff went through the main terms and conditions, in particular the \"As Is\" clause in the Notice to Bidders which read: ";
	String text18 = "“All goods are sold \"AS IS, WHERE IS, WITH ALL FAULTS\"  \n"
			+ "Illustrations, pictures or weight are for the convenience of buyers only. The auctioneer has used its reasonable endeavors to ensure that the description of each lot(s) appearing in this catalog are accurate, but buyers are recommended to rely upon such description at its own risk.” "; //fix
	String text19 = "Before the bidding of each item began, a picture of the item was projected on the screen and the auctioneer gave a short description. Each of the eight stones was described by the auctioneer as \"rough diamond stone\" when its picture was shown. ";
	String text20 = "The plaintiff successfully bid for seven of the eight stones for a total price of $1,155,000 including 10% premium. ";
	String text21 = "When the plaintiff and his party later took the Stones out of the plastic bags, they were alarmed by the smooth appearance and decided to have them examined by a gemmological testing centre. On examination, the Stones were found to be not diamonds, but synthetic cubic zirconia. ";
	String text22 = "That was the factual background of this case, your honour. ";

	SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	SlowTextPrinting slow3 = new SlowTextPrinting(layeredPane, text3);
	SlowTextPrinting slow4 = new SlowTextPrinting(layeredPane, text4);
	SlowTextPrinting slow5 = new SlowTextPrinting(layeredPane, text5);
	SlowTextPrinting slow6 = new SlowTextPrinting(layeredPane, text6);
	SlowTextPrinting slow7 = new SlowTextPrinting(layeredPane, text7);
	SlowTextPrinting slow8 = new SlowTextPrinting(layeredPane, text8);
	SlowTextPrinting slow9 = new SlowTextPrinting(layeredPane, text9);
	SlowTextPrinting slow10 = new SlowTextPrinting(layeredPane, text10);
	SlowTextPrinting slow11 = new SlowTextPrinting(layeredPane, text11);
	SlowTextPrinting slow12 = new SlowTextPrinting(layeredPane, text12);
	SlowTextPrinting slow13 = new SlowTextPrinting(layeredPane, text13);
	SlowTextPrinting slow14 = new SlowTextPrinting(layeredPane, text14);
	SlowTextPrinting slow15 = new SlowTextPrinting(layeredPane, text15);
	SlowTextPrinting slow16 = new SlowTextPrinting(layeredPane, text16);
	SlowTextPrinting slow17 = new SlowTextPrinting(layeredPane, text17);
	SlowTextPrinting slow18 = new SlowTextPrinting(layeredPane, text18);
	SlowTextPrinting slow19 = new SlowTextPrinting(layeredPane, text19);
	SlowTextPrinting slow20 = new SlowTextPrinting(layeredPane, text20);
	SlowTextPrinting slow21 = new SlowTextPrinting(layeredPane, text21);
	SlowTextPrinting slow22 = new SlowTextPrinting(layeredPane, text22);
	
	Integer btn_count = 2;
	
	Scene3_2 scene3_2;
	Scene3_3 scene3_3;

	public Scene3_1() {
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

	    // Set bounds and add components
	    cinders.setBounds(300, 550, 1000, 50);
	    Font txt = new Font("Monospaced", Font.ITALIC, 24);
	    cinders.setFont(txt);
	    cinders.setForeground(Color.BLACK);
	    layeredPane.add(cinders, Integer.valueOf(5));

	    Image_label17.setBounds(-200, 10, 800, 1000);
        layeredPane.add(Image_label17, Integer.valueOf(3));

	    next.setBounds(950, 700, 100, 50);
	    layeredPane.add(next, Integer.valueOf(6));
	    next.addActionListener(this);

	    // Start the text printing
	    slow1.startPrinting();
	}

	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
        	if(btn_count == 2) {
                layeredPane.remove(slow1.getLabel());
                layeredPane.remove(Image_label17);
                layeredPane.repaint();
                slow2.startPrinting();
            }
            if(btn_count == 3) {
                layeredPane.remove(slow2.getLabel());
                Image_liquidator.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_liquidator, Integer.valueOf(3));
        	    Image_liquidator2.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_liquidator2, Integer.valueOf(3));
        	    Image_liquidator3.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_liquidator3, Integer.valueOf(3));
                slow3.startPrinting();
            }
            if(btn_count == 4) {
                layeredPane.remove(slow3.getLabel());
                layeredPane.remove(Image_liquidator);
                layeredPane.remove(Image_liquidator2);
                layeredPane.remove(Image_liquidator3);
                layeredPane.repaint();
                slow4.startPrinting();
            }
            if(btn_count == 5) {
                layeredPane.remove(slow4.getLabel());
                Image_liquidator.setBounds(-200, 10, 800, 1000);
                layeredPane.add(Image_liquidator, Integer.valueOf(4));
                slow5.startPrinting();
            }
            if(btn_count == 6) {
                layeredPane.remove(slow5.getLabel());
                layeredPane.remove(Image_liquidator);
                layeredPane.repaint();
                slow6.startPrinting();
            }
            if(btn_count == 7) {
                layeredPane.remove(slow6.getLabel());
                slow7.startPrinting();
            }
            if(btn_count == 8) {
                layeredPane.remove(slow7.getLabel());
                Image_liquidator.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_liquidator, Integer.valueOf(3));
        	    Image_liquidator2.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_liquidator2, Integer.valueOf(3));
        	    Image_liquidator3.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_liquidator3, Integer.valueOf(3));
                slow8.startPrinting();
            }
            if(btn_count == 9) {
                layeredPane.remove(slow8.getLabel());
                layeredPane.remove(Image_liquidator);
                layeredPane.remove(Image_liquidator2);
                layeredPane.remove(Image_liquidator3);
                layeredPane.repaint();
                slow9.startPrinting();
            }
            if(btn_count == 10) {
                layeredPane.remove(slow9.getLabel());
                slow10.startPrinting();
            }
            if(btn_count == 11) {
                layeredPane.remove(slow10.getLabel());
                Image_liquidator.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_liquidator, Integer.valueOf(3));
        	    Image_liquidator2.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_liquidator2, Integer.valueOf(3));
        	    Image_liquidator3.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_liquidator3, Integer.valueOf(3));
                slow11.startPrinting();
            }
            if(btn_count == 12) {
                layeredPane.remove(slow11.getLabel());
                layeredPane.remove(Image_liquidator);
                layeredPane.remove(Image_liquidator2);
                layeredPane.remove(Image_liquidator3);
                layeredPane.repaint();
                slow12.startPrinting();
            }
            if(btn_count == 13) {
                layeredPane.remove(slow12.getLabel());
                slow13.startPrinting();
            }
            if(btn_count == 14) {
                layeredPane.remove(slow13.getLabel());
                slow14.startPrinting();
            }
            if(btn_count == 15) {
                layeredPane.remove(slow14.getLabel());
                Image_label13.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label13, Integer.valueOf(3));
                slow15.startPrinting();
            }
            if(btn_count == 16) {
                layeredPane.remove(slow15.getLabel());
                layeredPane.remove(Image_label13);
                layeredPane.repaint();
                slow16.startPrinting();
            }
            if(btn_count == 17) {
                layeredPane.remove(slow16.getLabel());
                Image_label13.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label13, Integer.valueOf(3));
                slow17.startPrinting();
            }
            if(btn_count == 18) {
                layeredPane.remove(slow17.getLabel());
                layeredPane.remove(Image_label13);
                layeredPane.repaint();
                slow18.startPrinting();
            }
            if(btn_count == 19) {
                layeredPane.remove(slow18.getLabel());
                slow19.startPrinting();
            }
            if(btn_count == 20) {
                layeredPane.remove(slow19.getLabel());
                diamonds_label.setBounds(400 , 50, 500, 500);
                layeredPane.add(diamonds_label, Integer.valueOf(10));
                Image_label13.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label13, Integer.valueOf(3));
                slow20.startPrinting();
            }
            if(btn_count == 21) {
                layeredPane.remove(slow20.getLabel());
                layeredPane.remove(diamonds_label);
                slow21.startPrinting();
            }
            if(btn_count == 22) {
                layeredPane.remove(slow21.getLabel());
                slow22.startPrinting();
            }
            if(btn_count == 23) {
                layeredPane.remove(slow22.getLabel());
                layeredPane.remove(cinders);
                layeredPane.remove(next);
                layeredPane.remove(Image_label9);
                layeredPane.remove(Image_label13);
                layeredPane.repaint();
                option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
            }
            btn_count++;
        }
        if (e.getSource() == option1) {
        	//proceed to Scene 3-2
        	scene3_2 = new Scene3_2();
        	scene3_2.startScene();
        	layeredPane.remove(label);
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        }
        if (e.getSource() == option2) {
        	//proceed to Scene 3-3
        	scene3_3 = new Scene3_3();
        	scene3_3.startScene();
        	layeredPane.remove(label);
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        }
    }
}
