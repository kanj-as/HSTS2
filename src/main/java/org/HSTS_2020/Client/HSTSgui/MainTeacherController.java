package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.HSTS_2020.App;

import java.io.IOException;

public class MainTeacherController {

    @FXML
    private Button GiveExamButton;

    @FXML
    private Label StudentInvalidLogin;

    @FXML
    private Button CreateExamButton;

    @FXML
    private Button ExitMainTeacher;

    @FXML
    private Button AddQuestionButton;

    @FXML
    void HandleAddQuestion(ActionEvent event) throws IOException {
        App.setRoot("addQuestion");

    }

    @FXML
    void HandleCreateExam(ActionEvent event) throws IOException {
        App.setRoot("createExam");
    }

    @FXML
    void HandleExitMainTeacher(ActionEvent event) throws IOException {
        App.setRoot("loginTeacher");

    }

    @FXML
    void HandleGiveExam(ActionEvent event) throws IOException {
        App.setRoot("giveExam");

    }

}
