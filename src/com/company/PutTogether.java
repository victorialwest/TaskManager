package com.company;


import java.util.ArrayList;

public class PutTogether {

    private ArrayList<TaskLists> list = new ArrayList<>();
    private ArrayList<TaskLists> completed = new ArrayList<>();


    protected void CreateTask(){

        TaskLists tasklists = new TaskLists();
        list.add(tasklists);
    }
    protected void editTask(){

    }
    protected void completeTask(){

    }
    protected void viewTasks(){

    }
    protected void viewCompletedTasks(){

    }
    protected void viewIncompleteTasks(){
        int index = 1;
        for (TaskLists tasklists : list) {
            System.out.println();

        }

    }
}