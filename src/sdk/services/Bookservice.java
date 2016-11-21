package sdk.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.HttpGet;
import sdk.connection.Connection;
import sdk.connection.ResponseCallback;
import sdk.connection.ResponseParser;
import sdk.models.Book;

import java.util.ArrayList;

/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */
public class Bookservice {

    private Connection connection;
    private Gson gson;

    public Bookservice() {
        this.connection = new Connection();
        this.gson = new Gson();
    }

    public void getAll(final ResponseCallback<ArrayList<Book>> responseCallback){

        HttpGet getrequest = new HttpGet(Connection.serverURL + "/books");

        this.connection.execute(getrequest, new ResponseParser() {
            public void payload(String json) {

                ArrayList<Book> books = gson.fromJson(json, new TypeToken<ArrayList<Book>>(){}.getType());
                responseCallback.success(books);
            }

            public void error(int status) {
                System.out.println("An error has occured" + status);

            }
        });
    }

}
