package com.company;

import com.company.Controller.CompanyController;
import com.company.Controller.MainController;
import com.company.Repository.CompanyInFileRepo;
import com.company.Repository.CrudRepository;
import com.company.view.RegistrationSystem;

public class Main {

    public static void main(String[] args) throws Exception {
        CrudRepository companyRepo = new CompanyInFileRepo("D:\\University\\Info\\materii\\MAP\\ExamenLab2\\src\\com\\company\\RepoData\\offerten.txt");

        ((CompanyInFileRepo) companyRepo).writeToFile("D:\\University\\Info\\materii\\MAP\\ExamenLab2\\src\\com\\company\\RepoData\\offertensorientiert.txt", CompanyList);

        CompanyController companyController = new CompanyController(companyRepo);
        MainController mainController = new MainController(companyController);

        RegistrationSystem registrationSystem = new RegistrationSystem(mainController);
        registrationSystem.startApplication();
    }
}
