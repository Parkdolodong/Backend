package org.comstudy.saramjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "SARAM")
@Data
public class SaramEntity {
	@Id
	@GeneratedValue
	private Long seq;
	private String id;
	private String name;
	private int age;
}
