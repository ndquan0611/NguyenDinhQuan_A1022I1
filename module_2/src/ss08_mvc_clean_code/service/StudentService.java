package ss08_mvc_clean_code.service;

import ss08_mvc_clean_code.model.Student;

public interface StudentService {
    Student[] findAll();

    void addStudent(Student student);
}
