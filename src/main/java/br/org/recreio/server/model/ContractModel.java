package br.org.recreio.server.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Contract")
public class ContractModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, unique = true)
    private Long idContract;

    @Column(nullable = false, unique = true)
    private String contractName;

    @Column(nullable = false, unique = true)
    private String contractURL;

    public Long getIdContract() {
        return idContract;
    }

    public void setIdContract(Long idContract) {
        this.idContract = idContract;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractURL() {
        return contractURL;
    }

    public void setContractURL(String contractURL) {
        this.contractURL = contractURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractModel that)) return false;
        return Objects.equals(getIdContract(), that.getIdContract()) && Objects.equals(getContractName(), that.getContractName()) && Objects.equals(getContractURL(), that.getContractURL());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdContract(), getContractName(), getContractURL());
    }

    @Override
    public String toString() {
        return "ID:" + idContract + '\n' +
                "Name:" + contractName + '\n' +
                "URL:" + contractURL;
    }

}
