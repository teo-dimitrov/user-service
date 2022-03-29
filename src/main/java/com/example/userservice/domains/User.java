package com.example.userservice.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;
    private String userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String profileImageUrl;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private Date joinDate;
    private String[] roles;
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;

    public User() {
    }

    public User(Long id, String userId, String username, String password, String firstName,
                String lastName, String email, String profileImageUrl, Date lastLoginDate,
                Date lastLoginDateDisplay, Date joinDate, String[] roles, String[] authorities,
                boolean isActive, boolean isNotLocked) {
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginDateDisplay = lastLoginDateDisplay;
        this.joinDate = joinDate;
        this.roles = roles;
        this.authorities = authorities;
        this.isActive = isActive;
        this.isNotLocked = isNotLocked;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public User setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        return this;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public User setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
        return this;
    }

    public Date getLastLoginDateDisplay() {
        return lastLoginDateDisplay;
    }

    public User setLastLoginDateDisplay(Date lastLoginDateDisplay) {
        this.lastLoginDateDisplay = lastLoginDateDisplay;
        return this;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public User setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
        return this;
    }

    public String[] getRoles() {
        return roles;
    }

    public User setRoles(String[] roles) {
        this.roles = roles;
        return this;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public User setAuthorities(String[] authorities) {
        this.authorities = authorities;
        return this;
    }

    public boolean isActive() {
        return isActive;
    }

    public User setActive(boolean active) {
        isActive = active;
        return this;
    }

    public boolean isNotLocked() {
        return isNotLocked;
    }

    public User setNotLocked(boolean notLocked) {
        isNotLocked = notLocked;
        return this;
    }
}
