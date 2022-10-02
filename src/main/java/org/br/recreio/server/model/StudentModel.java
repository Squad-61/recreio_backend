package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity(name = "Student")
public class StudentModel extends ProfileModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idStudent", nullable = false)
  private UUID pkStudent;
  
  @OneToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
  @JoinColumn(name = "idProfile", table = "Profile")
  private ProfileModel profile;

  public UUID getPkStudent() {
    return pkStudent;
  }

  public void setPkStudent(UUID pkStudent) {
    this.pkStudent = pkStudent;
  }

  public ProfileModel getProfile() {
    return profile;
  }

  public void setFkStudent(ProfileModel profile) {
    this.profile = profile;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof StudentModel that)) return false;
    return Objects.equals(getPkStudent(), that.getPkStudent()) && Objects.equals(getProfile(), that.getProfile());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPkStudent(), getProfile());
  }

  @Override
  public String toString() {
    return "StudentModel{" +
      "pkStudent=" + pkStudent +
      ", profile=" + profile +
      '}';
  }
}
