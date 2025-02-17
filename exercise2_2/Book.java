package exercise2_2;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book(String name, Author[] authors, double price, int qty) {
		this.name= name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthors() {
		return authors;
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
	public String toString() {
	    StringBuilder authorsString = new StringBuilder();
	    for (Author author : authors) {
	        authorsString.append(author.toString()).append(", ");
	    }
	    if (authorsString.length() > 0) {
	        authorsString.setLength(authorsString.length() - 2);
	    }

	    return "Book[name=" + name + ", authors={" + authorsString.toString() + "}, price=" + price + ", qty=" + qty + "]";
	}

}
