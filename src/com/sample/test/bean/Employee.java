package com.sample.test.bean;

public class Employee implements Comparable<Employee>, Cloneable {
	
	private int empID;
	private String empFirstName;
	private String empLastName;
	private double empSalary;
	/**
	 * @return the empID
	 */
	
	
	
	public int getEmpID() {
		return empID;
	}
	/**
	 * @param empID
	 * @param empFirstName
	 * @param empLastName
	 * @param empSalary
	 */
	public Employee(int empID, String empFirstName, String empLastName, double empSalary) {
		super();
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	/**
	 * @return the empFirstName
	 */
	public String getEmpFirstName() {
		return empFirstName;
	}
	/**
	 * @param empFirstName the empFirstName to set
	 */
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	/**
	 * @return the empLastName
	 */
	public String getEmpLastName() {
		return empLastName;
	}
	/**
	 * @param empLastName the empLastName to set
	 */
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empSalary=" + empSalary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (o.empSalary - this.empSalary);
	}

	@Override
	public Employee clone() {
        Employee clone = null;
        try{
            clone = (Employee) super.clone();
           
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e); // won't happen
        }
       
        return clone;
		
	}

	
}
