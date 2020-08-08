package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;
    @FXML
    private Label status;

    @FXML
    public void companyLogin(ActionEvent event) throws Exception{
        if (user.getText().equals("user") && pass.getText().equals("pass")) {
            ((Node)event.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));

            primaryStage.setTitle("Contacts");
            primaryStage.setScene(new Scene(root1, 900, 475));
            primaryStage.show();
        }
    }
}

