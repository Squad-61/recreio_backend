package br.org.recreio.server.controller;

import br.org.recreio.server.model.TeacherModel;
import br.org.recreio.server.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/v1/api/teacher")
public class TeacherController {

    @Autowired
    private ITeacherRepository repository;

    /**
     * @apiNote This End-Point saves the data of the 'Teacher Profile' into the database and returns the data object saved.
     * @implNote This method is a responsible for save data of 'Teacher Profile' and return of data object from Font-End.
     **/
    @PostMapping(produces = "application/json")
    public TeacherModel saveTeacher(@Validated @RequestBody TeacherModel studentProfileData) {
        return repository.save(studentProfileData);
    }

    /**
     * @apiNote This End-Point asks for the 'Teacher Profile' in the database and returns the data object.
     * Example 'http://localhost:3000/v1/api/teacher?id=1', this URL return data of 'Teacher Profile' with contains an ID equal to 1.
     * @implNote This method is a responsible for call data of 'Teacher Profile' and return data object from Front-End.
     */
    @GetMapping(produces = "application/json", params = {"id"})
    public Object getTeacher(@Validated @RequestParam Long id) {
        return repository.findById(id);
    }

}
