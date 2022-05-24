


public interface Student_Course {
 public abstract String addCourse();
 public abstract String viewCourse();
public abstract String addFee();

public static void  main(String[] arg) {
	Student_Course sc=new SCM(); //polymorphism
	String addCourse=sc.addCourse();
	System.out.println( addCourse);
	Student_Course vc=new SCM(); //polymorphism
	String viewCourse=vc.viewCourse();
	System.out.println( "All The Best");
	Student_Course af=new SCM(); //polymorphism
	String addfee=af.addFee();
	System.out.println( addfee+" Welcome");
}
}