package customerpack;

import java.io.Serializable;

public class Empployee implements Comparable<Empployee>, Serializable,Cloneable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;
String name;
double salary;
String email;

	
	public Empployee(int id, String name, double salary, String email) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.email = email;
}

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
@Override
public int compareTo(Empployee o) {
	if (this.id > o.id) {
		return 1;
	} else if (this.id < o.id) {
		return -1;

	} else {
		return 0;
	}
}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

		@Override
	public String toString() {
		return "Empployee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}

		

}
