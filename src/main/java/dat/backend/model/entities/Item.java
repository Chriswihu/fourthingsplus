package dat.backend.model.entities;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Item
{
    private int id;
    private String name;
    private Boolean done;
    private Timestamp created;
    private Timestamp updated;
    private String username;

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public Item(int id, String name, Boolean done, Timestamp created, Timestamp updated, String username) {
        this.id = id;
        this.name = name;
        this.done = done;
        this.created = created;
        this.updated = updated;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getDone() {
        return done;
    }

    public Timestamp getCreated() {
        return created;
    }

    public Timestamp getUpdated() {
//        String currentTime = df.format(new Date(updated));
        return updated;
    }

    public String getUsername() {
        return username;
    }

}
