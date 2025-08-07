package week1.ass1;

public class Report {

	public static void main(String[] args) {
		Student student=new Student();
		student.studentName="Midhun";
		student.rollNo=17;
		student.collegeName="SKCT";
		student.mark=85;
		student.cgpa=8.02f;
		System.out.println("Student Name  : " + student.studentName);
        System.out.println("Roll Number   : " + student.rollNo);
        System.out.println("College Name  : " + student.collegeName);
        System.out.println("Marks Scored  : " + student.mark);
        System.out.println("CGPA          : " + student.cgpa);


	}

}
