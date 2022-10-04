package org.br.recreio.server.controller;

import org.br.recreio.server.model.TeacherModel;
import org.springframework.web.bind.annotation.*;
import org.br.recreio.server.repository.ITeacherRepository;

@RestController
@RequestMapping(name = "/teacher")
public class TeacherController {

  private ITeacherRepository repository;

  @PostMapping("/add")
  public TeacherModel postTeacher(@RequestBody TeacherModel teacher) {
    return repository.save(teacher);
  }

  @GetMapping("/list")
  public Iterable<TeacherModel> getTeacher() {
    return repository.findAll();
  }

}
