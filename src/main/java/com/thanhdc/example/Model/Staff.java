package com.thanhdc.example.Model;

import javax.persistence.*;

@Entity
@Table(name="Staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int group;
    private String name;
    private String gendle;
    private String phone;

    public Staff() {
    }

    public Staff(int id, int group, String name, String gendle, String phonenumber) {
        this.id = id;
        this.group = group;
        this.name = name;
        this.gendle = gendle;
        this.phone = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGendle() {
        return gendle;
    }

    public void setGendle(String gendle) {
        this.gendle = gendle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
