/**
 * @author Justin Blacksher
 * @version 1.0
 * <h1>BuyStuff.com</h1>
 * <h2>ItemToPurchase.java</h2>
 * <p>ItemToPurchase is created to do the following</p>
 * <ul>
 *     <li>Set the name for an item</li>
 *     <li>Set the price for an item</li>
 *     <li>Set the quantity for an item</li>
 *     <li>An object is created in the ShoppingCartPrinter.java</li>
 *     <li>The prices will be calculated together into a virtual cart</li>
 *
 * </ul>
 *
 */


package BuyStuff.com;

public class ItemToPurchase {

    // TODO: Private Fields
    // [-] String itemName - Initialized in default Constructor to "none"
    private String itemName;
    // [-] int itemPrice - Initialized in default constructor to 0
    private int itemPrice;
    // [-] int itemQuantity - initialized in default constructor to 0
    private int itemQuantity;


    // TODO: Create a default constructor
    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    // TODO: Create public member methods (mutators and accessors)

    // [-] setName() & getName()
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // [-] setPrice() & getPrice()
    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;

    }

    // [-] setQuantity() & getQuantity()
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

}




