package com.company;

import java.util.Scanner;

public class MainMenu {

    private Scanner input;

    protected void UserPrompt() {

        System.out.println("What would you like to do with the Task Manager?");
        System.out.println("1. Create task \n2. Edit task \n3. Complete Task \n4. View all tasks \n5. View completed tasks" );
        System.out.println("6. View incomplete tasks \n7. Exit");
        input = new Scanner(System.in);
        int selection = input.nextInt();
    }

}
