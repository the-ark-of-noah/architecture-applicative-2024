package fr.epsiflix.domain.interaction.model;

class Comment {
    private String comment;
    private String author;
    private String date;

    public Comment(String comment, String author, String date) {
        this.comment = comment;
        this.author = author;
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }
}