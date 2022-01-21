import java.util.*;
public class Atm{
	static Scanner sc=new Scanner(System.in);
//	static int[] ar= {0,0,0,0};
	static int twothousand1=10;
	static int fivehundred1=10;
	static int twohundred1=10;
	static int hundred1=10;
	static int praneshbalance=50000;
	static int withdraw=0,withdraw1=0;
	static int amount,atmbalance,username1=0,t=0;
	static List<Integer>li=new ArrayList<>();
	static List<String>li2=new ArrayList<>();
	
	public static void addAmount() {
		System.out.println("Enter the Amounts to be added");
		System.out.println("Enter the number 2000 notes :");
		int twothousand=sc.nextInt(); 
		sc.nextLine();
		twothousand1+=twothousand;
		System.out.println("Enter the number 500 notes");
		int fivehundred=sc.nextInt(); 
		sc.nextLine();
		fivehundred1+=fivehundred;
		System.out.println("Enter the amount of 200 notes :");
		int twohundred=sc.nextInt(); 
		sc.nextLine();
		twohundred1+=twohundred;
		System.out.println("Enter the amount of 100 notes :");
		int hundred=sc.nextInt(); 
		sc.nextLine();
		hundred1+=hundred;
		atmbalance=(twothousand1*2000)+(fivehundred1*500)+(twohundred1+200)+(hundred1*100);
	}
	public static void display() {
		int total=0;
		System.out.println(twothousand1);
		System.out.println(fivehundred1);
		System.out.println(twohundred1);
		System.out.println(hundred1);
	}
	public static void checkBalance(){
	    int n=praneshbalance-withdraw;
	    System.out.println(n);
	}
	public static void withdraw(){
	    
	    sc.nextLine();
	    if (amount>99)
	        withdraw=amount;
	    
	    
	}
	public static void notes(){
	    if(amount>99){
	        int a=(int)amount/2000;
	        
	        amount-=a*2000;
	        int b=(int)amount/500;
	        amount-=b*500;
	        int c=(int)amount/200;
	        amount-=c*200;
	        int d=(int)amount/100;
	        amount-=d*100;
	        if(a<twothousand1 && b<fivehundred1 && c<twohundred1 && d<hundred1)
	            System.out.println(twothousand1-a);
	            twothousand1-=a;
	            System.out.println( fivehundred1-b);
	            fivehundred1-=b;
	            System.out.println(twohundred1-c);
	            twohundred1-=c;
	            System.out.println(hundred1-d);
	            hundred1-=d;
	    }
	}
	public static void notes1(){
	    if(amount>99){
	        int b=(int)amount/500;
	        amount-=b*500;
	        int c=(int)amount/200;
	        amount-=c*200;
	        int d=(int)amount/100;
	        amount-=d*100;
	        if( b<fivehundred1 && c<twohundred1 && d<hundred1)
	            System.out.println(twothousand1);
	            System.out.println( fivehundred1-b);
	            System.out.println(twohundred1-c);
	            System.out.println(hundred1-d);
	    }
	}
	public static void notes2(){
	    if(amount>99){
	        int c=(int)amount/200;
	        amount-=c*200;
	        int d=(int)amount/100;
	        amount-=d*100;
	        if( c<twohundred1 && d<hundred1)
	            System.out.println(twothousand1);
	            System.out.println( fivehundred1);
	            System.out.println(twohundred1-c);
	            System.out.println(hundred1-d);
	    }
	}
	public static void notes3(){
	    if(amount>99){
	       
	        int d=(int)amount/100;
	        amount-=d*100;
	        if( d<hundred1)
	            System.out.println(twothousand1);
	            System.out.println( fivehundred1);
	            System.out.println(twohundred1);
	            System.out.println(hundred1-d);
	    }
	}
	public static void history(){
	    //li.add()
	}
	public static void withdraw1(){
	    int a=amount,b=0,c=0,d=0,e=0;
	    withdraw1=0;
	    //praneshbalance-=t;
	                 while(a!=0){
            if(a>=2000 && twothousand1!=0){
                a-=2000;
                b+=1;
                twothousand1--;
                withdraw+=2000;
                withdraw1+=2000;
            }
            else if(a>=500 && fivehundred1!=0){
                a-=500;
                c+=1;
                fivehundred1--;
                withdraw+=500;
                withdraw1+=500;
            }
            else if(a>=200 && twohundred1!=0){
                a-=200;
                d+=1;
                twohundred1--;
                withdraw+=200;
                withdraw1+=200;
            }
            else if(a>=100 && hundred1!=0){
                a-=100;
                e+=1;
                hundred1--;
                withdraw+=100;
                withdraw1+=100;
            }
            else{
                System.out.println("Insufficient Balance");
                withdraw=0;
                withdraw1+=0;
                break;
            }
            
            
	}
	t=withdraw1;
	//praneshbalance=praneshbalance-withdraw;
	}
	public static void pinchange(){
	    li2.clear();
	    String s1=sc.nextLine();
	    li2.add(s1);
	    String s=li2.get(0);
		int o=Integer.parseInt(s);
	}
	public static void main(String[] args) {
	    li2.add("1234");
	    int r=0;
		int ch=0;
		do {
		System.out.println("ATM MACHINE");
		System.out.println("1.Admin Login");
		System.out.println("2.User Login");
		System.out.println("3.Exit");
		System.out.print("Choice  ");
		ch=sc.nextInt();
		sc.nextLine();
		switch(ch) {
		case 1:
			System.out.println("Enter your Id");
			String id=sc.nextLine();
			System.out.println("Enter your pass");
			int pass=sc.nextInt();
			
			if(id.compareTo("admin")==0  && pass==2020) {
				while(true) {
				System.out.println("----------ADMIN-------");
				System.out.print("1.load\n2.display\n3.clear\n");
				System.out.print("enter your choice: ");
				int lo=sc.nextInt();
				if(lo==1) {
					addAmount();
					continue;
				}
					
				else if(lo==2) {
					display();
					continue;
				}
				else if(lo==3)
					break;
					
			}
			}else{
			    System.out.println("Invalid username or password");
			    
			}
			
			break;
		
		case 2:
			System.out.println("Welcome");
			System.out.println("Enter your name");
			String username = sc.nextLine();
			System.out.println("Enter your password");
			int password = sc.nextInt();
			sc.nextLine();
			
			String s=li2.get(0);
			int o=Integer.parseInt(s);
			if(username.equals("pranesh") && password==o && username1<=2){
			    System.out.println("Welcome Pranesh");
			    System.out.println("1.Withdrwal");
			    System.out.println("2.Check Balance");
			    System.out.println("3.Exit");
			    System.out.println("4.Tranaction History");
			    System.out.println("5.Pin Change");
			   // sc.nextLine();
			    System.out.println("Enter your choice");
			    int n=sc.nextInt();
			    sc.nextLine();
			    if(n==1 ){
			        System.out.println("Enter code :");
			
			String code=sc.nextLine();
			        System.out.println("Enter the amount to withdraw");
			        amount=sc.nextInt();
			        
			        withdraw1();
			        li.add(t);
                    //char c=code.charAt(0);
                    String v="s123";
                   // char y='s';
                    //String z=Character.toString(y);
                    if(!v.equals(code))
                        r++;
            
        }
			        
			    else if(n==2 ){
			        //String s=Integer.toString(withdraw);
			        //li.add(s);
			        if(r>2)
			            System.out.println(praneshbalance-withdraw-((r-2)*20));
			        else if(r<=2)
			            System.out.println(praneshbalance-withdraw);
			            //praneshbalance=praneshbalance-withdraw;
			        //checkBalance();
			    }else if(n==3){
			        
			        break;
			    }else if(n==4){
			        System.out.println(li);
			    }else if(n==5){
			        pinchange();
			    }
			} else if(username1>2){
			    System.out.println("Too Many Attempts");
			}
			else{
			    System.out.println("Invalid username or password");
			    username1++;
			}
			
			break;
		case 3:
			System.out.println("----Closed-----");
			break;
		default:
			System.out.println("----Invalid Input-----"); 
		
		}
		}while(ch!=3);
	

}
}