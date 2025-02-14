package com.sasha.jobportal.entity;

import jakarta.persistence.*;

@Entity
public class JobCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name;
    private String logo;

    public JobCompany() {
    }

    public JobCompany(Integer Id, String name, String logo) {
        this.Id = Id;
        this.name = name;
        this.logo = logo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "JobCompany{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
