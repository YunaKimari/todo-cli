package com.todo;

public class Task {
    private static int counter = 0;

    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.id = ++counter;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void markAsCompleted(){
        this.completed = true;
    }

    public String toString(){
        return String.format("[%d] %s - %s (%s)",
            id, title, description, completed ? "✅ Concluída" : "⌛ Pendente");
    }
}