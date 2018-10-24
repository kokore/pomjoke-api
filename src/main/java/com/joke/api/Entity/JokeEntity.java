package com.joke.api.Entity;

import javax.persistence.*;

@Entity
@Table(name = "pomjoke")
public class JokeEntity {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;

    private String type;
    private String setup;
    private String punchline;

    public JokeEntity() {}

    public JokeEntity(String type, String setup, String punchline) {
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
