package package01;
//Weapons in separate package for organization, imports listed below
import package02.Weapon_FancyCue;
import package02.Weapon_Fists;
import package02.Weapon_HotSauce;
import package02.Weapon_Staff;
import package02.Weapon_SwitchComb;

//Initialization of Story class
public class Story {
	
	//Imports of other classes to use data and functions within them
	Game game;
	UI ui;
	VisibilityManager vm;
	Player player = new Player();

	public Story(Game g, UI userInterface, VisibilityManager vManager) {
		
		game = g;
		ui = userInterface;
		vm = vManager;
	}
	
	//Default "avatar" including settings for story
	public void defaultSetup() {
		player.playerHP = 90;
		player.playerDamage = 0;
		player.testScore = 0;
		player.viktor = 0;
		player.questionNum = 1;
		player.study = 0;
		player.pass = 0;
		player.wager = 0;
		player.duffel = 0;
		player.weaponSkill = 8;
		player.unarmedSkill = 5;
		player.money = 0;
		ui.hpLabelNumber.setText("" + player.playerHP);
		player.currentWeapon = new Weapon_Fists();
		ui.weaponLabelName.setText(player.currentWeapon.name);
	}
	
	//Positional and declaration data of every switch case for Game class to use
	public void selectPosition(String nextPosition) {
		
		switch(nextPosition) {
		case "A1Choice1": A1Choice1(); break;
		case "A1Choice2": A1Choice2(); break;
		case "A1Choice3": A1Choice3(); break;
		case "A1Choice4": A1Choice4(); break;
		case "A1Choice2Messages": A1Choice2Messages(); break;
		case "A1Choice2Notifications": A1Choice2Notifications(); break;
		case "A1Choice2FriendRequest": A1Choice2FriendRequest(); break;
		case "A1Choice2AcceptRequest": A1Choice2AcceptRequest(); break;
		case "A1Choice2AcceptRequest2": A1Choice2AcceptRequest2(); break;
		case "A1Choice2AcceptRequestLoop1": A1Choice2AcceptRequestLoop1(); break;
		case "A1Choice2AcceptRequestLoop2": A1Choice2AcceptRequestLoop2(); break;
		case "A1Choice3Brunch": A1Choice3Brunch(); break;
		case "A1Choice3BrunchCold": A1Choice3BrunchCold(); break;
		case "A1Choice3BrunchHot": A1Choice3BrunchHot(); break;
		case "A1Choice3BrunchHotFast": A1Choice3BrunchHotFast(); break;
		case "A1Choice3BrunchHotSlow": A1Choice3BrunchHotSlow(); break;
		case "A1Choice3BrunchFridge": A1Choice3BrunchFridge(); break;
		case "A1Choice3BrunchForgetIt": A1Choice3BrunchForgetIt(); break;
		case "A1Choice3Clean": A1Choice3Clean(); break;
		case "A1Choice3Clothes": A1Choice3Clothes(); break;
		case "A1Choice3Closet": A1Choice3Closet(); break;
		case "A1Choice3Closet1": A1Choice3Closet1(); break;
		case "A1Choice3Closet2": A1Choice3Closet2(); break;
		case "A1Choice3Closet3": A1Choice3Closet3(); break;
		case "A1Choice3Closet4": A1Choice3Closet4(); break;
		case "A1Choice3Shower": A1Choice3Shower(); break;
		case "A1Choice3OutNaked": A1Choice3OutNaked(); break;
		case "AreaTwo": AreaTwo(); break;
		case "Class": Class(); break;
		case "ClassFight": ClassFight(); break;
		case "ClassFightTest": ClassFightTest(); break;
		case "ClassFightTestBack": ClassFightTestBack(); break;
		case "ClassFightNext": ClassFightNext(); break;
		case "TestPass": TestPass(); break;
		case "TestDeath": TestDeath(); break;
		case "TestFail": TestFail(); break;
		case "ClassRun": ClassRun(); break;
		case "ClassCheat": ClassCheat(); break;
		case "Library": Library(); break;
		case "LibraryStudy": LibraryStudy(); break;
		case "LibraryFail": LibraryFail(); break;
		case "LibraryChill": LibraryChill(); break;
		case "LibraryWander": LibraryWander(); break;
		case "LibraryWanderTake": LibraryWanderTake(); break;
		case "LibraryWanderLeave": LibraryWanderLeave(); break;
		case "Lounge": Lounge(); break;
		case "LoungeGames": LoungeGames(); break;
		case "LoungeGamesAgain": LoungeGamesAgain(); break;
		case "LoungeGamesAgain1": LoungeGamesAgain1(); break;
		case "LoungeGamesAgain2": LoungeGamesAgain2(); break;
		case "LoungePool": LoungePool(); break;
		case "LoungePoolWager": LoungePoolWager(); break;
		case "LoungePoolWagerHeads": LoungePoolWagerHeads(); break;
		case "LoungePoolWagerHeads2Win": LoungePoolWagerHeads2Win(); break;
		case "LoungePoolWagerHeads2Lose": LoungePoolWagerHeads2Lose(); break;
		case "LoungePoolWagerTails": LoungePoolWagerTails(); break;
		case "LoungePoolWagerTails2": LoungePoolWagerTails2(); break;
		case "LoungePoolFun": LoungePoolFun(); break;
		case "Gym": Gym(); break;
		case "GymBagel": GymBagel(); break;
		case "GymBagelBag1": GymBagelBag1(); break;
		case "GymBagelBag2": GymBagelBag2(); break;
		case "GymShred": GymShred(); break;
		case "GymShredW": GymShredW(); break;
		case "GymShredC": GymShredC(); break;
		case "GymShredP": GymShredP(); break;
		case "GymBackdoor": GymBackdoor(); break;
		case "GymBackdoorViktor": GymBackdoorViktor(); break;
		case "GymBackdoorViktorGive": GymBackdoorViktorGive(); break;
		case "GymBackdoorViktorFight": GymBackdoorViktorFight(); break;
		case "GymBackdoorViktorFightAttack": GymBackdoorViktorFightAttack(); break;
		case "GymBackdoorViktorFightRiposte": GymBackdoorViktorFightRiposte(); break;
		case "GymBackdoorViktorFightWin": GymBackdoorViktorFightWin(); break;
		case "GymBackdoorViktorFightLose": GymBackdoorViktorFightLose(); break;
		case "Home": Home(); break;
		
		
		
		
		
		}
		
	}
	
	//Start of the game, Area One.
public void AreaOne() {
		ui.mainTextArea.setText("You wake up in a tiny 15x10 foot apartment."
				+ "\nThe faint smell of yesterday night's pizza and "
				+ "\nalcohol fills the air as your eyes are assaulted by "
				+ "\nthe blinding white and blue light of a monitor with "
				+ "\nlines of code, still open from last nights coding "
				+ "\nsession with your buddies. What do you do? ");
		ui.choice1.setText("Check calendar");
		ui.choice2.setText("Check MyTwitBookGram");
		ui.choice3.setText("Get out of bed");
		ui.choice4.setText("Go back to sleep");
		
				game.nextPosition1 = "A1Choice1";
				game.nextPosition2 = "A1Choice2";
				game.nextPosition3 = "A1Choice3";
				game.nextPosition4 = "A1Choice4";
	}

	//First choice for Area One, first branch
		public void A1Choice1() {
			ui.mainTextArea.setText("You decide to check your online calendar."
					+ "\nYou see that you have multiple assignments due"
					+ "\nvery soon. A programming project, some math work,"
					+ "\nand some Gen Ed assignments. As much as you'd love"
					+ "\nto get right on those, it's still a bit early. "
					+ "\nWhat would you like to do?");
			ui.choice1.setText("Check MyTwitBookGram");
			ui.choice2.setText("Get out of bed");
			ui.choice3.setText("Go back to sleep");
			ui.choice4.setText("");
			
			
				game.nextPosition1 = "A1Choice2";
				game.nextPosition2 = "A1Choice3";
				game.nextPosition3= "A1Choice4";
				game.nextPosition4= "";
		}
		
		//Second choice for Area One, second branch
		public void A1Choice2() {
			ui.mainTextArea.setText("You open a new tab and type mytwitbookgram.com."
					+ "\nYou see classmates posting offensive memes, some family"
					+ "\nmembers posting fake news articles about how the government"
					+ "\nis secretly lizard people, and a few of your friends posting"
					+ "\nabout how much it sucks to be in college. That's a mood."
					+ "\nYou have 2 messages, 15 notifications, and a friend request."
					+ "\nWhat would you like to do?");
			ui.choice1.setText("Get off computer");
			ui.choice2.setText("Check messages");
			ui.choice3.setText("Check notifications");
			ui.choice4.setText("Check friend request");
			
			game.nextPosition1 = "A1Choice3";
			game.nextPosition2 = "A1Choice2Messages";
			game.nextPosition3 = "A1Choice3Notifications";
			game.nextPosition4 = "A1Choice4FriendRequest";
		}
		
