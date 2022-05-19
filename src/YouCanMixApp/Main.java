package YouCanMixApp;

import javax.swing.*;

public class Main{
	//starts the program
	public static void main(String[] args)throws ClassNotFoundException {


		System.out.println("creating sql tables in main");
		CreateSQLTables drinkTable = new CreateSQLTables();


//		Context context = new Context();

		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
			      	new DrinkGUI().setVisible(true);
			}
		});



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
