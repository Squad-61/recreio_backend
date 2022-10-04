package org.br.recreio.server.repository;

import org.br.recreio.server.model.ProfileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@EnableJpaRepositories
public interface IProfileRepository extends CrudRepository<ProfileModel, Long> { }
