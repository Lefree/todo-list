package ru.java.practice.todolist.Entities;

public class TodoItem {

    private Long id;
    private String name;
    private String description;
    private Long user_id;
    private Boolean finished = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public TodoItem(Long id, String name, String description, Long user_id, Boolean finished) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user_id = user_id;
        this.finished = finished;
    }
}
