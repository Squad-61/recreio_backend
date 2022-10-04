package org.br.recreio.server.repository;

import org.br.recreio.server.model.ParentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParentRepository extends CrudRepository<ParentModel, Long> { }
