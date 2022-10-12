package br.org.recreio.server.repository;

import br.org.recreio.server.model.ProfileModel;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface IProfileRepository extends CrudRepository<ProfileModel, Long> { }
