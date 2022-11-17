package br.org.recreio.server.controller;

import br.org.recreio.server.model.ParentModel;
import br.org.recreio.server.repository.IParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/api/parent")
public class ParentController {

    @Autowired
    private IParentRepository repository;

    /**
     * @apiNote This End-Point saves the data of the 'Parent Profile' into the database and returns the data object saved.
     * @implNote This method is a responsible for save data of 'Parent Profile' and return of data object from Font-End.
     **/
    @PostMapping(produces = "application/json")
    public ParentModel saveParent(@Validated @RequestBody ParentModel parentProfileData) {
        return repository.save(parentProfileData);
    }

    /**
     * @apiNote This End-Point asks for the 'Parent Profile' in the database and returns the data object.
     * Example 'http://localhost:3000/v1/api/parent?id=1', this URL return data of 'Parent Profile' with contains an ID equal to 1.
     * @implNote This method is a responsible for call data of 'Parent Profile' and return data object from Front-End.
     */
    @GetMapping(produces = "application/json")
    public Optional<ParentModel> getParent(@Validated @RequestParam Long id) {
        return repository.findById(id);
    }

}
