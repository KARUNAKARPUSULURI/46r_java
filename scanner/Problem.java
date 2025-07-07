import java.util.Scanner;

class Problem{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int per = sc.nextInt();
		double is = sc.nextDouble();
		int exp = sc.nextInt();
		if((per > 80 && per < 100) && (is > 7.5 && is < 9.0) && exp >= 5){
			System.out.print("You are hired!");
	        }else if((per > 60 && per <= 80) && (is > 6.0 && is <= 7.5) && exp <= 4){
			System.out.print("Your profile is on hold");
		}else{
			System.out.print("rejected");
		}	
	}
}