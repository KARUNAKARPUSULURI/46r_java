import java.util.Scanner;
class ScannerFunc{
	public static void main(String [] args){
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		double salary = s1.nextDouble();
		s1.nextLine();
		String name = s1.nextLine();
		System.out.println("age : " + age);
		System.out.println("salary : " + salary);
		System.out.println("name : " + name);
		if(age > 30){
			System.out.println("salary" + " " + salary + name);
		}else{
			System.out.println("no salary");
		}
	}
}