					//2-2 choice for Area One
					public void A1Choice2Messages() {
						ui.mainTextArea.setText("You check your messages. One is from your friend and"
								+ "\n coding project partner, and says 'yo did u finish the class"
								+ "\n for our text based adventure. We need that done by midnight"
								+ "\n tonight or else were screwed.' You feel a strange sense of "
								+ "\n meta-narrative taking place, but are not sure why. The other"
								+ "\n message says 'Hey cutie, I live in Anonymous Proxy too, want"
								+ "\n to meet up?'. It's most likely spam. What would you like to do?");
						ui.choice1.setText("Get off computer");
						ui.choice2.setText("Check notifications");
						ui.choice3.setText("Check friend request");
						ui.choice4.setText("");
						
						game.nextPosition1 = "A1Choice3";
						game.nextPosition2 = "A1Choice2Notifications";
						game.nextPosition3 = "A1Choice2FriendRequest";
						game.nextPosition4 = "";
					}
					//2-3 choice for Area One
					public void A1Choice2Notifications() {
						ui.mainTextArea.setText("You check your notifications. Nothing interesting,"
								+ "\njust some likes on your posts, some comments arguing about how"
								+ "\nthe stuff you like sucks and why the stuff they like is better,"
								+ "\nand things of that nature. What would you like to do?");
						ui.choice1.setText("Get off computer");
						ui.choice2.setText("Check messages");
						ui.choice3.setText("Check friend request");
						ui.choice4.setText("");
						
						game.nextPosition1 = "A1Choice3";
						game.nextPosition2 = "A1Choice2Messages";
						game.nextPosition3 = "A1Choice2FriendRequest";
						game.nextPosition4 = "";
					}
					//2-4 choice for Area One
					public void A1Choice2FriendRequest() {
						ui.mainTextArea.setText("You click on the friend requests section and see"
								+ "\n a man named 'Viktor' has sent you a friend request. You"
								+ "\n think back and try to remember if you know anybody named"
								+ "\n Viktor, but you can't even remember what you'd just learned"
								+ "\n in lecture yesterday morning, so it's futile. "
								+ "\n What would you like to do?");
						player.viktor = 0;
						ui.choice1.setText("Get off computer");
						ui.choice2.setText("Accept the friend request.");
						ui.choice3.setText("Check notifications");
						ui.choice4.setText("Check messages");
						
						game.nextPosition1 = "A1Choice3";
						game.nextPosition2 = "A1Choice2AcceptRequest";
						game.nextPosition3 = "A1Choice2Notifications";
						game.nextPosition4 = "A1Choice2Messages";
					}
					
					//2-5-1 choice for Area One
					public void A1Choice2AcceptRequest() {
						ui.mainTextArea.setText("You accept the friend request and prepare"
								+ "\n to get off, but as soon as you go to close the tab"
								+ "\n you receive a message. It's from Viktor, the man you"
								+ "\n just added. What would you like to do?");
						player.viktor = 1;
						ui.choice1.setText("Get off computer");
						ui.choice2.setText("Check the message.");
						ui.choice3.setText("");
						ui.choice4.setText("");
						
						game.nextPosition1 = "A1Choice3";
						game.nextPosition2 = "A1Choice2AcceptRequest2";
						game.nextPosition3 = "";
						game.nextPosition4 = "";
					}
					
					//2-5-2 choice for Area One
							public void A1Choice2AcceptRequest2() {
								ui.mainTextArea.setText("You open up the message from Viktor. It says: "
										+ "\n 'you meet viktor 5 pm behind america ball field. "
										+ "\n bring america dolar and product. no be late. you"
										+ "\n accept friendship, boss say was signal'. You have"
										+ "\n no idea what this means, but it does worry you a "
										+ "\n bit. What could that mean? Regardless, you have"
										+ "\n stuff to do, and really should get to that. What"
										+ "\n would you like to do?");
								ui.choice1.setText("Get off computer");
								ui.choice2.setText("Check messages");
								ui.choice3.setText("Check notifications");
								ui.choice4.setText("");
								
								game.nextPosition1 = "A1Choice3";
								game.nextPosition2 = "A1Choice2AcceptRequestLoop1";
								game.nextPosition3 = "A1Choice2AcceptRequestLoop2";
								game.nextPosition4 = "";
							}
							
							////2-5-1A&B choice for Area OneThese two functions allow players that didn't pick the previous choices but went down the "friend request" path to check those paths again (as they don't result in a change of state for the player unlike the 'Viktor' scenario, which would cause continuity errors).
							public void A1Choice2AcceptRequestLoop1() {
								ui.mainTextArea.setText("You check your notifications. Nothing interesting,"
										+ "\njust some likes on your posts, some comments arguing about how"
										+ "\nthe stuff you like sucks and why the stuff they like is better,"
										+ "\nand things of that nature. What would you like to do?");
								ui.choice1.setText("Get off computer");
								ui.choice2.setText("Check messages");
								ui.choice3.setText("");
								ui.choice4.setText("");
								
								game.nextPosition1 = "A1Choice3";
								game.nextPosition2 = "A1Choice2AcceptRequestLoop2";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							}
							public void A1Choice2AcceptRequestLoop2() {
								ui.mainTextArea.setText("You check your messages. One is from your friend and"
										+ "\n coding project partner, and says 'yo did u finish the class"
										+ "\n for our text based adventure. We need that done by midnight"
										+ "\n tonight or else were screwed.' You feel a strange sense of "
										+ "\n meta-narrative taking place, but are not sure why. The other"
										+ "\n message says 'Hey cutie, I live in Anonymous Proxy too, want"
										+ "\n to meet up?'. It's most likely spam. What would you like to do?");
								ui.choice1.setText("Get off computer");
								ui.choice2.setText("Check notifications");
								ui.choice3.setText("");
								ui.choice4.setText("");
								
								game.nextPosition1 = "A1Choice3";
								game.nextPosition2 = "A1Choice2AcceptRequestLoop1";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							}
	
							//3-1 choice for Area One, Second Branch
		public void A1Choice3() {
			ui.mainTextArea.setText("You sit up, stretch, and throw the sheets off of yourself"
					+ "\nand step out of bed, ready to tackle the day like a responsible"
					+ "\nadult. And it's only 10:30 AM! "
					+ "\nWhat do you do?");
			ui.choice1.setText("Have brunch");
			ui.choice2.setText("Get clean");
			ui.choice3.setText("Get dressed");
			ui.choice4.setText("Head out");
			
			game.nextPosition1 = "A1Choice3Brunch";
			game.nextPosition2 = "A1Choice3Clean";
			game.nextPosition3 = "A1Choice3Clothes";
			game.nextPosition4 = "A1Choice4OutNaked";
		}
		//3-2 choice for Area One, Second Branch
					public void A1Choice3Brunch() {
						ui.mainTextArea.setText("You are starving! You can even tell because your"
								+ "\nhealth is at 90 when it should be at 100, as is written"
								+ "\nin the Text-Based Adventure Bible!"
								+ "\nWhat would you like to do?");
						ui.choice1.setText("Eat some leftover pizza (cold)");
						ui.choice2.setText("Eat some leftover pizza (hot)");
						ui.choice3.setText("Check the fridge");
						ui.choice4.setText("Forget it");
						
						game.nextPosition1 = "A1Choice3BrunchCold";
						game.nextPosition2 = "A1Choice3BrunchHot";
						game.nextPosition3 = "A1Choice3Fridge";
						game.nextPosition4 = "A1Choice4ForgetIt";
					}
					
					//3-2A choice for Area One, Second Branch
										public void A1Choice3BrunchCold(){
											ui.mainTextArea.setText("You decide to eat the leftover pizza on the counter"
													+ "\n without so much as even heating it up. You're in college,"
													+ "\nand every second counts, so no time for luxuries like warming"
													+ "\nup your food. You scarf down a couple slices of cold pizza."
													+ "\nIt's not very pleasant. You gain 5 health points. "
													+ "\n What would you like to do now?");
											player.playerHP = 95;
											ui.hpLabelNumber.setText("" + player.playerHP);
											ui.choice1.setText("Get clean");
											ui.choice2.setText("Get dressed");
											ui.choice3.setText("Head out");
											ui.choice4.setText("");
											
											game.nextPosition1 = "A1Choice3Clean";
											game.nextPosition2 = "A1Choice3Clothes";
											game.nextPosition3 = "A1Choice4OutNaked";
											game.nextPosition4 = "";
										}
										
										//3-2B choice for Area One, Second Branch
										public void A1Choice3BrunchHot() {
											ui.mainTextArea.setText("You decide to eat some leftover pizza, but you're"
													+ "\nnot a savage, and you pull out a paper plate and toss the"
													+ "\npizza on it and into the microwave. The whole room fills with"
													+ "\nthe smell of warm cheese and meat as the timer slowly ticks down,"
													+ "\nand then dings. You pull the plate out and can feel the heat radiating"
													+ "\noff of the slices with a deliciously inviting smell as well."
													+ "\nWhat would you like to do now?");
											ui.choice1.setText("Take a bite");
											ui.choice2.setText("Let it cool");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "A1Choice3BrunchHotFast";
											game.nextPosition2 = "A1Choice3BrunchHotSlow";
											game.nextPosition3 = "";
											game.nextPosition4 = "";
										}
										//3-2B1 choice for Area One, Second Branch
														public void A1Choice3BrunchHotFast() {
															ui.mainTextArea.setText("The smell was too tantilizing and you decide to take"
																	+ "\na bite immediately, no time to let it cool, you're hungry and"
																	+ "\nin college, no time for luxuries like waiting!"
																	+ "\n"
																	+ "\nTaking the bite, you burn the roof of your mouth and spit the bite you took"
																	+ "\nout on the floor. You are unable to eat the rest and have"
																	+ "\nnot only ruined your ability to eat for the next 2-5 hours,"
																	+ "\nbut also take 10 points in damage. Good job."
																	+ "\nNow what?");
															player.playerHP = 80;
															ui.hpLabelNumber.setText("" + player.playerHP);
															ui.choice1.setText("Get dressed");
															ui.choice2.setText("Get clean");
															ui.choice3.setText("Head out");
															ui.choice4.setText("");
															
															game.nextPosition1 = "A1Choice3Clothes";
															game.nextPosition2 = "A1Choice3Clean";
															game.nextPosition3 = "A1Choice4OutNaked";
															game.nextPosition4 = "";
														}
														//3-2B2 choice for Area One, Second Branch
														public void A1Choice3BrunchHotSlow() {
															ui.mainTextArea.setText("You can feel how hot the pizza is, and using"
																	+ "\nyour better judgement you decide to let it cool a bit first"
																	+ "\nand then eat it. Delicious! But you also ran out of "
																	+ "\ntime to take a shower and get clean. "
																	+ "\n"
																	+ "\nYou gain health 10 points"
																	+ "\nWhat would you like to do now?. ");
															player.playerHP = 100;
															ui.hpLabelNumber.setText("" + player.playerHP);
															ui.choice1.setText("Get dressed");
															ui.choice2.setText("Head out");
															ui.choice3.setText("");
															ui.choice4.setText("");
															
															game.nextPosition1 = "A1Choice3Closet";
															game.nextPosition2 = "A1Choice4OutNaked";
															game.nextPosition3 = "";
															game.nextPosition4 = "";
														}
										//3-3 choice for Area One, Second Branch
										public void A1Choice3BrunchFridge(){
											ui.mainTextArea.setText("You check the fridge and see nothing but beers, some sauces,"
													+ "\nand some unidentifiable substances in tupperwares that don't"
													+ "\nbelong to you. You consider just having a beer, but it's a little"
													+ "\nearly for that. Maybe tomorrow."
													+ "\nWhat would you like to do?");
											ui.choice1.setText("Eat pizza (cold)");
											ui.choice2.setText("Eat pizza (hot)");
											ui.choice3.setText("Forget it");
											ui.choice4.setText("");
											
											game.nextPosition1 = "A1Choice3BrunchCold";
											game.nextPosition2 = "A1Choice3BrunchHot";
											game.nextPosition3 = "A1Choice3BrunchForgetIt";
											game.nextPosition4 = "";
										}
										//3-4 choice for Area One, Second Branch
										public void A1Choice3BrunchForgetIt() {
											ui.mainTextArea.setText("You examine your options and change your mind"
													+ "\non eating. No time for that, you got things to do and"
													+ "\nbeing healthy is not one of them! "
													+ "\nWhat would you like to do?");
											ui.choice1.setText("Get dressed");
											ui.choice2.setText("Get clean");
											ui.choice3.setText("Head out");
											ui.choice4.setText("");
											
											game.nextPosition1 = "A1Choice3Clothes";
											game.nextPosition2 = "A1Choice3Clean";
											game.nextPosition3 = "A1Choice4OutNaked";
											game.nextPosition4 = "";
										}
								
