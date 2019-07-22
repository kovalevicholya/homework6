package com.company.task_87_A_5;


public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book (1, "Энциклопедия полимеров","Кабанов","Москва",
                2001, 523, 53, "твердый");
        books[1] = new Book (2, "Химия и технология полимеров","Ставерман","Москва",
                2008, 611, 95, "твердый");
        books[2] = new Book (3, "Высокомолекулярные соединения","Шур","Минск",
                1991, 325, 43, "твердый");

        List l = new List();

        System.out.println("список введенных книг");
        l.listOut(books);

        System.out.println("список книг заданного автора");
        l.listOutByAuthor("Ставерман");

        System.out.println("список книг заданного издательства");
        l.listOutByPublishing(books,"Москва");

        System.out.println("список книг, выпущенных после заданного года");
        l.listOutByPublicationDate(books,1991);
    }
}
