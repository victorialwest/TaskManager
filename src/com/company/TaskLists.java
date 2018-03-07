package com.company;

import java.util.Scanner;

public class TaskLists extends MainMenu{

    public String title = "";
    public String dueDate;
    public String details;
    public String dateComplete;
    private Scanner input = new Scanner(System.in);

    public TaskLists() {
        setTitle();
        setDueDate();
        setDetails();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        System.out.println("What is the title of your task?");
        title = input.nextLine();
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate() {
        System.out.println("What is the due date of your task?");
        dueDate = input.nextLine();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails() {
        System.out.println("What are the details of your task?");
        details = input.nextLine();
    }

    public String getDateComplete() {
        return dateComplete;
    }

    public void setDateComplete() {
        System.out.println("Your task has been completed and the date has been logged.");
        dateComplete = input.nextLine();
    }
}
