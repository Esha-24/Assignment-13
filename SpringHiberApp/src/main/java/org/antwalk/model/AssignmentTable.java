package org.antwalk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AssignmentTable")
public class AssignmentTable {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="Assignment_id")
	private int AssignmentId;
	
	@Column(name="Assignment_name")
	private String AssignmentName;
	
	@Column(name="Assignment_number")
	private String AssignmentNumber;

	public int getAssignmentId() {
		return AssignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		AssignmentId = assignmentId;
	}

	public String getAssignmentName() {
		return AssignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		AssignmentName = assignmentName;
	}

	public String getAssignmentNumber() {
		return AssignmentNumber;
	}

	public void setAssignmentNumber(String assignmentNumber) {
		AssignmentNumber = assignmentNumber;
	}
}
