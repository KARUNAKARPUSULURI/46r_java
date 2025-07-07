class Main {
    public static int add(){
        return 4;
    }
    public String greet(String name){
        String wish = "Good Morning";
        return wish + " " +name;
    }
    public static void main(String[] args) {
        Main p1 = new Main();
        String s1 = p1.greet("Karunakar");
        System.out.println(s1);
        if(add() % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}

class Main {
    static int balance = 20000;
    public static int checkBalance(){
        return balance;
    }
    
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    
    public static void main(String[] args) {
        Main b1 = new Main();
        System.out.println(checkBalance());
        System.out.println(b1.deposit(500));
        System.out.println(b1.withdraw(1500));
    }
}