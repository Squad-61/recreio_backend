package br.org.recreio.server.controller;

import org.br.recreio.server.model.ParentModel;
import org.springframework.web.bind.annotation.*;
import br.org.recreio.server.repository.IParentRepository;

@RestController
@RequestMapping("/parent")
public class ParentController {

  private IParentRepository repository;

  @PostMapping("/add")
  public ParentModel putPArent(@RequestBody ParentModel parent) {
    return repository.save(parent);
  };

  @GetMapping("/list")
  public Iterable<ParentModel> getParent() {
    return repository.findAll();
  }

}