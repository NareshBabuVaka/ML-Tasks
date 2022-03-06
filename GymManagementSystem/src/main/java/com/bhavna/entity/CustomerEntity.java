package com.bhavna.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class CustomerEntity {

	@Id
	@Column(name = "customerId")
	public Integer customerId;

	@Column(name = "customerName")
	public String customerName;

	@Column(name = "customerPlan")
	public String customerPlan;

	@Column(name = "customerPhoneNumber")
	public Long customerPhoneNumber;

	@Column(name = "customerBranch")
	public String customerBranch;

	@Column(name = "customerAddress")
	public String customerAddress;

	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="gymId")
	public List<GymEntity> gymId;

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerPlan="
				+ customerPlan + ", customerPhoneNumber=" + customerPhoneNumber + ", customerBranch=" + customerBranch
				+ ", customerAddress=" + customerAddress + ", gymId=" + gymId + "]";
	}

}