					//3-5 choice for Area One, Second Branch	
					public void A1Choice3Clean() {
						ui.mainTextArea.setText("You can feel the leftovers of last night on"
								+ "\nyour skin and in your hair, and it feels disgusting. "
								+ "\nYou should probably take a shower, but maybe you can"
								+ "\nget by with just a fresh pair of clothes like usual."
								+ "\nWhat would you like to do? ");
						ui.choice1.setText("Take a shower");
						ui.choice2.setText("Check the closet");
						ui.choice3.setText("Head out, I'm fine");
						ui.choice4.setText("");
						
						game.nextPosition1 = "A1Choice3Shower";
						game.nextPosition2 = "A1Choice3Clothes";
						game.nextPosition3 = "A1Choice4OutNaked";
						game.nextPosition4 = "";
					}
					//3-6 choice for Area One, Second Branch
					public void A1Choice3Clothes() {
						ui.mainTextArea.setText("You feel dirty, but could probably risk not"
								+ "\ntaking a shower and instead throwing some clothes over"
								+ "\nyourself and heading out. "
								+ "\nWhat would you like to do?");
						ui.choice1.setText("Check the closet");
						ui.choice2.setText("Take a shower");
						ui.choice3.setText("Head out, I'm fine");
						ui.choice4.setText("");
						
						game.nextPosition1 = "A1Choice3Closet";
						game.nextPosition2 = "A1Choice3Shower";
						game.nextPosition3 = "A1Choice4OutNaked";
						game.nextPosition4 = "";
					}
							//3-6A choice for Area One, Second Branch
									public void A1Choice3Closet() {
										ui.mainTextArea.setText("You open your closet and see a few outfits on hangars"
												+ "\nas well as a gross pile of dirty clothes on the floor. You should"
												+ "\nprobably wash those sometime. What do you want to wear?");
										ui.choice1.setText("Button Shirt w/flames");
										ui.choice2.setText("Bomber jacket");
										ui.choice3.setText("Wizard Cosplay");
										ui.choice4.setText("Nothing");
										
										game.nextPosition1 = "A1Choice3Closet1";
										game.nextPosition2 = "A1Choice3Closet2";	
										game.nextPosition3 = "A1Choice3Closet3";
										game.nextPosition4 = "A1Choice3Closet4";
									}
															//3-6A1 choice for Area One, Second Branch
															public void A1Choice3Closet1() {
																ui.mainTextArea.setText("You look at the first outfit, which is a button"
																		+ "\nup shirt with flames, a dragon on the sleeve, some cool"
																		+ "\nJNCO jeans, Crocs, and some 5 dollar gas station sunglasses."
																		+ "\n This outfit provides you with a bottle of very hot hot sauce and a +5 buff to"
																		+ "coolness, but -20 debuff to social interaction. Wear this?");
																player.outfit = 1;
																ui.choice1.setText("Yes.");
																ui.choice2.setText("No.");
																ui.choice3.setText("");
																ui.choice4.setText("");
																
																game.nextPosition1 = "AreaTwo";
																game.nextPosition2 = "A1Choice3Closet";	
																game.nextPosition3 = "";
																game.nextPosition4 = "";
															}
															//3-6A2 choice for Area One, Second Branch
															public void A1Choice3Closet2() {
																ui.mainTextArea.setText("You look at the second outfit, which is a casual bomber"
																		+ "\njacket, white t shirt, black jeans, and some nice sneakers. "
																		+ "\n This outfit provides you with a switchblade-comb, +20 buff to social"
																		+ "\n interaction, as well as +40 increase in temperature. Wear this?");
																player.outfit = 2;
																ui.choice1.setText("Yes.");
																ui.choice2.setText("No.");
																ui.choice3.setText("");
																ui.choice4.setText("");
																
																game.nextPosition1 = "AreaTwo";
																game.nextPosition2 = "A1Choice3Closet";	
																game.nextPosition3 = "";
																game.nextPosition4 = "";
															}
															//3-6A3 choice for Area One, Second Branch
															public void A1Choice3Closet3() {
																ui.mainTextArea.setText("You look at the third outfit, which is a wizard outfit"
																		+ "\nbased on a character from that one RPG game you played in high school."
																		+ "\nYou contemplate on what brought you to bring this to your college aparment"
																		+ "\nwhen you moved out from your moms house. Provides you with a dope wizard staff"
																		+ "\nbut a -100 social interaction debuff. Yikes. Wear this?");
																player.outfit = 3;
																ui.choice1.setText("Yes.");
																ui.choice2.setText("No.");
																ui.choice3.setText("");
																ui.choice4.setText("");
																
																game.nextPosition1 = "AreaTwo";
																game.nextPosition2 = "A1Choice3Closet";	
																game.nextPosition3 = "";
																game.nextPosition4 = "";
															}
															//3-6A4 choice for Area One, Second Branch
															public void A1Choice3Closet4() {
																ui.mainTextArea.setText("You decide that the outfit you woke up in is best. Wear this instead of changing outfits?");
																ui.choice1.setText("Yes.");
																ui.choice2.setText("No.");
																ui.choice3.setText("");
																ui.choice4.setText("");
																
																game.nextPosition1 = "AreaTwo";
																game.nextPosition2 = "A1Choice3Closet";	
																game.nextPosition3 = "";
																game.nextPosition4 = "";
															}
									
					//3-7 choice for Area One, Second Branch
					public void A1Choice3Shower() {
						ui.mainTextArea.setText("You decide to take a shower before heading out."
								+ "\n Good call, you weren't very clean. You also got 5 HP."
								+ "\n What would you like to do?");
						player.playerHP = player.playerHP + 5;
						ui.hpLabelNumber.setText("" + player.playerHP);
						ui.choice1.setText("Get dressed");
						ui.choice2.setText("Head out, I'm fine");
						ui.choice3.setText("");
						ui.choice4.setText("");
						
						game.nextPosition1 = "A1Choice3Closet";
						game.nextPosition2 = "A1Choice4OutNaked";
						game.nextPosition3 = "";
						game.nextPosition4 = "";
					}
					
					
					//3-8 choice for Area One, Second Branch
					public void A1Choice3OutNaked() {
						ui.mainTextArea.setText("You step out, head down the stairs, and cross the street, but for some reason everyone seems"
								+ "\nto be staring at you, and some even look like they're taking pictures of you. It's not until a car rolls"
								+ "\nby and stops in front of you at a crosswalk to laugh at you and take pictures that you realize that in "
								+ "\nthe reflection of the car's windows, you can see yourself, with nothing on but your boxers. You forgot to put some clothes"
								+ "\non, moron. This most certainly is grounds for explusion from college, especially with your record. Game over.");
						ui.choice1.setText("Maybe try putting");
						ui.choice2.setText("some clothes on.");
						ui.choice3.setText("Restart program");
						ui.choice4.setText("to try again");
					}

		
		//4-1 choice for Area One, Second Branch
		public void A1Choice4() {
			ui.mainTextArea.setText("You disregard everything, and decide your comfort come first,"
					+ "\na good and healthy choice!"
					+ "\nToo bad you're in college. You missed your chance to get things "
					+ "\ndone and slept 10 more hours, dropping your GPA to unrecoverable"
					+ "\nlevels. You have failed this semester and are forced to drop out. "
					+ "\n"
					+ "\n                                   Game Over.");
			ui.choice1.setText("Good job, you");
			ui.choice2.setText("failed on the");
			ui.choice3.setText("first choice. Restart");
			ui.choice4.setText("program to try again.");
			
			
		}
		
	//Area Two, Third Branch
		public void AreaTwo() {
			ui.mainTextArea.setText("You step out, confident in your decisions to start your day,"
					+ "\n for better or for worse. At least you remembered to put clothes on."
					+ "\n Where should you go from here?");
			if (player.outfit == 1)
			{
				player.currentWeapon =  new Weapon_HotSauce();
				ui.weaponLabelName.setText(player.currentWeapon.name);
			}
			if (player.outfit == 2)
			{
				player.currentWeapon =  new Weapon_SwitchComb();
				ui.weaponLabelName.setText(player.currentWeapon.name);
			}
			if (player.outfit == 3)
			{
				player.currentWeapon =  new Weapon_Staff();
				ui.weaponLabelName.setText(player.currentWeapon.name);
			}
			ui.choice1.setText("Class");
			ui.choice2.setText("Library");
			ui.choice3.setText("Lounge");
			ui.choice4.setText("Gym");
			
			game.nextPosition1 = "Class";
			game.nextPosition2 = "Library";	
			game.nextPosition3 = "Lounge";
			game.nextPosition4 = "Gym";

		}
		
