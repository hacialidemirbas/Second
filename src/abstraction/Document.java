package abstraction;

import java.util.Date;

abstract class Document {
    private String[]authors;
    private Date date;

    public Document(String[] authors, Date date) {
        this.authors = authors;
        this.date = date;
    }

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }
}
