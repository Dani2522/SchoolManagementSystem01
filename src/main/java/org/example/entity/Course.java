package org.example.entity;

public class Course {
    private int id;
    private String name;
    private String description;
    private Integer credits;
    private String version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Course(int id, String name, String description, Integer credits, String version) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.version = version;
    }

    public Course() {
    }


    @Override
    public String toString() {
        return String.format("%-10s| %-10s | %-10s | %-10s | %-10s | %s",
                getId(), getName(), getDescription(), getDescription(), getCredits(), getVersion());
    }
}
