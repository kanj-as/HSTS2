package org.HSTS_2020.Client.HSTSgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.HSTS_2020.App;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddQuestionController implements Initializable {

    ObservableList list= FXCollections.observableArrayList();

    @FXML
    private ChoiceBox<String> CourseCBox;

    @FXML
    private TextArea AddQuestion;

    @FXML
    private TextArea AddAnswar;

    @FXML
    private ChoiceBox<String> AnswerCbox;

    @FXML
    private CheckBox answer1;

    @FXML
    private CheckBox Answer_2;

    @FXML
    private CheckBox Answer_3;

    @FXML
    private CheckBox Answer_4;

    @FXML
    private Button QuestionNextButton;

    @FXML
    private Button QuestionPrevButton;

    @FXML
    private TextField QuestionCode;

    @FXML
    private Button SaveQuestion;

    @FXML
    private Button QuestionExit;

    @FXML
    private Button ApplyAnswerChoice;

    @FXML
    void HandleQuestionExit(ActionEvent event) throws IOException {
        App.setRoot("mainTeacher");
    }

    @FXML
    void HandleQuestionNext(ActionEvent event) {
        //App.setRoot("main");
    }

    @FXML
    void HandleQuestionPrev(ActionEvent event) {
        //App.setRoot("main");
    }

    @FXML
    void HandleApplyAnswer(ActionEvent event) {

    }

    @FXML
    void HandleSaveQuestion(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadAnswer();
    }

    @FXML
    private void displayValue(ActionEvent event){

    }

    private void loadAnswer(){
        list.removeAll(list);
        String a="Open Answer";
        String b="Multi Choice";
        list.addAll(a,b);
        AnswerCbox.getItems().addAll(list);
    }

}
