package br.org.recreio.server.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity(name = "profile")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "profile")
public class ProfileModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer idProfile;

    private String name;

    @Temporal(value = TemporalType.DATE)
    private Date birthday;

    private String email;

    private String passwd;

    public Integer getPkProfile() {
        return this.idProfile;
    }

    public void setPkProfile(Integer idProfile) {
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
    public String toString() {
        return "ProfileModel{" +
                "idProfile=" + idProfile +
                ", name='" + name +
                ", birthday=" + birthday +
                ", email='" + email +
                ", passwd='" + passwd +
                '}';
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

}

