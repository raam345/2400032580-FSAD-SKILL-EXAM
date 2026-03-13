package com.example.entity;
import javax.persistence.*;
@Entity
@Table(name = "students")
public class Student 
{
    @Id
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_seq_gen")
    @SequenceGenerator(name = "student_seq_gen",sequenceName = "student_seq",allocationSize = 1)*/
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String Date;
    private String Description;
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
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	\
    