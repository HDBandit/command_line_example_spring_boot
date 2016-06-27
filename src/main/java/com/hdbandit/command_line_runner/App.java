package com.hdbandit.command_line_runner;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(App.class, args);
        
        // get any bean from application context you want to process the command
        // context.getBean....
       
        
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        
        while (!finish) {
            System.out.print("Enter your command:");
            String command = scanner.nextLine();
            
            switch (command) {
                case "save":
                    System.out.println("save is executed");
                    // call bean to process save command
                    break;
                case "remove":
                    System.out.println("remove is executed");
                 // call bean to process remove command
                    break;
                case "exit":
                    System.out.print("Bye !!");
                    finish = true;
                    break;
                default:
                    System.out.println(String.format("Not supported option: %s", args[0]));
                
            }
        }
        
    }

}
