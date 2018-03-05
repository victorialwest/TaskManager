package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class PutTogether {

    protected ArrayList<TaskLists> list = new ArrayList<>();
    protected final ArrayList<TaskLists> completed = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    protected void CreateTask() {

        TaskLists tasklists = new TaskLists();
        list.add(tasklists);
    }

    protected void editTask() {

    }

    protected void completeTask() {

    }

    protected void viewTasks() {
        System.out.println("Here are your complete tasks: ");
        viewCompletedTasks();
        System.out.println("Here are your incompleted tasks: ");
        viewIncompleteTasks();

    }

    protected void viewCompletedTasks() {
        int index2 = 1;
        for (TaskLists tasklists : completed) {
            System.out.println(index2++ + " title: " + tasklists.title + "\n due date: " + tasklists.dueDate + " \n details: "
                    + tasklists.details);

        }

    }
    protected void viewIncompleteTasks() {
        int index = 1;
        for (TaskLists tasklists : list) {
            System.out.println(index++ + " title: " + tasklists.title + "\n due date: " + tasklists.dueDate + " \n details: "
                    + tasklists.details);
        }

    }

}