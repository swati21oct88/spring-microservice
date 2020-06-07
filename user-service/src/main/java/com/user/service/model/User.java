package com.user.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "USER_TABLE")
public class User {
	
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column (name = "USER_NAME")
    private String name;
	
    @Column (name = "CONTACT_N0")
    private String contactNo;

    public User(String name, String contactNo) {
        super();
        this.contactNo=contactNo;
        this.name= name;
    }
}
