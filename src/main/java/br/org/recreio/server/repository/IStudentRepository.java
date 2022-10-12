package br.org.recreio.server.repository;

import br.org.recreio.server.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<StudentModel, Long> {
}
