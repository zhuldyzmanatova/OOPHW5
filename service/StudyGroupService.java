package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupService {   

    private Map<String, StudyGroup> studyGroups;
    
    public StudyGroupService(){
        this.studyGroups = new HashMap<>();
    }   
    
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }

    public void addGroup(String teacherName, StudyGroup group) {
        studyGroups.put(teacherName, group);
    }

    public StudyGroup getGroupByTeacher(String teacherName) {
        return studyGroups.get(teacherName);
    }
}
