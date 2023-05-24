/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class Book {
    
    private String title;
    private Integer pages;
    private Integer publication_year;

    public Book(String title, Integer pages, Integer publication_year) {
        this.title = title;
        this.pages = pages;
        this.publication_year = publication_year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(Integer publication_year) {
        this.publication_year = publication_year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publication_year;
    }
}
