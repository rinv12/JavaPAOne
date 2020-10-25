import java.time.LocalDate;

public class Book extends Product {
    private String authorName;
    private LocalDate publicationData;
    private int edition;

    public Book(String productID, String productName, String brandName, String productDesc,
                LocalDate dateOfIncorp, String authorName, LocalDate publicationData, int edition) {
        super(productID, productName, brandName, productDesc, dateOfIncorp);
        this.authorName = authorName;
        this.publicationData = publicationData;
        this.edition = edition;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublicationData() {
        return publicationData;
    }

    public void setPublicationData(LocalDate publicationData) {
        this.publicationData = publicationData;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}