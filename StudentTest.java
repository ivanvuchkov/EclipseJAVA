import java.util.Scanner;

public class StudentTest {
	private Student St;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		String name;
		String studienrichtung;
		int jahre;
		int stNummer;
		int note;
		
		System.out.println("Bitte ausfullen sie den Name");
		name=scanner.nextLine();
		
		System.out.println("Bitte ausfullen sie die studienrichtung");
		studienrichtung=scanner.nextLine();
		
		System.out.println("Bitte ausfullen sie die jahre");
		jahre=scanner.nextInt();
		
		System.out.println("Bitte ausfullen sie das St.Number");
		stNummer=scanner.nextInt();
		
		System.out.println("Bitte ausfullen sie die Note");
		note=scanner.nextInt();
		
		
		
		//Student myStudent=new Student (name,studienrichtung,jahre,stNummer,note);
		//myStudent=displayMessage();
		
		
		
		Student myStudent=new Student("Ivan","Wirtschaftinformatik",2013,87132,2);
		myStudent.displayMessage();
		
		Student myStudent2=new Student("Petur","Informatik",2002,76345,1);
		myStudent2.displayMessage();
		
		
		myStudent.setStudienrichtung("Mathematik");
		myStudent.displayMessage();
		System.out.println(myStudent.getStudienrichtung());
		
		
	}

}
