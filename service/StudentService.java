package ru.hogwarts.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositories.StudentRepository;

@Service
public class StudentService {

//    private final HashMap<Long, Student> students = new HashMap<>();
//    private long lastID = 0;

    @Autowired
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

/*        student.setId(lastID++);
        students.put(student.getId(), student);
        return student;
*/

    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

//        return students.get(id);

    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }



/*        if (!students.containsKey(student.getId())) {
            return null;
        }
        students.put(student.getId(), student);
        return student;
    }
*/

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
//        return students.remove(id);
    }
}

/*    public Collection<Student> findByAge(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getAge() == age) {
                result.add(student);
            }
        }
        return result;
    }
*/
