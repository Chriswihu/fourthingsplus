package dat.backend.model.entities;

import java.sql.Timestamp;

public class Item
{
    private int id;
    private String name;
    private Boolean done;
    private Timestamp created;
    private String username;

    public Item(int id, String name, Boolean done, Timestamp created, String username) {
        this.id = id;
        this.name = name;
        this.done = done;
        this.created = created;
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

    public String getUsername() {
        return username;
    }

}
