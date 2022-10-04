package org.br.recreio.server.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "profile")
public class ProfileModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long pkProfile;
  
  private String cpf;
  
  private String firthName;
  
  private String lastName;
  
  private String birthday;
  
  private String email;
  
  private String passwd;

//  @Column(name = "createdAt", nullable = false)
//  private LocalDate dateCreated;
//
//  @Column(name = "updatedAt", nullable = false)
//  private LocalDate dateUpdated;

//  @OneToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
//  private TeacherModel teacher;
  
  public ProfileModel() {
    super();
  }

  public Long getPkClient() {
    return pkProfile;
  }

  public void setPkClient(Long pkProfile) {
    this.pkProfile = pkProfile;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getFirthName() {
    return firthName;
  }

  public void setFirthName(String firthName) {
    this.firthName = firthName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBirthDay() {
    return birthday;
  }

  public void setBirthDay(String birthday) {
    this.birthday = birthday;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) { this.passwd = passwd; }

//  public LocalDate getDateCreated() {
//    return dateCreated;
//  }
//
//  public void setDateCreated(LocalDate dateCreated) {
//    this.dateCreated = dateCreated;
//  }
//
//  public LocalDate getDateUpdated() {
//    return dateUpdated;
//  }
//
//  public void setDateUpdated(LocalDate dateUpdated) {
//    this.dateUpdated = dateUpdated;
//  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ProfileModel that)) return false;
    return Objects.equals(getPkClient(), that.getPkClient()) && Objects.equals(getCpf(), that.getCpf());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPkClient(), getCpf());
  }

  @Override
  public String toString() {
    return "ProfileModel{" +
      "pkProfile=" + pkProfile +
      ", cpf='" + cpf + '\'' +
      ", firthName='" + firthName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", birthday='" + birthday + '\'' +
      ", email='" + email + '\'' +
      ", passwd='" + passwd + '\'' +
//      ", dateCreatedAt" + dateCreated + '\'' +
//      ", dateUpdatedAt" + dateUpdated +  '\'' + 
      '}';
  }

}
