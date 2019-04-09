package warrios;

import gui.elements.Constant;
import people.Characters;

public class Student extends Characters{
	//Attributes
	private boolean validateStudent;
	private boolean mapValidateStudent;
	private boolean drawStudentOnTheMap; 
	//Constructor
	public Student(){
		super("Student",Constant.DEFAULT_QUANTITY,0,null);
		this.validateStudent = false;
		this.mapValidateStudent = false;
		this.drawStudentOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateStudent() {
		return validateStudent;
	}
	public void setValidateStudent(boolean validateStudent) {
		this.validateStudent = validateStudent;
	}
	public boolean isMapValidateStudent() {
		return mapValidateStudent;
	}
	public void setMapValidateStudent(boolean mapValidateStudent) {
		this.mapValidateStudent = mapValidateStudent;
	}
	public boolean isDrawStudentOnTheMap() {
		return drawStudentOnTheMap;
	}
	public void setDrawStudentOnTheMap(boolean drawStudentOnTheMap) {
		this.drawStudentOnTheMap = drawStudentOnTheMap;
	}
	
	
}
