package Method;

public class ConstructorReference2 {
	public static void main(String[] args) {
		Interface i=(name,rollno,lastname)->new Student(name,rollno,lastname);
//		System.out.println(i.get("harsha",87,"togaru"));
		Interface i1=Student::new;
		System.out.println(i1.get("ha", 0, "to"));
		
	}
}
class Student{
	String name;
	int rollno;
	String lastname;
	Student(String name,int rollno,String lastname){
		this.name=name;
		this.rollno=rollno;
		this.lastname=lastname;
	}
}
interface Interface{
	public Student get(String name,int rollno,String lastname);
}
