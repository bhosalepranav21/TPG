package beans;

import java.util.Arrays;

public class SortStudentInfo {

	public static void main(String[] args) {
	StudentInfo[] studentInfos = new StudentInfo[5];
	StudentInfo Tina = new StudentInfo(33, "Tina", (float) 3.68);
	StudentInfo Louis = new StudentInfo(85, "Louis", (float) 3.85);
	StudentInfo Samil = new StudentInfo(56, "Samil", (float) 3.75);
	StudentInfo Samar = new StudentInfo(19, "Samar", (float) 3.75);
	StudentInfo Lorry = new StudentInfo(22, "Lorry", (float) 3.76);

	studentInfos[0]=Tina;
	studentInfos[1]=Louis;
	studentInfos[2]=Samil;
	studentInfos[3]=Samar;
	studentInfos[4]=Lorry;
	
	Arrays.sort(studentInfos, StudentInfo.studenComparator);
	int i=0;
	for(StudentInfo temp:studentInfos){
		System.out.println("studentID" + ++i + ":" + temp.getID() + "studentname:" + temp.getName() + "studentGPA" + temp.getGPA());
	}
	}

}
