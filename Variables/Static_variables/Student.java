class Student{
	static String collegeName; //null
	static int id = 123456;
	int a = 10; //instance variables
	public void idInfo(String howToOnProjector){
		System.out.print("5" + Student.id + howToOnProjector);
	}
	public static void main(String[] args){
		Student student = new Student();
		student.idInfo("remote");
		System.out.print("4" + collegeName); //null
		System.out.print("" + Student.collegeName);
		collegeName = "XYZ";
		System.out.print("7" + collegeName); //XYZ
		
	}
}