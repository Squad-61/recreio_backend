package br.org.recreio.server.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public class ProfileModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idProfile = UUID.randomUUID();

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date birthday;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwd;

    public UUID getPkProfile() {
        return this.idProfile;
    }

    public void setPkProfile(UUID idProfile) {
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
        return "UUID: " + this.getPkProfile() + '\n' +
                "Name: " + this.getName() + '\n' +
                "E-mail: " + this.getEmail() + '\n' +
                "BirthDay: " + this.getBirthday();
    }
}

