package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <h1>College Quest Game!</h1> This is a simple text based adventure game
 * implemented with a GUI. Go about a day in the life of a typical college
 * student, and try to pass your exams! "Main" file for game, handles transfer
 * of data between Story class and every other class.
 *
 * @author Aaron Sedas, Aidan Becker, Prem Panchal
 * @version 1.0
 * @since @since 2020-05-04
 */

public class Game {

	// initialization of basic UI elements and helpers
	private ChoiceHandler cHandler = new ChoiceHandler();
	private UI ui = new UI();
	private VisibilityManager vm = new VisibilityManager(ui);
	private Story story = new Story(this, ui, vm);

	private String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

	/**
	 * This the main function, where the program is initiated.
	 * 
	 * @param none
	 * @return none
	 */
	public static void main(String[] args) {

		new Game();
	}

	/**
	 * This method is the constructor for a game object. This starts the game
	 * itself.
	 * 
	 * @param none
	 * @return none
	 */
	public Game() {

		ui.createUI(cHandler);
		story.defaultSetup();
		vm.showTitleScreen();
	}

	/**
	 * This method is used to return the nextPosition1 variable
	 * 
	 * @param none
	 * @return String nextPosition1
	 */
	public String getNextPosition1() {
		return nextPosition1;
	}

	/**
	 * This method is used to return the nextPosition2 variable
	 * 
	 * @param none
	 * @return String nextPosition2
	 */
	public String getNextPosition2() {
		return nextPosition2;
	}

	/**
	 * This method is used to return the nextPosition3 variable
	 * 
	 * @param none
	 * @return String nextPosition3
	 */
	public String getNextPosition3() {
		return nextPosition3;
	}

	/**
	 * This method is used to return the nextPosition4 variable
	 * 
	 * @param none
	 * @return String nextPosition4
	 */
	public String getNextPosition4() {
		return nextPosition4;
	}

	/**
	 * This method is used to change the value of the nextPosition1 variable This
	 * string is only selected from a list in Story.java
	 * 
	 * @param next This is the value that will be placed in nextPosition1
	 * @return none
	 */
	public void setNextPosition1(String next) {
		nextPosition1 = next;
	}

	/**
	 * This method is used to change the value of the nextPosition2 variable This
	 * string is only selected from a list in Story.java
	 * 
	 * @param next This is the value that will be placed in nextPosition2
	 * @return none
	 */
	public void setNextPosition2(String next) {
		nextPosition2 = next;
	}

	/**
	 * This method is used to change the value of the nextPosition3 variable This
	 * string is only selected from a list in Story.java
	 * 
	 * @param next This is the value that will be placed in nextPosition3
	 * @return none
	 */
	public void setNextPosition3(String next) {
		nextPosition3 = next;
	}

	/**
	 * This method is used to change the value of the nextPosition4 variable This
	 * string is only selected from a list in Story.java
	 * 
	 * @param next This is the value that will be placed in nextPosition4
	 * @return none
	 */
	public void setNextPosition4(String next) {
		nextPosition4 = next;
	}

	/**
	 * <h1>ChoiceHandler</h1> This is a utility class allowing the selection of
	 * different choices throughout the story.
	 *
	 * @author Aaron Sedas, Aidan Becker, Prem Panchal
	 * @version 1.0
	 * @since @since 2020-05-04
	 */
	public class ChoiceHandler implements ActionListener {

		/**
		 * This method is used to move from position to position whenever a button is
		 * pressed
		 * 
		 * @param ActionEvent This contains information about the button that was
		 *                    pressed
		 * @return none
		 */
		public void actionPerformed(ActionEvent event) {

			// load the button that was pressed into a String
			String yourChoice = event.getActionCommand();

			// decide with position to move to based on that information
			switch (yourChoice) {
			case "start":
				vm.titleToStart();
				story.AreaOne();
				break;
			case "c1":
				story.selectPosition(nextPosition1);
				break;
			case "c2":
				story.selectPosition(nextPosition2);
				break;
			case "c3":
				story.selectPosition(nextPosition3);
				break;
			case "c4":
				story.selectPosition(nextPosition4);
				break;
			}

		}
	}

}
