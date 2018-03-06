package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu{

    public Scanner input;

    private PutTogether puttogether = new PutTogether();
    protected void userPrompt() {


        System.out.println("This is your task manager. It functions like a to do list for the things you need to complete, " +
                "and you can track the due dates and dates completed.");
        System.out.println( "\n");
        System.out.println("What would you like to do with the Task Manager?" + "\n" );
        System.out.println("1. Create task \n2. Edit task \n3. Complete Task \n4. View all tasks \n5. View completed tasks");
        System.out.println("6. View incomplete tasks \n7. Exit");
        //add a delete task?
        input = new Scanner(System.in);
        int selection = input.nextInt();
        try {
            switch (selection) {
                case 1:
                    //create task
                    puttogether.CreateTask();
                    userPrompt();
                    break;
                case 2:
                    //edit task
                    puttogether.editTask();
                    System.out.println("What item do you want to edit? Enter the number of the item");

                    //user input +1 to correct formatting
                    //ask user what they wanted to change
                    //code to change that item on the list to what the user inputted
                    userPrompt();
                    break;
                case 3:
                    //complete task
                    //moves task entered into completedtasks

                    break;
                case 4:
                    //view all tasks
                    puttogether.viewTasks();
                    userPrompt();
                    break;
                case 5:
                    //view completed tasks
                    puttogether.viewCompletedTasks();
                    userPrompt();
                    break;
                case 6:
                    //view incomplete tasks
                    puttogether.viewIncompleteTasks();
                    userPrompt();
                    break;
                case 7:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 7");
                    userPrompt();
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 7.");
            userPrompt();

        }
    }
}