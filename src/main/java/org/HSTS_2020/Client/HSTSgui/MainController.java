package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.HSTS_2020.App;

import java.io.IOException;

public class MainController {

    @FXML
    private Button TeacherMain;

    @FXML
    private Button StudentMain;

    @FXML
    void HandleStudentMain(ActionEvent event) throws IOException {
        App.setRoot("login");
    }

    @FXML
    void HandleTeacherMain(ActionEvent event) throws IOException {
        App.setRoot("loginTeacher");
    }

}

