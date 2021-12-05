/**
 *
 * @author Justin Blacksher
 * @version 1.0
 * <h1>BuyStuff.com</h1>
 * <h2>ShoppingCartPrinter.java</h2>
 * <p>ShoppingCartPrinter.java is created to accomplish the following</p>
 * <ul>
 *     <li>Prompt the user for two items</li>
 *     <li>Create two objects of the ItemToPurchase class</li>
 *     <ul>
 *         <li>Before prompting for the second item. Call scnr.nextLine() to input a new string</li>
 *     </ul>
 *     <li>Add the item costs together and output the total cost</li>
 * </ul>
 *
 */


package BuyStuff.com;
import java.util.Scanner;

public class ShoppingCartPrinter {

    public static void main(String[] args) {
	    // TODO: Create a scanner
        Scanner scan = new Scanner(System.in);
        int totalCost;
        totalCost = 0;
        int itemOneCost;
        itemOneCost = 0;
        int itemTwoCost;
        itemTwoCost = 0;
        // TODO: Create two objects of ItemToPurchase
        // 1st object
        ItemToPurchase stockItem_1 = new ItemToPurchase();
        // 2nd object
        ItemToPurchase stockItem_2 = new ItemToPurchase();

        // TODO: Use the scanner for user input to populate the objects
        // ************************************* SET ITEM 1 *******************************
        System.out.println("Item 1");
        System.out.print("Enter the item name: ");
        stockItem_1.setItemName(scan.nextLine()); // Get / Set the item name
        System.out.print("Enter the item price: ");
        stockItem_1.setItemPrice(scan.nextInt());   // Get / Set the item price
        System.out.print("Enter the item quantity: ");
        stockItem_1.setItemQuantity(scan.nextInt());  // Get / Set the item quantity

        // Reset Scanner
        scan.nextLine();

        // ************************************* SET ITEM 2 *******************************
        System.out.println("Item 2");
        System.out.print("Enter the item name: ");
        stockItem_2.setItemName(scan.nextLine()); // Get / Set the item name
        System.out.print("Enter the item price: ");
        stockItem_2.setItemPrice(scan.nextInt());   // Get / Set the item price
        System.out.print("Enter the item quantity: ");
        stockItem_2.setItemQuantity(scan.nextInt());  // Get / Set the item quantity



        // TODO: Add the total cost of both of the items
        System.out.println(""); // Create some space
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // Create some magic with the calculations
        itemOneCost = (stockItem_1.getItemPrice() * stockItem_1.getItemQuantity());
        itemTwoCost = (stockItem_2.getItemPrice() * stockItem_2.getItemQuantity());
        totalCost = itemOneCost + itemTwoCost;
        System.out.println("TOTAL COST:");
        System.out.print(stockItem_1.getItemName() + " ");
        System.out.println(stockItem_1.getItemQuantity() + " @ $" + stockItem_1.getItemPrice() +  " = " + itemOneCost );
        System.out.print(stockItem_2.getItemName() + " ");
        System.out.println(stockItem_2.getItemQuantity() + " @ $" + stockItem_2.getItemPrice() +  " = " + itemOneCost );
        System.out.println("");
        System.out.println("");
        System.out.print("Total: ");
        System.out.println("$" + totalCost);
        /*
            *** INTENDED OUTPUT FORMAT ***
            TOTAL COST:
            Chocolate Chips 1 @ 3$ = 3$
            Bottled Water 10 @ $1 = 10$

            Total: $13
         */

    }
}

/*
    Criteria
        [X] comments. Line and Block
        [X] Whitespace and style
        [X] Created two files
            [X] ItemToPurchase.java
            [X] ShoppingCartPrinter.java contains main() method
        [X] Created public methods
            [X] setName()
            [X] getName()
            [X] setPrice()
            [X] getPrice()
            [X] setQuantity()
            [X] getQuantity()
        [X] Prompt user for two items and create two objects from them
            [X] call scnr.nextLine() to allow the user to input a new string
        [X] Add the costs of the two items together and output the total cost
 */