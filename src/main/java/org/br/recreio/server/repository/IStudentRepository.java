package org.br.recreio.server.repository;

import org.br.recreio.server.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<StudentModel, Long> {
}
