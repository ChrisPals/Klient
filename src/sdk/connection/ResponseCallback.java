package sdk.connection;

/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */
public interface ResponseCallback<T> {
    void success(T data);
    void error(int status);
}
