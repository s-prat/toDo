package com.rest.webservice.toDo.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDo {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	private Date targetDate;
	private boolean isCompleted;
	
	public ToDo(int id, String description, Date targetDate, boolean isCompleted) {
		super();
		this.id = id;
		this.description = description;
		this.targetDate = targetDate;
		this.isCompleted = isCompleted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", description=" + description + ", targetDate=" + targetDate + ", isCompleted="
				+ isCompleted + "]";
	}
	
	

}
