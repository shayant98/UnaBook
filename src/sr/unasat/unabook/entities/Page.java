package sr.unasat.unabook.entities;

import java.time.LocalDate;

public class Page {
    private long id;
    private String titel, content, author;
    private LocalDate PublishDate;

    public Page(long id, String titel, String content, String author, LocalDate publishDate) {
        this.id = id;
        this.titel = titel;
        this.content = content;
        this.author = author;
        PublishDate = publishDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        PublishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", PublishDate=" + PublishDate +
                '}';
    }
}
