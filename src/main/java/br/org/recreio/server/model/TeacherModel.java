package br.org.recreio.server.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.io.Serial;

@Entity(name = "teacher")
@DiscriminatorColumn(name = "teacher")
public class TeacherModel extends ProfileModel {

    @Serial
    private static final long serialVersionUID = 1L;

    private Boolean isVoluntary;

    public Boolean getVoluntary() {
        return isVoluntary;
    }

    public void setVoluntary(Boolean voluntary) {
        isVoluntary = voluntary;
    }


    @Override
    public String toString() {
        return "TeacherModel{" +
                "idTeacher=" + super.getPkProfile() +
                ", name=" + super.getName() +
                ", isVoluntary=" + isVoluntary +
                ", birthday" + super.getBirthday() +
                ", email=" + super.getEmail() +
                ", passwd=" + super.getPasswd() +
                '}';
    }

}

