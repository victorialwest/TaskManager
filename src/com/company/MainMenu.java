package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu{

    public Scanner input;

    protected void UserPrompt() {

        ArrayList<String> title = new ArrayList<String>();

        System.out.println("This is your task manager. It acts like a to do list for the things you need to complete, " +
                "and you can track the due dates and dates completed.");
        System.out.println( "\n");
        System.out.println("What would you like to do with the Task Manager?" + "\n" );
        System.out.println("1. Create task \n2. Edit task \n3. Complete Task \n4. View all tasks \n5. View completed tasks");
        System.out.println("6. View incomplete tasks \n7. Exit");
        input = new Scanner(System.in);
        int selection = input.nextInt();

        try {
            switch (selection) {
                //pull input into this line

                case 1:
                    //create task
                    TaskLists tasklists = new TaskLists("", 2, "" , 7;

                case 2:
                    //edit task

                case 3:
                    //complete task

                case 4:
                    //view all tasks

                case 5:
                    //view completed tasks

                case 6:
                    //view incomplete tasks

                case 7:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 7");
                    UserPrompt();
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 7.");
            UserPrompt();

        }
    }
}