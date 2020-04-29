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

public class Game012 {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Arial", Font.PLAIN,90);
	Font normalFont = new Font("Arial", Font.PLAIN, 20);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int playerHP, testScore, questionNum, playerDamage, study, pass, viktor, wager, duffel, weaponSkill, unarmedSkill, money;
	String weapon, position, outfit;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	public static void main(String[] args) {
		
		new Game012();
	}

	
	public Game012() {
		
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
		playerDamage = 0;
		testScore = 0;
		viktor = 1;
		questionNum = 1;
		study = 0;
		pass = 0;
		wager = 0;
		duffel = 0;
		weaponSkill = 8;
		unarmedSkill = 5;
		money = 0;
		weapon = "Fists";
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHP);
		
		AreaOne();
	}
	
	//Starting game area, the basis of the entire game where everything branches out from. Paths will be denoted by 'main' paths and 'sub' paths, 'main' using numeric notation and 'sub' using alphabetic notation.
	public void AreaOne() {
		
		position = "AreaOne";
		mainTextArea.setText("You wake up in a tiny 15x10 foot apartment."
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
							viktor = 0;
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
									viktor = 1;
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
															position = "A1Choice3BrunchHotSlow";
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
				
								public void Class() {
									position = "Class";
									if (study == 0)
									{
									mainTextArea.setText("You decide to head to your first class, which is Problem "
											+ "\nSolving With Computers II. You sit down, and everyone seems strangely"
											+ " quiet and focused. You're not sure what's going on, but you just check out"
											+ " MyTwitBookGram on your phone until the teacher arrives. When they do,"
											+ " they say to put everything away and to get ready for the exam. Oh no!"
											+ " You forgot there was an exam! A horrible dread fills your mind . . .");
									choice1.setText("Take exam");
									choice2.setText("Run away");
									choice3.setText("Try to cheat");
									choice4.setText("");
									}
									
									else {
										mainTextArea.setText("You decide to head to your first class, which is Problem "
												+ "\nSolving With Computers II. You sit down, and get your pencil out, "
												+ "\narmed with the knowledge that you so smartly equipped yourself with "
												+ "\nearlier by studying. Your teacher walks in, places the exam on  your "
												+ "\ndesk, and your heart jumps. It's only 20 questions, but it's huge. "
												+ "\nWhat do you do?");
										choice1.setText("Take exam");
										choice2.setText("Run away");
										choice3.setText("Try to cheat");
										choice4.setText("");
									}
								}
										
												public void ClassFight() {
													position = "ClassFight";
													mainTextArea.setText("You man up and get ready to tackle the test as best"
															+ "\n you can. It's just you versus the exam, armed with all of "
															+ "\n your programming knowledge and a slight hangover, you get"
															+ "\nready to battle! (A 60 is required to pass.)");
													choice1.setText("Begin!");
													choice2.setText("");
													choice3.setText("");
													choice4.setText("");
												}
												
																		public void ClassFightTest() {
																			position="ClassFightTest";
																			if (study==0) {
																			playerDamage = new java.util.Random().nextInt(6);
																			mainTextArea.setText("You guess on question " + questionNum + " and received " + testScore + "points.");
																			testScore = testScore + playerDamage;
																			questionNum = questionNum + 1;
																			choice1.setText("Next Question");
																			choice2.setText("");
																			choice3.setText("");
																			choice4.setText("");
																			}
																			
																			else {
																					playerDamage = new java.util.Random().nextInt(11);
																					mainTextArea.setText("You answer question " + questionNum + " and received " + testScore + "points.");
																					testScore = testScore + playerDamage;
																					questionNum = questionNum + 1;
																					choice1.setText("Next Question");
																					choice2.setText("");
																					choice3.setText("");
																					choice4.setText("");
																			}
																			
																		}
																		
																		public void ClassFightTestBack() {
																			position="ClassFightTestBack";
																			int testDamage = 0;
																			testDamage = new java.util.Random().nextInt(4);
																			
																			mainTextArea.setText("That last question messed with your head, you take " + testDamage + " points in "
																					+ "\ndamage.");
																			playerHP = playerHP - testDamage;
																			hpLabelNumber.setText("" + playerHP);
																			choice1.setText("Next Question");
																			choice2.setText("");
																			choice3.setText("");
																			choice4.setText("");
																		}
																		
																		public void ClassFightNext() {
																			position = "ClassFightNext";
																			mainTextArea.setText("You move on to the next question.");
																			choice1.setText(">");
																			choice2.setText("");
																			choice3.setText("");
																			choice4.setText("");
																		}
																		
																		public void TestPass() {
																			position = "TestPass";
																			mainTextArea.setText("You finished the test and managed to pass with a \n"
																					+ testScore + ". Congratulations!"
																					+ "\nYou still have a lot of time in the day. "
																					+ "\nWhere would you like to go now?");
																			pass = 1;
																			choice1.setText("Library");
																			choice2.setText("Lounge");
																			choice3.setText("Gym");
																			choice4.setText("");
																		}
																		
																		public void TestDeath() {
																			position = "TestDeath";
																			
																			mainTextArea.setText("You died from mental exhaustion"
																					+ "\nTry studying next time maybe?.");
																			choice1.setText("Restart the");
																			choice2.setText("program to");
																			choice3.setText("Try again.");
																			choice4.setText("Game Over.");
																			
																		}
																		
				
																		public void TestFail() {
																			position = "TestFail";
																			
																			mainTextArea.setText("You finished the test with a " + testScore
																					+ "\nand utterly failed. You did not pass this class and therefore failed the semester."
																					+ "\nWhat a shame. Maybe try studying next time. Game over.");
																			choice1.setText("Restart the");
																			choice2.setText("program to");
																			choice3.setText("Try again.");
																			choice4.setText("Game Over.");
																			
																		}
												
												public void ClassRun() {
													position = "ClassRun";
													mainTextArea.setText("You aren't ready for this in the slightest! There's"
															+ "\nno way you're going to pass this at all. You wait for an"
															+ "\nopportune moment when you're not in the teacher's line of "
															+ "\nsight and make a break for the door. You head to your dorm,"
															+ "\na feeling of defeat hanging over you. You check the computer"
															+ "\nand realize you had a 68 in that class, which after getting"
															+ "\n a 0 on this means it'll be a 48. Oh no.");
													choice1.setText("What did you");
													choice2.setText("think was going");
													choice3.setText("to happen?");
													choice4.setText("Game Over.");
												}
												
												public void ClassCheat() {
													position = "ClassCheat";
													mainTextArea.setText("You aren't ready for this in the slightest, but you do have all "
															+ "of the study guides and access to the class's online materials on your phone. "
															+ "Thank god your dad is still paying for high speed phone data. "
															+ "You decide that the only way you're passing is to cheat with your phone! "
															+ "Sneakily checking the answers, your eyes dart around the room between the"
															+ "teacher to your phone to the test, and you grow ever confident with each"
															+ "answer you find on your phone. Too bad you didn't see the Teacher's Assistant"
															+ "in the corner of the room. You're caught cheating and are expelled. ");
													choice1.setText("There's always");
													choice2.setText("communnity college?");
													choice3.setText("Restart program to");
													choice4.setText("try again.");
												}
												
												
						public void Library() {
							position = "Library";
							mainTextArea.setText("You decide to head on over to the library for some much needed"
									+ "\nstudying, or maybe just to relax and read a book while drinking some coffee."
									+ "\nWhat would you like to do?");
							if (pass == 0 && duffel == 0)
							{
							choice1.setText("Study");
							choice2.setText("Leisure reading");
							choice3.setText("Wander");
							choice4.setText("");
						}
							
							else if (pass == 1 && duffel == 0)
							{
								choice1.setText("");
								choice2.setText("Leisure reading");
								choice3.setText("Wander");
								choice4.setText("");
							}
							
							else if (pass == 0 && duffel == 1)
							{
								choice1.setText("Study");
								choice2.setText("Leisure reading");
								choice3.setText("");
								choice4.setText("");
							}
							else if (pass == 1 && duffel == 1)
							{
								choice1.setText("");
								choice2.setText("Leisure reading");
								choice3.setText("");
								choice4.setText("");
							}
						}
						
											public void LibraryStudy() {
												position = "LibraryStudy";
												mainTextArea.setText("You decide to use your time wisely and study for your"
														+ "\nProblem Solving 2 class. You crack open some books and your study guide on"
														+ "\nBlackboard only to realize you have an exam today. Good call on studying."
														+ "\n(You've gained a +5% bonus to test taking ability!)"
														+ "\nWhat would you like to do now?");
												study = 1;
												choice1.setText("Head to class");
												choice2.setText("Gym");
												choice3.setText("Lounge");
												choice4.setText("");
											}
														public void LibraryFail() {
															position = "LibraryFail";
															mainTextArea.setText("You decide to head elsewhere instead of going to the"
																	+ "\nclass you literally just studied for that you are very clearly"
																	+ "\naware of having a major exam in. What's wrong with you?"
																	+ "\nYou missed your exam and failed the semester. Game over.");
															choice1.setText("At least you");
															choice2.setText("studied, right?");
															choice3.setText("Restart program");
															choice4.setText("to try again.");
														}
											
											public void LibraryChill() {
												position = "LibraryChill";
												if (pass == 0)
												{
												mainTextArea.setText("You decide to use your time to relax, grabbing some manga and"
														+ "\na cup of coffee from TsarBucks and slip into a comfy bean bag chair"
														+ "\nin the silent section of the library's second floor. Not even 20 minutes"
														+ "\ninto reading and sipping do you start to feel so comfy that you shut your"
														+ "\n eyes and take a nap. You wake up 3 hours later, only to realize you've"
														+ "\nmissed first period and your PSWCII exam. You have failed the semester.");
												choice1.setText("At least you");
												choice2.setText("caught up on");
												choice3.setText("One Punch Man.");
												choice4.setText("Game Over.");
												}
												else 
												{
													mainTextArea.setText("You decide to use your time to relax, grabbing some manga and "
															+ "\na cup of coffee from TsarBucks and slip into a comfy bean bag chair "
															+ "\nin the silent section of the library's second floor. Not even 20 minutes "
															+ "\ninto reading and sipping do you start to feel so comfy that you shut your "
															+ "\neyes and take a nap. You wake up 3 hours later, and it's basically the "
															+ "\nend of the day. You've got a few hours to kill though. "
															+ "\nWhat would you like to do?");
													choice1.setText("Lounge");
													choice2.setText("Gym");
													choice3.setText("Home");
													choice4.setText("");
												}
											}
											
											public void LibraryWander() {
												position = "LibraryWander";
												mainTextArea.setText("You are bored out of your mind before class, and decide to just"
														+ "\nwalk around the library and check out what's happening to kill time. You"
														+ "\ncheck out some exhibits, some art, and then in an aisle of books you notice"
														+ "\na random bag with some green paper sticking out of it. You investigate the "
														+ "\nduffel bag and notice it's full of money and some squares covered in duct tape."
														+ "\nWhat do you do?");
												choice1.setText("Take the bag");
												choice2.setText("Leave the bag");
												choice3.setText("");
												choice4.setText("");
											}
											
															public void LibraryWanderTake() {
																position = "LibraryWanderTake";
																mainTextArea.setText("You decide to take the duffel bag, zipping it up so nobody"
																		+ "\ncan see the contents within. You leave the library in a hurry and"
																		+ "\ntake a look again, and realize that there's at least 100k in dollars"
																		+ "\nin here. Your mind races, but then you come to your senses and try to "
																		+ "\nplan your next move."
																		+ "\nWhere do you go?");
																duffel = 1;
																if (pass == 0)
																{
																																
																choice1.setText("To class");
																choice2.setText("To the gym");
																choice3.setText("To the lounge");
																choice4.setText("");
																}
															else
															{
																choice1.setText("Lounge");
																choice2.setText("Gym");
																choice3.setText("Home");
																choice4.setText("");
															}
															}
															
															
															public void LibraryWanderLeave() {
																position = "LibraryWanderTake";
																mainTextArea.setText("You decide to just leave the bag there, and alert"
																		+ "\nthe people at the front desk of it. They alert the school's"
																		+ "\nsecurity and the cops come in and handle it. You feel good"
																		+ "\nabout doing the right thing, but regret not grabbing a little"
																		+ "\nbit of cash from it for yourself. Who knows though, maybe it"
																		+ "\nwas a trap. It's still early, but your class starts soon."
																		+ "\nWhat would you like to do now?");
																viktor = 0;
																if (pass == 0)
																{
																choice1.setText("Class");
																choice2.setText("Gym");
																choice3.setText("Lounge");
																choice4.setText("");
																}
																else 
																{
																	choice1.setText("Lounge");
																	choice2.setText("Gym");
																	choice3.setText("Home");
																	choice4.setText("");
																}
															}
											
		public void Lounge() {
			position = "Lounge";
			mainTextArea.setText("You decide to head over to the lounge for some relaxation."
					+ "\nResponsibilities can wait, they've got pool, video games, AND some"
					+ "\nreally cool dudes to hang out with in here. It's like paradise in"
					+ "\nthe middle of the worst place on earth. "
					+ "\nWhat would you like to do?");
			choice1.setText("Play games");
			choice2.setText("Play pool");
			choice3.setText("Hang out");
			choice4.setText("");
		}
		
						public void LoungeGames() {
							position = "LoungeGames";
							mainTextArea.setText("You walk over to the group of people sitting on the"
									+ "\ncouch next to the Switch where they're playing Super Smash"
									+ "\nBros. You take a seat and queue up, chatting with the people"
									+ "\nabout the game and whatever else,and before you know it you're"
									+ "\nup. You play a close game with your opponent but they knock you"
									+ "\nout last second and you lose. "
									+ "\nWhat would you like to do next?");
							choice1.setText("Play another");
							choice2.setText("Head to class");
							choice3.setText("");
							choice4.setText("");
						}
						
									public void LoungeGamesAgain() {
										position = "LoungeGamesAgain";
										mainTextArea.setText("You decide to queue up again, wanting to show your stuff."
												+ "\nYou win the next match but quite easily, you aren't going to stop"
												+ "\nuntil you've proven that you're better than everyone here. As people"
												+ "\nfilter in and out and you win and lose, the time passes without you "
												+ "\nrealizing. You've missed your first class, and the exam in it. You've"
												+ "\nfailed this semester, but hey, at least you've got your Smash Bros skills.");
										choice1.setText("You could always");
										choice2.setText("try EVO, lol.");
										choice3.setText("Restart program");
										choice4.setText("to try again.");
									}
									

									public void LoungeGamesAgain1() {
										position = "LoungeGamesAgain1";
										mainTextArea.setText("You decide to queue up again, wanting to show your stuff."
												+ "\nYou win the next match but quite easily, you aren't going to stop"
												+ "\nuntil you've proven that you're better than everyone here. As people"
												+ "\nfilter in and out and you win and lose, the time passes without you "
												+ "\nrealizing. You spend over 3 hours just playing Smash Bros with random"
												+ "\npeople. There's still a few hours left in the day though. "
												+ "\nWhat do you do?");
										choice1.setText("Gym");
										choice2.setText("Home");
										choice3.setText("");
										choice4.setText("");
									}
									
									public void LoungeGamesAgain2() {
										position = "LoungeGamesAgain2";
										mainTextArea.setText("You decide not to queue up again, and head somewhere else. "
												+ "\nWhere would you like to go?");
										choice1.setText("Gym");
										choice2.setText("Home");
										choice3.setText("");
										choice4.setText("");
									}
			

						public void LoungePool() {
							position = "LoungePool";
							mainTextArea.setText("You walk over to the pool table, and a guy playing"
									+ "\nby himself invites you to play. You accept, and as you're racking"
									+ "\nthe balls and setting up, he asks if you'd like to make it interesting."
									+ "\nYour " + weapon + " against his pool cue. It's a really nice and "
									+ "\nexpensive looking pool cue. You consider the offer."
									+ "\nWhat would you like to do?");
							wager = new java.util.Random().nextInt(11);
							choice1.setText("Wager");
							choice2.setText("Play for fun");
							choice3.setText("");
							choice4.setText("");
						}
						
								public void LoungePoolWager() {
									position = "LoungePoolWager";
									mainTextArea.setText("You decide to place your weapon on the line, as"
											+ "\n that pool cue looks mighty nice. You set your\n" + weapon
											+ " \ndown and proceed to challenge him. It's all on the line."
											+ "\nYou flip a coin to see who breaks and goes first."
											+ "\nYou're heads, he's tails.");
									wager = new java.util.Random().nextInt(11);
									choice1.setText("Flip coin.");
									choice2.setText("");
									choice3.setText("");
									choice4.setText("");
								}
								
											public void LoungePoolWagerHeads() {
												position = "LoungePoolWagerHeads";
												mainTextArea.setText("He flicks the coin in the air and it lands"
														+ "\nheads. You break the formation with the cue ball and "
														+ "\n a striped ball goes into a pocket. You and him trade"
														+ "\nback and forth, each getting balls in one by one. Eventually,"
														+ "\nthere's nothing but a stripe, a solid, and the 8 ball. A crowd"
														+ "\n gathered around without you even noticing until now. You're up,"
														+ "\nit's all on this. ");
												choice1.setText("Good luck.");
												choice2.setText("");
												choice3.setText("");
												choice4.setText("");
											}
											
											public void LoungePoolWagerHeads2Win() {
												position = "LoungePoolWagerHeads2Win";
												mainTextArea.setText("You line up the shot with your cue and the ball, take aim, and"
														+ "\na thunderous crack fills the room as you slam the cue ball and hit both "
														+ "\nthe striped ball and 8 ball and sink them together. A beautiful shot, the"
														+ "\ncrowd cheering and clapping. The man glares at you, hands you his cue, and"
														+ "\nleaves, not before turning back one final time to shoot a glance at you."
														+ "\n (New weapon get: Fancy Cue - A favorite of bar bikers and Terminators!");
												weapon="Fancy Cue";
												weaponLabelName.setText(weapon);
												weaponSkill = weaponSkill + 2;
												choice1.setText("Good luck.");
												choice2.setText("");
												choice3.setText("");
												choice4.setText("");
											}
											
											public void LoungePoolWagerHeads2Lose() {
												position = "LoungePoolWagerHeads2Lose";
												mainTextArea.setText("You line up the shot with your cue and the ball, take aim, and "
														+ "\nabsolutely fail, your elbow slipping off the table and smacking your "
														+ "\nchin against the edge of it. You hit the cue though, only just barely, "
														+ "\nso it doesn't so much as move beyond an inch. You just handed the game "
														+ "\nover, and your opponent easily sinks both balls. You lose 20 health and "
														+ "\nyour weapon. Good going. You decide to leave, pride not intact at all.");
												weapon="Fists";
												weaponLabelName.setText(weapon);
												choice1.setText("Gym");
												choice2.setText("Home");
												choice3.setText("");
												choice4.setText("");
											}
											
											
											public void LoungePoolWagerTails() {
												position = "LoungePoolWagerTails";
												mainTextArea.setText("He flicks the coin in the air and it lands"
														+ "\ntails. He slams the formation and it all separates,"
														+ "\nbouncing around the table in a beautifully chaotic mess."
														+ "\nhe chooses solids and lets you go. You miss your first shot "
														+ "\nand he sinks one after the other, all the way down to the 8 ball. ");
												choice1.setText("-->");
												choice2.setText("");
												choice3.setText("");
												choice4.setText("");
											}
											public void LoungePoolWagerTails2() {
												position = "LoungePoolWagerTails2";
												mainTextArea.setText("Sorry kid, looks like I win. I'll have that " + weapon
														+ "\nnow. Thanks."
														+ "\nYou hand him your weapon. You're so ashamed and shaken by "
														+ "\n getting sharked for your weapon you actually take "
														+ "\n10 points in damage. Sad!"
														+ "\nWhat would you like to do now?");
												playerHP = playerHP - 10;
												hpLabelNumber.setText("" + playerHP);
												weapon="Fists";
												weaponLabelName.setText(weapon);
												choice1.setText("Gym");
												choice2.setText("Home");
												choice3.setText("");
												choice4.setText("");
											}
											
								public void LoungePoolFun() {
									position = "LoungePoolFun";
									mainTextArea.setText("You decide not to wager your weapon, as"
											+ "\nyou sense that he may be lying about his ability,"
											+ "\nand given the fact that his cue is expensive and"
											+ "\nhe's confident enough to bet against someone he's never"
											+ "\nmet, you assume he's got skills. You were right, he breaks"
											+ "\nand doesn't miss a beat sinking every ball and winning."
											+ "\nGood call not betting."
											+ "\nWhat would you like to do now?");
									choice1.setText("Gym");
									choice2.setText("Home");
									choice3.setText("");
									choice4.setText("");
								}
								
								
		public void Gym() {
			position = "Gym";
			mainTextArea.setText("You decided to head to the gym. Why? You're a "
					+ "\nComputer Science major, there's literally nothing here for you."
					+ "\nWell, they have food at least. What would you like to do?");
			choice1.setText("Buy a bagel");
			choice2.setText("Get shredded");
			choice3.setText("Leave");
			choice4.setText("");
		}
		
							public void GymBagel() {
								position = "GymBagel";
								if (duffel == 0)
								{
									mainTextArea.setText("You walk up to the counter and take a look at"
										+ "\nwhat they have to offer. They've got bagel sandwiches, as"
										+ "\nwell as some smoothies. They all look really expensive though."
										+ "\nYou can't afford any of this, so you leave."
										+ "\nWhat  would you like to do?");
								choice1.setText("Get shredded");
								choice2.setText("Leave");
								choice3.setText("");
								choice4.setText("");
									}
								
							else {
									mainTextArea.setText("You walk up to the counter and take a look at"
											+ "\nwhat they have to offer. They've got bagel sandwiches, as"
											+ "\nwell as some smoothies. They all look really expensive though."
											+ "\nYou don't have money yourself, but you look at the duffel bag"
											+ "\nand contemplate using money from there to pay for it. ."
											+ "\nWhat  would you like to do?");
									choice1.setText("Use bag money");
									choice2.setText("Exercise");
									choice3.setText("Leave");
									choice4.setText("");
								}
							}

							
							
											public void GymBagelBag1() {
												position = "GymBagelBag";
												mainTextArea.setText("You unzip the bag and try to loosen a single bill"
														+ "\nfrom the random bundled stacks of cash. You pull one out only"
														+ "\nto see that it's a 100 dollar bill. You hand it to the cashier"
														+ "\nand pull an unconvincing smile, the cashier accepts it and goes"
														+ "\nto make your food, and whispers something to another employee..");
												choice2.setText("-->");
												choice3.setText("");
												choice4.setText("");
											}
											
											public void GymBagelBag2() {
												position = "GymBagelBag2";
												mainTextArea.setText("as you wait for your food, a cop appears to your side and "
														+ "\nasks you to come with him. As you pass him, he grabs your arms and "
														+ "\nputs you in handcuffs. You're under arrest for possession of illegal "
														+ "\nsubstances and counterfitting. You plead your innocence but the cop "
														+ "\nunzips the bag and shoves it in your face. You realize you're screwed."
														+ "\n                                           Game over.");
												choice1.setText("Maybe don't");
												choice2.setText("pick up bags");
												choice3.setText("that aren't yours.");
												choice4.setText("Restart program.");
											}
							public void GymShred() {
								position = "GymShred";
								mainTextArea.setText("You head over to the part of the gym with "
										+ "\nall of the exercise equipment. They have weights,"
										+ "\na lot of cardio based machines, and a punching bag."
										+ "\nWhat would you like to do?");
								choice1.setText("Weights");
								choice2.setText("Cardio");
								choice3.setText("Punching bag");
								choice4.setText("");
							}
							
									public void GymShredW() {
										position = "GymShredW";
										mainTextArea.setText("You head over to the weights section of the gym "
												+ "\nand lay down on the bench, which has 2 25 pound weights on"
												+ "\neach side of it. You grab a hold of the bar, lift it up off"
												+ "\nthe hooks, and up and down above your chest. The bar is incredibly"
												+ "\nheavy but you manage to do a whole 5 reps before having to place it back."
												+ "\n (You gained +10% damage bonus with weapons!)"
												+ "\nWhat would you like to do? ");
										weaponSkill = weaponSkill + 2;
										if (pass == 0)
										{
										choice1.setText("Head to class");
										choice2.setText("Go home");
										choice3.setText("");
										choice4.setText("");
										}
										else
										{
											choice1.setText("Home");
											choice2.setText("");
											choice3.setText("");
											choice4.setText("");
										}
									}
									public void GymShredC() {
										position = "GymShredC";
										mainTextArea.setText("You take a seat on a stationary bike and begin to "
												+ "\npedal, ramping up and down in tandem with the electronic display. "
												+ "\nafter about 30 minutes, you decide to stop. You feel tired, but great!"
												+ "\n (You gained 15 health! )"
												+ "\nWhat would you like to do? ");
										if (playerHP>=85)
										{
											playerHP = 100;
										}
										else {

											playerHP = playerHP + 15;
										}
										if (pass == 0)
										{
										choice1.setText("Head to class");
										choice2.setText("Go home");
										choice3.setText("");
										choice4.setText("");
										}
										else
										{
											choice1.setText("Home");
											choice2.setText("");
											choice3.setText("");
											choice4.setText("");
										}
									}
									
									public void GymShredP() {
										position = "GymShredP";
										mainTextArea.setText("You head over to the punching bag section and"
												+ "\ndo a few stretches before laying into the bag. You take"
												+ "\nyour frustrations out on the bag, remembering all the work"
												+ "\nand other stuff weighing you down, letting it all out through"
												+ "\nyour fists against the leather. After 15 minutes of punching,"
												+ "\nyou decide to stop and clean up. "
												+ "\n     (Your unarmed combat skills rise 20%!))"
												+ "\nWhat would you like to do? ");
										unarmedSkill = 7;
										if (pass == 0)
										{
										choice1.setText("Head to class");
										choice2.setText("Go home");
										choice3.setText("");
										choice4.setText("");
										}
										else
										{
											choice1.setText("Home");
											choice2.setText("");
											choice3.setText("");
											choice4.setText("");
										}
									}
									
									
									public void GymBackdoor() {
										position = "GymBackdoor";
										mainTextArea.setText("You decide to head out, leaving out of the back entrance as"
												+ "\nit's closer to your destination. As you turn the corner to the small"
												+ "\nconnector, a large man in a wifebeater, green tactical pants, and dark"
												+ "\nred military boots stops you. In a deep, thickly-accented voice, he asks"
												+ "'Vere ees ze product and dollar little man'. ");
										choice1.setText("-->");
										choice2.setText("");
										choice3.setText("");
										choice4.setText("");
									}
									
												public void GymBackdoorViktor() {
													position = "GymBackdoorViktor";
													if (duffel == 0 && viktor == 0)
													{
													mainTextArea.setText("You tell the man you have no idea what he's talking about,"
															+ "\nand try to walk past him. He puts his arm out to stop you again,"
															+ "\ninspects you, and then puts it down and you walk on. What was"
															+ "\nthat all about? Whatever, you have somewhere to be, so you"
															+ "\nignore it and walk on."
															+ "\nWhere would you like to go?");
													choice1.setText("Class");
													choice2.setText("Home");
													choice3.setText("");
													choice4.setText("");
													}
													
													else if (duffel == 0 && viktor == 1)
													{
													mainTextArea.setText("You tell him you don't know what he's talking about "
															+ "\nand try to walk past him. He grabs you, pushes you back in front "
															+ "\nof him, and says 'Do not trick me little man, tell Viktor where "
															+ "\nbag is or else. "
															+ "\nHe cracks his knuckles and towers over you. What do you do? ");
													choice1.setText("Fight");
													choice2.setText("Run");
													choice3.setText("");
													choice4.setText("");}
												
												else if (duffel == 1 && viktor == 0) 
												{
												mainTextArea.setText("You tell him you don't know what he's talking about, "
														+ "\nbut he grabs a hold of the duffel bag in your hand and unzips "
														+ "\nit. He sees the contents inside, tries to wrestle it from your"
														+ "\ngrip, and you fall to the floor with duffel bag in arms. He"
														+ "\ncracks his knuckles and winds up a punch, get ready to fight!");
												choice1.setText("Fight!");
												choice2.setText("");
												choice3.setText("");
												choice4.setText("");
												}
													
												else if (duffel == 1 && viktor == 1)
												{
												mainTextArea.setText("You stand there, frozen, as the friend request you got "
														+ "\nalong with the weird message that followed combined with the duffel"
														+ "\nbag full of strange stuff and stacks of cash finally clicks in your  "
														+ "\nhead. You ponder your options in this situation for a moment. "
														+ "\nWhat do you do?");
												choice1.setText("Give it");
												choice2.setText("Don't give it");
												choice3.setText("");
												choice4.setText("");}
											}
													
												public void GymBackdoorViktorGive() {
													position = "GymBackdoorViktorGive";
													mainTextArea.setText("You don't even think about trying to fight this guy."
															+ "\nYou hand over the duffel bag and he inspects it, gives you a "
															+ "\nfirm nod, and pulls two of the stacks of cash out of the bag."
															+ "\nYou inspect the stacks and realize he handed you 100,000 dollars."
															+ "\nYou quickly stuff them under your shirt and decide to run home "
															+ "\nwith your new found wealth.");
													choice1.setText("-->");
													choice2.setText("");
													choice3.setText("");
													choice4.setText("");
												}
											
												public void GymBackdoorViktorFight() {
													position = "GymBackdoorViktorFight";
													mainTextArea.setText("You decide to take him on. You get in a fighting stance "
															+ "\nand ready your " + weapon + " for battle. Begin fight!");
													testScore = 100;
													choice1.setText("-->");
													choice2.setText("");
													choice3.setText("");
													choice4.setText("");
												}
												
												
												
																	public void GymBackdoorViktorFightAttack() {
																		position="GymBackdoorViktorFightAttack";
																		if (weapon == "Fists")
																		{
																		playerDamage = new java.util.Random().nextInt(unarmedSkill);
																		}
																		else
																		{
																			playerDamage = new java.util.Random().nextInt(weaponSkill);
																		}
																		
																		mainTextArea.setText("Viktor's Health: " + testScore
																				+ "\n"
																				+ "\nYou attack with your " + weapon + " and did " + playerDamage + " damage.");
																		testScore = testScore - playerDamage;
																		choice1.setText("-->");
																		choice2.setText("");
																		choice3.setText("");
																		choice4.setText("");
																		}
																		
																	
																	
																	public void GymBackdoorViktorFightRiposte() {
																		position="GymBackdoorViktorFightRiposte";
																		int testDamage = 0;
																		testDamage = new java.util.Random().nextInt(6);
																		
																		mainTextArea.setText("Viktor throws a punch, and you take " + testDamage + " points in "
																				+ "\ndamage.");
																		playerHP = playerHP - testDamage;
																		hpLabelNumber.setText("" + playerHP);
																		choice1.setText("-->");
																		choice2.setText("");
																		choice3.setText("");
																		choice4.setText("");
																	}
																	
																	
																	public void GymBackdoorViktorFightWin() {
																		position = "GymBackdoorViktorFightWin";
																		mainTextArea.setText("You land a final blow to Viktor and he "
																				+ "\ntopples over, going down flat on his back. You decide"
																				+ "\nto head home as you can't afford to get caught having "
																				+ "\nfought someone, much less with the circumstance you're"
																				+ "\nin. You grab your things and dart for your dorm room.");
																		money = 1;
																		choice1.setText("-->");
																		choice2.setText("");
																		choice3.setText("");
																		choice4.setText("");
																	}
																	
																	public void GymBackdoorViktorFightLose() {
																		position = "GymBackdoorViktorFightLose";
																		
																		mainTextArea.setText("You tried your best, but Viktor pummelled you "
																				+ "\nso hard you were knocked out and found later by police. "
																				+ "\nAfter investigation into the situation, they arrest you "
																				+ "\nfor criminal activity. There goes your college career. "
																				+ "                                      Game Over.");
																		choice1.setText("Restart the");
																		choice2.setText("program to");
																		choice3.setText("Try again.");
																		choice4.setText("Game Over.");
																		
																	}
					
																	
																	
																	
																	
				
		public void Home() {
			position = "Home";
			if (pass == 0 && money == 0)
			{
			mainTextArea.setText("You decide to head home, exhausted from everything today. "
					+ "\nYou lay down on your bed ready to earn some much needed rest. "
					+ "\nYou check your calendar on your phone and see you had an exam "
					+ "\ntoday that you totally missed. You check your grade for that class "
					+ "\nand see that it's now a 48. You've failed the class and the semester. "
					+ "\nMaybe you should have gone to class. Game over.");
			choice1.setText("At least you had");
			choice2.setText("fun today, right?");
			choice3.setText("Restart program");
			choice4.setText("to try again.");
			}
			
			else if (pass == 1 && money == 0)
			{
				mainTextArea.setText("You decide to head home, exhausted from everything today. "
						+ "\nYou lay down on your bed ready to earn some much needed rest. "
						+ "\nYou relax, knowing you got what needed to be done done and that "
						+ "\nyour grades are safe. At least for now. You close your eyes and "
						+ "\nfall asleep, comfortable and safe. "
						+ "\n                    You won! Congratulations!");
				choice1.setText("College isn't");
				choice2.setText("so bad, is it?");
				choice3.setText("Restart program");
				choice4.setText("to play again.");
				}
			
			else if (pass == 0 && money == 1)
			{
				mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
						+ "\nYou check the stacks of cash you hid and just stare at it. You made "
						+ "\nenough to cover your student loans as well as a down payment on a"
						+ "\nhouse or a car. This is the stuff people in college dream of. You "
						+ "\nstash the money somewhere safe, get in bed, and get on your phone. "
						+ "\nYou check your calendar and see you missed an exam today and failed "
						+ "\nthat class and the seemster. Oh well, it was worth it."
						+ "\n                      You won! Congratulations!");
				choice1.setText("At least you");
				choice2.setText("have money for");
				choice3.setText("a repeat semester.");
				choice4.setText("Play again?");
				}
			
			else if (pass == 0 && duffel == 1)
			{
				mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
						+ "\nYou check the duffel bag and see about 800,000 in cash, as well as "
						+ "\nthose weird duct taped squares. You toss the squares and just keep "
						+ "\nthe cash somewhere safe. You get in bed, check your phone, and see "
						+ "\nthat Viktor was arrested. You worry but know that he won't be saying "
						+ "\nanything to police. You also see you missed an exam in class today and "
						+ "\that means you failed the semester. Oh well, you're rich!"
						+ "\n                         You won! Congratulations!");
				choice1.setText("At least you");
				choice2.setText("have money for");
				choice3.setText("a repeat semester.");
				choice4.setText("Play again?");
				}
			
			else if (pass == 1 && duffel == 1)
			{
				mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
						+ "\nYou check the duffel bag and see about 800,000 in cash, as well as "
						+ "\nthose weird duct taped squares. You toss the squares and just keep "
						+ "\nthe cash somewhere safe. You get in bed, check your phone, and see "
						+ "\nthat Viktor was arrested. You worry but know that he won't be saying "
						+ "\nanything to police. You sleep knowing you did well today in all aspects."
						+ "\n                         You won! Congratulations!");
				choice1.setText("Hopefully the");
				choice2.setText("cops don't check");
				choice3.setText("your garbage cans.");
				choice4.setText("Play again?");
				}
			
			else if (pass == 1 && money == 1)
			{
				mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
						+ "\nYou check the stacks of cash you hid and just stare at it. You made "
						+ "\nenough to cover your student loans as well as a down payment on a"
						+ "\nhouse or a car. This is the stuff people in college dream of. You "
						+ "\nstash the money somewhere safe, get in bed, and see nthat Viktor "
						+ "was arrested. You worry but know that he won't be saying anything "
						+ "\nto the police. You sleep knowing you did well today in all aspects."
						+ "\n                      You won! Congratulations!");
				choice1.setText("Good job.");
				choice2.setText("You did everything");
				choice3.setText("right (probably).");
				choice4.setText("Play again?");
				}
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
									case "c1": AreaTwo(); weapon="Hot Sauce";
									weaponLabelName.setText(weapon); break;
									case "c2": A1Choice3Closet(); break;
									case "c3": break;
									case "c4": break;
									}
									break;
								case "A1Choice3Closet2":
									switch(userChoice) {
									case "c1": AreaTwo(); weapon="SwitchComb";
									weaponLabelName.setText(weapon); break;
									case "c2": A1Choice3Closet(); break;
									case "c3": break;
									case "c4": break;
									}
									break;
								case "A1Choice3Closet3":
									switch(userChoice) {
									case "c1": AreaTwo(); weapon="Staff";
									weaponLabelName.setText(weapon); break;
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
					case "AreaTwo":
						switch(userChoice) {
						case "c1": Class();  break;
						case "c2": Library();break;
						case "c3": Lounge(); break;
						case "c4": Gym();break;
						}
						break;
							case "Class":
								switch(userChoice) {
								case "c1": ClassFight(); break;
								case "c2": ClassRun();   break;
								case "c3": ClassCheat(); break;
								case "c4": break;
								}
								break;
									case "ClassFight":
										switch(userChoice) {
										case "c1": ClassFightTest(); break;
										case "c2": break;
										case "c3": break;
										case "c4": break;
										}
										break;
										
											case "ClassFightTest":
												switch(userChoice) {
												case "c1": ClassFightTestBack(); break;
												case "c2": break;
												case "c3": break;
												case "c4": break;
												}
												break;
											case "ClassFightTestBack":
												switch(userChoice) {
												case "c1": 
													if(questionNum < 21 && testScore < 100)
													{
													ClassFightNext();
													}
													else if (testScore < 60){
														TestFail();
													}
													else {
														TestPass();
													}
													break;
												case "c2": break;
												case "c3": break;
												case "c4": break;
												}
												break;
											case "ClassFightNext":
												switch(userChoice) {
												case "c1": 
													if (playerHP<1)
														{
															TestDeath();
														}
													else {
														ClassFightTest();
														} 
													break;
												case "c2": break;
												case "c3": break;
												case "c4": break;
												}
												break;
											case "TestPass":
												switch(userChoice) {
												case "c1": Library(); break;
												case "c2": Lounge(); break;
												case "c3": Gym(); break;
												case "c4": break;
												}
												break;
												
			case "Library":
				switch(userChoice) {
				case "c1": 
					if (pass == 1)
					{
						break;
					}
					else {
						LibraryStudy();
					}
					break;
				case "c2": LibraryChill(); break;
				case "c3": 
					if (duffel == 0)
					{
					LibraryWander();
					}
					else
					{
						break;
					}
					break;
				case "c4": break;
				}
				break;
				
					case "LibraryChill":
						switch(userChoice) {
						case "c1": 
							if(pass == 0)
								{
								 break;
								}
								else 
								{
									Lounge();
								}
								break;
						case "c2": if (pass == 0)
							{
							break;
							}
							else 
							{
								Gym();
							}
							break;
						case "c3": 
							if (pass == 0)
								{
								break;
								}
							else
							{
								Home();
							}
							break;
						case "c4": break;
						}
						break;
					case "LibraryStudy":
						switch(userChoice) {
						case "c1": Class(); break;
						case "c2": LibraryFail(); break;
						case "c3": LibraryFail();break;
						case "c4": break;
						}
						break;
					case "LibraryWander":
						switch(userChoice) {
						case "c1": LibraryWanderTake(); break;
						case "c2": LibraryWanderLeave(); break;
						case "c3": break;
						case "c4": break;
						}
						break;
						
					case "LibraryWanderTake":
						switch(userChoice) {
						case "c1": 
							if (pass == 0)
							{
							Class();
							}
							else
							{
								Lounge();
							}
							break;
						case "c2": Gym(); break;
						case "c3": 
							if (pass == 0)
							{
							Lounge();
							}
							else 
							{
								Home();
							}
							break;
						case "c4": break;
						}
						break;
						
					case "LibraryWanderLeave":
						switch(userChoice) {
						case "c1": 
							if (pass == 0)
								{
								Class();
								}
							else
								{
								Lounge();
								}
							break;
						case "c2": Gym(); break;
						case "c3":
							if(pass == 0)
								{
									Lounge();
								}
							else
								{
									Home();
								}
							break;
						case "c4": break;
							}
						break;
						
			case "Lounge":
				switch(userChoice) {
				case "c1": LoungeGames(); break;
				case "c2": LoungePool(); break;
				case "c3": break;
				case "c4": break;
				}
				break;
					case "LoungeGames":
						switch(userChoice) {
						case "c1": 
							if (pass == 0)
							{
							LoungeGamesAgain();
							}
							else
							{
								LoungeGamesAgain1();
							}
							break;
						case "c2": 
							if (pass == 0)
							{
							Class(); 
							}
							else
							{
								LoungeGamesAgain2();
							}
							break;
						case "c3": break;
						case "c4": break;
						}
						break;
						
					case "LoungeGamesAgain1":
						switch(userChoice) {
						case "c1": Gym(); break;
						case "c2": Home(); break;
						case "c3": break;
						case "c4": break;
						}
						break;
					case "LoungeGamesAgain2":
						switch(userChoice) {
						case "c1": Gym(); break;
						case "c2": Home(); break;
						case "c3": break;
						case "c4": break;
						}
						break;
						
					case "LoungePool":
						switch(userChoice) {
						case "c1": LoungePoolWager(); break;
						case "c2": LoungePoolFun(); break;
						case "c3": break;
						case "c4": break;
						}
						break;
						
								case "LoungePoolWager":
									switch(userChoice) {
									case "c1": if (wager > 10)
										{
										LoungePoolWagerTails();
										}
									else {
										LoungePoolWagerHeads();
									}
									 break;
									case "c2": break;
									case "c3": break;
									case "c4": break;
									}
									break;
									
										case "LoungePoolWagerHeads":
											switch(userChoice) {
											case "c1":if (wager > 1)
												{
												LoungePoolWagerHeads2Win(); 
												}
											else 
											{
												LoungePoolWagerHeads2Lose();
											}

											break;
											case "c2":  break;
											case "c3": break;
											case "c4": break;
											}
											break;
										
												case "LoungePoolWagerHeads2Win":
													switch(userChoice) {
													case "c1": Gym(); break;
													case "c2": Home();break;
													case "c3": break;
													case "c4": break;
													}
													break;
											
										case "LoungePoolWagerTails":
											switch(userChoice) {
											case "c1": LoungePoolWagerTails2(); break;
											case "c2": break;
											case "c3": break;
											case "c4": break;
											}
											break;
											
												case "LoungePoolWagerTails2":
													switch(userChoice) {
													case "c1": Gym(); break;
													case "c2": Home(); break;
													case "c3": break;
													case "c4": break;
													}
													break;
													
					case "Gym":
						switch(userChoice) {
						case "c1": GymBagel(); break;
						case "c2": GymShred(); break;
						case "c3": GymBackdoor(); break;
						case "c4": break;
						}
						break;
						
								case "GymBagel":
									switch(userChoice) {
									case "c1": 
										if(duffel == 0) {
											GymShred(); 
										}
										else {
											GymBagelBag1();
										}
										 break;
										
									case "c2": GymBackdoor();   break;
									case "c3": break;
									case "c4": break;
									}
												break;
											case "GymBagelBag1":
												switch(userChoice) {
												case "c1": GymBagelBag2(); break;
												case "c2": break;
												case "c3": break;
												case "c4": break;
												}
												break;
								case "GymShred":
									switch(userChoice) {
									case "c1": GymShredW(); break;
									case "c2": GymShredC(); break;
									case "c3": GymShredP(); break;
									case "c4": break;
									}
									break;
										case "GymShredW":
											switch(userChoice) {
											case "c1":
												if (pass == 0)
													{
														Class();
													}
												else
													{
														GymBackdoor();
													}
												break;
											case "c2": 
												if (pass == 0)
													{
														GymBackdoor();
													}
												else
													{
														break;
													}
												break;
											case "c3": break;
											case "c4": break;
											}
											break;
										case "GymShredC":
											switch(userChoice) {
												case "c1":
													if (pass == 0)
														{
															Class();
														}
													else
														{
															GymBackdoor();
														}
													break;
												case "c2": 
													if (pass == 0)
														{
															GymBackdoor();
														}
													else
														{
															break;
														}
													break;
											case "c3": break;
											case "c4": break;
											}
											break;
										case "GymShredP":
											switch(userChoice) {
												case "c1":
													if (pass == 0)
														{
															Class();
														}
													else
														{
															GymBackdoor();
														}
													break;
												case "c2": 
													if (pass == 0)
														{
															GymBackdoor();
														}
													else
														{
															break;
														}
													break;
											case "c3": break;
											case "c4": break;
											}
											break;
											
										case "GymBackdoor":
											switch(userChoice) {
											case "c1": GymBackdoorViktor(); break;
											case "c2": break;
											case "c3": break;
											case "c4": break;
											}
											break;
											
										case "GymBackdoorViktor":
											switch(userChoice) {
											
											case "c1": 
														if (duffel == 0 && viktor == 0)
															{
																Class();
															}
														else if (duffel == 1 && viktor == 1)
															{
																GymBackdoorViktorGive();
															}
														else 
															{
																GymBackdoorViktorFight();
															}
														 break;
											case "c2":
														if (duffel == 0 && viktor == 0)
														{
														Home(); 
														}
														else 
														{
															GymBackdoorViktorFight(); 
														}
														break;
											case "c3": break;
											case "c4": break;
											}
											break;
											
															case "GymBackdoorViktorGive":
																switch(userChoice) {
																case "c1": Home(); break;
																case "c2": break;
																case "c3": break;
																case "c4": break;
																}
																break;
																
															case "GymBackdoorViktorFight":
																switch(userChoice) {
																case "c1": GymBackdoorViktorFightAttack(); break;
																case "c2": break;
																case "c3": break;
																case "c4": break;
																}
																break;
																
															case "GymBackdoorViktorFightAttack":
																switch(userChoice) {
																case "c1": GymBackdoorViktorFightRiposte(); break;
																case "c2": break;
																case "c3": break;
																case "c4": break;
																}
																break;
															case "GymBackdoorViktorFightRiposte":
																switch(userChoice) {
																case "c1": 
																	if(testScore > 0)
																	{
																		GymBackdoorViktorFightAttack();
																	}
																	else if (playerHP <= 0){
																		GymBackdoorViktorFightLose();
																	}
																	else {
																		GymBackdoorViktorFightWin();
																	}
																	break;
																case "c2": break;
																case "c3": break;
																case "c4": break;
																}
																break;
															case "GymBackdoorViktorFightWin":
																switch(userChoice) {
																case "c1": Home(); break;
																case "c2": break;
																case "c3": break;
																case "c4": break;
																}
																break;
																
															
									
												
		}
			
		}
		}
}
