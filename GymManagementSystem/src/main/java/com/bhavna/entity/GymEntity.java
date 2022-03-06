package com.bhavna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Gym")
public class GymEntity {

	@Id
	@Column(name = "gymId")
	public Integer gymId;

	@Column(name = "gymName")
	public String gymName;

	@Column(name = "gymBranch")
	public String gymBranch;

	@Column(name = "gymAddress")
	public String gymAddress;

	@Override
	public String toString() {
		return "GymEntity [gymId=" + gymId + ", gymName=" + gymName + ", gymBranch=" + gymBranch + ", gymAddress="
				+ gymAddress + "]";
	}

}
