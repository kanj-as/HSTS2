package org.HSTS_2020.Client.HSTSgui;

        import com.mysql.cj.x.protobuf.MysqlxDatatypes;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.ListView;
        import org.HSTS_2020.Client.DBConnection;
        import org.HSTS_2020.Server.Question;

        import java.sql.Connection;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;
        import java.util.ArrayList;
        import java.util.List;

public class CreateExamController {

        @FXML
        private ListView<String> QuistionList;

        @FXML
        private Button AddQuestion;

        @FXML
        private ListView<String> ExamQuistions;

        @FXML
        private Button DeleteQuestion;

        @FXML
        private Label TeacherNameLabel;

        @FXML
        private Label TopicLabel;

        @FXML
        private Button CreateNewExam;

        @FXML
        private Button CancelExam;

       @FXML
        public void initialize() {
           List<String> questions = new ArrayList<>();
           try {
               Connection db = DBConnection.getInstance().getConnection();
               Statement statement = db.createStatement();
               //Class for reading from DB
               ResultSet rs = statement.executeQuery("SELECT Question FROM HSTS.questions");
               while (rs.next()) {
                   String tmp = new String(rs.getString("Question"));
                   questions.add(tmp);
                   QuistionList.getItems().add(tmp);
               }
               //QuistionList.getItems().addAll(questions);

           } catch (SQLException throwables) {
               throwables.printStackTrace();
           }
           ExamQuistions.getItems().addAll ("test2","test3");

       }

        @FXML
        void HandleAddQuestion(ActionEvent event) {

        }

        @FXML
        void HandleCreateNewExam(ActionEvent event) {

        }

        @FXML
        void HandleDeleteQuestion(ActionEvent event) {

        }

        @FXML
        void HandleCancelExam(ActionEvent event) {

        }

}
