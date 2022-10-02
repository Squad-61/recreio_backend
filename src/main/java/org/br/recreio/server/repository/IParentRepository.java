package org.br.recreio.server.repository;

import org.br.recreio.server.model.Parent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IParentRepository extends CrudRepository<Parent, UUID> { }