		//1-1 Choice for Area Two, Third Branch, leads into a classroom exam fight until and ends at next comment.
				public void Class() {
					if (player.study == 0)
					{
					ui.mainTextArea.setText("You decide to head to your first class, which is Problem "
							+ "\nSolving With Computers II. You sit down, and everyone seems strangely"
							+ " quiet and focused. You're not sure what's going on, but you just check out"
							+ " MyTwitBookGram on your phone until the teacher arrives. When they do,"
							+ " they say to put everything away and to get ready for the exam. Oh no!"
							+ " You forgot there was an exam! A horrible dread fills your mind . . .");
					ui.choice1.setText("Take exam");
					ui.choice2.setText("Run away");
					ui.choice3.setText("Try to cheat");
					ui.choice4.setText("");
					
					}
					
					else {
						ui.mainTextArea.setText("You decide to head to your first class, which is Problem "
								+ "\nSolving With Computers II. You sit down, and get your pencil out, "
								+ "\narmed with the knowledge that you so smartly equipped yourself with "
								+ "\nearlier by studying. Your teacher walks in, places the exam on  your "
								+ "\ndesk, and your heart jumps. It's only 20 questions, but it's huge. "
								+ "\nWhat do you do?");
						ui.choice1.setText("Take exam");
						ui.choice2.setText("Run away");
						ui.choice3.setText("Try to cheat");
						ui.choice4.setText("");
					}
					
		
					game.nextPosition1 = "ClassFight";
					game.nextPosition2 = "ClassRun";
					game.nextPosition3 = "ClassCheat";
					game.nextPosition4 = "";
					
					
				}
				
				
							public void ClassFight() {
								ui.mainTextArea.setText("You man up and get ready to tackle the test as best"
										+ "\n you can. It's just you versus the exam, armed with all of "
										+ "\n your programming knowledge and a slight hangover, you get"
										+ "\nready to battle! (A 60 is required to pass.)");
								ui.choice1.setText("Begin!");
								ui.choice2.setText("");
								ui.choice3.setText("");
								ui.choice4.setText("");
								
								game.nextPosition1 = "ClassFightTest";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							}
							
													public void ClassFightTest() {
														if (player.study==0) {
														player.playerDamage = new java.util.Random().nextInt(8);
														ui.mainTextArea.setText("You guess on question " + player.questionNum + " and received " + player.testScore + "points.");
														player.testScore = player.testScore + player.playerDamage;
														player.questionNum = player.questionNum + 1;
														ui.choice1.setText("Next Question");
														ui.choice2.setText("");
														ui.choice3.setText("");
														ui.choice4.setText("");
																												
														}
														
														else {
																player.playerDamage = new java.util.Random().nextInt(11);
																ui.mainTextArea.setText("You answer question " + player.questionNum + " and received " + player.testScore + "points.");
																player.testScore = player.testScore + player.playerDamage;
																player.questionNum = player.questionNum + 1;
																ui.choice1.setText("Next Question");
																ui.choice2.setText("");
																ui.choice3.setText("");
																ui.choice4.setText("");
														}
														
														game.nextPosition1 = "ClassFightTestBack";
														game.nextPosition2 = "";
														game.nextPosition3 = "";
														game.nextPosition4 = "";
													}
													
													public void ClassFightTestBack() {
														int testDamage = 0;
														testDamage = new java.util.Random().nextInt(4);
														
														ui.mainTextArea.setText("That last question messed with your head, you take " + testDamage + " points in "
																+ "\ndamage.");
														player.playerHP = player.playerHP - testDamage;
														ui.hpLabelNumber.setText("" + player.playerHP);
														ui.choice1.setText("Next Question");
														ui.choice2.setText("");
														ui.choice3.setText("");
														ui.choice4.setText("");
														
														game.nextPosition1 = "ClassFightNext";
														game.nextPosition2 = "";
														game.nextPosition3 = "";
														game.nextPosition4 = "";
													}
													
													public void ClassFightNext() {
														if (player.questionNum <= 20 && player.playerHP <= 0)
														{
														
															ui.mainTextArea.setText("You don't feel so good in the head...");
															ui.choice1.setText(">");
															ui.choice2.setText("");
															ui.choice3.setText("");
															ui.choice4.setText("");
															
															game.nextPosition1 = "TestDeath";
															game.nextPosition2 = "";
															game.nextPosition3 = "";
															game.nextPosition4 = "";
														}
															
														else if (player.questionNum <= 20 && player.testScore >= 100)
														{
															ui.mainTextArea.setText("You did it! You passed with an A+.");
															ui.choice1.setText(">");
															ui.choice2.setText("");
															ui.choice3.setText("");
															ui.choice4.setText("");
															
															game.nextPosition1 = "TestPass";
															game.nextPosition2 = "";
															game.nextPosition3 = "";
															game.nextPosition4 = "";
															}
														
														else if (player.questionNum > 20 && player.testScore < 60) 
														{
															ui.mainTextArea.setText("You finish, but aren't too sure of your answers...");
															ui.choice1.setText(">");
															ui.choice2.setText("");
															ui.choice3.setText("");
															ui.choice4.setText("");
															
															game.nextPosition1 = "TestFail";
															game.nextPosition2 = "";
															game.nextPosition3 = "";
															game.nextPosition4 = "";
														}
														
														else if (player.questionNum > 20 && player.testScore > 60) 
														{
															ui.mainTextArea.setText("You finish, and feel confident somehow...");
															ui.choice1.setText(">");
															ui.choice2.setText("");
															ui.choice3.setText("");
															ui.choice4.setText("");
															
															game.nextPosition1 = "TestPass";
															game.nextPosition2 = "";
															game.nextPosition3 = "";
															game.nextPosition4 = "";
														}
														
														else 
														{															
															ui.mainTextArea.setText("You move on to the next question.");
															ui.choice1.setText(">");
															ui.choice2.setText("");
															ui.choice3.setText("");
															ui.choice4.setText("");
															
															game.nextPosition1 = "ClassFightTest";
															game.nextPosition2 = "";
															game.nextPosition3 = "";
															game.nextPosition4 = "";
															}
														
														
														}
													
													
													
													public void TestPass() 
													{
														ui.mainTextArea.setText("You finished the test and managed to pass with a \n"
																+ player.testScore + ". Congratulations!"
																+ "\nYou still have a lot of time in the day. "
																+ "\nWhere would you like to go now?");
														player.pass = 1;
														ui.choice1.setText("Library");
														ui.choice2.setText("Lounge");
														ui.choice3.setText("Gym");
														ui.choice4.setText("");
														
														game.nextPosition1 = "Library";
														game.nextPosition2 = "Lounge";	
														game.nextPosition3 = "Gym";
														game.nextPosition4 = "";
													}
													
													public void TestDeath() {														
														ui.mainTextArea.setText("You died from mental exhaustion"
																+ "\nTry studying next time maybe?.");
														ui.choice1.setText("Restart the");
														ui.choice2.setText("program to");
														ui.choice3.setText("Try again.");
														ui.choice4.setText("Game Over.");
														
														game.nextPosition1 = "";
														game.nextPosition2 = "";	
														game.nextPosition3 = "";
														game.nextPosition4 = "";
														
													}
													
			
													public void TestFail() {														
														ui.mainTextArea.setText("You finished the test with a " + player.testScore
																+ "\nand utterly failed. You did not pass this class and therefore failed the semester."
																+ "\nWhat a shame. Maybe try studying next time. Game over.");
														ui.choice1.setText("Restart the");
														ui.choice2.setText("program to");
														ui.choice3.setText("Try again.");
														ui.choice4.setText("Game Over.");
														
														game.nextPosition1 = "";
														game.nextPosition2 = "";	
														game.nextPosition3 = "";
														game.nextPosition4 = "";
														
													}
				
				
						public void ClassRun() {
							ui.mainTextArea.setText("You aren't ready for this in the slightest! There's"
									+ "\nno way you're going to pass this at all. You wait for an"
									+ "\nopportune moment when you're not in the teacher's line of "
									+ "\nsight and make a break for the door. You head to your dorm,"
									+ "\na feeling of defeat hanging over you. You check the computer"
									+ "\nand realize you had a 68 in that class, which after getting"
									+ "\n a 0 on this means it'll be a 48. Oh no.");
							ui.choice1.setText("What did you");
							ui.choice2.setText("think was going");
							ui.choice3.setText("to happen?");
							ui.choice4.setText("Game Over.");
							
							game.nextPosition1 = "";
							game.nextPosition2 = "";
							game.nextPosition3 = "";
							game.nextPosition4 = "";
						}
						
						public void ClassCheat() {
							ui.mainTextArea.setText("You aren't ready for this in the slightest, but you do have all "
									+ "of the study guides and access to the class's online materials on your phone. "
									+ "Thank god your dad is still paying for high speed phone data. "
									+ "You decide that the only way you're passing is to cheat with your phone! "
									+ "Sneakily checking the answers, your eyes dart around the room between the"
									+ "teacher to your phone to the test, and you grow ever confident with each"
									+ "answer you find on your phone. Too bad you didn't see the Teacher's Assistant"
									+ "in the corner of the room. You're caught cheating and are expelled. ");
							ui.choice1.setText("There's always");
							ui.choice2.setText("communnity college?");
							ui.choice3.setText("Restart program to");
							ui.choice4.setText("try again.");
							
							game.nextPosition1 = "";
							game.nextPosition2 = "";
							game.nextPosition3 = "";
							game.nextPosition4 = "";
						}
	//2-1 Choice for Area Two, Fourth branch, allows picking up of game-altering item as well as studying for previous test fight that you can reroute back to, ends at next //					
		public void Library() {
		ui.mainTextArea.setText("You decide to head on over to the library for some much needed"
		+ "\nstudying, or maybe just to relax and read a book while drinking some coffee."
		+ "\nWhat would you like to do?");
		if (player.pass == 0 && player.duffel == 0)
		{
		ui.choice1.setText("Study");
		ui.choice2.setText("Leisure reading");
		ui.choice3.setText("Wander");
		ui.choice4.setText("");
		
		game.nextPosition1 = "LibraryStudy";
		game.nextPosition2 = "LibraryChill";
		game.nextPosition3 = "LibraryWander";
		game.nextPosition4 = "";
		}
			
			else if (player.pass == 1 && player.duffel == 0)
			{
		ui.choice1.setText("");
		ui.choice2.setText("Leisure reading");
		ui.choice3.setText("Wander");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "LibraryChill";
		game.nextPosition3 = "LibraryWander";
		game.nextPosition4 = "";
		}
		
		else if (player.pass == 0 && player.duffel == 1)
		{
		ui.choice1.setText("Study");
		ui.choice2.setText("Leisure reading");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "LibraryStudy";
		game.nextPosition2 = "LibraryChill";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		}
		else if (player.pass == 1 && player.duffel == 1)
		{
		ui.choice1.setText("");
		ui.choice2.setText("Leisure reading");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "LibraryChill";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
			}
		}
		
