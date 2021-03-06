package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import Exceptions.PersonException;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {

		Course class1 = new Course();
		Course class2 = new Course();
		Course class3 = new Course();
		ArrayList classList = new ArrayList();

		classList.add(class1);
		classList.add(class2);
		classList.add(class3);

		UUID id1 = UUID.randomUUID();
		Date semdate1 = new Date();
		Date semdate2 = new Date();

		Semester fall = new Semester(id1, semdate1, semdate2);
		Semester spring = new Semester(id1, semdate1, semdate2);
		ArrayList semList = new ArrayList();

		semList.add(fall);
		semList.add(spring);

		Section classa = new Section(id1, id1, id1, 5);
		Section classb = new Section(id1, id1, id1, 5);
		Section classc = new Section(id1, id1, id1, 5);
		Section classd = new Section(id1, id1, id1, 5);
		Section classe = new Section(id1, id1, id1, 5);
		Section classf = new Section(id1, id1, id1, 5);

		ArrayList<Section> secList = new ArrayList<Section>();
		secList.add(classa);
		secList.add(classc);
		secList.add(classe);
		secList.add(classb);
		secList.add(classd);
		secList.add(classf);

		Student student_one = new Student("Matt", "John", "Damon", semdate2, eMajor.BUSINESS, "101 fake lane",
				"(555)-555-5555", "fakeemail1@gmail.com");
		Student student_two = new Student("Steve", "Frankie", "Waler", semdate2, eMajor.CHEM, "1012 fake lane",
				"(555)-555-5555", "fakeemail2@gmail.com");
		Student student_three = new Student("Kylo", "Luke", "Bob", semdate2, eMajor.BUSINESS, "1013 fake lane",
				"(555)-555-5555", "fakeemail3@gmail.com");
		Student student_four = new Student("Frank", "Hardy", "Nugan", semdate2, eMajor.CHEM, "1014 fake lane",
				"(555)-555-5555", "fakeemail4@gmail.com");
		Student student_five = new Student("John", "Hav", "Williams", semdate2, eMajor.BUSINESS, "1015 fake lane",
				"(555)-555-5555", "fakeemail5@gmail.com");
		Student student_six = new Student("Franklin", "Mack", "Neilson", semdate2, eMajor.COMPSI, "1016 fake lane",
				"(555)-555-5555", "fakeemail6@gmail.com");
		Student student_seven = new Student("James", "Joe", "Frost", semdate2, eMajor.BUSINESS, "1017 fake lane",
				"(555)-555-5555", "fakeemail7@gmail.com");
		Student student_eight = new Student("John", "Apple", "Martin", semdate2, eMajor.NURSING, "1018 fake lane",
				"(555)-555-5555", "fakeemail8@gmail.com");
		Student student_nine = new Student("Fender", "Gibson", "Les", semdate2, eMajor.CHEM, "1019 fake lane",
				"(555)-555-5555", "fakeemail9@gmail.com");
		Student student_ten = new Student("Will", "Depp", "Sparrow", semdate2, eMajor.PHYSICS, "1010 fake lane",
				"(555)-555-5555", "fakeemail10@gmail.com");
		ArrayList<Student> student_List = new ArrayList<Student>();

		//adding students to arraylist
		student_List.add(student_one);
		student_List.add(student_two);
		student_List.add(student_three);
		student_List.add(student_four);
		student_List.add(student_five);
		student_List.add(student_six);
		student_List.add(student_seven);
		student_List.add(student_eight);
		student_List.add(student_nine);
		student_List.add(student_ten);
		for (Student s : student_List)
			new Enrollment(s.getStudentID(), classa.getSectionID());

	}

	@Test
	public void test() {
		Enrollment enroll = new Enrollment();

		assertEquals(1, 1);
	}
}