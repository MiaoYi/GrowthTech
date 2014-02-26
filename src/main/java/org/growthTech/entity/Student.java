package org.growthTech.entity;

public class Student {
	private int id;
	private String tokenId;
	private String name;
	private String studentNumber;
	private String classNumber;
	private String grade;
	private int fk_parentId;
	
	public Student() {
		super();
	}
	
	public Student(int id, String tokenId, String name, String studentNumber,
			String classNumber, String grade, int fk_parentId) {
		this.id = id;
		this.tokenId = tokenId;
		this.name = name;
		this.studentNumber = studentNumber;
		this.classNumber = classNumber;
		this.grade = grade;
		this.fk_parentId = fk_parentId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void classNubmer(String classNumber) {
		this.classNumber = classNumber;
	}
	
	public String getClassNumber() {
		return this.classNumber;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getFk_parentId() {
		return fk_parentId;
	}
	public void setFk_parentId(int fk_parentId) {
		this.fk_parentId = fk_parentId;
	}

}
