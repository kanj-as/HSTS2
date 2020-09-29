package org.HSTS_2020.Server;

public class Teacher {
    int teacher_id;
    String teacher_name , teacher_email , teacher_topic , teacher_password;

    public Teacher(int teacher_id, String teacher_name, String teacher_email, String teacher_topic, String teacher_password) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.teacher_email = teacher_email;
        this.teacher_topic = teacher_topic;
        this.teacher_password = teacher_password;
    }

    public Teacher(int teacher_id, String teacher_password) {
        this.teacher_id = teacher_id;
        this.teacher_password = teacher_password;
    }

    public int getTeacher_id() { return teacher_id; }

    public String getTeacher_password() { return teacher_password; }
}
