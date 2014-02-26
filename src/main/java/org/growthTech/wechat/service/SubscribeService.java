package org.growthTech.wechat.service;

import org.growthTech.dao.ParentDAO;
import org.growthTech.dao.StudentDAO;
import org.growthTech.entity.Parent;
import org.growthTech.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class SubscribeService {
	@Autowired
	private ParentDAO parentDAO;
	@Autowired
	private StudentDAO studentDAO;
	
	public void register(String tokenId, String content) {
		// Insert parent
		this.insertParent(tokenId, content);
		
		// Insert student
		Parent parent = parentDAO.getParentByTokenId(tokenId);
		int parentId = parent.getId();
		this.insertStudent(parentId, content);
	}
	
	public boolean isValidRegistration(String regStr) {
    	final String REG_PATTERN = ".+-.+-.+";
    	
    	return regStr.matches(REG_PATTERN);
    }
    
    public String getStudentName(String inputStr) {
    	String studentName = "";
    	int index1 = inputStr.indexOf("-");
    	studentName = inputStr.substring(0, index1);
    	
    	return studentName;
    }
    
    public String getStudentNumber(String inputStr) {
    	String studentNumber = "";
    	int index1 = inputStr.indexOf("-");
    	int index2 = inputStr.indexOf("-", index1 + 1);
    	studentNumber = inputStr.substring(index1 + 1, index2);
    	
    	return studentNumber;
    }
    
    public String getParentName(String inputStr) {
    	String parentName = "";
    	int index1 = inputStr.indexOf("-");
    	int index2 = inputStr.indexOf("-", index1 + 1);
    	parentName = inputStr.substring(index2 + 1);
    	
    	return parentName;
    }
    
    private void insertParent(String tokenId, String content) {
    	Parent parent = new Parent();
    	parent.setTokenId(tokenId);
    	parent.setName(this.getParentName(content));
    	
    	this.parentDAO.insert(parent);
    }
    
    private void insertStudent(int parentId, String content) {
		Student student = new Student();
		student.setName(this.getStudentName(content));
		student.setStudentNumber(this.getStudentNumber(content));
		student.setFk_parentId(parentId);
		
		this.studentDAO.insert(student);
	}

}
