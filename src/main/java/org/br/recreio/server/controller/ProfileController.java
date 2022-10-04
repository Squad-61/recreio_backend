package org.br.recreio.server.controller;

import org.br.recreio.server.model.ProfileModel;
import org.springframework.web.bind.annotation.*;
import org.br.recreio.server.repository.IProfileRepository;

@RestController
@RequestMapping("/profile")
public class ProfileController {

  private IProfileRepository repository;

  @PostMapping("/add")
  public ProfileModel postProfile(@RequestBody ProfileModel profile) {
    return repository.save(profile);
  }

  @GetMapping("/list")
  public Iterable<ProfileModel> getProfile() {
    return repository.findAll();
  }

}
