package asigment52e.tickets.gui.controlers;


import asigment52e.tickets.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public Button OpenEventPbutton;
    public Button OpenEventCPbutton;
    public ImageView OpenPfpP;

    @FXML
    public void handleOpenEventP(ActionEvent event) {
            try {
                // Load the new FXML
                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("EventP.fxml"));
                Parent root = loader.load();

                // Get the current stage
                Stage stage = (Stage) OpenEventPbutton.getScene().getWindow();

                // Set the new scene root
                stage.getScene().setRoot(root);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public void handleOpenEventCP(ActionEvent event) {
        try {
            // Load the new FXML
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("EventCP.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) OpenEventCPbutton.getScene().getWindow();

            // Set the new scene root
            stage.getScene().setRoot(root);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void HandleOpenPfpP(MouseEvent mouseEvent) {
        try {
            // Load the new FXML
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("PfpP.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) OpenPfpP.getScene().getWindow();

            // Set the new scene root
            stage.getScene().setRoot(root);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}