							public void LibraryStudy() {
					ui.mainTextArea.setText("You decide to use your time wisely and study for your"
							+ "\nProblem Solving 2 class. You crack open some books and your study guide on"
							+ "\nBlackboard only to realize you have an exam today. Good call on studying."
							+ "\n(You've gained a +5% bonus to test taking ability!)"
							+ "\nWhat would you like to do now?");
					player.study = 1;
					ui.choice1.setText("Head to class");
					ui.choice2.setText("Gym");
					ui.choice3.setText("Lounge");
					ui.choice4.setText("");
					
					game.nextPosition1 = "Class";
					game.nextPosition2 = "LibraryFail";
					game.nextPosition3 = "LibraryFail";
					game.nextPosition4 = "";
				}
							public void LibraryFail() {
								ui.mainTextArea.setText("You decide to head elsewhere instead of going to the"
										+ "\nclass you literally just studied for that you are very clearly"
										+ "\naware of having a major exam in. What's wrong with you?"
										+ "\nYou missed your exam and failed the semester. Game over.");
								ui.choice1.setText("At least you");
								ui.choice2.setText("studied, right?");
								ui.choice3.setText("Restart program");
								ui.choice4.setText("to try again.");
								
								game.nextPosition1 = "";
								game.nextPosition2 = "";	
								game.nextPosition3 = "";
								game.nextPosition4 = "";

							}
				
				public void LibraryChill() {
					if (player.pass == 0)
					{
					ui.mainTextArea.setText("You decide to use your time to relax, grabbing some manga and"
							+ "\na cup of coffee from TsarBucks and slip into a comfy bean bag chair"
							+ "\nin the silent section of the library's second floor. Not even 20 minutes"
							+ "\ninto reading and sipping do you start to feel so comfy that you shut your"
							+ "\n eyes and take a nap. You wake up 3 hours later, only to realize you've"
							+ "\nmissed first period and your PSWCII exam. You have failed the semester.");
					ui.choice1.setText("At least you");
					ui.choice2.setText("caught up on");
					ui.choice3.setText("One Punch Man.");
					ui.choice4.setText("Game Over.");
					
					game.nextPosition1 = "";
					game.nextPosition2 = "";	
					game.nextPosition3 = "";
					game.nextPosition4 = "";

					}
					else 
					{
						ui.mainTextArea.setText("You decide to use your time to relax, grabbing some manga and "
								+ "\na cup of coffee from TsarBucks and slip into a comfy bean bag chair "
								+ "\nin the silent section of the library's second floor. Not even 20 minutes "
								+ "\ninto reading and sipping do you start to feel so comfy that you shut your "
								+ "\neyes and take a nap. You wake up 3 hours later, and it's basically the "
								+ "\nend of the day. You've got a few hours to kill though. "
								+ "\nWhat would you like to do?");
						ui.choice1.setText("Lounge");
						ui.choice2.setText("Gym");
						ui.choice3.setText("Home");
						ui.choice4.setText("");
						
						game.nextPosition1 = "Lounge";
						game.nextPosition2 = "Gym";	
						game.nextPosition3 = "Home";
						game.nextPosition4 = "";

					}
				}
				
				public void LibraryWander() {
					ui.mainTextArea.setText("You are bored out of your mind before class, and decide to just"
							+ "\nwalk around the library and check out what's happening to kill time. You"
							+ "\ncheck out some exhibits, some art, and then in an aisle of books you notice"
							+ "\na random bag with some green paper sticking out of it. You investigate the "
							+ "\nduffel bag and notice it's full of money and some squares covered in duct tape."
							+ "\nWhat do you do?");
					ui.choice1.setText("Take the bag");
					ui.choice2.setText("Leave the bag");
					ui.choice3.setText("");
					ui.choice4.setText("");
					
					game.nextPosition1 = "LibraryWanderTake";
					game.nextPosition2 = "LibraryWanderLeave";	
					game.nextPosition3 = "";
					game.nextPosition4 = "";

				}
				
								public void LibraryWanderTake() {
									ui.mainTextArea.setText("You decide to take the duffel bag, zipping it up so nobody"
											+ "\ncan see the contents within. You leave the library in a hurry and"
											+ "\ntake a look again, and realize that there's at least 100k in dollars"
											+ "\nin here. Your mind races, but then you come to your senses and try to "
											+ "\nplan your next move."
											+ "\nWhere do you go?");
									player.duffel = 1;
									if (player.pass == 0)
									{
																									
									ui.choice1.setText("To class");
									ui.choice2.setText("To the gym");
									ui.choice3.setText("To the lounge");
									ui.choice4.setText("");
									
									game.nextPosition1 = "Class";
									game.nextPosition2 = "Gym";	
									game.nextPosition3 = "Lounge";
									game.nextPosition4 = "";
									}
								else
								{
									ui.choice1.setText("Lounge");
									ui.choice2.setText("Gym");
									ui.choice3.setText("Home");
									ui.choice4.setText("");
									
									game.nextPosition1 = "Lounge";
									game.nextPosition2 = "Gym";	
									game.nextPosition3 = "Home";
									game.nextPosition4 = "";
								}
								}
								
								
								public void LibraryWanderLeave() {
									ui.mainTextArea.setText("You decide to just leave the bag there, and alert"
											+ "\nthe people at the front desk of it. They alert the school's"
											+ "\nsecurity and the cops come in and handle it. You feel good"
											+ "\nabout doing the right thing, but regret not grabbing a little"
											+ "\nbit of cash from it for yourself. Who knows though, maybe it"
											+ "\nwas a trap. It's still early, but your class starts soon."
											+ "\nWhat would you like to do now?");
									player.viktor = 0;
									if (player.pass == 0)
									{
									ui.choice1.setText("Class");
									ui.choice2.setText("Gym");
									ui.choice3.setText("Lounge");
									ui.choice4.setText("");
									
									game.nextPosition1 = "Class";
									game.nextPosition2 = "Gym";	
									game.nextPosition3 = "Lounge";
									game.nextPosition4 = "";
									}
									else 
									{
										ui.choice1.setText("Lounge");
										ui.choice2.setText("Gym");
										ui.choice3.setText("Home");
										ui.choice4.setText("");
										
										game.nextPosition1 = "Lounge";
										game.nextPosition2 = "Gym";	
										game.nextPosition3 = "Home";
										game.nextPosition4 = "";
									}
								}	
		
	//3-1 Choice for Area Two, Fifth Branch, can get weapon with best stats in game or lose it via a dice roll system, ends at next //
	public void Lounge() {
		ui.mainTextArea.setText("You decide to head over to the lounge for some relaxation."
				+ "\nResponsibilities can wait, they've got pool, video games, AND some"
				+ "\nreally cool dudes to hang out with in here. It's like paradise in"
				+ "\nthe middle of the worst place on earth. "
				+ "\nWhat would you like to do?");
		ui.choice1.setText("Play games");
		ui.choice2.setText("Play pool");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "LoungeGames";
		game.nextPosition2 = "LoungePool";	
		game.nextPosition3 = "";
		game.nextPosition4 = "";

	}
	
					public void LoungeGames() {
						
						if (player.pass == 0)
						{
						ui.mainTextArea.setText("You walk over to the group of people sitting on the"
								+ "\ncouch next to the Switch where they're playing Super Smash"
								+ "\nBros. You take a seat and queue up, chatting with the people"
								+ "\nabout the game and whatever else,and before you know it you're"
								+ "\nup. You play a close game with your opponent but they knock you"
								+ "\nout last second and you lose. "
								+ "\nWhat would you like to do next?");
						ui.choice1.setText("Play another");
						ui.choice2.setText("Head to class");
						ui.choice3.setText("");
						ui.choice4.setText("");
						
						game.nextPosition1 = "LoungeGamesAgain";
						game.nextPosition2 = "Class";	
						game.nextPosition3 = "";
						game.nextPosition4 = "";
						}
						
						else
						{
							ui.mainTextArea.setText("You walk over to the group of people sitting on the"
									+ "\ncouch next to the Switch where they're playing Super Smash"
									+ "\nBros. You take a seat and queue up, chatting with the people"
									+ "\nabout the game and whatever else,and before you know it you're"
									+ "\nup. You play a close game with your opponent but they knock you"
									+ "\nout last second and you lose. "
									+ "\nWhat would you like to do next?");
							ui.choice1.setText("Play another");
							ui.choice2.setText("Leave");
							ui.choice3.setText("");
							ui.choice4.setText("");
							
							game.nextPosition1 = "LoungeGamesAgain1";
							game.nextPosition2 = "LoungeGamesAgain2";	
							game.nextPosition3 = "";
							game.nextPosition4 = "";
						}
					}
					
