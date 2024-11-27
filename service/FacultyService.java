package ru.hogwarts.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repositories.FacultyRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

@Service
public class FacultyService {

    //   private final HashMap<Long, Faculty> faculties = new HashMap<>();
    //   private long count = 0;

    @Autowired
    private FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }


/*        faculty.setId(count++);
        faculties.put(faculty.getId(), faculty);
        return faculty;
*/

    public Faculty findFaculty(long id) {
        return facultyRepository.getById(id);
    }


//        return faculties.get(id);


    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }


/*        if (!faculties.containsKey(faculty.getId())) {
            return null;
        }
        faculties.put(faculty.getId(), faculty);
        return faculty;
*/

    public void deleteFaculty(long id) {
        facultyRepository.deleteById(id);
//        return faculties.remove(id);
    }
}

/*    public Collection<Faculty> findByColor(String color) {
        ArrayList<Faculty> result = new ArrayList<>();
        for (Faculty faculty : faculties.values()) {
            if (Objects.equals(faculty.getColor(), color)) {
                result.add(faculty);
            }
        }
        return result;
    }
*/