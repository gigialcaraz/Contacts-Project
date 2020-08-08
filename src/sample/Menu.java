package sample;

import javafx.event.ActionEvent;

public class Menu {

    FillClient newClient = new FillClient();
    CompanyLogin worker = new CompanyLogin();


    public void firstMenu(ActionEvent event) {
        newClient.firstMenu();

    }
    public void companyLogin(ActionEvent event) {
        worker.companyLogin(event);
    }


}
