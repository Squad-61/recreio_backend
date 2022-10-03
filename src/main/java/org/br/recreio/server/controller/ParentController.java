package org.br.recreio.server.controller;

import org.br.recreio.server.model.ParentModel;
import org.br.recreio.server.repository.IParentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping(name = "/parent")
public class ParentController {
  
  private IParentRepository repository;


  @PutMapping("/v1/save")
  public void putParent(@RequestBody ParentModel data) { repository.save(data); }

  @GetMapping("/v1/{id}")
  public void getParent(@PathVariable ParentModel id) { repository.findById(id.getPkParent()); }

  @DeleteMapping("/v1/delete/{id}")
  public void deleteParent(@RequestBody ParentModel id) { repository.deleteById(id.getPkParent()); }

//  @PostMapping("/v1/update")
//  public void updateParent(@RequestBody ParentModel data) { repository.save(data); }
  
}
