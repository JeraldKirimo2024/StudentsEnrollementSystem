import java.util.ArrayList;
class Student{
	private String name; 
	private ArrayList<String> courses;
	public Student(String name) {
		this.name=name;
		this.courses= new ArrayList<String>();
	}
	public void enrollInCourse (String course){
		courses.add(course);
	}
	public void displayCourses() {
		System.out.println(name +"'s enrolled Corses");
		for (String course: courses) {
			System.out.println("-"+ course);
		}
		System.out.println();	
	}
}
public class StudentsEnrollementSystem {

	public static void main(String[] args) {
	ArrayList<String> students= new ArrayList<>();
	Student student1= new Student("Sarah");
	Student student2=new Student("Pricillar");
	
students.add(student1);
students.add(student2);
student1.enrollInCourse("Mathematics);
student1.enrollInCourse("History");
	}

}
