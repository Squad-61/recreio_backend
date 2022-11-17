package br.org.recreio.server.controller;

import br.org.recreio.server.model.ContractModel;
import br.org.recreio.server.repository.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/contract")
public class ContractController {

    @Autowired
    private IContractRepository repository;

    @PostMapping
    public ContractModel setContract(@Validated @RequestBody ContractModel contractFileData) {
        return repository.save(contractFileData);
    }

    @GetMapping(produces = "application/json", params = {"id"})
    public Object getContract(@Validated @RequestParam Long id) {
        return repository.findById(id);
    }

}
