package LinkedHashSet;

import java.util.LinkedHashSet;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class LinkedHashSetDemo3 {
    public static void main(String[] args) {
        LinkedHashSet<Book> hs = new LinkedHashSet<Book>();

        //Adding Books to hash table
        hs.add(new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8));
        hs.add(new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4));
        hs.add(new Book(103, "Operating System", "Galvin", "Wiley", 6));

        //Traversing hash table
        for (Book b : hs) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
