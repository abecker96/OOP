package package01;

//UI handling class, sets parameters and related data for formatting of UI elements using Swing and JFrame libs

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import package01.Game.ChoiceHandler;

public class UI {

	
	//Settings for every base for panels & text
			JFrame window;
			JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;;
			JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
			JButton startButton, choice1, choice2, choice3, choice4;
			JTextArea mainTextArea;
			Font titleFont = new Font("Arial", Font.PLAIN,90);
			Font normalFont = new Font("Arial", Font.PLAIN, 20);
			
			public void createUI(ChoiceHandler cHandler) {
				
				//Window Initialization
				window = new JFrame();
				window.setSize(800,600);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.getContentPane().setBackground(Color.black);
				window.setLayout(null);
				
				//Title Initialization
				titleNamePanel = new JPanel();
				titleNamePanel.setBounds(100, 100, 600, 150);
				titleNamePanel.setBackground(Color.red);
				titleNameLabel = new JLabel("College Quest");
				titleNameLabel.setForeground(Color.yellow);
				titleNameLabel.setFont(titleFont);
				titleNamePanel.add(titleNameLabel);
				
				//Start button specific initialization
				startButtonPanel = new JPanel();
				startButtonPanel.setBounds(300, 400, 200, 75);
				startButtonPanel.setBackground(Color.black);
				startButton = new JButton("Begin Adventure");
				startButton.setBackground(Color.red);
				startButton.setForeground(Color.yellow);
				startButton.setFont(normalFont);
				startButton.setFocusPainted(false);
				startButton.addActionListener(cHandler);
				startButton.setActionCommand("start");
				startButtonPanel.add(startButton);
				window.add(titleNamePanel);
				window.add(startButtonPanel);
				

				// Game Screen Initialization (Main text area and choice buttons)
				mainTextPanel = new JPanel();
				mainTextPanel.setBounds(100, 100, 600, 250);
				mainTextPanel.setBackground(Color.black);
				window.add(mainTextPanel);
				
				mainTextArea = new JTextArea("This is text area");
				mainTextArea.setBounds(100, 100, 600, 250);
				mainTextArea.setBackground(Color.black);
				mainTextArea.setForeground(Color.white);
				mainTextArea.setFont(normalFont);
				mainTextArea.setLineWrap(true);
				mainTextArea.setWrapStyleWord(true);
				mainTextArea.setEditable(false);
				mainTextPanel.add(mainTextArea);
				
				choiceButtonPanel = new JPanel();
				choiceButtonPanel.setBounds(250, 350, 300, 150);
				choiceButtonPanel.setBackground(Color.red);
				choiceButtonPanel.setLayout(new GridLayout(4,1));
				window.add(choiceButtonPanel);
				
				choice1 = new JButton("Choice 1");
				choice1.setBackground(Color.black);
				choice1.setForeground(Color.white);
				choice1.setFont(normalFont);
				choice1.setFocusPainted(false);
				choice1.addActionListener(cHandler);
				choice1.setActionCommand("c1");
				choiceButtonPanel.add(choice1);
				
				choice2 = new JButton("2");
				choice2.setBackground(Color.black);
				choice2.setForeground(Color.white);
				choice2.setFont(normalFont);
				choice2.setFocusPainted(false);
				choice2.addActionListener(cHandler);
				choice2.setActionCommand("c2");
				choiceButtonPanel.add(choice2);
				
				choice3 = new JButton("3");
				choice3.setBackground(Color.black);
				choice3.setForeground(Color.white);
				choice3.setFont(normalFont);
				choice3.setFocusPainted(false);
				choice3.addActionListener(cHandler);
				choice3.setActionCommand("c3");
				choiceButtonPanel.add(choice3);
				
				choice4 = new JButton("4");
				choice4.setBackground(Color.black);
				choice4.setForeground(Color.white);
				choice4.setFont(normalFont);
				choice4.setFocusPainted(false);
				choice4.addActionListener(cHandler);
				choice4.setActionCommand("c4");
				choiceButtonPanel.add(choice4);
				
				//Settings for every Player Information panel section (text & formatting)
				playerPanel = new JPanel();
				playerPanel.setBounds(80, 15, 600, 50);
				playerPanel.setBackground(Color.red);
				playerPanel.setLayout(new GridLayout(1,4));
				window.add(playerPanel);
				
				hpLabel = new JLabel("           Health:");
				hpLabel.setFont(normalFont);
				hpLabel.setForeground(Color.yellow);
				playerPanel.add(hpLabel);
				hpLabelNumber = new JLabel();
				hpLabelNumber.setFont(normalFont);
				hpLabelNumber.setForeground(Color.yellow);
				playerPanel.add(hpLabelNumber);
				weaponLabel = new JLabel("Weapon:");
				weaponLabel.setFont(normalFont);
				weaponLabel.setForeground(Color.yellow);
				playerPanel.add(weaponLabel);
				weaponLabelName = new JLabel();
				weaponLabelName.setFont(normalFont);
				weaponLabelName.setForeground(Color.white);
				playerPanel.add(weaponLabelName);
				
				window.setVisible(true);
			}
	
	}
	

