package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.HSTS_2020.App;
import org.HSTS_2020.Client.DBConnection;
import org.HSTS_2020.Server.Student;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LoginController {


    @FXML
    private ImageView loginStudentImageView;

    @FXML
    private TextField InsertStudentUserName;

    @FXML
    private PasswordField InsertStudentPassword;

    @FXML
    private Button StudentLoginButton;

    @FXML
    private Button StudentExitButton;

    public void exitStudentOnAction(ActionEvent event){
        Stage stage = (Stage) StudentExitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private Label StudentInvalidLogin;
/**
    @Override
    public void  initialize(URL url, ResourceBundle resourceBundle){
        File loginStudentFile = new File("@loginStudent.jpg");
        Image loginStudentImage = new Image(loginStudentFile.toURI().toString());
        loginStudentImageView.setImage(loginStudentImage);
    }
**/
    public void loginButtonOnAction() throws SQLException {

        if (InsertStudentUserName.getText().isBlank() == false && InsertStudentPassword.getText().isBlank() == false) {
        //    validateLogin();
        } else {
            StudentInvalidLogin.setText("Please enter username and password");
        }
    }

    @FXML
    void HandleStudentExit(ActionEvent event) throws IOException {
        App.setRoot("main");

    }

    @FXML
    void HandleStudentLogin(ActionEvent event) throws IOException {
        //MAKE json
        //SEND REQUEST TO SERVER
        List<Student> students = new ArrayList<>();
        try{
            Connection db= DBConnection.getInstance().getConnection();
            Statement statment = db.createStatement();
            //Class for reading from DB
            ResultSet rs=statment.executeQuery("SELECT Student_ID,Student_Password FROM HSTS.students");
            while (rs.next())
            {
                //Student tmp= new Student(rs.getInt("Student_ID"), rs.getString("Student_Name"), rs.getString("Student_Email"), rs.getString("Student_Classroom"), rs.getString("Student_Password"));
                Student tmp= new Student(rs.getInt("Student_ID"), rs.getString("Student_Password"));
                students.add(tmp);
                rs.next();
            }

            int un= Integer.parseInt(InsertStudentUserName.getText());
            String pw = InsertStudentPassword.getText();
            int flag = 0;
            for (Student tmp : students){
                if (tmp.getStudent_id() == un){
                    if (pw.equals(tmp.getStudent_password())){
                            StudentInvalidLogin.setText("Awesome!");
                            flag = 1;
                            App.setRoot("mainStudent");
                        } else {
                            StudentInvalidLogin.setText("Invalid log in!");
                        }
                    }
                }
            if (flag == 0) StudentInvalidLogin.setText("Invalid Username :( !");
        }catch (SQLException throwables) {
            throwables.printStackTrace();

        }

    }
    /**
    public void validateLogin() throws SQLException {
        //List<Student> students = new ArrayList<>();
        try{
            Connection db= DBConnection.getInstance().getConnection();
            Statement statment = db.createStatement();
            //Class for reading from DB
            ResultSet rs=statment.executeQuery("SELECT count(1) FROM HSTS.students WHERE Student_ID = '" + InsertStudentUserName.getText() + "' AND Password = '" + InsertStudentPassword.getText() + "'");
            while (rs.next())
            {
                if (rs.getInt(1) == 1){
                    StudentInvalidLogin.setText("Awesome!");
                } else {
                    StudentInvalidLogin.setText("Invalid log in!");
                }
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();

        }






        //DBConnection connectNow = new DBConnection();
        Connection connectDB = DBConnection.getInstance().getConnection();

        String verifyLogin = "SELECT count(1) FROM HSTS.students WHERE Student_ID = '" + InsertStudentUserName.getText() + "' AND Password = '" + InsertStudentPassword.getText() + "'";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()){
                if (queryResult.getInt(1) == 1){
                    StudentInvalidLogin.setText("Awesome!");
                } else {
                    StudentInvalidLogin.setText("Invalid log in!");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }


    }
     **/
}
