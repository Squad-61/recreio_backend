package org.br.recreio.server.controller;

import org.br.recreio.server.model.StudentModel;
import org.springframework.web.bind.annotation.*;
import org.br.recreio.server.repository.IStudentRepository;

@RestController
@RequestMapping(name = "/student")
public class StudentController {

  private IStudentRepository repository;

  @PutMapping("/v1/save")
  public void putStudent(@RequestBody StudentModel data) { repository.save(data); }
  
  @GetMapping("/v1/find/{id}")
  public void getStudent(@RequestBody StudentModel id) { repository.findById(id.getPkStudent()); }
  
  @DeleteMapping("/v1/{id}")
  public void deleteStudent(@RequestBody StudentModel id) { repository.deleteById(id.getPkStudent()); }
  
//  @PostMapping("/v1/update")
//  public void updateStudent(@RequestBody StudentModel data) { repository.save(data); }
    
}
