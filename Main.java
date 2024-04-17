import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.User;
import view.StudentView;
import view.StudyGroupView;

public class Main {
    public static void main(String[] args) {
        User student1 = new Student("Петров Максим", 19, 124);
        User student2 = new Student("Легкова Марина", 21, 125);
        User student3 = new Student("Пряничникова Маша", 20, 126);
        User student4 = new Student("Матвеев Иван", 19, 123);
        User student5 = new Student("Иванов Алексей", 19, 235);
        User student6 = new Student("Петрова Екатерина", 20, 236);
        User student7 = new Student("Смирнов Дмитрий", 21, 237);
        User student8 = new Student("Полякова Ольга", 18, 238);
        User student9 = new Student("Васильев Андрей", 22, 239);
        User student10 = new Student("Николаева Анна", 20, 389);
        User student11 = new Student("Лебедев Артем", 19, 390);
        User student12 = new Student("Морозова Мария", 21, 391);
        User student13 = new Student("Соколов Павел", 18, 392);
        User student14 = new Student("Жукова Анастасия", 20, 393);
        User student15 = new Student("Ветров Сергей", 22, 394);
        
        StudentView studentView1 = new StudentView();
        studentView1.userList(student1);
        studentView1.userList(student2);
        studentView1.userList(student3);
        studentView1.userList(student4);

        StudentView studentView2 = new StudentView();
        studentView2.userList(student5);
        studentView2.userList(student6);
        studentView2.userList(student7);
        studentView2.userList(student8);
        studentView2.userList(student9);

        StudentView studentView3 = new StudentView();
        studentView3.userList(student10);
        studentView3.userList(student11);
        studentView3.userList(student12);
        studentView3.userList(student13);
        studentView3.userList(student14);
        studentView3.userList(student15);
        System.out.println("----------------------------------------------------------");

        // 3 строчки ниже закомментированы, т.к. на печать выводится огромное кол-во текста
        // System.out.println(studentView1.getUserList()); 
        // System.out.println(studentView2.getUserList());
        // System.out.println(studentView3.getUserList());

        Teacher teacher1 = new Teacher("Григорьев Г.Г.", 54, "Матемитика");
        Teacher teacher2 = new Teacher("Замятин Ф.М.", 48, "Информатика");
        Teacher teacher3 = new Teacher("Свиридова Н.В.", 52, "Программирование");

        StudyGroupView view = new StudyGroupView();

        /*
         * Ниже я столкнулась с таким предупреждением - The method createStudyGroup(Teacher, List<Student>) 
         * in the type StudyGroupView is not applicable for the arguments (Teacher, StudentView) - и решила сделать 
         * приведение типов через (List<Student>) (List<?>). Можно ли так делать? Я почитала про предупреждение о 
         * безопасности типов в Java, и что можно проигнорировать это предупреждени, если уверены, что все объекты 
         * в списке действительно являются экземплярами Student (у нас такая проверка есть в классе DataService).
         * Или нужно было создать новый Service, и с самого начала работать со студентами как Student, а не как User?
         * Но тогда бы поломался весь изначальный смысл задачи... 
         */
        StudyGroup group1 = view.createStudyGroup(teacher1, (List<Student>) (List<?>) studentView1.getUserList());
        StudyGroup group2 = view.createStudyGroup(teacher2, (List<Student>) (List<?>) studentView2.getUserList());
        StudyGroup group3 = view.createStudyGroup(teacher3, (List<Student>) (List<?>) studentView3.getUserList());

        view.addGroup(teacher1.getName(), group1);
        view.addGroup(teacher2.getName(), group2);
        view.addGroup(teacher3.getName(), group3);
        System.out.println("----------------------------------------------------------");

        StudyGroup targetGroup1 = view.getGroupByTeacher(teacher1.getName());
        System.out.println(targetGroup1);
        System.out.println("----------------------------------------------------------");

        StudyGroup targetGroup2 = view.getGroupByTeacher(teacher2.getName());
        System.out.println(targetGroup2);
        System.out.println("----------------------------------------------------------");

        StudyGroup targetGroup3 = view.getGroupByTeacher(teacher3.getName());        
        System.out.println(targetGroup3);
        System.out.println("----------------------------------------------------------");
    
    }
}
