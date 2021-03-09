package ie.gmit;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public int studentArrayListSize() {
        return studentArrayList.size();
    }
}
