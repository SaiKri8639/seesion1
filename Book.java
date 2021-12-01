package model;

public class Book implements Comparable<Book>
{ 
 public Book(String bookName, float bookPrice, String authorName, String category) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.category = category;
	}
 String bookName;
 float bookPrice;
 String authorName;
 String category;
 //public Book( String bookName,)
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public float getBookPrice() {
	return bookPrice;
}
public void setBookPrice(float bookPrice) {
	this.bookPrice = bookPrice;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName=" + authorName + ", category="
			+ category + "]";
}

public Book withDiscountedPrice(float discountPercentage)
{
	this.setBookPrice(this.getBookPrice()-(this.getBookPrice()*discountPercentage));
	return this;
}
@Override
public int compareTo(Book o) {
	// TODO Auto-generated method stub
	return this.getBookPrice()>o.bookPrice 
			?1 
			:this.getBookPrice()==o.bookPrice 
			?0
			:-1;
}
}


}

