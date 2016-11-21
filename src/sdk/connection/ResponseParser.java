package sdk.connection;

/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */
public interface ResponseParser {
    void payload(String json);
    void error(int status);
}
