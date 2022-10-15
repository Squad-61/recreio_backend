package br.org.recreio.server.model;

import javax.persistence.*;
import java.io.Serial;

@Entity
@Table(name = "Student")
@DiscriminatorColumn(name = "Student")
public class StudentModel extends ProfileModel {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * @apiNote This is a relationship of {@link  ParentModel} with {@link StudentModel}
     * @implNote Relationship of Many to One
     **/
    @ManyToOne(targetEntity = ParentModel.class)
    @JoinColumn(name = "idParent")
    public ParentModel idParent; // Many Dependents as one Parent

    @Column(name = "RM", nullable = false, unique = true)
    private Integer rm;

    public Integer getRm() {
        return rm;
    }

    public void setRm(Integer rm) {
        this.rm = rm;
    }

    public ParentModel getIdParent() {
        return idParent;
    }

    public void setIdParent(ParentModel idParent) {
        this.idParent = idParent;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + '\n' +
                "E-mail: " + super.getEmail() + '\n' +
                "Birthday: " + super.getBirthday();
    }

}

