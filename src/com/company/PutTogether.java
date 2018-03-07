package com.company;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


public class PutTogether {

    protected ArrayList<TaskLists> list = new ArrayList<>();
    protected final ArrayList<TaskLists> completed = new ArrayList<>();
    public Scanner input2;
    private TaskLists tasklists = new TaskLists();

    protected void CreateTask() {

        TaskLists tasklists = new TaskLists();
        list.add(tasklists);
    }

    protected void editTask() {
        System.out.println("Do you want to edit the \n 1. Title \n 2. Due Date \n 3. Details");
        input2 = new Scanner(System.in);
        int edit_selection = input2.nextInt();
        input2.nextLine();
        switch (edit_selection){
            case 1:
                System.out.println("Enter a new title:");
                String new_title = input2.nextLine();
                System.out.println(new_title);
                list.set(new_title);
                // How do I set the title from this case?
                break;
            case 2:
                System.out.println("Enter a new due date:");
                String new_date = input2.nextLine();
                System.out.println(new_date);
                list.set(new_date);
                break;
            case 3:
                //edit details
                System.out.println("Enter new details:");
                String new_details = input2.nextLine();
                System.out.println(new_details);
                list.set(new_details);
                break;
            default:System.out.println("Please enter a number between 1 and 7");
               editTask();
//                list.set(input3);
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