package TaskNo10;

import java.io.Serializable;

public class Student implements Serializable{
public Student(String name, int id, String dept, String clg) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.clg = clg;
	}
public String name;
public int id;
public String dept;
public String clg;

public String toString()
{
	return "[ Name: "+name+"  Id :"+id+"  Departement : "+dept+"  college : "+clg+"]";
}
}
