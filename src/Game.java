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
<<<<<<< HEAD
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
=======
	Font titleFont = new Font("Arial", Font.PLAIN,90);
	Font normalFont = new Font("Arial", Font.PLAIN, 20);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int playerHP;
	String weapon, position, outfit, viktor;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	public static void main(String[] args) 
	{
		
		Game game1 = new Game();
		
	}

	//hello!
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
		titleNameLabel = new JLabel("College Quest");
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
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is text area");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
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
		playerPanel.setBounds(80, 15, 600, 50);
		playerPanel.setBackground(Color.red);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
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
		
		playerSetup();
		
	}
	
	public class TitleScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			createGameScreen();
			
		}
	}
	
	public void playerSetup() {
		
		playerHP = 90;
		weapon = "Fists";
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHP);
		
		AreaOne();
	}
	
	//Starting game area, the basis of the entire game where everything branches out from. Paths will be denoted by 'main' paths and 'sub' paths, 'main' using numeric notation and 'sub' using alphabetic notation.
	public void AreaOne() {
		
		position = "AreaOne";
		mainTextArea.setText("You wake up in a tiny 15x10 foot apartment. "
				+ "\nThe faint smell of yesterday night's pizza and "
				+ "\nalcohol fills the air as your eyes are assaulted by "
				+ "\nthe blinding white and blue light of a monitor with "
				+ "\nlines of code, still open from last nights coding "
				+ "\nsession with your buddies. What do you do? ");
		choice1.setText("Check calendar");
		choice2.setText("Check MyTwitBookGram");
		choice3.setText("Get out of bed");
		choice4.setText("Go back to sleep");
		
	}
	//First choice in start of game that branches out to multiple paths that can affect story, but not lead to victory (Path "1").
				public void A1Choice1() {
					position = "A1Choice1";
					mainTextArea.setText("You decide to check your online calendar."
							+ "\nYou see that you have multiple assignments due"
							+ "\nvery soon. A programming project, some math work,"
							+ "\nand some Gen Ed assignments. As much as you'd love"
							+ "\nto get right on those, it's still a bit early. "
							+ "\nWhat would you like to do?");
					choice1.setText("Check MyTwitBookGram");
					choice2.setText("Get out of bed");
					choice3.setText("Go back to sleep");
					choice4.setText("");
				}
				//First path-specific choice, Path A Part 1.
				public void A1Choice2() {
					position = "A1Choice2";
					mainTextArea.setText("You open a new tab and type mytwitbookgram.com."
							+ "\nYou see classmates posting offensive memes, some family"
							+ "\nmembers posting fake news articles about how the government"
							+ "\nis secretly lizard people, and a few of your friends posting"
							+ "\nabout how much it sucks to be in college. That's a mood."
							+ "\nYou have 2 messages, 15 notifications, and a friend request."
							+ "\nWhat would you like to do?");
					choice1.setText("Get off computer");
					choice2.setText("Check messages");
					choice3.setText("Check notifications");
					choice4.setText("Check friend request");
				}
						//Part 2-4 of PathA. The first choice from Part 1 Path A simply reroutes you to path B and onward in the story, 
						//so the choices within paths will be denoted with "ChoiceXSubX", with choice being the path and "X" in Sub"X" being the option within said path's page.
						public void A1Choice2Messages() {
							position = "A1Choice2Messages";
							mainTextArea.setText("You check your messages. One is from your friend and"
									+ "\n coding project partner, and says 'yo did u finish the class"
									+ "\n for our text based adventure. We need that done by midnight"
									+ "\n tonight or else were screwed.' You feel a strange sense of "
									+ "\n meta-narrative taking place, but are not sure why. The other"
									+ "\n message says 'Hey cutie, I live in Anonymous Proxy too, want"
									+ "\n to meet up?'. It's most likely spam. What would you like to do?");
							choice1.setText("Get off computer");
							choice2.setText("Check notifications");
							choice3.setText("Check friend request");
							choice4.setText("");
						}
						
						public void A1Choice2Notifications() {
							position = "A1Choice2Notifications";
							mainTextArea.setText("You check your notifications. Nothing interesting,"
									+ "\njust some likes on your posts, some comments arguing about how"
									+ "\nthe stuff you like sucks and why the stuff they like is better,"
									+ "\nand things of that nature. What would you like to do?");
							choice1.setText("Get off computer");
							choice2.setText("Check messages");
							choice3.setText("Check friend request");
							choice4.setText("");
						}
						
						public void A1Choice2FriendRequest() {
							position = "A1Choice2FriendRequest";
							mainTextArea.setText("You click on the friend requests section and see"
									+ "\n a man named 'Viktor' has sent you a friend request. You"
									+ "\n think back and try to remember if you know anybody named"
									+ "\n Viktor, but you can't even remember what you'd just learned"
									+ "\n in lecture yesterday morning, so it's futile. "
									+ "\n What would you like to do?");
							viktor = "Not Added";
							choice1.setText("Get off computer");
							choice2.setText("Accept the friend request.");
							choice3.setText("Check notifications");
							choice4.setText("Check messages");
						}
								
								public void A1Choice2AcceptRequest() {
									position = "A1Choice2AcceptRequest";
									mainTextArea.setText("You accept the friend request and prepare"
											+ "\n to get off, but as soon as you go to close the tab"
											+ "\n you receive a message. It's from Viktor, the man you"
											+ "\n just added. What would you like to do?");
									viktor = "Added";
									choice1.setText("Get off computer");
									choice2.setText("Check the message.");
									choice3.setText("");
									choice4.setText("");
								}
										public void A1Choice2AcceptRequest2() {
											position = "A1Choice2AcceptRequest2";
											mainTextArea.setText("You open up the message from Viktor. It says: "
													+ "\n 'you meet viktor 5 pm behind america ball field. "
													+ "\n bring america dolar and product. no be late. you"
													+ "\n accept friendship, boss say was signal'. You have"
													+ "\n no idea what this means, but it does worry you a "
													+ "\n bit. What could that mean? Regardless, you have"
													+ "\n stuff to do, and really should get to that. What"
													+ "\n would you like to do?");
											choice1.setText("Get off computer");
											choice2.setText("Check messages");
											choice3.setText("Check notifications");
											choice4.setText("");
										}
										//These two functions allow players that didn't pick the previous choices but went down the "friend request" path to check those paths again (as they don't result in a change of state for the player unlike the 'Viktor' scenario, which would cause continuity errors).
											public void A1Choice2AcceptRequestLoop1() {
												position = "A1Choice2AcceptRequestLoop1";
												mainTextArea.setText("You check your notifications. Nothing interesting,"
														+ "\njust some likes on your posts, some comments arguing about how"
														+ "\nthe stuff you like sucks and why the stuff they like is better,"
														+ "\nand things of that nature. What would you like to do?");
												choice1.setText("Get off computer");
												choice2.setText("Check messages");
												choice3.setText("");
												choice4.setText("");
											}
											public void A1Choice2AcceptReqeustLoop2() {
												position = "A1Choice2AcceptRequestLoop2";
												mainTextArea.setText("You check your messages. One is from your friend and"
														+ "\n coding project partner, and says 'yo did u finish the class"
														+ "\n for our text based adventure. We need that done by midnight"
														+ "\n tonight or else were screwed.' You feel a strange sense of "
														+ "\n meta-narrative taking place, but are not sure why. The other"
														+ "\n message says 'Hey cutie, I live in Anonymous Proxy too, want"
														+ "\n to meet up?'. It's most likely spam. What would you like to do?");
												choice1.setText("Get off computer");
												choice2.setText("Check notifications");
												choice3.setText("");
												choice4.setText("");
											}
											
				
				
				public void A1Choice3() {
					position = "A1Choice3";
					mainTextArea.setText("You sit up, stretch, and throw the sheets off of yourself"
							+ "\nand step out of bed, ready to tackle the day like a responsible"
							+ "\nadult. And it's only 10:30 AM! "
							+ "\nWhat do you do?");
					choice1.setText("Have brunch");
					choice2.setText("Get clean");
					choice3.setText("Get dressed");
					choice4.setText("Head out");
				}
				
						public void A1Choice3Brunch() {
							position = "A1Choice3Brunch";
							mainTextArea.setText("You are starving! You can even tell because your"
									+ "\nhealth is at 90 when it should be at 100, as is written"
									+ "\nin the Text-Based Adventure Bible!"
									+ "\nWhat would you like to do?");
							choice1.setText("Eat some leftover pizza (cold)");
							choice2.setText("Eat some leftover pizza (hot)");
							choice3.setText("Check the fridge");
							choice4.setText("Forget it");
						}
						
										public void A1Choice3BrunchCold(){
											position = "A1Choice3BrunchCold";
											mainTextArea.setText("You decide to eat the leftover pizza on the counter"
													+ "\n without so much as even heating it up. You're in college,"
													+ "\nand every second counts, so no time for luxuries like warming"
													+ "\nup your food. You scarf down a couple slices of cold pizza."
													+ "\nIt's not very pleasant. You gain 5 health points. "
													+ "\n What would you like to do now?");
											playerHP = 95;
											hpLabelNumber.setText("" + playerHP);
											choice1.setText("Get clean");
											choice2.setText("Get dressed");
											choice3.setText("Head out");
											choice4.setText("");
										}
										
										public void A1Choice3BrunchHot() {
											position = "A1Choice3BrunchHot";
											mainTextArea.setText("You decide to eat some leftover pizza, but you're"
													+ "\nnot a savage, and you pull out a paper plate and toss the"
													+ "\npizza on it and into the microwave. The whole room fills with"
													+ "\nthe smell of warm cheese and meat as the timer slowly ticks down,"
													+ "\nand then dings. You pull the plate out and can feel the heat radiating"
													+ "\noff of the slices with a deliciously inviting smell as well."
													+ "\nWhat would you like to do now?");
											choice1.setText("Take a bite");
											choice2.setText("Let it cool");
											choice3.setText("");
											choice4.setText("");
										}
								
														public void A1Choice3BrunchHotFast() {
															position = "A1Choice3BrunchHotFast";
															mainTextArea.setText("The smell was too tantilizing and you decide to take"
																	+ "\na bite immediately, no time to let it cool, you're hungry and"
																	+ "\nin college, no time for luxuries like waiting!"
																	+ "\n"
																	+ "\nTaking the bite, you burn the roof of your mouth and spit the bite you took"
																	+ "\nout on the floor. You are unable to eat the rest and have"
																	+ "\nnot only ruined your ability to eat for the next 2-5 hours,"
																	+ "\nbut also take 10 points in damage. Good job."
																	+ "\nNow what?");
															playerHP = 80;
															hpLabelNumber.setText("" + playerHP);
															choice1.setText("Get dressed");
															choice2.setText("Get clean");
															choice3.setText("Head out");
															choice4.setText("");
														}
												
														public void A1Choice3BrunchHotSlow() {
															position = "A1Choice3BrunchHot";
															mainTextArea.setText("You can feel how hot the pizza is, and using"
																	+ "\nyour better judgement you decide to let it cool a bit first"
																	+ "\nand then eat it. Delicious! But you also ran out of "
																	+ "\ntime to take a shower and get clean. "
																	+ "\n"
																	+ "\nYou gain health 10 points"
																	+ "\nWhat would you like to do now?. ");
															playerHP = 100;
															hpLabelNumber.setText("" + playerHP);
															choice1.setText("Get dressed");
															choice2.setText("Head out");
															choice3.setText("");
															choice4.setText("");
														}
														
											public void A1Choice3BrunchFridge(){
												position = "A1Choice3BrunchFridge";
												mainTextArea.setText("You check the fridge and see nothing but beers, some sauces,"
														+ "\nand some unidentifiable substances in tupperwares that don't"
														+ "\nbelong to you. You consider just having a beer, but it's a little"
														+ "\nearly for that. Maybe tomorrow."
														+ "\nWhat would you like to do?");
												choice1.setText("Eat pizza (cold)");
												choice2.setText("Eat pizza (hot)");
												choice3.setText("Forget it");
												choice4.setText("");
											}
									
											public void A1Choice3BrunchForgetIt() {
												position = "A1Choice3BrunchForgetIt";
												mainTextArea.setText("You examine your options and change your mind"
														+ "\non eating. No time for that, you got things to do and"
														+ "\nbeing healthy is not one of them! "
														+ "\nWhat would you like to do?");
												choice1.setText("Get dressed");
												choice2.setText("Get clean");
												choice3.setText("Head out");
												choice4.setText("");
											}
						
						public void A1Choice3Clean() {
							position = "A1Choice3Clean";
							mainTextArea.setText("You can feel the leftovers of last night on"
									+ "\nyour skin and in your hair, and it feels disgusting. "
									+ "\nYou should probably take a shower, but maybe you can"
									+ "\nget by with just a fresh pair of clothes like usual."
									+ "\nWhat would you like to do? ");
							choice1.setText("Take a shower");
							choice2.setText("Check the closet");
							choice3.setText("Head out, I'm fine");
							choice4.setText("");
						}
						
						public void A1Choice3Clothes() {
							position = "A1Choice3Clothes";
							mainTextArea.setText("You feel dirty, but could probably risk not"
									+ "\ntaking a shower and instead throwing some clothes over"
									+ "\nyourself and heading out. "
									+ "\nWhat would you like to do?");
							choice1.setText("Check the closet");
							choice2.setText("Take a shower");
							choice3.setText("Head out, I'm fine");
							choice4.setText("");
						}
						
										public void A1Choice3Closet() {
											position = "A1Choice3Closet";
											mainTextArea.setText("You open your closet and see a few outfits on hangars"
													+ "\nas well as a gross pile of dirty clothes on the floor. You should"
													+ "\nprobably wash those sometime. What do you want to wear?");
											choice1.setText("Button Shirt w/flames");
											choice2.setText("Bomber jacket");
											choice3.setText("Wizard Cosplay");
											choice4.setText("Nothing");
										}
										
																public void A1Choice3Closet1() {
																	position = "A1Choice3Closet1";
																	mainTextArea.setText("You look at the first outfit, which is a button"
																			+ "\nup shirt with flames, a dragon on the sleeve, some cool"
																			+ "\nJNCO jeans, Crocs, and some 5 dollar gas station sunglasses."
																			+ "\n This outfit provides you with a bottle of very hot hot sauce and a +5 buff to"
																			+ "coolness, but -20 debuff to social interaction. Wear this?");
																	choice1.setText("Yes.");
																	choice2.setText("No.");
																	choice3.setText("");
																	choice4.setText("");
																}
																public void A1Choice3Closet2() {
																	position = "A1Choice3Closet2";
																	mainTextArea.setText("You look at the second outfit, which is a casual bomber"
																			+ "\njacket, white t shirt, black jeans, and some nice sneakers. "
																			+ "\n This outfit provides you with a switchblade-comb, +20 buff to social"
																			+ "\n interaction, as well as +40 increase in temperature. Wear this?");
																	choice1.setText("Yes.");
																	choice2.setText("No.");
																	choice3.setText("");
																	choice4.setText("");
																}
																public void A1Choice3Closet3() {
																	position = "A1Choice3Closet3";
																	mainTextArea.setText("You look at the third outfit, which is a wizard outfit"
																			+ "\nbased on a character from that one RPG game you played in high school."
																			+ "\nYou contemplate on what brought you to bring this to your college aparment"
																			+ "\nwhen you moved out from your moms house. Provides you with a dope wizard staff"
																			+ "\nbut a -100 social interaction debuff. Yikes. Wear this?");
																	choice1.setText("Yes.");
																	choice2.setText("No.");
																	choice3.setText("");
																	choice4.setText("");
																}
																public void A1Choice3Closet4() {
																	position = "A1Choice3Closet4";
																	mainTextArea.setText("You decide that the outfit you woke up in is best. Wear this instead of changing outfits?");
																	choice1.setText("Yes.");
																	choice2.setText("No.");
																	choice3.setText("");
																	choice4.setText("");
																}
										
						
						public void A1Choice3Shower() {
							position = "A1Choice3Shower";
							mainTextArea.setText("You decide to take a shower before heading out."
									+ "\n Good call, you weren't very clean. You also got 5 HP."
									+ "\n What would you like to do?");
							playerHP = playerHP + 5;
							hpLabelNumber.setText("" + playerHP);
							choice1.setText("Get dressed");
							choice2.setText("Head out, I'm fine");
							choice3.setText("");
							choice4.setText("");
						}
						
						
						
						public void A1Choice3OutNaked() {
							position = "A1Choice3OutNaked";
							mainTextArea.setText("You step out, head down the stairs, and cross the street, but for some reason everyone seems"
									+ "\nto be staring at you, and some even look like they're taking pictures of you. It's not until a car rolls"
									+ "\nby and stops in front of you at a crosswalk to laugh at you and take pictures that you realize that in "
									+ "\nthe reflection of the car's windows, you can see yourself, with nothing on but your boxers. You forgot to put some clothes"
									+ "\non, moron. This most certainly is grounds for explusion from college, especially with your record. Game over.");
							choice1.setText("Maybe try putting");
							choice2.setText("some clothes on.");
							choice3.setText("Restart program");
							choice4.setText("to try again");
						}
				
				public void A1Choice4() {
					position = "A1Choice4";
					mainTextArea.setText("You disregard everything, and decide your comfort come first,"
							+ "\na good and healthy choice!"
							+ "\nToo bad you're in college. You missed your chance to get things "
							+ "\ndone and slept 10 more hours, dropping your GPA to unrecoverable"
							+ "\nlevels. You have failed this semester and are forced to drop out. "
							+ "\n"
							+ "\n                                   Game Over.");
					choice1.setText("Good job, you");
					choice2.setText("failed on the");
					choice3.setText("first choice. Restart");
					choice4.setText("program to try again.");
					
					
				}
				
				public void AreaTwo() {
					position = "AreaTwo";
					mainTextArea.setText("You step out, confident in your decisions to start your day,"
							+ "\n for better or for worse. At least you remembered to put clothes on."
							+ "\n Where should you go from here?");
					choice1.setText("Class");
					choice2.setText("Library");
					choice3.setText("Lounge");
					choice4.setText("Gym");
				}
				
	
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String userChoice = event.getActionCommand();
			
			switch(position) {
			case "AreaOne":
				switch(userChoice) {
				case "c1": A1Choice1(); break;
				case "c2": A1Choice2(); break;
				case "c3": A1Choice3(); break;
				case "c4": A1Choice4(); break;
				}
				break;
				
			case "A1Choice1":
				switch(userChoice) {
				case "c1": A1Choice2(); break;
				case "c2": A1Choice3(); break;
				case "c3": A1Choice4(); break;
				}
				break;
				
			case "A1Choice2":
				switch(userChoice) {
				case "c1": A1Choice3(); 	break;
				case "c2": A1Choice2Messages(); break;
				case "c3": A1Choice2Notifications(); break;
				case "c4": A1Choice2FriendRequest(); break;
				}
				break;
					
					case "A1Choice2Messages":
						switch(userChoice) {
						case "c1": A1Choice3(); break;
						case "c2": A1Choice2Notifications(); break;
						case "c3": A1Choice2FriendRequest(); break;
						}
						break;
					case "A1Choice2Notifications":
						switch(userChoice) {
						case "c1": A1Choice3(); break;
						case "c2": A1Choice2Messages(); break;
						case "c3": A1Choice2FriendRequest(); break;
						}
						break;
					case "A1Choice2FriendRequest":
						switch(userChoice) {
						case "c1": A1Choice3(); break;
						case "c2": A1Choice2AcceptRequest(); break;
						case "c3": A1Choice2Notifications(); break;
						case "c4": A1Choice2Messages(); break;
						}
						break;
						case "A1Choice2AcceptRequest":
							switch(userChoice) {
							case "c1": A1Choice3(); break;
							case "c2": A1Choice2AcceptRequest2(); break;
							}
							break;
							case "A1Choice2AcceptRequest2":
								switch(userChoice) {
								case "c1": A1Choice3(); break;
								case "c2": A1Choice2AcceptRequestLoop1(); break;
								case "c3": A1Choice2AcceptReqeustLoop2(); break;
								}
								break;
								case "A1Choice2AcceptRequestLoop1":
									switch(userChoice) {
									case "c1": A1Choice3(); break;
									case "c2": A1Choice2AcceptReqeustLoop2(); break;
									}
									break;
								case "A1Choice2AcceptRequestLoop2":
									switch(userChoice) {
									case "c1": A1Choice3(); break;
									case "c2": A1Choice2AcceptRequestLoop1(); break;
									}
									break;
			case "A1Choice3":
				switch(userChoice) {
				case "c1": A1Choice3Brunch(); break;
				case "c2": A1Choice3Clean(); break;
				case "c3": A1Choice3Clothes(); break;
				case "c4": break;
				}
				break;
					case "A1Choice3Brunch":
						switch(userChoice) {
						case "c1": A1Choice3BrunchCold(); break;
						case "c2": A1Choice3BrunchHot(); break;
						case "c3": A1Choice3BrunchFridge(); break;
						case "c4": A1Choice3BrunchForgetIt(); break;
						}
						break;	
							case "A1Choice3BrunchCold":
								switch(userChoice) {
								case "c1": A1Choice3Clean(); break;
								case "c2": A1Choice3Clothes(); break;
								case "c3": A1Choice3OutNaked(); break;
								case "c4": break;
								}
								break;	
							case "A1Choice3BrunchHot":
								switch(userChoice) {
								case "c1": A1Choice3BrunchHotFast(); break;
								case "c2": A1Choice3BrunchHotSlow(); break;
								case "c3": break;
								case "c4": break;
								}
								break;	
								case "A1Choice3BrunchHotFast":
									switch(userChoice) {
									case "c1": A1Choice3Clothes(); break;
									case "c2": A1Choice3Clean(); break;
									case "c3": A1Choice3OutNaked(); break;
									case "c4": break;
									}
								break;	
									case "A1Choice3BrunchHotSlow":
										switch(userChoice) {
										case "c1": A1Choice3Clothes(); 	break;
										case "c2": A1Choice3Clean(); 	break;
										case "c3": A1Choice3OutNaked(); break;
										case "c4": break;
										}
										break;	
							case "A1Choice3BrunchFridge":
								switch(userChoice) {
								case "c1": A1Choice3BrunchCold(); break;
								case "c2": A1Choice3BrunchHot(); break;
								case "c3": A1Choice3BrunchForgetIt(); break;
								case "c4": ; break;
								}
								break;
							case "A1Choice3BrunchForgetIt":
								switch(userChoice) {
								case "c1": A1Choice3Clean(); break;
								case "c2": A1Choice3Clothes(); break;
								case "c3": A1Choice3OutNaked(); break;
								case "c4": break;
								}
								break;
					case "A1Choice3Clean":
						switch(userChoice) {
						case "c1": A1Choice3Shower(); break;
						case "c2": A1Choice3Clothes(); break;
						case "c3": A1Choice3OutNaked(); break;
						case "c4": break;
						}
						break;
					case "A1Choice3Shower":
						switch(userChoice) {
						case "c1": A1Choice3Closet();   break;
						case "c2": A1Choice3OutNaked(); break;
						case "c3": break;
						case "c4": break;
						}
						break;
					case "A1Choice3Clothes":
						switch(userChoice) {
						case "c1": A1Choice3Closet();   break;
						case "c2": A1Choice3Shower();   break;
						case "c3": A1Choice3OutNaked(); break;
						case "c4":  break;
						}
						break;
					case "A1Choice3Closet":
						switch(userChoice) {
						case "c1": A1Choice3Closet1();   break;
						case "c2": A1Choice3Closet2();    break;
						case "c3": A1Choice3Closet3();  break;
						case "c4": A1Choice3Closet4();  break;
						}
						break;
						
								case "A1Choice3Closet1":
									switch(userChoice) {
									case "c1": AreaTwo(); break;
									case "c2": A1Choice3Closet(); break;
									case "c3": break;
									case "c4": break;
									}
									break;
								case "A1Choice3Closet2":
									switch(userChoice) {
									case "c1": AreaTwo(); break;
									case "c2": A1Choice3Closet(); break;
									case "c3": break;
									case "c4": break;
									}
									break;
								case "A1Choice3Closet3":
									switch(userChoice) {
									case "c1": AreaTwo(); break;
									case "c2": A1Choice3Closet(); break;
									case "c3": break;
									case "c4": break;
									}
									break;
								case "A1Choice3Closet4":
									switch(userChoice) {
									case "c1": AreaTwo(); break;
									case "c2": A1Choice3Closet(); break;
									case "c3": break;
									case "c4": break;
									}
									break;
			}
			
>>>>>>> branch 'master' of https://github.com/abecker96/OOP
		}
		}
}
