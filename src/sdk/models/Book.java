package sdk.models;

/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */
public class Book extends BaseModel{
    private int BookID;
    private String Title;
    private int Version;
    private double ISBN;
    private double PriceAB;
    private double PriceSaxo;
    private double PriceCdon;
    private String publisher;
    private String author;

    public Book(int bookID, String title, int version, double ISBN, double priceAB, double priceSaxo, double priceCdon, String publisher, String author) {
        BookID = bookID;
        Title = title;
        Version = version;
        this.ISBN = ISBN;
        PriceAB = priceAB;
        PriceSaxo = priceSaxo;
        PriceCdon = priceCdon;
        this.publisher = publisher;
        this.author = author;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(double ISBN) {
        this.ISBN = ISBN;
    }

    public double getPriceAB() {
        return PriceAB;
    }

    public void setPriceAB(double priceAB) {
        PriceAB = priceAB;
    }

    public double getPriceSaxo() {
        return PriceSaxo;
    }

    public void setPriceSaxo(double priceSaxo) {
        PriceSaxo = priceSaxo;
    }

    public double getPriceCdon() {
        return PriceCdon;
    }

    public void setPriceCdon(double priceCdon) {
        PriceCdon = priceCdon;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
