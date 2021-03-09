package ie.gmit;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public Student findStudent(String name) {
        for(int i = 0; i <= studentArrayList.size()-1; i++)
        {
            if(studentArrayList.get(i).getName() == name) {
                return studentArrayList.get(i);
            }
        }
        throw new IllegalArgumentException("No Student found with name provided");
    }

    public int studentArrayListSize() {
        return studentArrayList.size();
    }
}
