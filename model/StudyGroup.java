package model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }

    public StudyGroup(){
        
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    // public void setStudentsList(List<Student> students) {
    //     this.students = students;
    // }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Предмет - ").append(teacher).append("\n");
        sb.append("Студенты:\n");
        for (User student : students) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}
