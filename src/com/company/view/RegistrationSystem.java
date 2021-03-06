package com.company.view;



import com.company.Controller.MainController;
import com.company.domain.Company;

import java.util.Scanner;

public class RegistrationSystem {

    private MainController mainController;

    public RegistrationSystem(MainController mainController) {
        this.mainController = mainController;
    }

    public void startApplication() throws Exception {
        this.showMenu();
        this.startConsole();
    }

    /**
     * print the menu
     */

    private void showMenu(){
        StringBuilder builder = new StringBuilder();
        builder.append("Welcome to the Company's Application\n")
                .append("Press: 1 for get sorted company by price\n")
                .append("Press: 2 for getting top city\n")
                .append("Press: 0 to exit application\n")
                .append("Your choice: ");
        System.out.println(builder.toString());
    }

    /**
     * run the methode of each case
     */
    private void startConsole() throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String opt = scanner.nextLine();

            switch (opt) {

                case "1":
                    Iterable<Company> getSortedCompanyList = this.mainController.getSortedCompany();
                    System.out.println("all the a company filtered by price: " + getSortedCompanyList + "\n");
                    break;

                case "2":
                    String getTopCity = this.mainController.getTopPlace();
                    System.out.println("Top city: " + getTopCity + "\n");
                    break;

                case "0":
                    System.out.println("Good-Bye!!");
                    return;
            }
            this.showMenu();
        }
    }

}
