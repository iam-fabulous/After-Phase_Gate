package fabdiary.data.models;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = true;
    List<Entry> entries = new ArrayList<>();

    public Diary() {}

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", entries=" + entries +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
