package by.itacademy.anatoliystavskiy;

public class Main {
    public static void main(String[] args) {

        Books books = new Books();
        books.addBook(new Book(1, "Муму", "Тургенев", "Азбука", 1854, 50));
        books.addBook(new Book(2, "Пираты карибского моря", "Cтивен Кинг", "Московский Дом", 1994, 87));
        books.addBook(new Book(3, "Рипцацам", "Ломоносов", "ОАО Рога и копыта", 1985, 13));
        books.addBook(new Book(4, "Нахлебник", "Тургенев", "Минский Дом", 1856, 66));
        books.addBook(new Book(6, "Игра пристолов", 1993));
        books.addBook(new Book(7, "Мастер и Маргарита", "Булгаков", "Минский Дом", 1891, 47));
        books.addBook(new Book(8, "Жизнь Пи", 2001));
        books.addBook(new Book(9, "Зеленая миля", "Стивен Кинг", "ОАО Рога и копыта", 1996, 121));

        books.FindAuthor("Тургенев");
        books.FindStartDate(1993);
        books.FindPublishing("Московский дом");
    }
}
