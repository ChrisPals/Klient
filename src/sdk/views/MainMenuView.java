package sdk.views;

import sdk.Controller;

import java.util.Scanner;

/**
 * Created by Christofferpalsgaard on 17/11/2016.
 */
public class MainMenuView {

    private Controller controller;
    public MainMenuView(Controller controller){
        this.controller = controller;
    }


    }

    public void mainMenu() {
        System.out.println("Welcome to Bookit");
        System.out.println("Main Menu");
        System.out.println("Your options are:");
        System.out.println("1) Books");
        System.out.println("2) Curriculums");
    Scanner inputreader = new Scanner(System.in);
        int choice = inputreader.nextInt();

            switch (choice) {


    }

}               }
