package ss08_mvc_clean_code.service;

import ss08_mvc_clean_code.model.Student;
import ss08_mvc_clean_code.repository.StudentRepository;
import ss08_mvc_clean_code.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
    private StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}
