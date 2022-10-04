package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity(name = "parent")
public class ParentModel extends ProfileModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pkParent", nullable = false)
  private Long pkParent;

  @ManyToOne(cascade = {CascadeType.PERSIST})
  @JoinColumn(name = "pkStudent", table = "student")
  private List<StudentModel> student;

  @OneToOne(cascade = {CascadeType.PERSIST})
  @JoinColumn(name = "pkProfile", table = "profile")
  private ProfileModel profile;

  public Long getIdParent() {
    return pkParent;
  }

  public void setIdParent(Long pkParent) {
    this.pkParent = pkParent;
  }

  public ProfileModel getProfile() { return this.profile; }

  public void setProfile(ProfileModel profile) { this.profile = profile; }

  public Long getPkParent() {
    return pkParent;
  }

  public void setPkParent(Long pkParent) {
    this.pkParent = pkParent;
  }

  public List<StudentModel> getStudent() {
    return student;
  }

  public void setStudent(List<StudentModel> student) {
    this.student = student;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ParentModel that)) return false;
    if (!super.equals(o)) return false;
    return Objects.equals(getPkParent(), that.getPkParent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getPkParent());
  }

  @Override
  public String toString() {
    return "ParentModel{" +
      "pkParent=" + pkParent +
      ", student=" + student +
      ", profile=" + profile +
      '}';
  }

}
