class Else_If{
	String day;
	public static void main(String [] args){
Else_If d1  = new Else_If();
		char grade = 'Z';
		switch(grade){
			default : 
				System.out.print("enter blw 0-6");
			case 'A' :
                          d1.day = "Sunday";
				break;
			case  'B':
		          d1.day = "Monday";
				break;
			case 2 : 
			  d1.day = "Tuesday";
				break;
			case 3 : 
			  d1.day = "Wednesday";
				break;
			case 4 : 
			  d1.day = "Thursday";
				break;
			case 5 : 
			  d1.day = "Friday";
				break;
			case 6 : 
			  d1.day = "Saturday";
				break;
		}
		
	}
}
