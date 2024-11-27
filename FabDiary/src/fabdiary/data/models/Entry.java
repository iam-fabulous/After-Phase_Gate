package fabdiary.data.models;

import java.time.LocalDateTime;

public class Entry {
    private long id;
    private String title;
    private String body;
    private String diary_id;
    LocalDateTime dateCreated = LocalDateTime.now();

    public Entry(){}


    public String getDiary_id() {
        return diary_id;
    }

    public void setDiary_id(String diary_id) {
        this.diary_id = diary_id;
    }

    public long getEntryId() {
        return id;
    }

    public void setEntryId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
