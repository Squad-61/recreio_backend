package br.org.recreio.server.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.io.Serial;

@Entity(name = "student")
@DiscriminatorColumn(name = "student")
public class StudentModel extends ProfileModel {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer codRm;

    public Integer getCodRm() {
        return codRm;
    }

    public void setCodRm(Integer codRm) {
        this.codRm = codRm;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "idStudent=" + super.getPkProfile() +
                ", name=" + super.getName() +
                ", codRm=" + codRm +
                ", birthday" + super.getBirthday() +
                ", email=" + super.getEmail() +
                ", passwd=" + super.getPasswd() +
                '}';
    }

}

