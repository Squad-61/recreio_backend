package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity(name = "teacher")
public class TeacherModel  extends ProfileModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "pkTeacher", nullable = false, updatable = false)
  private UUID pkTeacher;

  @Column(name = "contrato", nullable = false)
  private String contractFile;

  @Column(name = "isVoluntary", nullable = false)
  private Boolean isVoluntary;

  @OneToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
  @JoinColumn(name = "pkProfile", table = "profile")
  private ProfileModel profile;

  public UUID getPkTeacher() {
    return pkTeacher;
  }

  public void setPkTeacher(UUID pkTeacher) {
    this.pkTeacher = pkTeacher;
  }

  public String getContractFile() {
    return contractFile;
  }

  public void setContractFile(String contractFile) {
    this.contractFile = contractFile;
  }

  public Boolean getVoluntary() {
    return isVoluntary;
  }

  public void setVoluntary(Boolean voluntary) {
    isVoluntary = voluntary;
  }

  public ProfileModel getProfile() {
    return profile;
  }

  public void setProfile(ProfileModel profile) {
    this.profile = profile;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof TeacherModel that)) return false;
    if (!super.equals(obj)) return false;
    return Objects.equals(getPkTeacher(), that.getPkTeacher()) && Objects.equals(getProfile(), that.getProfile());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getPkTeacher(), getProfile());
  }

  @Override
  public String toString() {
    return "TeacherModel{" +
      "pkTeacher=" + pkTeacher +
      ", contractFile='" + contractFile + '\'' +
      ", isVoluntary=" + isVoluntary +
      ", profile=" + profile +
      '}';
  }
  
}
