package package01;


/**
* <h1>Visibility Manager</h1>
* Simple visibility manager that determines which of the two screens (Title or MainGame) screen
* and its relevant components show
*
* @author Zara Ali
* @version 1.0
* @since 2014-03-31
*/
public class VisibilityManager {

	private UI ui;

	public VisibilityManager(UI userInterface) {

		ui = userInterface;
	}

	/**
	* This method is used to switch to the title screen of the 
	* game as opposed to the main game
	* 
	* @param none
	* @return none
	*/
	public void showTitleScreen() {

		// Display title screen & start button
		ui.titleNameLabel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		ui.titleNamePanel.setVisible(true);

		// Hide game screen
		ui.mainTextPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
		ui.hpLabel.setVisible(false);
		ui.hpLabelNumber.setVisible(false);
		ui.weaponLabel.setVisible(false);
		ui.weaponLabelName.setVisible(false);
	}

	/**
	* This method is used to switch to the main game screen as
	* opposed to the title screen
	* 
	* @param none
	* @return none
	*/
	public void titleToStart() {

		// Hide title screen & start button
		ui.titleNameLabel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		ui.titleNamePanel.setVisible(false);

		// Show game screen
		ui.mainTextPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
		ui.playerPanel.setVisible(true);
		ui.hpLabel.setVisible(true);
		ui.hpLabelNumber.setVisible(true);
		ui.weaponLabel.setVisible(true);
		ui.weaponLabelName.setVisible(true);
	}
}
