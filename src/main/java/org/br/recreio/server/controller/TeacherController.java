package org.br.recreio.server.controller;

import org.br.recreio.server.model.TeacherModel;
import org.springframework.web.bind.annotation.*;
import org.br.recreio.server.repository.ITeacherRepository;

@RestController
@RequestMapping(name = "/teacher")
public class TeacherController {

  private ITeacherRepository repository;

  @PutMapping("/v1/save")
  public void putTeacher(@RequestBody TeacherModel data) { repository.save(data); }
  
  @GetMapping("/v1/find/{id}")
  public void getTeacher(@RequestBody TeacherModel id) { repository.findById(id.getPkTeacher()); }
  
  @DeleteMapping("/v1/delete/{id}")
  public void deleteTeacher(@RequestBody TeacherModel id) { repository.deleteById(id.getPkTeacher()); }
  
//  @PostMapping("/v1/update")
//  public void updateTeacher(@RequestBody TeacherModel data) { repository.save(data); }
  
}
