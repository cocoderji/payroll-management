package com.example.payrollmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int age;
    private String designation;
    private int rating;
    private double salary;
    
    // Getter and Setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    // Getter and Setter for age
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    // Getter and Setter for designation
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
    
    // Getter and Setter for rating
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    
    // Getter and Setter for salary
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
