package YouCanMixApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializeObjects implements Serializable {

    public static void serialize() throws IOException {
        final int NUM_ITEMS = 3;
        String description;
        int units;

        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Create an array to hold inventory objects.
        Object[] items = new Object[NUM_ITEMS];

        //Get data for the Inventory objects
        System.out.println("Enter data for " + NUM_ITEMS
                + " Inventory items.");

        for (int i = 0; i < items.length; i++) {
            //Get the item description
            System.out.print("Enter an item description: ");
            description = keyboard.nextLine();

            //Get the number of units
            System.out.print("Enter the number of units: ");
            units = keyboard.nextInt();
            keyboard.nextLine();         //Consume remaining newline

            //Create an Inventory Object in the array

            // populate Object array with constructor, THIS WON'T WORK SINCE INDIVIDUAL OBJECTS HAVE DIFFERENT VALUES
//            items[i] = new Inventory(description, units);
        }

        //Create the stream objects
        ObjectOutputStream outFile = new ObjectOutputStream(
                new FileOutputStream("Objects.dat"));
        //Write the serialized objects to the file
        for (int i = 0; i < items.length; i++) {
            outFile.writeObject(items[i]);
        }

        //Close the file
        outFile.close();
        System.out.println("The serialized objects were written to the "
                + "Objects.dat file.");
    }
}
