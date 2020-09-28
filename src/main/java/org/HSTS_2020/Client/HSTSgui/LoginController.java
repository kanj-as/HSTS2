package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.HSTS_2020.App;
import org.HSTS_2020.DBConnection;
import org.HSTS_2020.Server.Student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoginController {

    @FXML
    private TextField InsertStudentUserName;

    @FXML
    private TextField InsertStudentPassword;

    @FXML
    private Button StudentLoginButton;

    @FXML
    private Button StudentExitButton;

    @FXML
    private Label StudentInvalidLogin;

    @FXML
    void HandleStudentExit(ActionEvent event) throws IOException {
        App.setRoot("main");
    }

    @FXML
    void HandleStudentLogin(ActionEvent event) {
        //MAKE json
        //SEND REQUEST TO SERVER
        List<Student> students = new ArrayList<>();
        try{
            Connection db= DBConnection.getInstance().getConnection();
            Statement statment = db.createStatement();
            //Class for reading from DB
            ResultSet rs=statment.executeQuery("select * from HSTS.students");
            while (rs.next())
            {
                Student tmp= new Student(rs.getInt("Student_ID"), rs.getString("Student_Name"), rs.getString("Student_Email"), rs.getString("Student_Classroom"), rs.getString("Student_Password"));
                students.add(tmp);
                rs.next();
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();

        }

    }

}
