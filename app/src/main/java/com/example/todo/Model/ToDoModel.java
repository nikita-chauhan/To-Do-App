package com.example.todo.Model;

public class ToDoModel {
    public String getNewTaskText() {
        return newTaskText;
    }

    public ToDoModel() {
    }

    @Override
    public String toString() {
        return "ToDoModel{" +
                "newTaskText='" + newTaskText + '\'' +
                '}';
    }

    public void setNewTaskText(String newTaskText) {
        this.newTaskText = newTaskText;
    }

    String newTaskText;

}
