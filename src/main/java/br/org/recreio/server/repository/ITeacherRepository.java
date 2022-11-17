package br.org.recreio.server.repository;

import br.org.recreio.server.model.TeacherModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends CrudRepository<TeacherModel, Long> {
}
