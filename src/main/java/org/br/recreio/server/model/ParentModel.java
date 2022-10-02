package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity(name = "Parent")
public class ParentModel extends ProfileModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idParent", nullable = false)
  private UUID pkParent;
  
  @ManyToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
  @JoinColumn(name = "idProfile", table = "Profile")
  private StudentModel student;
  
  @OneToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
  @JoinColumn(name = "idProfile", table = "Profile")
  private ProfileModel profile;

  public UUID getIdParent() {
    return pkParent;
  }

  public void setIdParent(UUID pkParent) {
    this.pkParent = pkParent;
  }

  @Override
  public List<StudentModel> getStudent() {
    return (List<StudentModel>) student;
  }

  public void setStudent(StudentModel student) {
    this.student = student;
  }

  public ProfileModel getProfile() {
    return profile;
  }

  public void setProfile(ProfileModel profile) {
    this.profile = profile;
  }
}
