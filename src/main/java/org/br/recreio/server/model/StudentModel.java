package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity(name = "student")
public class StudentModel extends ProfileModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "pkStudent", nullable = false)
  private UUID pkStudent;

  @Column(name = "rm", nullable = false)
  private String rm;

  @OneToOne(cascade = {CascadeType.PERSIST})
  @JoinColumn(name = "fkProfile", table = "profile")
  private ProfileModel profile;

  public UUID getPkStudent() {
    return pkStudent;
  }

  public void setPkStudent(UUID pkStudent) {
    this.pkStudent = pkStudent;
  }

  public String getRm() {
    return rm;
  }

  public void setRm(String rm) {
    this.rm = rm;
  }

  public ProfileModel getProfile() {
    return profile;
  }

  public void setProfile(ProfileModel profile) {
    this.profile = profile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof StudentModel that)) return false;
    if (!super.equals(o)) return false;
    return Objects.equals(getPkStudent(), that.getPkStudent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getPkStudent());
  }

  @Override
  public String toString() {
    return "StudentModel{" +
      "pkStudent=" + pkStudent +
      ", rm='" + rm + '\'' +
      ", profile=" + profile +
      '}';
  }

}
