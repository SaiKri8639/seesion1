package model;

import java.util.Scanner;
import java.util.*;


public class BookShop
{
 public static void main(String[] args)
 {
   BookManager bookManager = new BookManager();
   bookManager.addBooks();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the category :");
   String categoryName = sc.next();
   List<Book> result =bookManager.getBookByCategory(categoryName);
   result.stream().forEach(System.out::println);
   
   List<Book> bookListWithDiscountedPrice = bookManager.applyDiscountByCategoryAndPercentage(categoryName,0.1f);
   bookListWithDiscountedPrice.stream().forEach(System.out::println);
   
   List<String> availableBookNames = bookManager.getBookName();
   availableBookNames.stream().forEach(System.out::println); 
   
   System.out.println("enter the number least price books :");
   int limit =sc.nextInt();
   List<Book> result1 =bookManager.getCheapestBookInStore(limit);
   result1.stream().forEach(System.out::println);
   
 }
}
