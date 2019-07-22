package com.company.task_87_A_5;

public class List {

    private Book[] bookList = new Book[50];


    int k = 0;
    public void addBook(Book[] n) {

        bookList = n;

    }

    public void listOut(Book[] bookList) {

        for (Book m : bookList) {

            System.out.print("id: "+m.getId()+", ");
            System.out.print("name: "+m.getName()+", ");
            System.out.print("author: "+m.getAuthor()+", ");
            System.out.print("publishing: "+m.getPublishing()+", ");
            System.out.print("publicationDate: "+m.getPublicationDate()+", ");
            System.out.print("numberPage: "+m.getNumberPage()+", ");
            System.out.print("price: "+m.getPrice()+", ");
            System.out.print("typeBinding: "+m.getTypeBinding()+", ");
            System.out.println();
        }

    }

    public void listOutByAuthor(String author) {

        for (Book m : bookList) {
            if (m != null) {

                if (author.equalsIgnoreCase(m.getAuthor())) {
                    System.out.print("id: "+m.getId()+", ");
                    System.out.print("name: "+m.getName()+", ");
                    System.out.print("author: "+m.getAuthor()+", ");
                    System.out.print("publishing: "+m.getPublishing()+", ");
                    System.out.print("publicationDate: "+m.getPublicationDate()+", ");
                    System.out.print("numberPage: "+m.getNumberPage()+", ");
                    System.out.print("price: "+m.getPrice()+", ");
                    System.out.print("typeBinding: "+m.getTypeBinding()+", ");
                    System.out.println();
                }

            }
        }
    }
    public void listOutByPublishing(Book[] bookList, String publishing) {
        for (Book m : bookList) {

            if (m != null) {

                if (publishing.equalsIgnoreCase(m.getPublishing())) {
                    System.out.print("id: "+m.getId()+", ");
                    System.out.print("name: "+m.getName()+", ");
                    System.out.print("author: "+m.getAuthor()+", ");
                    System.out.print("publishing: "+m.getPublishing()+", ");
                    System.out.print("publicationDate: "+m.getPublicationDate()+", ");
                    System.out.print("numberPage: "+m.getNumberPage()+", ");
                    System.out.print("price: "+m.getPrice()+", ");
                    System.out.print("typeBinding: "+m.getTypeBinding()+", ");
                    System.out.println();
                }

            }
        }
    }
    public void listOutByPublicationDate(Book[] bookList, int publicationDate) {

        for (Book m : bookList) {
            if (m != null) {

                if (publicationDate<m.getPublicationDate()) {
                    System.out.print("id: "+m.getId()+", ");
                    System.out.print("name: "+m.getName()+", ");
                    System.out.print("author: "+m.getAuthor()+", ");
                    System.out.print("publishing: "+m.getPublishing()+", ");
                    System.out.print("publicationDate: "+m.getPublicationDate()+", ");
                    System.out.print("numberPage: "+m.getNumberPage()+", ");
                    System.out.print("price: "+m.getPrice()+", ");
                    System.out.print("typeBinding: "+m.getTypeBinding()+", ");
                    System.out.println();
                }

            }
        }
    }
}

