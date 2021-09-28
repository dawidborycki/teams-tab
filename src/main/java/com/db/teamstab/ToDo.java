package com.db.teamstab;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToDo{
    @JsonProperty("userId")
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }
    int userId;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    int id;

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    String title;

    @JsonProperty("completed")
    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    boolean completed;
}