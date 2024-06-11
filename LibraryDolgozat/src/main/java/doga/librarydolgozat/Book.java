package doga.librarydolgozat;

public class Book {
    String author;
    String title;
    String year;
    String acquisitionDate;
    String category;

    public String getAuthor() {
        return author;
    }
    private void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    private void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }
    private void setYear(String year) {
        this.year = year;
    }

    public String getAcquisitionDate() {
        return acquisitionDate;
    }
    private void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getCategory() {
        return category;
    }
    private void setCategory(String category) {
        this.category = category;
    }

    public Book(String author, String title, String year, String category, String acquisitionDate) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setYear(year);
        this.setCategory(category);
        this.setAcquisitionDate(acquisitionDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + this.getAuthor() +
                " | title=" + this.getTitle() +
                " | year=" + this.getYear() +
                " | category=" + this.getCategory() +
                " | date=" + this.getAcquisitionDate() +
                '}';
    }

}
