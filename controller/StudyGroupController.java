package controller;

import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

public class StudyGroupController {
    private StudyGroupService studyGroupService = new StudyGroupService();

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public void addGroup(String teacherName, StudyGroup group) {
        studyGroupService.addGroup(teacherName, group);
    }

    public StudyGroup getGroupByTeacher(String teacherName) {
        return studyGroupService.getGroupByTeacher(teacherName);
    }
}
