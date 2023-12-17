package LawGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Scene2_1 extends Scene1_1{
    JLabel label = new JLabel("Scene 2-1");
    JLabel unknown_lawyer = new JLabel("Unknown lawyer");
    JLabel unknown_judge = new JLabel("Unknown judge");
    JLabel player = new JLabel("Player");
    String text1 = "…... notice of…... as...... further revised…... \n day before the hearing, what…... reasons…...";
    String text2 = "My learned colleagues...… submitted…... ";
    String text3 = "My head feels like it’s going to burst. I feel like bubbles are forming and popping within my brain, stirring it upwards and sideways. Whose memories are these…... What am I seeing?";
    String text4 = "My vision slowly clears up. I find myself in an unfinished jigsaw puzzle of memories, impressions of the courtroom, the lingering smell of wood, squeaky floorboards, all roughly put together by a trailblazing technology to bring me back to a certain moment of time amidst the vast history of mankind.";
    String text5 = "Anything I see here has either happened a million times, or simply drifted at the edges of my ancestors’ subconsciousness as figments of imagination. Can I get anything of use here? Wait…... what was I even here FOR again......? ";
    String text6 = "I remember. I am here to discover history. Digging up the ancient relics of wisdom. I faintly remember hearing the terms of a “common law,” by which future decisions are based on and bound by past decisions.  ";
    String text7 = "Is that true though? Has there ever been such civility and rationality in determining right or wrong? I don’t know...... The 30-year World War 4 has taken away too many things. How humanity has fallen...... I don’t even remember how the world was like before the war, but now I’m here: 2016. ";
    String text8 = "I can see everything much more clearly now. I’m definitely sitting inside a courtroom: a bastion of marble and oak, its walls adorned with the portraits of eminent jurists, their stern countenances silently observing the ebb and flow of the human drama.  ";
    String text9 = "Sunlight filtered through the grand windows and casts a melancholic glow upon a sea of faces. I look around and see two judges beside me, both adorned with snow-white hair and solemn expressions. ";
    String text10 = "Does this mean…... I am reliving the memories of another judge in this trial. What is going to happen? ";
    String text11 = "I see a person dressed in professional attire stand up to prepare for her speech. Her relatively younger age does not match the experienced confidence displayed in her movements. ";
    String text12 = "We submitted the amendment of notice of appeal for 3 reasons. ";
    String text13 = "One, to bring an appeal against the decision on costs; ";
    String text14 = "Two, to challenge the judge’s finding that the defendant’s vault was only accessible to its \"four top managers\" and they together were the defendant’s \"only controlling minds;\" ";
    String text15 = "And finally three, to challenge the holding on the claim in contract for total failure of consideration, your honour. ";
    String text16 = "Plaintiff’s counsel, just now, the court has allowed you to file a respondent’s notice out of time to affirm the judgment on an additional ground. Do you have any response to the amendments made by the defendant? ";
    String text17 = "We have no objection to the first and third amendments. However, we are opposed to the second amendment due to the lateness of this submission. ";
    String text18 = "The plaintiff did not have sufficient time to verify the matters deposed to by the defendant’s solicitor, regarding the trial bundles and the transcript of evidence. ";
    String text19 = "What are these people saying? I can understand every single word individually. But stringed together, they sound like foreign language without the YV3II-Transcriptor I bought 2 months ago. ";
    String text20 = "Suddenly, I feel a swirling sensation inside my head. Words are flowing out from me like memories from the distant future. ";
    String text21 = "Hey...... HEY! I’m Teresa, the archaeologist research assistant. You still remember me? ";
    String text22 = "You DO recall that you are inside of an experimental memory dive that we are conducting, right? ";
    String text23 = "I have to say, we are collecting some really interesting data here. If everything goes right, this can be massively beneficial for not just our studies, but the entirety of mankind.  ";
    String text24 = "Don’t worry, by the way. I’m just speaking inside your head, like a split personality. The others can’t hear me.  ";
    String text25 = "I try my best to conjure up words within my head, in an effort to communicate implicitly with a scientist more than 100 years in the future. ";
    String text26 = "Teresa. I didn’t know I was gonna be a judge? What am I supposed to do here? I know nothing about this case, these people, and definitely not a single word that they have been saying! ";
    String text27 = "Hmm. That could be a problem...... Why not try asking? You are one of the judges, after all. ";
    String text28 = "What? Are you serious? I don’t know anything about law! Especially not law in 21st century Hong Kong!  ";
    String text29 = "I’ll make an embarrassment out of myself. And what if they find out I’m not a real judge? I’ll get caught and arrested, probably. ";
    String text30 = "Calm down. Remember, this has already happened a long time ago. You are simply experiencing everything again through muscle memory, your real body is still here with us at the lab!  ";
    String text31 = "Things that happened have already happened. By asking for more information in the court, you won’t alter the course of history. This will only assist you and our access and understanding of this memory shard. ";
    String text32 = "For the difficult legal lingo, don’t worry. As we monitor your progress, we are putting together a real-time updated database of glossaries, relationship maps, and images, to better your understanding of what’s going on. It’s all being updated into your brain. ";
    String text33 = "Also, it is impossible to be embarrassed, or exposed, or imprisoned by these people. They are only figments of the past! They’re probably all dead at this point, anyway. ";
	String text34 = "Huh. I...... guess that makes sense. Yea okay, I’ll try to ask for some more details. Wow, what a trip this is. ";
    
    SlowTextPrinting slow1 = new SlowTextPrinting(layeredPane, text1);
	SlowTextPrinting slow2 = new SlowTextPrinting(layeredPane, text2);
	greyTextPrinting slow3 = new greyTextPrinting(layeredPane, text3);
	greyTextPrinting slow4 = new greyTextPrinting(layeredPane, text4);
	greyTextPrinting slow5 = new greyTextPrinting(layeredPane, text5);
	greyTextPrinting slow6 = new greyTextPrinting(layeredPane, text6);
	greyTextPrinting slow7 = new greyTextPrinting(layeredPane, text7);
	greyTextPrinting slow8 = new greyTextPrinting(layeredPane, text8);
	greyTextPrinting slow9 = new greyTextPrinting(layeredPane, text9);
	greyTextPrinting slow10 = new greyTextPrinting(layeredPane, text10);
	greyTextPrinting slow11 = new greyTextPrinting(layeredPane, text11);
	SlowTextPrinting slow12 = new SlowTextPrinting(layeredPane, text12);
	SlowTextPrinting slow13 = new SlowTextPrinting(layeredPane, text13);
	SlowTextPrinting slow14 = new SlowTextPrinting(layeredPane, text14);
	SlowTextPrinting slow15 = new SlowTextPrinting(layeredPane, text15);
	SlowTextPrinting slow16 = new SlowTextPrinting(layeredPane, text16);
	SlowTextPrinting slow17 = new SlowTextPrinting(layeredPane, text17);
	SlowTextPrinting slow18 = new SlowTextPrinting(layeredPane, text18);
	greyTextPrinting slow19 = new greyTextPrinting(layeredPane, text19);
	greyTextPrinting slow20 = new greyTextPrinting(layeredPane, text20);
	SlowTextPrinting slow21 = new SlowTextPrinting(layeredPane, text21);
	SlowTextPrinting slow22 = new SlowTextPrinting(layeredPane, text22);
	SlowTextPrinting slow23 = new SlowTextPrinting(layeredPane, text23);
	SlowTextPrinting slow24 = new SlowTextPrinting(layeredPane, text24);
	greyTextPrinting slow25 = new greyTextPrinting(layeredPane, text25);
	greyTextPrinting slow26 = new greyTextPrinting(layeredPane, text26);
	SlowTextPrinting slow27 = new SlowTextPrinting(layeredPane, text27);
	greyTextPrinting slow28 = new greyTextPrinting(layeredPane, text28);
	greyTextPrinting slow29 = new greyTextPrinting(layeredPane, text29);
	SlowTextPrinting slow30 = new SlowTextPrinting(layeredPane, text30);
	SlowTextPrinting slow31 = new SlowTextPrinting(layeredPane, text31);
	SlowTextPrinting slow32 = new SlowTextPrinting(layeredPane, text32);
	SlowTextPrinting slow33 = new SlowTextPrinting(layeredPane, text33);
	greyTextPrinting slow34 = new greyTextPrinting(layeredPane, text34);

	JButton option1 = new JButton("<html><center>*Clear throat* My apologies, gentlemen of the, uh, court. <br>Would it be possible to go over what happened in the case, from start to finish, again?</center></html>");
	JButton option2 = new JButton("Ignore advice. Continue the undecipherable discussion. ");
	
	Integer btn_count = 2;
	
	Scene2_2 scene2_2;
	Scene4_1 scene4_1;
	
    public Scene2_1() {
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
        layeredPane.remove(Image_lab);
        layeredPane.remove(next);

        // Add new components
        layeredPane.add(label, Integer.valueOf(1));

        
        unknown_lawyer.setBounds(300, 550, 1000, 50);
        Font txt = new Font("Monospaced", Font.ITALIC, 24);
        unknown_lawyer.setFont(txt);
        unknown_lawyer.setForeground(Color.BLACK);
        layeredPane.add(unknown_lawyer, Integer.valueOf(5));
        
        Image_label4.setBounds(-450, 120, 1920, 1080);
        layeredPane.add(Image_label4, Integer.valueOf(4));
        
        Image_label8.setBounds(850, 10, 800, 1000);
        layeredPane.add(Image_label7, Integer.valueOf(5));
        
        Image_label7.setBounds(-200, 10, 800, 1000);
        layeredPane.add(Image_label7, Integer.valueOf(3));
        
        Image_label11.setBounds(200, 10, 800, 1000);
        layeredPane.add(Image_label11, Integer.valueOf(3));
        
        Image_label15.setBounds(600, 10, 800, 1000);
        layeredPane.add(Image_label15, Integer.valueOf(3));
        
        next.setBounds(950, 700, 100, 50);
        layeredPane.add(next, Integer.valueOf(4));
        next.addActionListener(this);
        
        slow1.startPrinting();  
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
        	if(btn_count == 2) {
	        	layeredPane.remove(slow1.getLabel());
	        	layeredPane.remove(Image_label7);
	        	layeredPane.repaint();
	        	Image_label8.setBounds(-200, 10, 800, 1000);
	            layeredPane.add(Image_label8, Integer.valueOf(3));
	        	slow2.startPrinting();  
        	}
        	if(btn_count == 3) {
        		layeredPane.remove(unknown_lawyer);
        		layeredPane.remove(Image_label8);
        		layeredPane.repaint();
        		layeredPane.remove(slow2.getLabel());
        		Image_label7.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label7, Integer.valueOf(3));
        		slow3.startPrinting();
        	}
        	if(btn_count == 4) {
        		layeredPane.remove(slow3.getLabel());
        		layeredPane.remove(Image_label7);
        		layeredPane.remove(Image_label11);
        		layeredPane.remove(Image_label15);
	        	layeredPane.repaint();
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
        		layeredPane.remove(slow7.getLabel());
        		slow8.startPrinting();
        	}
        	if(btn_count == 9) {
        		layeredPane.remove(slow8.getLabel());
        		slow9.startPrinting();
        	}
        	if(btn_count == 10) {
        		layeredPane.remove(slow9.getLabel());
        		slow10.startPrinting();
        	}
        	if(btn_count == 11) {
        		layeredPane.remove(slow10.getLabel());
        		slow11.startPrinting();
        	}
        	if(btn_count == 12) {
        		layeredPane.remove(slow11.getLabel());
        		unknown_lawyer.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                unknown_lawyer.setFont(txt);
                unknown_lawyer.setForeground(Color.BLACK);
                layeredPane.add(unknown_lawyer, Integer.valueOf(5));
                Image_label7.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label7, Integer.valueOf(3));
                Image_label8.setBounds(-200, 10, 800, 1000);
        	    layeredPane.add(Image_label8, Integer.valueOf(3));
        	    Image_label11.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_label11, Integer.valueOf(3));
        	    Image_label15.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_label15, Integer.valueOf(3));
        		slow12.startPrinting();
        	}
        	if(btn_count == 13) {
        		layeredPane.remove(slow12.getLabel());
        		layeredPane.remove(Image_label8);
        		layeredPane.remove(Image_label11);
        		layeredPane.remove(Image_label15);
	        	layeredPane.repaint();
        		slow13.startPrinting();
        	}
        	if(btn_count == 14) {
        		layeredPane.remove(slow13.getLabel());
        		slow14.startPrinting();
        	}
        	if(btn_count == 15) {
        		layeredPane.remove(slow14.getLabel());
        		slow15.startPrinting();
        	}
        	if(btn_count == 16) {
        		layeredPane.remove(unknown_lawyer);
        		layeredPane.remove(Image_label7);
        		layeredPane.repaint();
        		layeredPane.remove(slow15.getLabel());
        		unknown_judge.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                unknown_judge.setFont(txt);
                unknown_judge.setForeground(Color.BLACK);
                layeredPane.add(unknown_judge, Integer.valueOf(5));
                Image_label8.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label8, Integer.valueOf(3));
                Image_label11.setBounds(200, 10, 800, 1000);
        	    layeredPane.add(Image_label11, Integer.valueOf(3));
        	    Image_label15.setBounds(600, 10, 800, 1000);
                layeredPane.add(Image_label15, Integer.valueOf(3));
        		slow16.startPrinting();
        	}
        	if(btn_count == 17) {
        		layeredPane.remove(slow16.getLabel());
        		layeredPane.remove(unknown_judge);
        		layeredPane.remove(Image_label8);
        		layeredPane.remove(Image_label11);
        		layeredPane.remove(Image_label15);
        		layeredPane.repaint();
        		unknown_lawyer.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                unknown_lawyer.setFont(txt);
                unknown_lawyer.setForeground(Color.BLACK);
                layeredPane.add(unknown_lawyer, Integer.valueOf(5));
                Image_label11.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label11, Integer.valueOf(3));
        		slow17.startPrinting();
        	}
        	if(btn_count == 18) {
        		layeredPane.remove(slow17.getLabel());
        		slow18.startPrinting();
        	}
        	if(btn_count == 19) {
        		layeredPane.remove(unknown_lawyer);
        		layeredPane.remove(Image_label11);
        		layeredPane.repaint();
        		layeredPane.remove(slow18.getLabel());
        		slow19.startPrinting();
        	}
        	if(btn_count == 20) {
        		layeredPane.remove(slow19.getLabel());
        		slow20.startPrinting();
        	}
        	if(btn_count == 21) {
        		layeredPane.remove(player);
        		layeredPane.remove(slow20.getLabel());
        		layeredPane.repaint();
        		slow21.startPrinting();
        	}
        	if(btn_count == 22) {
        		layeredPane.remove(slow21.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                teresa.setFont(txt);
                teresa.setForeground(Color.BLACK);
                layeredPane.add(teresa, Integer.valueOf(5));
                Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(3));
        		slow22.startPrinting();
        	}
        	if(btn_count == 23) {
        		layeredPane.remove(slow22.getLabel());
        		slow23.startPrinting();
        	}
        	if(btn_count == 24) {
        		layeredPane.remove(slow23.getLabel());
        		slow24.startPrinting();
        	}
        	if(btn_count == 25) {
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
        		layeredPane.remove(slow24.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
        		slow25.startPrinting();
        	}
        	if(btn_count == 26) {
        		layeredPane.remove(slow25.getLabel());
        		slow26.startPrinting();
        	}
        	if(btn_count == 27) {
        		layeredPane.remove(player);
        		layeredPane.remove(slow26.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                teresa.setFont(txt);
                teresa.setForeground(Color.BLACK);
                layeredPane.add(teresa, Integer.valueOf(5));
                Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(3));
        		slow27.startPrinting();
        	}
        	if(btn_count == 28) {
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
        		layeredPane.remove(slow27.getLabel());
        		slow28.startPrinting();
        	}
        	if(btn_count == 29) {
        		layeredPane.remove(slow28.getLabel());
        		slow29.startPrinting();
        	}
        	if(btn_count == 30) {
        		layeredPane.remove(player);
        		layeredPane.remove(slow29.getLabel());
        		teresa.setBounds(300, 550, 1000, 50);
                Font txt = new Font("Monospaced", Font.ITALIC, 24);
                teresa.setFont(txt);
                teresa.setForeground(Color.BLACK);
                layeredPane.add(teresa, Integer.valueOf(5));
                Image_label6.setBounds(850, 10, 800, 1000);
                layeredPane.add(Image_label6, Integer.valueOf(3));
        		slow30.startPrinting();
        	}
        	if(btn_count == 31) {
        		layeredPane.remove(slow30.getLabel());
        		slow31.startPrinting();
        	}
        	if(btn_count == 32) {
        		layeredPane.remove(slow31.getLabel());
        		slow32.startPrinting();
        	}
        	if(btn_count == 33) {
        		layeredPane.remove(slow32.getLabel());
        		slow33.startPrinting();
        	}
        	if(btn_count == 34) {
        		layeredPane.remove(teresa);
        		layeredPane.remove(Image_label6);
        		layeredPane.repaint();
        		layeredPane.remove(slow33.getLabel());
        		slow34.startPrinting();
        	}
        	if(btn_count == 35) {
        		layeredPane.remove(player);
        	    layeredPane.remove(slow34.getLabel());
        	    layeredPane.remove(next);
        	    layeredPane.repaint();
        	    option1.setBounds(120, 620, 700, 50);
        	    layeredPane.add(option1, Integer.valueOf(5));
        	    option1.addActionListener(this);
        	    option2.setBounds(120, 680, 700, 50);
        	    layeredPane.add(option2, Integer.valueOf(5));
        	    option2.addActionListener(this);
        	}
        	btn_count ++;
        }
        if (e.getSource() == option1) {
        	//proceed to scene 2-2
        	scene2_2 = new Scene2_2();
        	scene2_2.startScene();
        	layeredPane.remove(label);
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        	layeredPane.repaint();
        }
        if (e.getSource() == option2) {
        	//proceed to scene 4-1
        	scene4_1 = new Scene4_1();
        	scene4_1.start_Scene();
        	layeredPane.remove(label);
        	layeredPane.remove(option1);
        	layeredPane.remove(option2);
        }
    }
}