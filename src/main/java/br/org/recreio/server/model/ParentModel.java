package br.org.recreio.server.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.io.Serial;

@Entity(name = "parent")
@DiscriminatorColumn(name = "parent")
public class ParentModel extends ProfileModel {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer cpf;

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ParentModel{" +
                "idParent=" + super.getPkProfile() +
                ", name=" + super.getName() +
                ", cpf=" + cpf +
                ", birthday" + super.getBirthday() +
                ", email=" + super.getEmail() +
                ", passwd=" + super.getPasswd() +
                '}';
    }

}

