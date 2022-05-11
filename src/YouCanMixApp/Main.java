package YouCanMixApp;

import YouCanMixApp.SQL.CreateSQLTables;
import javax.swing.*;

/**
 * @author Gabriel Alfredo Siguenza <sigue005@cougars.csusm.edu>
 */
public class Main{
	//starts the program
	public static void main(String[] args)throws ClassNotFoundException{
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
			      	new DrinkGUI().setVisible(true);
			}
		});
		//Creates drinks table in MySQL DB
		CreateSQLTables drinkTable = new CreateSQLTables();

		/**
		 * Demo class. Everything comes together here.
		 */
		/*public class Demo {
			public static void main(String[] args) {
				Mediator mediator = new Editor();

				mediator.registerComponent(new YouCanMixApp.Title());
				mediator.registerComponent(new TextBox());
				mediator.registerComponent(new AddButton());
				mediator.registerComponent(new DeleteButton());
				mediator.registerComponent(new SaveButton());
				mediator.registerComponent(new List(new DefaultListModel()));
				mediator.registerComponent(new Filter());

				mediator.createGUI();
			}
		}*/
	}
}
