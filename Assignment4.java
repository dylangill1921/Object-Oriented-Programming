// Name: Dylan Gill
// Filename: assignment4
// Date: March 31, 2024
// Description: 

package week11;

import java.util.Date;
	
	class Product {
		private int sku;
		private String productname;
		private float cost;
		private int quantityinstore;
		private int quantitytoorder;
		private String instructions;
	
	// Default Constructor
	public Product() {
		this.sku = 0;
		this.productname = "";
		this.cost =  0.0f;
		this.quantityinstore = 0;
		this.quantitytoorder = 0;
		this.instructions = "";
	}
	
	//Parameterized Constructor
	public Product(int sku, String productname, float cost, int quantityinstore, int quantitytoorder, String instructions) {
		this.sku = sku;
		this.productname = productname;
		this.cost = cost;
		this.quantityinstore = quantityinstore;
		this.quantitytoorder = quantitytoorder;
		this.instructions = instructions;
	}
	
	// Set and Get the Properties
	public int getSku() {
		return sku;
	}
	
	public void setSku(int sku) {
		this.sku = sku;
	}
	
	public String getProductname() {
		return productname;
	}
	
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public int getQuantityinstore() {
		return quantityinstore;
	}
	
	public void setQuantityinstore(int quantityinstore) {
		this.quantityinstore = quantityinstore;
	}
	
	public int getQuantitytoorder() {
		return quantitytoorder;
	}
	
	public void setQuantitytoorder(int quantitytoorder) {
		this.quantitytoorder = quantitytoorder;
	}
	
	public String getInstructions() {
		return instructions;
	}
	
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	// Display method
	public void display() {
		System.out.println("SKU: " + sku);
		System.out.println("Product Name: " + productname);
		System.out.println("Unit Cost: " + cost);
		System.out.println("Quantity on hand: " + quantityinstore);
		System.out.println("Quantity Needed: " + quantitytoorder);
		System.out.println("Special Instructions: " + instructions);
	}
}
	
class Perishable extends Product {
	private Date expirydate;
	
	// Overloaded Constructor
	public Perishable(int sku, String productname, float cost, int quantityinstore, int quantitytoorder, String instructions, Date expirydate) {
		super(sku, productname, cost, quantityinstore, quantitytoorder, instructions);
		this.expirydate = expirydate;
	}
	
	// Set and Get the properties for perishableproduct
	public Date getExpirydate() {
		return expirydate;
	}
	
	public void setExpirydate (Date expirydate) {
		this.expirydate = expirydate;
	}
	
	// Override the display method to add perishablep
	public void display() {
		super.display();
		System.out.println("Expiry Date: " + expirydate);
	}
}
public class Assignment4 {
	public static void main(String[] args) {
		
		// Create products to test your code
		Product p1 = new Product(1, "Banana", 0.5f, 125, 75, "Best to not leave out on counter for a month");
		Product p2 = new Product(2, "Cantalope", 0.9f, 80, 40, "Best to enjoy on a hot sunny day, keep cool.");
		Product p3 = new Product(3, "Strawberry", 0.3f, 225, 175, "Best to mix it with yogurt or a shake.");
		
		// Create perishable product
		Perishable pp4 = new Perishable(4, "Cheese", 2.5f, 75, 25, "Keep refrigerated", new Date());
		Perishable pp5 = new Perishable(5, "Milk", 2.2f, 50, 30, "Best before the expiry date", new Date());
		
		// Create an array for the prodcuts
		Product[] products = {p1, p2, p3, pp4, pp5};
		
		// Display all the details on each product
		System.out.println("Details of all products:");
		for (Product product: products) {
			product.display();
			System.out.println();
		}
	}

}
