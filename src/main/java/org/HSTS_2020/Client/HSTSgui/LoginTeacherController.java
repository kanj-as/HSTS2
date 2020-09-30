package org.HSTS_2020.Client.HSTSgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.HSTS_2020.App;
import org.HSTS_2020.Client.DBConnection;
import org.HSTS_2020.Server.Teacher;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoginTeacherController {

    @FXML
    private TextField InsertTeacherUserName;

    @FXML
    private TextField InsertTeacherPassword;

    @FXML
    private Button TeacherLoginButton;

    @FXML
    private Button TeacherExitButton;

    @FXML
    private Label TeacherInvalidLogin;

    @FXML
    void HandleTeacherExit(ActionEvent event) throws IOException {
        App.setRoot("main");
    }

    @FXML
    void HandleTeacherLogin(ActionEvent event) throws IOException {
        App.setRoot("mainTeacher");
        List<Teacher> teachers = new ArrayList<>();
        try{
            Connection db= DBConnection.getInstance().getConnection();
            Statement statment = db.createStatement();
            //Class for reading from DB



            ResultSet rs=statment.executeQuery("SELECT Teacher_ID,Teacher_Password FROM HSTS.teachers");
            while (rs.next())
            {
                //Student tmp= new Student(rs.getInt("Student_ID"), rs.getString("Student_Name"), rs.getString("Student_Email"), rs.getString("Student_Classroom"), rs.getString("Student_Password"));
                Teacher tmp= new Teacher(rs.getInt("Teacher_ID"), rs.getString("Teacher_Password"));
                teachers.add(tmp);
                rs.next();
            }

            int un= Integer.parseInt(InsertTeacherUserName.getText());
            String pw = InsertTeacherPassword.getText();
            int flag = 0;
            for (Teacher tmp : teachers){
                if (tmp.getTeacher_id() == un){
                    if (pw.equals(tmp.getTeacher_password())){
                        TeacherInvalidLogin.setText("Awesome!");
                        flag = 1;
                        App.setRoot("mainTeacher");
                    } else {
                        TeacherInvalidLogin.setText("Invalid log in!");
                    }
                }
            }
            if (flag == 0) TeacherInvalidLogin.setText("Invalid Username :( !");
        }catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }

}
