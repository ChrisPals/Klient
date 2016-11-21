package sdk;

/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */

import sdk.connection.ResponseCallback;
import sdk.models.Book;
import sdk.models.User;
import sdk.services.Bookservice;

import java.util.ArrayList;


public class Bookstore {

    Controller controller = new Controller();
    static Bookservice bookService = new Bookservice();

    public static void main(String[] args) {
        new Bookstore().run();

        bookService.getAll(new ResponseCallback<ArrayList<Book>>() {
            public void success(ArrayList<Book> books) {

                for(Book book : books){
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Subtitle: " + book.getPublisher());
                    System.out.println("Price: " + book.getISBN());
                    System.out.println("Id: " + book.getBookID());
                    System.out.println("Id: " + book.getPriceAB());
                }

            }

            public void error(int status) {
                System.out.println(status);
            }
        });

        }

    public void run() {
        while (true) {
        }
    }

}