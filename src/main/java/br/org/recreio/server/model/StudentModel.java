package br.org.recreio.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Entity
@Table(name = "Student")
public class StudentModel extends ProfileModel {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "RM", nullable = false, unique = true)
    private Integer rm;

    public Integer getRm() {
        return rm;
    }

    public void setRm(Integer rm) {
        this.rm = rm;
    }

    @Override
    public String toString() {
        return "{" + '\n' +
                '\t' + "Name: " + super.getName() + '\n' +
                '\t' + "E-mail: " + super.getEmail() + '\n' +
                '\t' + "Birthday: " + super.getBirthday() + '\n' +
                "}";
    }

}

