package com.htp.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class User {

    private Long id;
    private String username;
    private String surname;
    private Date birthDate;
    private String login;
    private String password;
    private Timestamp created;
    private Timestamp changed;
    private boolean isBlocked;
    private Float weight;
    private String gender;
    private Long idRole;
    private String eMail;

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isBlocked == user.isBlocked &&
                Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(birthDate, user.birthDate) &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(created, user.created) &&
                Objects.equals(changed, user.changed) &&
                Objects.equals(weight, user.weight) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(idRole, user.idRole) &&
                Objects.equals(eMail, user.eMail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, surname, birthDate, login, password, created, changed, isBlocked, weight, gender, idRole, eMail);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", created=" + created +
                ", changed=" + changed +
                ", isBlocked=" + isBlocked +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", idRole=" + idRole +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getChanged() {
        return changed;
    }

    public void setChanged(Timestamp changed) {
        this.changed = changed;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
