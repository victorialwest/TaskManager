package com.company;

public class TaskLists extends MainMenu{

    public String title;
    public int dueDate;
    public String details;
    public int dateComplete;

    public TaskLists(String title, int dueDate, String details, int dateComplete) {
        this.title = title;
        this.dueDate = dueDate;
        this.details = details;
        this.dateComplete = dateComplete;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("What is the title of your task?");
        title = input.nextLine();
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
        System.out.println("What is the due date of your task?");
        dueDate = input.nextLine();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
        System.out.println("What are the details of your task?");
        details = input.nextLine();
    }

    public int getDateComplete() {
        return dateComplete;
    }

    public void setDateComplete(int dateComplete) {
        this.dateComplete = dateComplete;
        System.out.println("Your task has been completed and the date has been logged.");
        dateComplete = input.nextLine();
    }
}
