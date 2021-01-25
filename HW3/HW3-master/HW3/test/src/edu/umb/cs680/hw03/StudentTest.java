package edu.umb.cs680.hw03;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;


class StudentTest {
	private String[] InStateStudentToStringArray(Student s){
		String[] StudentInfo = 
			{ 
				s.getName(), s.get_us_Addr(), Integer.toString(s.getyrsInState()) 
			};
		return StudentInfo;
		}
	
	private String[] OutStateStudentToStringArray(Student s){
			String[] StudentInfo = 
				{ 
					s.getName(), s.get_us_Addr(), s.get_prior_Addr()
				};
		return StudentInfo;
	}	
	
	private String[] IntlStudentToStringArray(Student s){
		String[] StudentInfo = 
			{ 
				s.getName(), s.get_us_Addr(), Integer.toString(s.geti20num()), s.get_foreign_Addr()
			};
	return StudentInfo;
	}	
	
	@Test
	public void verify_In_state_student() {
		String[] expected = {"John", "Boston", "20"};
		Student actual= Student.createInStateStudent("John", "Boston", 20);
		assertArrayEquals(expected, InStateStudentToStringArray(actual));
	}

	@Test
	public void verify_Out_State_student() {
		String[] expected = {"John", "Boston", "124 New York"};
		Student actual= Student.createOutStateStudent("John", "Boston", "124 New York");
		assertArrayEquals(expected, OutStateStudentToStringArray(actual));
	} 
	
	@Test
	public void verify_Inl_student() {
		String[] expected = {"John", "Boston", "565622", "India"};
		Student actual= Student.createIntlStudent("John", "Boston", 565622, "India");
		assertArrayEquals(expected, IntlStudentToStringArray(actual));
	} 
}
