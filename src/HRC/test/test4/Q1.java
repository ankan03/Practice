package HRC.test.test4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of books you want to put in the list");

        try {
            int n = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Enter name for Book "+(i+1));
                String name = bufferedReader.readLine();
                System.out.println("Enter author for Book "+(i+1));
                String author = bufferedReader.readLine();
                System.out.println("Enter bookNumber for Book "+(i+1));
                int bookNumber = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter price for Book "+(i+1));
                int price = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter publisher for Book "+(i+1));
                String publisher = bufferedReader.readLine();
                bookList.add(new Book(name,author,bookNumber,price,publisher));

            }

            File file = new File("myBookStore.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);


            for (Book b : bookList) {
                System.out.println(b);
                dataOutputStream.writeUTF(String.valueOf(b));
            }
        }catch (Exception e){
            System.out.println("Wrong input");
        }


    }
}

class Book{
//    name, author, bookNumber, price, publisher.
    String name;
    String author;
    int bookNumber;
    int price;
    String publisher;

    public Book(String name, String author, int bookNumber, int price, String publisher) {
        this.name = name;
        this.author = author;
        this.bookNumber = bookNumber;
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                "| author='" + author + '\'' +
                "| bookNumber=" + bookNumber +
                "| price=" + price +
                "| publisher='" + publisher + '\'' +
                '}';
    }
}