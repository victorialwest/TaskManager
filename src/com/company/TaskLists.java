package com.company;

public class TaskLists extends MainMenu{

    public static String title;
    public String dueDate;
    public String details;
    public String dateComplete;

    public TaskLists() {
        this.title = title;
        this.dueDate = dueDate;
        this.details = details;
        this.dateComplete = dateComplete;
    }

    public static String getTitle() {
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

    public String getDateComplete() {
        return dateComplete;
    }

    public void setDateComplete(String dateComplete) {
        this.dateComplete = dateComplete;
        System.out.println("Your task has been completed and the date has been logged.");
        dateComplete = input.nextLine();
    }
}