								public void LoungeGamesAgain() {
									ui.mainTextArea.setText("You decide to queue up again, wanting to show your stuff."
											+ "\nYou win the next match but quite easily, you aren't going to stop"
											+ "\nuntil you've proven that you're better than everyone here. As people"
											+ "\nfilter in and out and you win and lose, the time passes without you "
											+ "\nrealizing. You've missed your first class, and the exam in it. You've"
											+ "\nfailed this semester, but hey, at least you've got your Smash Bros skills.");
									ui.choice1.setText("You could always");
									ui.choice2.setText("try EVO, lol.");
									ui.choice3.setText("Restart program");
									ui.choice4.setText("to try again.");
									game.nextPosition1 = "";
									game.nextPosition2 = "";	
									game.nextPosition3 = "";
									game.nextPosition4 = "";

								}
								

								public void LoungeGamesAgain1() {
									ui.mainTextArea.setText("You decide to queue up again, wanting to show your stuff."
											+ "\nYou win the next match but quite easily, you aren't going to stop"
											+ "\nuntil you've proven that you're better than everyone here. As people"
											+ "\nfilter in and out and you win and lose, the time passes without you "
											+ "\nrealizing. You spend over 3 hours just playing Smash Bros with random"
											+ "\npeople. There's still a few hours left in the day though. "
											+ "\nWhat do you do?");
									ui.choice1.setText("Gym");
									ui.choice2.setText("Home");
									ui.choice3.setText("");
									ui.choice4.setText("");
									
									game.nextPosition1 = "Gym";
									game.nextPosition2 = "Home";	
									game.nextPosition3 = "";
									game.nextPosition4 = "";

								}
								
								public void LoungeGamesAgain2() {
									ui.mainTextArea.setText("You decide not to queue up again, and head somewhere else. "
											+ "\nWhere would you like to go?");
									ui.choice1.setText("Gym");
									ui.choice2.setText("Home");
									ui.choice3.setText("");
									ui.choice4.setText("");
							
									game.nextPosition1 = "Gym";
									game.nextPosition2 = "Home";	
									game.nextPosition3 = "";
									game.nextPosition4 = "";

								}
		

					public void LoungePool() {
						ui.mainTextArea.setText("You walk over to the pool table, and a guy playing"
								+ "\nby himself invites you to play. You accept, and as you're racking"
								+ "\nthe balls and setting up, he asks if you'd like to make it interesting."
								+ "\nYour " + player.currentWeapon.name + " against his pool cue. It's a really nice and "
								+ "\nexpensive looking pool cue. You consider the offer."
								+ "\nWhat would you like to do?");
						player.wager = new java.util.Random().nextInt(11);
						ui.choice1.setText("Wager");
						ui.choice2.setText("Play for fun");
						ui.choice3.setText("");
						ui.choice4.setText("");
						
						game.nextPosition1 = "LoungePoolWager";
						game.nextPosition2 = "LoungePoolFun";	
						game.nextPosition3 = "";
						game.nextPosition4 = "";

						
					}
					
							public void LoungePoolWager() {
								ui.mainTextArea.setText("You decide to place your weapon on the line, as"
										+ "\n that pool cue looks mighty nice. You set your\n" + player.currentWeapon.name
										+ " \ndown and proceed to challenge him. It's all on the line."
										+ "\nYou flip a coin to see who breaks and goes first."
										+ "\nYou're heads, he's tails.");
								player.wager = new java.util.Random().nextInt(11);
								ui.choice1.setText("Flip coin.");
								ui.choice2.setText("");
								ui.choice3.setText("");
								ui.choice4.setText("");
								
								if (player.wager > 5) {
								game.nextPosition1 = "LoungePoolWagerHeads";
								game.nextPosition2 = "";	
								game.nextPosition3 = "";
								game.nextPosition4 = "";
								}
								
								else {
									game.nextPosition1 = "LoungePoolWagerTails";
									game.nextPosition2 = "";	
									game.nextPosition3 = "";
									game.nextPosition4 = "";

								}

							}
							
										public void LoungePoolWagerHeads() {
											ui.mainTextArea.setText("He flicks the coin in the air and it lands"
													+ "\nheads. You break the formation with the cue ball and "
													+ "\n a striped ball goes into a pocket. You and him trade"
													+ "\nback and forth, each getting balls in one by one. Eventually,"
													+ "\nthere's nothing but a stripe, a solid, and the 8 ball. A crowd"
													+ "\n gathered around without you even noticing until now. You're up,"
													+ "\nit's all on this. ");
											player.wager = new java.util.Random().nextInt(11);
											ui.choice1.setText("Good luck.");
											ui.choice2.setText("");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											if (player.wager > 5) {
												game.nextPosition1 = "LoungePoolWagerHeads2Win";
												game.nextPosition2 = "";	
												game.nextPosition3 = "";
												game.nextPosition4 = "";
												}
												
												else {
													game.nextPosition1 = "LoungePoolWagerHeads2Lose";
													game.nextPosition2 = "";	
													game.nextPosition3 = "";
													game.nextPosition4 = "";

												}
										}
										
										public void LoungePoolWagerHeads2Win() {
											ui.mainTextArea.setText("You line up the shot with your cue and "
													+ "\nthe ball, take aim, anda thunderous crack fills the "
													+ "\nroom as you slam the cue ball and hit both the striped ball and "
													+ "\n8 ball and sink them together. A beautiful shot, the"
													+ "\ncrowd cheering and clapping. The man glares at you, hands you"
													+ "\nhis cue, and leaves, not before turning back one final "
													+ "\ntime to shoot a glance at you. "
													+ "\n(New weapon get: Fancy Cue - A favorite of bar bikers and Terminators!"
													+ "\n                 Where to now?");
											player.currentWeapon =  new Weapon_FancyCue();
											ui.weaponLabelName.setText(player.currentWeapon.name);
											player.weaponSkill = player.weaponSkill + 2;
											ui.choice1.setText("Gym");
											ui.choice2.setText("Home");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "Gym ";
											game.nextPosition2 = "Home";	
											game.nextPosition3 = "";
											game.nextPosition4 = "";

											
										}
										
										public void LoungePoolWagerHeads2Lose() {
											ui.mainTextArea.setText("You line up the shot with your cue and the ball, take aim, and "
													+ "\nabsolutely fail, your elbow slipping off the table and smacking your "
													+ "\nchin against the edge of it. You hit the cue though, only just barely, "
													+ "\nso it doesn't so much as move beyond an inch. You just handed the game "
													+ "\nover, and your opponent easily sinks both balls. You lose 20 health and "
													+ "\nyour weapon. Good going. You decide to leave, pride not intact at all.");
										player.currentWeapon =  new Weapon_Fists();
										ui.weaponLabelName.setText(player.currentWeapon.name);
											ui.choice1.setText("Gym");
											ui.choice2.setText("Home");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "Gym ";
											game.nextPosition2 = "Home";	
											game.nextPosition3 = "";
											game.nextPosition4 = "";
											
											
										}
										
										
										public void LoungePoolWagerTails() {
											ui.mainTextArea.setText("He flicks the coin in the air and it lands"
													+ "\ntails. He slams the formation and it all separates,"
													+ "\nbouncing around the table in a beautifully chaotic mess."
													+ "\nhe chooses solids and lets you go. You miss your first shot "
													+ "\nand he sinks one after the other, all the way down to the 8 ball. ");
											ui.choice1.setText("-->");
											ui.choice2.setText("");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "LoungePoolWagerTails2 ";
											game.nextPosition2 = "";	
											game.nextPosition3 = "";
											game.nextPosition4 = "";
										}
										public void LoungePoolWagerTails2() {
											ui.mainTextArea.setText("Sorry kid, looks like I win. I'll have that " + player.currentWeapon.name
													+ "\nnow. Thanks."
													+ "\nYou hand him your weapon. You're so ashamed and shaken by "
													+ "\n getting sharked for your weapon you actually take "
													+ "\n10 points in damage. Sad!"
													+ "\nWhat would you like to do now?");
											player.playerHP = player.playerHP - 10;
											ui.hpLabelNumber.setText("" + player.playerHP);
											player.currentWeapon =  new Weapon_Fists();
											ui.weaponLabelName.setText(player.currentWeapon.name);
											ui.choice1.setText("Gym");
											ui.choice2.setText("Home");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "Gym ";
											game.nextPosition2 = "Home";	
											game.nextPosition3 = "";
											game.nextPosition4 = "";
										}
										
							public void LoungePoolFun() {
								ui.mainTextArea.setText("You decide not to wager your weapon, as"
										+ "\nyou sense that he may be lying about his ability,"
										+ "\nand given the fact that his cue is expensive and"
										+ "\nhe's confident enough to bet against someone he's never"
										+ "\nmet, you assume he's got skills. You were right, he breaks"
										+ "\nand doesn't miss a beat sinking every ball and winning."
										+ "\nGood call not betting."
										+ "\nWhat would you like to do now?");
								ui.choice1.setText("Gym");
								ui.choice2.setText("Home");
								ui.choice3.setText("");
								ui.choice4.setText("");
								
								game.nextPosition1 = "Gym ";
								game.nextPosition2 = "Home";	
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							}
		

