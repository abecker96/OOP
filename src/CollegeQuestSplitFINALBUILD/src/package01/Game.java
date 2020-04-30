package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//"Main" file for game, handles transfer of data between Story class and every other class. 
public class Game {

	ChoiceHandler cHandler = new ChoiceHandler();
	UI ui = new UI();
	VisibilityManager vm = new VisibilityManager(ui);
	Story story = new Story(this, ui, vm);
	
	String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
	
	public static void main(String[] args) {
		
		new Game();
	}

	//Initialization of Game and program
	public Game() {
		
		ui.createUI(cHandler);
		story.defaultSetup();
		vm.showTitleScreen();
		
		
	}
	
	public class ChoiceHandler implements ActionListener{
		
		//Case Switch handler
		public void actionPerformed(ActionEvent event) {
			
			String yourChoice = event.getActionCommand();
			
			switch(yourChoice) {
			case "start": vm.titleToStart(); story.AreaOne(); break;
			case "c1": story.selectPosition(nextPosition1);break;
			case "c2": story.selectPosition(nextPosition2);break;
			case "c3": story.selectPosition(nextPosition3);break;
			case "c4": story.selectPosition(nextPosition4);break;
			}
			
		}
	}
	
}
