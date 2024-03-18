package org.workingdepot.springbookdatabase.entity;

import jakarta.persistence.*;


@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="author_name")
    private String author;

    @Column(name="publish_year")
    private int publishYear;

    @Column(name="genre")
    private String genre;

    public Book(){

    }

    public Book(String title, String author, int publishYear, String genre) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", published='" + publishYear + '\'' +
                ", genre='" + genre + '\'' +
                '}';

    }
}
