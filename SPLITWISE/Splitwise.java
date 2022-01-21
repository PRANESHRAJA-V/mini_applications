import java.util.*;
public class Splitwise
{
    static Scanner sc=new Scanner(System.in);
    static int password,w,ch,each,i,d;
    static String name,T;
    static List<String>name1=new ArrayList<>();
    static List<Integer>pass=new ArrayList<>();
    static List<Integer> wallet =  new ArrayList<Integer>();
    static List<Integer> debt=new ArrayList<Integer>();
    
    static void func(){
        System.out.println("Welcome to the Group");
        System.out.println("Please Enter your Name:");
        name=sc.next();
        System.out.println("Please  Enter your Password:");
        int password=sc.nextInt();
        sc.nextLine();
        for(i=0;i<name1.size();i++){
            if(name1.get(i).equals(name) && pass.get(i)==password){
                      
                do{
                    w=wallet.get(i);
                    
                    System.out.println("1.Pay the Expenses:");
                    System.out.println("2.See the Debt");
                    System.out.println("3.Pay the Debt");
                    System.out.println("4.Update Wallet Amount:");
                    System.out.println("5.Add Friends");
                    System.out.println("6.Remove Friends");
                    System.out.println("7.Exit");
                    System.out.println("Please Enter your Choice:");
                     ch=sc.nextInt();
                    switch(ch){
                        case 1:
                         expense();
                         break;
                        case 2:
                         System.out.println(debt.get(i));
                         break;
                        case 3:
                         debt();
                         break;
                        case 4:
                        System.out.println("Enter the amount to add:");
                        int amountto=sc.nextInt();
                        amountto+=wallet.get(i);
                        wallet.set(i,amountto);
                         break;
                        case 5:
                         add();
                         break;
                        case 6:
                         remove();
                         break;
                        case 7:
            
                         break;
                    }
                }while(ch!=7);
            }else{
                System.out.println("Enter a valid Username or Password");
            }
        } 
    }
    static void expense(){
        System.out.println("Enter the amount to pay:");
        int amount=sc.nextInt();
        if(amount<=w){
            String statement="The amount paid by "+name+" is "+amount+"";
            T+=statement;
            each=amount/name1.size();
            for(int j=i+1;j<name1.size();j++){
               int debts=each;
               debt.set(j,debts);
               
            }
            System.out.println("Amount of "+amount+"is paid");
            w=wallet.get(i)-amount;
            wallet.set(i,w);
        }
    }
    static void debt(){
      System.out.println("Debts in your account is:");
      System.out.println(debt.get(i));
      System.out.println("Enter the amount to pay:");
      int a=sc.nextInt();
      d=debt.get(i)-a;
      debt.set(i,d);
        
    }
    static void add(){
      System.out.println("Enter the no of Friends to add:");
      int n=sc.nextInt();
      for(int k=0;k<n;k++){
          System.out.println("Enter the name of your Friend:");
          String names=sc.next();
          name1.add(names);
          System.out.println("Enter the password for your Friend:");
          int passs=sc.nextInt();
          pass.add(passs);
          wallet.add(0);
          debt.add(0);
      }
  }
    static void remove(){
      System.out.println("Enter the Name to remove:");
      String n=sc.next();
      
      for(int k=0;k<name1.size();k++){
          if(name1.get(k).equals(n)){
              name1.remove(k);
              pass.remove(k);
              wallet.remove(k);
              debt.remove(k);

          }
      }
    }
    
	public static void main(String[] args) {
	    
	    name1.add("raja");
	    name1.add("sai");
	    
	    pass.add(1234);
	    pass.add(1234);
	    
	    wallet.add(3000);
	    wallet.add(3000);
	    
	    debt.add(0);
	    debt.add(0);
	    
	    do{
        System.out.println("WELCOME TO THE SPLITWISE APPLICATION:");
        System.out.println("1.Group");
        System.out.println("2.Expenses");
        System.out.println("3.Exit");
        System.out.println("Please Enter your Choice:-");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
             func();
             break;
            case 2:
            System.out.println(T);
             break;
            case 3:
             System.out.println("Thank you");
             break;
        }
    }while(ch!=3);
	}
}
