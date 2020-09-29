package org.HSTS_2020.Client.HSTSgui;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.CheckBox;
        import javafx.scene.control.TextArea;
        import javafx.scene.control.TextField;
        import org.HSTS_2020.App;

        import java.io.IOException;

public class AddQuestionController {

    @FXML
    private TextArea AddQuestion;

    @FXML
    private TextArea AddAnswar;

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

}
