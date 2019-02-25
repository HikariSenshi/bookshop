package spring.database.entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Book {
    @Id
    private Long id;
    private String name;
    private String author;
    private String publication;
    private Date publishingDate;
    private int likes;
    private int dislikes;

    public Book(String name, String author, String publication, Date publishingDate, int likes, int dislikes) {
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.publishingDate = publishingDate;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public Book(String name, String author) {
        this(name,author,"unknown",null,0,0);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

}
