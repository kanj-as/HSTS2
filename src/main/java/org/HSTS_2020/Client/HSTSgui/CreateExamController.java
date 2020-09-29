package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextArea;
        import javafx.scene.paint.Color;
        import javafx.scene.text.Font;
import org.HSTS_2020.App;

import java.io.IOException;

public class CreateExamController {

        @FXML
        private Font x1;

        @FXML
        private Color x2;

        @FXML
        private Button ExamNext;

        @FXML
        private Button ExamPrev;

        @FXML
        private Label TeacherNameLabel;

        @FXML
        private Label ExamCodeLabel;

        @FXML
        private TextArea ExamQuestion;

        @FXML
        private TextArea ExamQuestionAnswer;

        @FXML
        private TextArea ExamQuestionRemark;

        @FXML
        private Button ExamExit;

        @FXML
        private Button ExamSave;

        @FXML
        private Font x3;

        @FXML
        private Color x4;

        @FXML
        void HandleExamExit(ActionEvent event) throws IOException {
            App.setRoot("mainTeacher");
        }

        @FXML
        void HandleExamNext(ActionEvent event) {

        }

        @FXML
        void HandleExamPrev(ActionEvent event) {

        }

        @FXML
        void HandleExamSave(ActionEvent event) {

        }

    }
