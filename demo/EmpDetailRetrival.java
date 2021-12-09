package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDetailRetrival {

	public static void main(String[] args) {

		String[] s1 = { "java", "c", "c#", "Guidewire", "spring" };
		String[] s2 = { "c", "c#", "spring" };
		String[] s3 = { "c", "c#", "phyton" };
		String[] d1 = { "SE", "ASE" };

		Emp e1 = new Emp("varun", s1, d1);
		Emp e2 = new Emp("Rakesh", s2, d1);
		Emp e3 = new Emp("john", s3, d1);

		List<Emp> list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		System.out.println("-------------1");

		for (Emp emp : list) {
			for (String skills : emp.getSkills()) {
				if (skills.contains("java")) {
					System.out.println(emp);
				}
			}
		}

		System.out.println("-------------2");

		for (Emp emp : list) {
			String[] skills = emp.getSkills();
			if (Arrays.toString(skills).contains("Guidewire")) {
				System.out.println("");
			} else {
				System.out.println("Employee who does not have GuideWire as one of their skills are " + emp);
			}
		}

		System.out.println("-----------------------3");

		for (Emp emp : list) {
			for (String skills : emp.getSkills()) {
				if (skills.contains("spring")) {
					System.out.println(emp);
				}
			}
		}

		System.out.println("-----------------------4");

		for (Emp emp : list) {
			if (emp.getName().equals("john")) {
				System.out.println(emp);
			}
		}

	}
}

class Emp {

	String name;
	String[] skills;
	String[] designation;

	public Emp(String name, String[] skills, String[] designation) {
		super();
		this.name = name;
		this.skills = skills;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String[] getDesignation() {
		return designation;
	}

	public void setDesignation(String[] designation) {
		this.designation = designation;
	}

	public String toString() {
		return "Emp [name=" + name + ", skills=" + Arrays.toString(skills) + ", designation="
				+ Arrays.toString(designation) + "]";
	}

}
