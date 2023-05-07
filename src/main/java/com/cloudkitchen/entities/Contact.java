package com.cloudkitchen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Contact {

	@Id
	private Integer contactID;
	private String firstName;
	private String lastName;
	private long mobile;
	private String emailID;
}