		//5-1 Choice for Area Two, Sixth Branch. Leads into second fight with fully fledged fight system with actual physical enemy entity, involves all previous stats and even bypass with secret item. Ends at next //
		//Multiple stat buffs can be achieved here as well.
							public void Gym() {
			ui.mainTextArea.setText("You decided to head to the gym. Why? You're a "
					+ "\nComputer Science major, there's literally nothing here for you."
					+ "\nWell, they have food at least. What would you like to do?");
			ui.choice1.setText("Buy a bagel");
			ui.choice2.setText("Get shredded");
			ui.choice3.setText("Leave");
			ui.choice4.setText("");
			
			game.nextPosition1 = "GymBagel";
			game.nextPosition2 = "GymShred";	
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
		
							public void GymBagel() {
								if (player.duffel == 0)
								{
									ui.mainTextArea.setText("You walk up to the counter and take a look at"
										+ "\nwhat they have to offer. They've got bagel sandwiches, as"
										+ "\nwell as some smoothies. They all look really expensive though."
										+ "\nYou can't afford any of this, so you leave."
										+ "\nWhat  would you like to do?");
								ui.choice1.setText("Get shredded");
								ui.choice2.setText("Leave");
								ui.choice3.setText("");
								ui.choice4.setText("");
								
								game.nextPosition1 = "GymShred";
								game.nextPosition2 = "GymBackdoor";	
								game.nextPosition3 = "";
								game.nextPosition4 = "";
									}
								
							else {
									ui.mainTextArea.setText("You walk up to the counter and take a look at"
											+ "\nwhat they have to offer. They've got bagel sandwiches, as"
											+ "\nwell as some smoothies. They all look really expensive though."
											+ "\nYou don't have money yourself, but you look at the duffel bag"
											+ "\nand contemplate using money from there to pay for it. ."
											+ "\nWhat  would you like to do?");
									ui.choice1.setText("Use bag money");
									ui.choice2.setText("Exercise");
									ui.choice3.setText("Leave");
									ui.choice4.setText("");
									
									game.nextPosition1 = "GymBagelBag1";
									game.nextPosition2 = "GymShred";	
									game.nextPosition3 = "GymBackdoor";
									game.nextPosition4 = "";
								}
							}
		
							
							
											public void GymBagelBag1() {
												ui.mainTextArea.setText("You unzip the bag and try to loosen a single bill"
														+ "\nfrom the random bundled stacks of cash. You pull one out only"
														+ "\nto see that it's a 100 dollar bill. You hand it to the cashier"
														+ "\nand pull an unconvincing smile, the cashier accepts it and goes"
														+ "\nto make your food, and whispers something to another employee..");
												ui.choice2.setText("-->");
												ui.choice3.setText("");
												ui.choice4.setText("");
												
												game.nextPosition1 = "GymBagelBag2";
												game.nextPosition2 = "";	
												game.nextPosition3 = "";
												game.nextPosition4 = "";
											}
											
											public void GymBagelBag2() {
												ui.mainTextArea.setText("as you wait for your food, a cop appears to your side and "
														+ "\nasks you to come with him. As you pass him, he grabs your arms and "
														+ "\nputs you in handcuffs. You're under arrest for possession of illegal "
														+ "\nsubstances and counterfitting. You plead your innocence but the cop "
														+ "\nunzips the bag and shoves it in your face. You realize you're screwed."
														+ "\n                                           Game over.");
												ui.choice1.setText("Maybe don't");
												ui.choice2.setText("pick up bags");
												ui.choice3.setText("that aren't yours.");
												ui.choice4.setText("Restart program.");
												
												game.nextPosition1 = "";
												game.nextPosition2 = "";	
												game.nextPosition3 = "";
												game.nextPosition4 = "";
											}
											
							public void GymShred() {
								ui.mainTextArea.setText("You head over to the part of the gym with "
										+ "\nall of the exercise equipment. They have weights,"
										+ "\na lot of cardio based machines, and a punching bag."
										+ "\nWhat would you like to do?");
								ui.choice1.setText("Weights");
								ui.choice2.setText("Cardio");
								ui.choice3.setText("Punching bag");
								ui.choice4.setText("");
								
								game.nextPosition1 = "GymShredW";
								game.nextPosition2 = "GymShredC";	
								game.nextPosition3 = "GymShredP";
								game.nextPosition4 = "";
							}
							
									public void GymShredW() {
										ui.mainTextArea.setText("You head over to the weights section of the gym "
												+ "\nand lay down on the bench, which has 2 25 pound weights on"
												+ "\neach side of it. You grab a hold of the bar, lift it up off"
												+ "\nthe hooks, and up and down above your chest. The bar is incredibly"
												+ "\nheavy but you manage to do a whole 5 reps before having to place it back."
												+ "\n (You gained +10% damage bonus with weapons!)"
												+ "\nWhat would you like to do? ");
										player.weaponSkill = player.weaponSkill + 2;
										if (player.pass == 0)
										{
										ui.choice1.setText("Head to class");
										ui.choice2.setText("Go home");
										ui.choice3.setText("");
										ui.choice4.setText("");
										
										game.nextPosition1 = "Class";
										game.nextPosition2 = "GymBackdoor";	
										game.nextPosition3 = "";
										game.nextPosition4 = "";
										}
										else
										{
											ui.choice1.setText("Home");
											ui.choice2.setText("");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "GymBackdoor";
											game.nextPosition2 = "";	
											game.nextPosition3 = "";
											game.nextPosition4 = "";
										}
									}
									public void GymShredC() {
										ui.mainTextArea.setText("You take a seat on a stationary bike and begin to "
												+ "\npedal, ramping up and down in tandem with the electronic display. "
												+ "\nafter about 30 minutes, you decide to stop. You feel tired, but great!"
												+ "\n (You gained 15 health! )"
												+ "\nWhat would you like to do? ");
										if (player.playerHP>=85)
										{
											player.playerHP = 100;
										}
										else {
		
											player.playerHP = player.playerHP + 15;
										}
										if (player.pass == 0)
										{
										ui.choice1.setText("Head to class");
										ui.choice2.setText("Go home");
										ui.choice3.setText("");
										ui.choice4.setText("");
										
										game.nextPosition1 = "Class";
										game.nextPosition2 = "GymBackdoor";	
										game.nextPosition3 = "";
										game.nextPosition4 = "";
										}
										else
										{
											ui.choice1.setText("Home");
											ui.choice2.setText("");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "GymBackdoor";
											game.nextPosition2 = "";	
											game.nextPosition3 = "";
											game.nextPosition4 = "";
										}
									}
									
									public void GymShredP() {
										ui.mainTextArea.setText("You head over to the punching bag section and"
												+ "\ndo a few stretches before laying into the bag. You take"
												+ "\nyour frustrations out on the bag, remembering all the work"
												+ "\nand other stuff weighing you down, letting it all out through"
												+ "\nyour fists against the leather. After 15 minutes of punching,"
												+ "\nyou decide to stop and clean up. "
												+ "\n     (Your unarmed combat skills rise 20%!))"
												+ "\nWhat would you like to do? ");
										player.unarmedSkill = 7;
										if (player.pass == 0)
										{
										ui.choice1.setText("Head to class");
										ui.choice2.setText("Go home");
										ui.choice3.setText("");
										ui.choice4.setText("");
										
										game.nextPosition1 = "Class";
										game.nextPosition2 = "GymBackdoor";	
										game.nextPosition3 = "";
										game.nextPosition4 = "";
										}
										else
										{
											ui.choice1.setText("Home");
											ui.choice2.setText("");
											ui.choice3.setText("");
											ui.choice4.setText("");
											
											game.nextPosition1 = "GymBackdoor";
											game.nextPosition2 = "";	
											game.nextPosition3 = "";
											game.nextPosition4 = "";
										}
									}
									
									
									public void GymBackdoor() {
										ui.mainTextArea.setText("You decide to head out, leaving out of the back entrance as"
												+ "\nit's closer to your destination. As you turn the corner to the small"
												+ "\nconnector, a large man in a wifebeater, green tactical pants, and dark"
												+ "\nred military boots stops you. In a deep, thickly-accented voice, he asks"
												+ "'Vere ees ze product and dollar little man'. ");
										ui.choice1.setText("-->");
										ui.choice2.setText("");
										ui.choice3.setText("");
										ui.choice4.setText("");
										
										game.nextPosition1 = "GymBackdoorViktor";
										game.nextPosition2 = "";	
										game.nextPosition3 = "";
										game.nextPosition4 = "";
									}
									
												public void GymBackdoorViktor() {
													if (player.duffel == 0 && player.viktor == 0)
													{
													ui.mainTextArea.setText("You tell the man you have no idea what he's talking about,"
															+ "\nand try to walk past him. He puts his arm out to stop you again,"
															+ "\ninspects you, and then puts it down and you walk on. What was"
															+ "\nthat all about? Whatever, you have somewhere to be, so you"
															+ "\nignore it and walk on."
															+ "\nWhere would you like to go?");
													ui.choice1.setText("Class");
													ui.choice2.setText("Home");
													ui.choice3.setText("");
													ui.choice4.setText("");
													
													game.nextPosition1 = "Class";
													game.nextPosition2 = "GymBackdoor";	
													game.nextPosition3 = "";
													game.nextPosition4 = "";
													}
													
													else if (player.duffel == 0 && player.viktor == 1)
													{
													ui.mainTextArea.setText("You tell him you don't know what he's talking about "
															+ "\nand try to walk past him. He grabs you, pushes you back in front "
															+ "\nof him, and says 'Do not trick me little man, tell Viktor where "
															+ "\nbag is or else. "
															+ "\nHe cracks his knuckles and towers over you. Get ready... ");
													ui.choice1.setText("Fight");
													ui.choice2.setText("");
													ui.choice3.setText("");
													ui.choice4.setText("");
													
													game.nextPosition1 = "GymBackdoorViktorFight";
													game.nextPosition2 = "";	
													game.nextPosition3 = "";
													game.nextPosition4 = "";
													}
												
												else if (player.duffel == 1 && player.viktor == 0) 
												{
												ui.mainTextArea.setText("You tell him you don't know what he's talking about, "
														+ "\nbut he grabs a hold of the duffel bag in your hand and unzips "
														+ "\nit. He sees the contents inside, tries to wrestle it from your"
														+ "\ngrip, and you fall to the floor with duffel bag in arms. He"
														+ "\ncracks his knuckles and winds up a punch, get ready to fight!");
												ui.choice1.setText("Fight!");
												ui.choice2.setText("");
												ui.choice3.setText("");
												ui.choice4.setText("");
												
												game.nextPosition1 = "GymBackdoorViktorFight";
												game.nextPosition2 = "";	
												game.nextPosition3 = "";
												game.nextPosition4 = "";
												}
													
												else if (player.duffel == 1 && player.viktor == 1)
												{
												ui.mainTextArea.setText("You stand there, frozen, as the friend request you got "
														+ "\nalong with the weird message that followed combined with the duffel"
														+ "\nbag full of strange stuff and stacks of cash finally clicks in your  "
														+ "\nhead. You ponder your options in this situation for a moment. "
														+ "\nWhat do you do?");
												ui.choice1.setText("Give it");
												ui.choice2.setText("Don't give it");
												ui.choice3.setText("");
												ui.choice4.setText("");}
											}
													
												public void GymBackdoorViktorGive() {
													ui.mainTextArea.setText("You don't even think about trying to fight this guy."
															+ "\nYou hand over the duffel bag and he inspects it, gives you a "
															+ "\nfirm nod, and pulls two of the stacks of cash out of the bag."
															+ "\nYou inspect the stacks and realize he handed you 100,000 dollars."
															+ "\nYou quickly stuff them under your shirt and decide to run home "
															+ "\nwith your new found wealth.");
													ui.choice1.setText("-->");
													ui.choice2.setText("");
													ui.choice3.setText("");
													ui.choice4.setText("");
													
													game.nextPosition1 = "Home";
													game.nextPosition2 = "";	
													game.nextPosition3 = "";
													game.nextPosition4 = "";
												}
											
												public void GymBackdoorViktorFight() {
													ui.mainTextArea.setText("You decide to take him on. You get in a fighting stance "
															+ "\nand ready your " +  player.currentWeapon.name + " for battle. Begin fight!");
													player.testScore = 100;
													ui.choice1.setText("-->");
													ui.choice2.setText("");
													ui.choice3.setText("");
													ui.choice4.setText("");
													
													game.nextPosition1 = "GymBackdoorViktorFightAttack";
													game.nextPosition2 = "";	
													game.nextPosition3 = "";
													game.nextPosition4 = "";
												}
												
												
												
																	public void GymBackdoorViktorFightAttack() {
																		if ( player.currentWeapon.name == "Fists")
																		{
																			player.playerDamage = new java.util.Random().nextInt(player.unarmedSkill);
																		}
																		else
																		{
																			player.playerDamage = new java.util.Random().nextInt(player.weaponSkill);
																		}
																		
																		if(player.testScore >= 0)
																		{
																		ui.mainTextArea.setText("Viktor's Health: " + player.testScore
																				+ "\n"
																				+ "\nYou attack with your " +  player.currentWeapon.name + " and did " + player.playerDamage + " damage.");
																		player.testScore = player.testScore - player.playerDamage;
																		ui.choice1.setText("-->");
																		ui.choice2.setText("");
																		ui.choice3.setText("");
																		ui.choice4.setText("");
																		
																		game.nextPosition1 = "GymBackdoorViktorFightRiposte";
																		game.nextPosition2 = "";	
																		game.nextPosition3 = "";
																		game.nextPosition4 = "";
																		}
																		
																		else if(player.playerHP <= 0)
																		{
																			game.nextPosition1 = "GymBackdoorViktorFightLose";
																			game.nextPosition2 = "";	
																			game.nextPosition3 = "";
																			game.nextPosition4 = "";
																		}
																		
																		else{
																			game.nextPosition1 = "GymBackdoorViktorFightWin";
																			game.nextPosition2 = "";	
																			game.nextPosition3 = "";
																			game.nextPosition4 = "";
																		}
																	}
																	
																	
																	public void GymBackdoorViktorFightRiposte() {
																		int testDamage = 0;
																		testDamage = new java.util.Random().nextInt(6);
																		
																		ui.mainTextArea.setText("Viktor throws a punch, and you take " + testDamage + " points in "
																				+ "\ndamage.");
																		player.playerHP = player.playerHP - testDamage;
																		ui.hpLabelNumber.setText("" + player.playerHP);
																		ui.choice1.setText("-->");
																		ui.choice2.setText("");
																		ui.choice3.setText("");
																		ui.choice4.setText("");
																		
																		game.nextPosition1 = "GymBackdoorViktorFightAttack";
																		game.nextPosition2 = "";	
																		game.nextPosition3 = "";
																		game.nextPosition4 = "";
																	}
																	
																	
																	public void GymBackdoorViktorFightWin() {
																		ui.mainTextArea.setText("You land a final blow to Viktor and he "
																				+ "\ntopples over, going down flat on his back. You decide"
																				+ "\nto head home as you can't afford to get caught having "
																				+ "\nfought someone, much less with the circumstance you're"
																				+ "\nin. You grab your things and dart for your dorm room.");
																		player.money = 1;
																		ui.choice1.setText("-->");
																		ui.choice2.setText("");
																		ui.choice3.setText("");
																		ui.choice4.setText("");
																		
																		game.nextPosition1 = "Home";
																		game.nextPosition2 = "";	
																		game.nextPosition3 = "";
																		game.nextPosition4 = "";
																	}
																	
																	public void GymBackdoorViktorFightLose() 
																	{																		
																		ui.mainTextArea.setText("You tried your best, but Viktor pummelled you "
																				+ "\nso hard you were knocked out and found later by police. "
																				+ "\nAfter investigation into the situation, they arrest you "
																				+ "\nfor criminal activity. There goes your college career. "
																				+ "                                      Game Over.");
																		ui.choice1.setText("Restart the");
																		ui.choice2.setText("program to");
																		ui.choice3.setText("Try again.");
																		ui.choice4.setText("Game Over.");
																		
																		game.nextPosition1 = "";
																		game.nextPosition2 = "";	
																		game.nextPosition3 = "";
																		game.nextPosition4 = "";
																	}
					
	//End game screens, can result in win or loss, end paths.
	public void Home() {
		if (player.pass == 0 && player.money == 0)
		{
		ui.mainTextArea.setText("You decide to head home, exhausted from everything today. "
				+ "\nYou lay down on your bed ready to earn some much needed rest. "
				+ "\nYou check your calendar on your phone and see you had an exam "
				+ "\ntoday that you totally missed. You check your grade for that class "
				+ "\nand see that it's now a 48. You've failed the class and the semester. "
				+ "\nMaybe you should have gone to class. Game over.");
		ui.choice1.setText("At least you had");
		ui.choice2.setText("fun today, right?");
		ui.choice3.setText("Restart program");
		ui.choice4.setText("to try again.");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";	
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		}
		
		else if (player.pass == 1 && player.money == 0)
		{
			ui.mainTextArea.setText("You decide to head home, exhausted from everything today. "
					+ "\nYou lay down on your bed ready to earn some much needed rest. "
					+ "\nYou relax, knowing you got what needed to be done done and that "
					+ "\nyour grades are safe. At least for now. You close your eyes and "
					+ "\nfall asleep, comfortable and safe. "
					+ "\n                    You won! Congratulations!");
			ui.choice1.setText("College isn't");
			ui.choice2.setText("so bad, is it?");
			ui.choice3.setText("Restart program");
			ui.choice4.setText("to play again.");
			
			game.nextPosition1 = "";
			game.nextPosition2 = "";	
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			}
		
		else if (player.pass == 0 && player.money == 1)
		{
			ui.mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
					+ "\nYou check the stacks of cash you hid and just stare at it. You made "
					+ "\nenough to cover your student loans as well as a down payment on a"
					+ "\nhouse or a car. This is the stuff people in college dream of. You "
					+ "\nstash the money somewhere safe, get in bed, and get on your phone. "
					+ "\nYou check your calendar and see you missed an exam today and failed "
					+ "\nthat class and the seemster. Oh well, it was worth it."
					+ "\n                      You won! Congratulations!");
			ui.choice1.setText("At least you");
			ui.choice2.setText("have money for");
			ui.choice3.setText("a repeat semester.");
			ui.choice4.setText("Play again?");
			
			game.nextPosition1 = "";
			game.nextPosition2 = "";	
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			}
		
		else if (player.pass == 0 && player.duffel == 1)
		{
			ui.mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
					+ "\nYou check the duffel bag and see about 800,000 in cash, as well as "
					+ "\nthose weird duct taped squares. You toss the squares and just keep "
					+ "\nthe cash somewhere safe. You get in bed, check your phone, and see "
					+ "\nthat Viktor was arrested. You worry but know that he won't be saying "
					+ "\nanything to police. You also see you missed an exam in class today and "
					+ "\that means you failed the semester. Oh well, you're rich!"
					+ "\n                         You won! Congratulations!");
			ui.choice1.setText("At least you");
			ui.choice2.setText("have money for");
			ui.choice3.setText("a repeat semester.");
			ui.choice4.setText("Play again?");
			
			game.nextPosition1 = "";
			game.nextPosition2 = "";	
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			}
		
