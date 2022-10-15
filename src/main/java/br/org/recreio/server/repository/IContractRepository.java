package br.org.recreio.server.repository;

import br.org.recreio.server.model.ContractModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends CrudRepository<ContractModel, Long> {
}
