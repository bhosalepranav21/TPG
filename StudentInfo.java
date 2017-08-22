package beans;

import java.util.Comparator;

public class StudentInfo implements Comparable<StudentInfo> {

	private int ID;
	private String Name;
	private float GPA;
	

	public StudentInfo(int ID, String Name, float gPA){
		super();
		this.ID = ID;
		this.Name = Name;
		this.GPA = gPA;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		this.GPA = gPA;
	}	


	public float compareTo(StudentInfo compareStudentInfo)  {
		float compareGPA = ((StudentInfo) compareStudentInfo).getGPA();
		return compareGPA - this.GPA;
	}

	public static Comparator<StudentInfo> studenComparator = new Comparator<StudentInfo>() {
		
		public int compare(StudentInfo studentInfo1, StudentInfo studentInfo2) {

			String Name1 = studentInfo1.getName().toUpperCase();
			String Name2 = studentInfo2.getName().toUpperCase();
			return Name1.compareTo(Name2);
		}
	};
}
