package com.molokotech.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchases")
public class Purchase extends Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private User user;
	@Column(name = "creation") private Timestamp creation;
	@Column(name = "paid") private double paid;
	@Column(name = "total") private double total;
	@Column(name = "rest") private double rest;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getCreation() {
		return creation;
	}

	public void setCreation(Timestamp creation) {
		this.creation = creation;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getRest() {
		return rest;
	}

	public void setRest(double rest) {
		this.rest = rest;
	}
}
