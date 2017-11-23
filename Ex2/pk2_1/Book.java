package Ex2.pk2_1;

public class Book {
	String name;
	Author author;
	double price;
	int qty = 0;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, Author author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name +", "+ author.toString() + ", price="+price+", qty=" + qty + "]";
	}
	
}
