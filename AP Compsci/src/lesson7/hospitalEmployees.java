package lesson7;

//superclass
public class hospitalEmployees{
	public String hospital = "Hackensack Medical Center";
	public double getSalary(){
		return 0;
	}
	public String toString(){
		return hospital;
	}
}

//subs of super
class admin extends hospitalEmployees{
	public double getSalary(){
		return 120000;
	}
	public String manageEmployees(){
		return "Get back to work!";
	}
	public String toString(){
		return "Administrator:\nOften seen muttering " + manageEmployees() + "\nAverage salary: $" + getSalary();
	}
}

class med extends hospitalEmployees{
	
}

class misc extends hospitalEmployees{
	
}

//subs of med
class surgeon extends med{
	public double getSalary(){
		return 315000;
	}
	public String doSurgery(){
		return "\"Relax, it's my first time.\"";
	}
	public String toString(){
		return "Surgeon:\nOften seen saying " + doSurgery() + "\nAverage salary: $" + getSalary();
	}
}

class doctor extends med{
	public double getSalary(){
		return 165000;
	}
	public String openWide(){
		return "\"Say ah...\"";
	}
	public String checkUp(){
		return "\"Have you been taking this every day?\"";
	}
	public String toString(){
		return "Family Physician:\nOften seen saying " + openWide() + "\nAverage salary: $" + getSalary();
	}
}

class nurse extends med{
	public double getSalary(){
		return 65000;
	}
	public String dismissPatient(){
		return "\"Yes, there are male nurses.\"";
	}
	public String toString(){
		return "Nurse:\nOften seen muttering" + dismissPatient() + "\nAverage salary: $" + getSalary();
	}
}

//subs of misc
class janitor extends misc{
	public double getSalary(){
		return 25000;
	}
	public String mopping(){
		return "\"Careful, that's blood you're stepping in.\"";
	}
	public String toString(){
		return "Janitor:\nOften seen saying" + mopping() + "\nAverage salary: $" + getSalary();
	}
}

class plumber extends misc{
	public double getSalary(){
		return 50000;
	}
	public String fixingToliet(){
		return "\"What on earth do these people eat...\"";
	}
	public String toString(){
		return "Plumber:\nOften seen saying" + fixingToliet() + "\nAverage salary: $" + getSalary();
	}
}


//driver
class hospitalEmployeesTest{
	public static void main(String[] args){
		hospitalEmployees h = new hospitalEmployees();

		surgeon s = new surgeon();
		doctor d = new doctor();
		janitor j = new janitor();
		plumber p = new plumber();
		
		System.out.println(h);
		System.out.println(s);
		System.out.println(d);
		System.out.println(j);
		System.out.println(p);
	}
}