package lesson7;

public class Sagar{
	public String name;
	public String address;
	public String phoneNumber;
	public String emailAddress;
	
	public Sagar(String name, String address, String phoneNumber, String emailAddress){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress(){
		return address; 
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String toString(){
		return "Hello, I am " + name;
	}
}
class Student extends sagar {
	public String classStatus = "";

	public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus){
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}
	public String classStatus() {
		return emailAddress;
	}
	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	public String toString(){
		return "Student: " + name;
	}
}
class Employee extends sagar {
	public String office;
	public double salary;
	public String date;
	
	public Employee(String name, String address, String phoneNumber, String emailAddress,
			String office, double salary, String date){
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}
	public String getOffice(){
		return office;
	}
	public void setOffice(String office){
		this.office = office;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public String getDate(){
		return date;
	}
	public String toString(){
		return "Employee: " + name;
	}	
}
class Faculty extends Employee {
	public String hours;
	public String rank;
	
	public Faculty(String name, String address, String phoneNumber, String emailAddress,
			String office, double salary, String date, String hours, String rank){
		super(name, address, phoneNumber, emailAddress, office, salary, date);
		this.hours = hours;
		this.rank = rank;	
	}
	public String getHours(){
		return hours;
	}
	public void setHours(String hours){
		this.hours = hours;
	}
	public String getRank(){
		return rank;
	}
	public void setRank(String rank){
		this.rank = rank;
	}
	public String toString(){
		return "Faculty: " + name;
	}
}
class Staff extends Employee {
	public String title;
	
	public Staff(String name, String address, String phoneNumber, String emailAddress,
			String office, double salary, String date, String title){
		super(name, title, phoneNumber, emailAddress, office, salary, date);
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String toString(){
		return "Staff: " + name;
	}
}

package lesson7;
public class sagarTest {
	public static void main(String[] args) {
		sagar p = new sagar("John Smith", "College", "201-123-4567", "johnsmith@gmail.com");
		Student s = new Student("John Smith", "College", "201-123-4567", "johnsmith@gmail.com", "Junior");
		System.out.println(p);
		System.out.println(s);
	}
}