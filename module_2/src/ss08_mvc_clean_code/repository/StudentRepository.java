package ss08_mvc_clean_code.repository;

import ss08_mvc_clean_code.model.Student;

public interface StudentRepository {
    Student[] findAll();

    void addStudent(Student student);
}
