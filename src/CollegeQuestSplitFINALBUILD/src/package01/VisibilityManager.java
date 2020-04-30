package package01;

//Simple visibility manager that determines which of the two screens (Title or MainGame) screen and its relevant components show

public class VisibilityManager {
	
	UI ui;

	public VisibilityManager(UI userInterface) {
		
		
		ui = userInterface;
	}
	
	public void showTitleScreen() {
		
		
		//Display title screen & start button
		ui.titleNameLabel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		ui.titleNamePanel.setVisible(true);
		
		//Hide game screen
		ui.mainTextPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
		ui.hpLabel.setVisible(false);
		ui.hpLabelNumber.setVisible(false);
		ui.weaponLabel.setVisible(false);
		ui.weaponLabelName.setVisible(false);
	}
	
	public void titleToStart() {
		
		//Hide title screen & start button
				ui.titleNameLabel.setVisible(false);
				ui.startButtonPanel.setVisible(false);
				ui.titleNamePanel.setVisible(false);
				
				
				//Show game screen
				ui.mainTextPanel.setVisible(true);
				ui.choiceButtonPanel.setVisible(true);
				ui.playerPanel.setVisible(true);
				ui.hpLabel.setVisible(true);
				ui.hpLabelNumber.setVisible(true);
				ui.weaponLabel.setVisible(true);
				ui.weaponLabelName.setVisible(true);
	}
}
