package org.github.mnakagawa14.audiobooklibraryjava;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BookMetadata {

    private String title;
    private String author;
    private int publicationYear;
    private Set<String> genres;

    public BookMetadata(String title, String author, int publication_year, String[] genres) {
        this.title = title;
        this.author = author;
        this.publicationYear = publication_year;
        this.genres = new HashSet<String>();
        Collections.addAll(this.genres, genres);
    }

    public BookMetadata(String title, String author, int publication_year) {
        this(title, author, publication_year, new String[0]);
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
