class Operators{
	public static void main(String [] args){
		int product1 = 2000;  //4000
		int product2 = 5000;
		int product3 = 10000;
		int product4 = 10000;
		int total_products_cost = product1 + product2 + product3;
	        double total_products_cost_after_discount = total_products_cost - (total_products_cost * 0.1);
		double average_cost = total_products_cost/3;
		int average_cost_rem = total_products_cost%3;
		System.out.println("Before updating: " + product1);
		product1 *= 2;
		System.out.println("After updating: " + total_products_cost);
		total_products_cost += product2;
		System.out.println("After updating: " + total_products_cost);
		System.out.println("After updating: " + product1);
		System.out.println(total_products_cost);
		System.out.println(total_products_cost_after_discount);
		System.out.println(average_cost);
                System.out.println(average_cost_rem);
		System.out.println(product3 > product4);
		System.out.println(product3 <= product4);
		System.out.print(product3 == product4 ? "Both are same" : "Both are not same");
		 //int a = (int) args[0];
		//int b = (int) args[1];
		System.out.print(3 + 4 == 34 ? "Matches" : "Not Matches");
		
	}
}





