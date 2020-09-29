package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.HSTS_2020.App;

import java.io.IOException;

public class LoginTeacherController {

    @FXML
    private TextField InsertTeacherUserName;

    @FXML
    private TextField InsertTeacherPassword;

    @FXML
    private Button TeacherLoginButton;

    @FXML
    private Button TeacherExitButton;

    @FXML
    private Label TeacherInvalidLogin;

    @FXML
    void HandleTeacherExit(ActionEvent event) throws IOException {
        App.setRoot("main");
    }

    @FXML
    void HandleTeacherLogin(ActionEvent event) throws IOException {
        App.setRoot("mainTeacher");

    }

}
