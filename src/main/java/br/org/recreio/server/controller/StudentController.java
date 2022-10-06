package br.org.recreio.server.controller;

import org.br.recreio.server.model.StudentModel;
import org.springframework.web.bind.annotation.*;
import br.org.recreio.server.repository.IStudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

  private IStudentRepository repository;

  @PostMapping("/add")
  public StudentModel postStudent(@RequestBody StudentModel student) {
    return repository.save(student);
  }

  @GetMapping("/list")
  public Iterable<StudentModel> getStudent() {
    return repository.findAll();
  }

}
