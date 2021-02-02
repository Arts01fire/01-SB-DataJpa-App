package com.yogesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT_DTLS")
public class Student {

	@Id
	@Column(name = "STUDENT_ID")
	private Integer studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;

	@Column(name = "STUDENT_AGE")
	private Integer studentAge;

}
