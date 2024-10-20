package by.itacademy.anatoliystavskiy;

public class Book {

    private int id;
    private String name;
    private String Author;
    private String publishingHouse;
    private int year;
    private int price;

    public Book(int id, String name, String author, String publishingHouse, int year, int price) {
        this.id = id;
        this.name = name;
        Author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.price = price;
    }

    public Book(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
