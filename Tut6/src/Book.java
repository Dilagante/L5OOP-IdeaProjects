public class Book implements Comparable<Book>{

    private String title;
    private double price;
    private int pubYear;
    private String authorName;

    public Book(String title, double price, int pubYear, String authorName) {
        this.title = title;
        this.price = price;
        this.pubYear = pubYear;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String toString(){
        return "Book(Title: " + this.title + ", Price: " + this.price + ", Published Year: " + this.pubYear + ", Author's Name: " + this.authorName + ")";
    }

    @Override
    public int compareTo(Book o) {
        return this.pubYear - o.getPubYear();
    }
}
