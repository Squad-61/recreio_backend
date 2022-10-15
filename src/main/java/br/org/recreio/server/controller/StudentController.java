package br.org.recreio.server.controller;

import br.org.recreio.server.model.StudentModel;
import br.org.recreio.server.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/student")
public class StudentController {

    @Autowired
    private IStudentRepository repository;

    /**
     * @apiNote This End-Point saves the data of the 'Student Profile' into the database and returns the data object saved.
     * @implNote This method is a responsible for save data of 'Student Profile' and return of data object from Font-End.
     **/
    @PostMapping(produces = "application/json")
    public StudentModel saveStudent(@Validated @RequestBody StudentModel studentProfileData) {
        return repository.save(studentProfileData);
    }

    /**
     * @apiNote This End-Point asks for the 'Student Profile' in the database and returns the data object.
     * Example http://localhost:3000/v1/api/student?id=1', this URL return data of 'Student Profile' with contains an ID equal to 1.
     * @implNote This method is a responsible for call data of 'Student Profile' and return data object from Front-End.
     */
    @GetMapping(produces = "application/json")
    public Object getStudent(@Validated @RequestParam Long id) {
        return repository.findById(id);
    }

}