		else if (player.pass == 1 && player.duffel == 1)
		{
			ui.mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
					+ "\nYou check the duffel bag and see about 800,000 in cash, as well as "
					+ "\nthose weird duct taped squares. You toss the squares and just keep "
					+ "\nthe cash somewhere safe. You get in bed, check your phone, and see "
					+ "\nthat Viktor was arrested. You worry but know that he won't be saying "
					+ "\nanything to police. You sleep knowing you did well today in all aspects."
					+ "\n                         You won! Congratulations!");
			ui.choice1.setText("Hopefully the");
			ui.choice2.setText("cops don't check");
			ui.choice3.setText("your garbage cans.");
			ui.choice4.setText("Play again?");
			
			game.nextPosition1 = "";
			game.nextPosition2 = "";	
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			}
		
		else if (player.pass == 1 && player.money == 1)
		{
			ui.mainTextArea.setText("You arrive at your dorm and slam the door shut behind you. "
					+ "\nYou check the stacks of cash you hid and just stare at it. You made "
					+ "\nenough to cover your student loans as well as a down payment on a"
					+ "\nhouse or a car. This is the stuff people in college dream of. You "
					+ "\nstash the money somewhere safe, get in bed, and see nthat Viktor "
					+ "was arrested. You worry but know that he won't be saying anything "
					+ "\nto the police. You sleep knowing you did well today in all aspects."
					+ "\n                      You won! Congratulations!");
			ui.choice1.setText("Good job.");
			ui.choice2.setText("You did everything");
			ui.choice3.setText("right (probably).");
			ui.choice4.setText("Play again?");
			
			game.nextPosition1 = "";
			game.nextPosition2 = "";	
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			}
	}



}
																	
					
																	
																	
																	
																						
															
							
							
							






