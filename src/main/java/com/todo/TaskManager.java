package com.todo;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public boolean removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            return true;
        } else {
            return false;
        }
    }

    public void listarTarefas() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    public void buscarPorTitulo(String palavraChave) {
        boolean encontrou = false;
        for (Task task : tasks) {
            if (task.getTitle().toLowerCase().contains(palavraChave.toLowerCase())) {
                System.out.println(task);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma tarefa encontrada com a palavra-chave: " + palavraChave);
        }
    }
}