package br.org.recreio.server.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Entity
@Table(name = "Teacher")
@DiscriminatorColumn(name = "Teacher")
public class TeacherModel extends ProfileModel {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private Boolean isVoluntary;

    public Boolean getVoluntary() {
        return isVoluntary;
    }

    public void setVoluntary(Boolean voluntary) {
        isVoluntary = voluntary;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + '\n' +
                "E-mail: " + super.getEmail() + '\n' +
                "BirthDay: " + super.getBirthday();
    }

}

