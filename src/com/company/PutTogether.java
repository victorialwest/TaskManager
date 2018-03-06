package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class PutTogether {

    protected ArrayList<TaskLists> list = new ArrayList<>();
    protected final ArrayList<TaskLists> completed = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public Scanner input2;

    protected void CreateTask() {

        TaskLists tasklists = new TaskLists();
        list.add(tasklists);
    }

    protected void editTask() {
        System.out.println("Do you want to edit the 1. Title \n 2. Due Date \n 3. Details");
        int selection2 = input2.nextInt();
        switch (selection2){
            case 1:
                //edit title
                break;
            case 2:
                //edit due date
                break;
            case 3:
                //edit details
                break;
            default:System.out.println("Please enter a number between 1 and 7");
               editTask();

        }

    }

    protected void completeTask() {

    }

    protected void viewTasks() {
        System.out.println("Here are your complete tasks: ");
        viewCompletedTasks();
        System.out.println("Here are your incomplete tasks: ");
        viewIncompleteTasks();

    }

    protected void viewCompletedTasks() {
        int index2 = 1;
        for (TaskLists tasklists : completed) {
            System.out.println("Here are your completed tasks: ");
            System.out.println(index2++ + " title: " + tasklists.title + "\n due date: " + tasklists.dueDate + " \n details: "
                    + tasklists.details);

        }

    }
    protected void viewIncompleteTasks() {
        int index = 1;
        for (TaskLists tasklists : list) {
            System.out.println("Here are your incomplete tasks: ");
            System.out.println(index++ + " title: " + tasklists.title + "\n due date: " + tasklists.dueDate + " \n details: "
                    + tasklists.details);
        }

    }

}