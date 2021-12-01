package model;

import java.util.Arrays;
import java.util.List;

//import assignments.Book;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookManager 
{
  List<Book> bookList = null;
  public void addBooks()
  {
	     Book b = new Book("Circe",500,"author1","Fantasy");
		 Book b1 = new Book("Ninth House",600,"author1","Fantasy");
		 Book b2 = new Book("The Help",700,"author1","Fiction");
		 Book b3 = new Book("One Hundred Years of Solitude",400,"author1","Fiction");
		 Book b4 = new Book("The Ninth Fire",300,"author1","Mystery");
		 Book b5 = new Book("The Advantures of Sherloch Holmes",800,"author1","Mystery");
       bookList = Arrays.asList(b,b1,b2,b3,b4,b5);
  }
  public List<Book> getBookByCategory(String categoryName)//function1 : get Books by category
  {
	  Predicate<Book> bookList1 = input->input.getCategory().equalsIgnoreCase(categoryName);
	  return bookList.stream().filter(bookList1).collect(Collectors.toList());
  }
  public List<Book> applyDiscountByCategoryAndPercentage(String categoryName,float discountPercentage)// functoin2 : applying 10% discount on Category.
  {
	  Predicate<Book> bookList1 = input->input.getCategory().equalsIgnoreCase(categoryName);
      return bookList.stream()
    		                  .filter(bookList1)
                              .map(book -> book.withDiscountedPrice(discountPercentage))
                              .collect(Collectors.toList());
                              
  }
//  System.out.println("==========");
  public List<String> getBookName()//function 3: Fetching all book names
  {
	  return bookList.stream().map(Book::getBookName).collect(Collectors.toList());
  }
  public List<Book> getCheapestBookInStore(int limit)// function 4: Getting least Price book names
  {
	 return bookList.stream().sorted()
	                  .limit(limit).collect(Collectors.toList());
  }
 
  
  
  
}
