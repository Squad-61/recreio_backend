package br.org.recreio.server.controller;

import br.org.recreio.server.model.ProfileModel;
import br.org.recreio.server.repository.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @apiNote
 * This class/controller is answerable to interpret HTTP requisitions of Profile entity.
 * @deprecated
 * This class/controller is deprecated, and the operation of saving, creating, deleting, and updating profiles is
 * separated in other classes/controllers, and this data is saved in separate entities.
 */
@Deprecated
@RestController
@RequestMapping("/profile")
public class ProfileController {

  @Autowired
  private IProfileRepository repository;

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public <Profile extends ProfileModel> Profile setProfile(@Validated @RequestBody Profile profileData) {
    return repository.save(profileData);
  }
  
  @GetMapping(path = "/{id}")
  @ResponseStatus(code = HttpStatus.OK)
  public Optional<ProfileModel> getProfile(@PathVariable Long id) {
    return repository.findById(id);
  }
  
}
