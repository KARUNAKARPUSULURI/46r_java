public class Operator2{
	public static void main(String [] args){
		int a  = 10;
		int b = 5;
		int c = 15;
		String name1 = "Karunakar";
		String name2 = "Shanmukh";
		String name3 = "Satish";
		String d = a > b && a > c ? "a is greater" : b > a && b > c ? "B is greater" : "c is greater";
		System.out.print(d);
		String e = name1 == "" ? "Present" : "Absent";
		String f = name2 == "Shanmukh" ? "Present" : "Absent";
		String g = name3 == "Satish" ? "Present" : "Absent";
		String h = name1 == "Karunakar" ? "Present" : name2 == "Karunakar" ? "Present" : name3 == "Karunakar" ? "Present" : "Absent";
		System.out.print(e + f + g + h);
		String i = !(name1 == "Karunakar" || name2 == "Karunakar" || name3 == "Karunakar") ? "Present" : "Absent";
		System.out.print(i);
		int abc = 5;
		abc++;
		int bca = 5;
		bca--;
		System.out.print(abc++ + ++bca); //11
		System.out.print(abc++ + ++bca); //13
	}
}









