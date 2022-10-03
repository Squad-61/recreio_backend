package org.br.recreio.server.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity(name = "profile")
public class ProfileModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "pkProfile", nullable = false, updatable = false)
  private UUID pkProfile;

  @Column(name = "cpf", nullable = false)
  private String cpf;

  @Column(name = "firthName", nullable = false)
  private String firthName;

  @Column(name = "lastName", nullable = false)
  private String lastName;

  @Column(name = "birthDay", nullable = false)
  private String birthDay;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String passwd;

  @Column(name = "createdAt", nullable = false)
  private LocalDate dateCreated;

  @Column(name = "updatedAt", nullable = false)
  private LocalDate dateUpdated;

  public ProfileModel() {
    super();
  }

  public UUID getPkClient() {
    return pkProfile;
  }

  public void setPkClient(UUID pkProfile) {
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
    return birthDay;
  }

  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
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

  public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }

  public LocalDate getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(LocalDate dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

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
      ", birthDay='" + birthDay + '\'' +
      ", email='" + email + '\'' +
      ", passwd='" + passwd + '\'' +
      ", dateCreatedAt" + dateCreated + '\'' +
      ", dateUpdatedAt" + dateUpdated +  '\'' + 
      '}';
  }

}
