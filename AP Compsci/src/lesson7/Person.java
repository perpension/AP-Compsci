package lesson7;

public class Person {
	public String name;
	public String address;
	public String number;
	public String email;
	
	//no-args constructor (need?)
	public Person(){
	}
	//constructor
	public Person(String name, String address, String number, String email){
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getnumber() {
		return number;
	}
	public void setnumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "Name: " + name;
	}
	
}

class Student extends Person{
	public String classStatus = "";
	
	public Student(String name, String address, String number, String email, String classStatus){
		super(name, address, number, email);
		this.classStatus = classStatus;
	}
	public String classStatus() {
		return email;
	}
	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	public String toString(){
		return "Student: " + name;
	}
}

class Employee extends Person{
	public String office;
	public double salary;
	public String date;
	
	public Employee(String name, String address, String number, String email,
			String office, double salary, String date){
		super(name, address, number, email);
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
//subs of employee
class Faculty extends Employee{
	public String hours;
	public String rank;
	
	public Faculty(String name, String address, String number, String email,
			String office, double salary, String date, String hours, String rank){
		super(name, address, number, email, office, salary, date);
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

class Staff extends Employee{
	public String title;
	
	public Staff(String name, String address, String number, String email,
			String office, double salary, String date, String title){
		super(name, title, number, email, office, salary, date);
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
//driver
class PersonTest{
	public static void main(String[] args){
		Person p = new Person("Daniel Gu", "200 Hackensack Ave", "555-555-5555", "danigu@bergen.org");
		Student s = new Student("Daniel Gu", "200 Hackensack Ave", "555-555-5555", "danigu@bergen.org", "Senior");
		
		System.out.println(p);
		System.out.println(s);
	}
}