package br.org.recreio.server.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

//@Entity
//@Table(name = "Client")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "profile")
@MappedSuperclass
public class ProfileModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfile;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date birthday;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwd;

    public Long getPkProfile() {
        return this.idProfile;
    }

    public void setPkProfile(Long idProfile) {
        this.idProfile = idProfile;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfileModel profileModel)) return false;
        return Objects.equals(idProfile, profileModel.idProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProfile);
    }
  
    @Override
    public String toString() {
      return '{' + '\n' +
        "Profile:" + '{' + '\n' +
          '\t' + "ID:" + '\t' + idProfile + "," + '\n' +
          '\t' + "Name:" + '\t' + name + "," + '\n' +
          '\t' + "Birthday:" + '\t' + birthday + "," + '\n' +
          '\t' + "Email:" +'\t' +  email + "," + '\n' +
          '\t' + "Passwd:" + '\t' + passwd + '\n' +
        '}' + '\n' +
      '}';
    }
}

