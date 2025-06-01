public class RunApp {
    public static void main (String[] args) {
        Author author2 = new Author("Ник", "Перумов");
        System.out.println(author2.getFullName());
        Book book2 = new Book("Гибель Богов", author2, 2002);
        book2.setPublicationYear(1999);
        System.out.println(book2.getTitle() + " " + book2.getAuthor().getFullName() + " " + book2.getPublicationYear());
    }
}
