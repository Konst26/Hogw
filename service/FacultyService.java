package ru.hogwarts.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repositories.FacultyRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }


    public void deleteFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public List<Faculty> facultyColor (String color) {
        return facultyRepository.findAll().stream().filter(faculty -> faculty.getColor().equals(color)).collect(Collectors.toList());
    }

    public Faculty findByNameIgnoreCaseAndColorIgnoreCase (String name, String color) {
        return facultyRepository.findByNameIgnoreCaseAndColorIgnoreCase (name, color);
        }
}