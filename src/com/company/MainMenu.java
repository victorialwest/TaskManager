package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu{

    public Scanner input;

    private PutTogether puttogether = new PutTogether();
    protected void UserPrompt() {


        System.out.println("This is your task manager. It functions like a to do list for the things you need to complete, " +
                "and you can track the due dates and dates completed.");
        System.out.println( "\n");
        System.out.println("What would you like to do with the Task Manager?" + "\n" );
        System.out.println("1. Create task \n2. Edit task \n3. Complete Task \n4. View all tasks \n5. View completed tasks");
        System.out.println("6. View incomplete tasks \n7. Exit");
        input = new Scanner(System.in);
        int selection = input.nextInt();
        try {
            switch (selection) {
                case 1:
                    //create task
                    puttogether.CreateTask();
                    break;
                case 2:
                    //edit task
                    break;
                case 3:
                    //complete task
                    break;
                case 4:
                    //view all tasks
                    break;
                case 5:
                    //view completed tasks
                    break;
                case 6:
                    //view incomplete tasks
                    break;
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