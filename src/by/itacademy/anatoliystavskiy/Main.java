package by.itacademy.anatoliystavskiy;

public class Main {
    public static void main(String[] args) {

        String checkAuthor = "Тургенев";
        int startDate = 1954;
        String checkPublishing = "Московский дом";
        Book[] books = new Book[9];

        books[0] = new Book(1, "Муму", "Тургенев", "Азбука", 1854, 50);
        books[1] = new Book(2, "Пираты карибского моря", "Cтивен Кинг", "Московский Дом", 1994, 87);
        books[2] = new Book(3, "Рипцацам", "Ломоносов", "ОАО Рога и копыта", 1985, 13);
        books[3] = new Book(4, "Нахлебник", "Тургенев", "Минский Дом", 1856, 66);
        books[4] = new Book(5, "Провинциалка", "Тургенев", "Минский Дом", 1851, 12);
        books[5] = new Book(6, "Игра пристолов", 1993);
        books[6] = new Book(7, "Мастер и Маргарита", "Булгаков", "Минский Дом", 1891, 47);
        books[7] = new Book(8, "Жизнь Пи", 2001);
        books[8] = new Book(9, "Зеленая миля", "Стивен Кинг", "ОАО Рога и копыта", 1996, 121);

        System.out.println("Список книг " + checkAuthor + ":");
        int value = 1;
        for (Book book : books) {
            if (checkAuthor.equalsIgnoreCase(book.getAuthor())) {
                System.out.println(value + ": " + book.getName());
                value++;
            }
        }
        System.out.println();

        System.out.println("Список книг после " + startDate + " года издания:");
        int value1 = 1;
        for (Book book : books) {
            if (book.getYear() > startDate) {
                System.out.println(value1 + ": " + book.getName() + " " + book.getYear() + " год");
            } else continue;
            value1++;
        }
        System.out.println();


        System.out.println("Книги " + " издательства " + checkPublishing + ":");
        int value2 = 1;
        for (Book book : books) {
            if (checkPublishing.equalsIgnoreCase(book.getPublishingHouse())) {
                System.out.println(value2 + ": " + book.getName());
                value2++;
            }
        }
    }
}
