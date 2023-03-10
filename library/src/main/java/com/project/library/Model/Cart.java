package com.project.library.Model;

import java.util.List;

public class Cart {
    private int id;
    private String name;
    private String author;
    private String link;

    private List<Books> books;

    // default and parameterized constructor

    public void addBook(Books book) {
        this.books.add(book);
    }
	

    public Cart() {
    }

    public Cart(int id, String name, String author, String link) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Cart [id=" + id + ", name=" + name + ", author=" + author + ", link=" + link + "]";
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
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public List<Books> getBooks() {
        return books;
    }


    public void setBooks(List<Books> books) {
        this.books = books;
    }

}
