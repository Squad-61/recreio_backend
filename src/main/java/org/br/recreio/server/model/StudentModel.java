package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "student")
public class StudentModel extends ProfileModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pkStudent", nullable = false)
  private Long pkStudent;

  @Column(name = "rm", nullable = false)
  private String rm;

  /**
   * SQL CODE REFERENCE:
   * CREATE TABLE `parent`  ( pkParent VARCHAR(256), ... , fkStudent VARCHAR(256) );
   * CREATE TABLE `student` ( pkStudent VARCHAR(256), ... , fkParent VARCHAR(256) );
   * ALTER TABLE `parent` ADD FOREIGN KEY `fkStudent` REFERENCES `student`(`pkStudent`);
   * SELECT * FROM `parent`
   */
  @OneToOne(cascade = {CascadeType.PERSIST})
  @JoinColumn(name = "fkProfile", table = "profile")
  private ProfileModel profile;

//  @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
//  @JoinColumn(name = "fkStudent", table = "parent")
//  private ParentModel parent;

  public Long getPkStudent() {
    return pkStudent;
  }

  public void setPkStudent(Long pkStudent) {
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

//  public ParentModel getParent() {
//    return parent;
//  }
//
//  public void setParent(ParentModel parent) {
//    this.parent = parent;
//  }

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
   '}';
  }

}
