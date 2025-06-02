public class Main {
    public static void main(String[] args) {

    Author author1 = new Author("Эрнест", "Хемингуэй");
        System.out.println(author1);
    Author author2 = new Author("Ник", "Перумов");
        System.out.println(author2);

    Book book1 = new Book("Прощай, оружие!", author1, 1929);
        System.out.println(book1);
    Book book2 = new Book("Гибель Богов", author2, 2002);
        System.out.println(book2);
    }
}
