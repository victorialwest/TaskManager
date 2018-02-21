package com.company;

public class TaskLists {

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
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getDateComplete() {
        return dateComplete;
    }

    public void setDateComplete(int dateComplete) {
        this.dateComplete = dateComplete;
    }
}
