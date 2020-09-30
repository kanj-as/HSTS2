package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.HSTS_2020.App;

import java.io.IOException;

public class GiveExamController {

    @FXML
    private Label StudentInvalidLogin;

    @FXML
    private Button ExitGiveExamTeacher;

    @FXML
    private ChoiceBox<?> ExamCode;

    @FXML
    private Button SendExamCode;

    @FXML
    void HandleGiveExam(ActionEvent event) throws IOException {
        App.setRoot("mainTeacher");

    }

}
