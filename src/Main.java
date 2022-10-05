public class Main {

    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Book theStand = new Book("The Stand", stephenKing, 1975);


        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1865);


        System.out.println("Название книги: " + theStand.getTitle()
        + " Автор: " + theStand.getAuthor().getName() + " " + theStand.getAuthor().getSurname()
        + " Дата: " +theStand.getPublicationYear());


        System.out.println("Название книги: " + warAndPeace.getTitle()
                + " Автор: " + warAndPeace.getAuthor().getName() + " " + warAndPeace.getAuthor().getSurname()
                + " Дата: " + warAndPeace.getPublicationYear());


        warAndPeace.setPublicationYear(1999);
        System.out.println("Название книги: " + warAndPeace.getTitle()
                + " Автор: " + warAndPeace.getAuthor().getName() + " " + warAndPeace.getAuthor().getSurname()
                + " Дата: " + warAndPeace.getPublicationYear());
    }
}