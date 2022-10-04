package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "teacher")
public class TeacherModel  extends ProfileModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long pkTeacher;

  private String contractFile;

  private Boolean isVoluntary;

  private ProfileModel profile;

  public Long getPkTeacher() {
    return pkTeacher;
  }

  public void setPkTeacher(Long pkTeacher) {
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
    return Objects.equals(getPkTeacher(), that.getPkTeacher());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getPkTeacher());
  }

  @Override
  public String toString() {
    return "TeacherModel{" +
      "pkTeacher=" + pkTeacher +
      ", contractFile='" + contractFile + '\'' +
      ", isVoluntary=" + isVoluntary +
      '}';
  }

}
