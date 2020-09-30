package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.HSTS_2020.App;

import java.io.IOException;


public class StudentGradesController {


    @FXML
    private Button ExitStudentGrades;

    public StudentGradesController() {
    }

    @FXML
    void HandleExitStudentGrades(ActionEvent event) throws IOException {
        App.setRoot("mainStudent");

    }

}

