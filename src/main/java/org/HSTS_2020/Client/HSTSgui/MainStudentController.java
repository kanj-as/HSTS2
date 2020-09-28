package org.HSTS_2020.Client.HSTSgui;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import org.HSTS_2020.App;

        import java.io.IOException;

public class MainStudentController {

    @FXML
    private Button ViewGradesButton;

    @FXML
    private Label StudentInvalidLogin;

    @FXML
    private Button TakeExamButton;

    @FXML
    private Button ExitMainStudent;

    @FXML
    void HandleExitMainStudent(ActionEvent event) throws IOException {
        App.setRoot("login");
    }

    @FXML
    void HandleTakeExam(ActionEvent event) {

    }

    @FXML
    void HandleViewGrades(ActionEvent event) {

    }

}
