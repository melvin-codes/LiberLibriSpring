package com.code.LiberLibriSpring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String author;
    private String bookTitle;
    private Genre genre;
    private Boolean stillReading;
    private String publisher;
    private Integer pagesRead;
    private Integer numberOfPages;
    private Integer publicationYear;
    private String isbnNumber;
    private String notes;
    private LocalDateTime updateDateTime;
    private LocalDateTime createDateTime;

    public Book() {}

    public Book(String author, String bookTitle, Genre genre, Boolean stillReading, String publisher, Integer pagesRead, Integer numberOfPages, Integer publicationYear, String isbnNumber, String notes) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.stillReading = stillReading;
        this.publisher = publisher;
        this.pagesRead = pagesRead;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
        this.isbnNumber = isbnNumber;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Boolean getStillReading() {
        return stillReading;
    }

    public void setStillReading(Boolean stillReading) {
        this.stillReading = stillReading;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(Integer pagesRead) {
        this.pagesRead = pagesRead;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", genre=" + genre +
                ", stillReading=" + stillReading +
                ", publisher='" + publisher + '\'' +
                ", pagesRead=" + pagesRead +
                ", numberOfPages=" + numberOfPages +
                ", publicationYear=" + publicationYear +
                ", isbnNumber='" + isbnNumber + '\'' +
                ", notes='" + notes + '\'' +
                ", updateDateTime=" + updateDateTime +
                ", createDateTime=" + createDateTime +
                '}';
    }
}
