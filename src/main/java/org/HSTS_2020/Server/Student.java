package org.HSTS_2020.Server;

public class Student {
    int student_id;
    String student_name , student_email , student_classroom , student_password;

    public Student(int student_id, String student_name, String student_email, String student_classroom, String student_password) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_email = student_email;
        this.student_classroom = student_classroom;
        this.student_password = student_password;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public String getStudent_classroom() {
        return student_classroom;
    }

    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public void setStudent_classroom(String student_classroom) {
        this.student_classroom = student_classroom;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }
}
