package org.br.recreio.server.controller;

import org.br.recreio.server.model.ProfileModel;
import org.br.recreio.server.repository.IProfileRepository;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/profile")
public class ProfileController {

  private IProfileRepository repository;

  @PutMapping("/v1/save")
  public void putProfile(@RequestBody ProfileModel data) { repository.save(data); }
  
  @GetMapping("/v1/find/{id}")
  public void getProfile(@PathVariable ProfileModel id) { repository.findById(id.getPkClient()); }
  
  @DeleteMapping("/v1/delete/{id}")
  public void deleteProfile(@RequestBody ProfileModel id) { repository.deleteById(id.getPkClient()); } 
  
//  @PostMapping
//  public void updateProfile(@RequestBody ProfileModel data) { repository.save(data); }
  
}
