package br.org.recreio.server.model;

import javax.persistence.*;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Parent")
public class ParentModel extends ProfileModel {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * @apiNote This is a relationship of {@link StudentModel} with {@link ParentModel}
     * @implNote Relationship of One to Many
     **/
    @OneToMany(targetEntity = StudentModel.class)
    @JoinColumn(name = "id_parent")
    public List<StudentModel> student = new ArrayList<StudentModel>(); // One Parent as Many Dependents

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<StudentModel> getStudent() {
        return this.student;
    }

    public void setStudent(StudentModel student) {
        this.student.add(student);
    }

    public void removeStudent(StudentModel student) {
        this.student.remove(student);
    }

    @Override
    public String toString() {
        return '{' + '\n' +
                '\t' + "Name: " + super.getName() + '\n' +
                '\t' + "E-mail: " + super.getEmail() + '\n' +
                '\t' + "Birthday: " + super.getBirthday() + '\n' +
                '\t' + "Students: " + this.getStudent() + '\n' +
                '}';
    }

}

