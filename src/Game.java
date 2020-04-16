import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Arial", Font.PLAIN, 70);
	Font normalFont = new Font("Arial", Font.PLAIN, 25);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int playerHP;
	String weapon, position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	public static void main(String[] args) {
		
		new Game();
	}

	
	public Game() {
		
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
				
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.red);
		titleNameLabel = new JLabel("Placeholder Title");
		titleNameLabel.setForeground(Color.yellow);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 75);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("Begin Adventure");
		startButton.setBackground(Color.red);
		startButton.setForeground(Color.yellow);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		con.add(titleNamePanel); 
		con.add(startButtonPanel);
		
	}
	
	public void createGameScreen() {
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.red);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is text area");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.red);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.red);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		
		choice2 = new JButton("2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		
		choice3 = new JButton("3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		
		choice4 = new JButton("4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.red);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		hpLabel = new JLabel("Health:");
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
		
		playerSetup();
		
	}
	
	public class TitleScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			createGameScreen();
			
		}
	}
	
	public void playerSetup() {
		
		playerHP = 100;
		weapon = "Fists";
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHP);
		
		AreaOne();
	}
	
	public void AreaOne() {
		
		position = "AreaOne";
		mainTextArea.setText("Area 1 text - enter intro to story here");
		choice1.setText("Choice 1 insert");
		choice2.setText("Choice 2 insert");
		choice3.setText("Choice 1 insert");
		choice4.setText("Choice 1 insert");
		
	}
	
	public void A1Choice1() {
		position = "A1Choice1";
		mainTextArea.setText("Choice 1 result text");
		choice1.setText("Choice 1 insert");
		choice2.setText("Choice 2 insert");
		choice3.setText("Choice 1 insert");
		choice4.setText("Choice 1 insert");
	}
	
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String userChoice = event.getActionCommand();
			
			switch(position) {
			case "AreaOne":
				switch(userChoice) {
				case "c1": A1Choice1(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}
			}
		}
		}
}
