import java.util.*;
class admin extends merchant{
    static Scanner sc=new Scanner(System.in);
    //String
    static void adduser(){
       //System.out.println("Enter user Name");
       //String a=sc.nextLine();
       //boolean ans1=li.contains(a);
       int k=li3.indexOf("notapproved");
       if(k>=0){
           System.out.println(li.get(k));
           System.out.println("1.Approve");
           System.out.println("2.Not Approve");
           int y=sc.nextInt();
           sc.nextLine();
           if(y==1){
               //int x1=li.indexOf(a);
               li3.set(k, "approved");
               adduser();
           }else if(y==2){
               li3.set(k, "denied");
               adduser();
           }
       }else{
           System.out.println("no Requests");
       }
    }
    static void removeuser(){
        System.out.println("Enter user Name");
        String a2=sc.nextLine();
        boolean ans2=li.contains(a2);
        if(ans2){
            int x2=li.indexOf(a2);
            li.remove(x2);
            li2.remove(x2);
            li3.remove(x2);
    }else{
        System.out.println("Enter a valid username");
    }
    }
    }
class merchant{
    static Scanner sc=new Scanner(System.in);
    //static boolean ans=
    static List<String>li=new ArrayList<>();
    static List<Integer>li2=new ArrayList<>();
    static List<String>li3=new ArrayList<>();
    static List<String>name1=new ArrayList<>();
    static List<String>products=new ArrayList<>();
    static List<Integer>number=new ArrayList<>();
    static List<Integer>price=new ArrayList<>();
    static List<String>cart=new ArrayList<>();
    static List<String>cart1=new ArrayList<>();
    static void newuser(){
        System.out.println("Enter your Name");
        String username=sc.nextLine();
        li.add(username);
        System.out.println("Enter your Password");
        int userpass=sc.nextInt();
        li2.add(userpass);
        sc.nextLine();
        li3.add("notapproved");
    }
    static void existinguser(){
        System.out.println("Enter Your Username :");
        String name=sc.nextLine();
        boolean ans=li.contains(name);
        if(ans){
            System.out.println("Enter Your Password");
            int x=li.indexOf(name);
            int p=sc.nextInt();
            sc.nextLine();
            if(p==li2.get(x) && li3.get(x).equals("approved")){
                System.out.println("1.Add Items");
                System.out.println("2.Review Items");
                System.out.println("3.Compare");
                System.out.println("4.Exit");
                System.out.println("Enter your choice");
                int a=sc.nextInt();
                sc.nextLine();
                if(a==1){
                    
                    System.out.println("Number items to add");
                    int b=sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<b;i++){
                        name1.add(name);
                        System.out.println("Name of the Items");
                        String c=sc.nextLine();
                        //sc.nextLine();
                        products.add(c);
                        System.out.println("Number of Items");
                        int d=sc.nextInt();
                        sc.nextLine();
                        number.add(d);
                        System.out.println("Cost of the item");
                        int e=sc.nextInt();
                        sc.nextLine();
                        price.add(e);
                    }
                }
                else if(a==2){
                    System.out.println(name1);
                    System.out.println(products);
                    System.out.println(number);
                    System.out.println(price);
                }
                else if(a==3){
                    System.out.println("Name the Item to be Compared");
                    String f=sc.nextLine();
                    boolean g=products.contains(f);
                    if(g){
                        int h=products.indexOf(f);
                        for(int j=h;j<products.size();j++){
                            if(f.equals(products.get(j))){
                                System.out.print(name1.get(j)+" ");
                                System.out.print(products.get(j)+" ");
                                System.out.print(number.get(j)+" ");
                                System.out.print(price.get(j)+" ");
                                System.out.println();
                            }
                        }
                    }else{
                        System.out.println("Not Available");
                    }
                }
            }
            else if(p==li2.get(x) && li3.get(x).equals("notapproved"))
                System.out.println("Youre Not Approved by Admin");
            else if(p==li2.get(x) && li3.get(x).equals("denied"))
                System.out.println("request denied");
            
        }
        else{
            System.out.println("Not an user");
        }
    }
    
}
class buyer extends merchant{
    static Scanner sc=new Scanner(System.in);
    static List<String>buyernew=new ArrayList<>();
    static List<Integer>buyercheck=new ArrayList<>();
    static void newbuyer(){
        System.out.println("Enter your name");
        String a=sc.nextLine();
        buyernew.add(a);
        System.out.println("Enter your password");
        int b=sc.nextInt();
        buyercheck.add(b);
    }
    static void existbuyer(){
        System.out.println("Enter your name:");
        String g=sc.nextLine();
        boolean ans3=buyernew.contains(g);
        if(ans3){
            int x3=buyernew.indexOf(g);
            System.out.println("Enter your password");
            int p=sc.nextInt();
            sc.nextLine();
            if(p==buyercheck.get(x3)){
                System.out.println("welcome "+g);
                System.out.println("1.Search");
                System.out.println("2.Buy");
                System.out.println("3.Cart");
                System.out.println("Enter Your Choice:");
                int a3=sc.nextInt();
                sc.nextLine();
                if(a3==1){
                    System.out.println("Enter the name of the item to be searched:");
                    String b3=sc.nextLine();
                    boolean c3=products.contains(b3);
                    if(c3){
                        int d3=products.indexOf(b3);
                        for(int e3=d3;e3<products.size();e3++){
                            if(b3.equals(products.get(e3))){
                                System.out.print(products.get(e3));
                                System.out.println(price.get(e3));
                                System.out.println("Press 1 to add to cart:");
                                int f3=sc.nextInt();
                                sc.nextLine();
                                if(f3==1){
                                    cart.add(g);
                                    cart1.add(b3);
                                }
                            }
                        }
                    }else{
                        System.out.println("Not having");
                    }
                }
                else if(a3==3){
                    int g3=cart.indexOf(g);
                    for(int h3=g3;h3<cart.size();h3++){
                        if(g.equals(cart.get(h3))){
                            System.out.println(cart1.get(h3));
                        }
                    }
                }else if(a3==2){
                    System.out.println("Enter the name of the item:");
                    String i3=sc.nextLine();
                    System.out.println("Enter the merchant name:");
                    String j3=sc.nextLine();
                    int k3=products.indexOf(i3);
                    System.out.println("Number of items");
                    int l3=sc.nextInt();
                    sc.nextLine();
                    int m3=number.get(k3)-l3;
                    number.set(k3,m3);
                    
                }
            }
        }else{
            System.out.println("Enter a valid user name");
        }
    }
}
class product{
    
}
class order{
    
}
    public class Amazon
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    int ch;
		do{
		    
		System.out.println("WELCOME");
		System.out.println("1.Admin Login");
		System.out.println("2.Merchant Login");
		System.out.println("3.Buyer Login");
		System.out.print("4.Exit  ");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		sc.nextLine();
		switch(ch) {
		case 1:
		    admin a1=new admin();
		    System.out.println("Enter your UserName:");
		    String abc=sc.nextLine();
		    System.out.println("Enter your password:");
		    int abcd=sc.nextInt();
		    sc.nextLine();
		    if(abc.equals("admin") && abcd==12345){
		    System.out.println("1.Add User");
		    System.out.println("2.Remove User");
		    int m=sc.nextInt();
		    sc.nextLine();
		    if(m==1){
		        a1.adduser();
		        //String name=sc.nextLine();
		        
		    }else if(m==2){
		        a1.removeuser();
		    }
		    }else{
		        System.out.println("Enter a Valid UserName and Password");
		    }
		    break;
		case 2:
		    merchant m1=new merchant();
		    System.out.println("1.New User");
		    System.out.println("2.Existing User");
		    int n=sc.nextInt();
		    sc.nextLine();
		    if(n==1)
		        m1.newuser();
		    else if(n==2)
		        m1.existinguser();
		    break;
		case 3:
		    buyer b1=new buyer();
		    System.out.println("1.New User");
		    System.out.println("2.Existing User");
		    int z=sc.nextInt();
		    sc.nextLine();
		    if(z==1){
		        b1.newbuyer();
		    }if(z==2){
		        b1.existbuyer();
		    }
		    break;
		case 4:
		    System.out.println("Thank You");
		    break;
			
			
		}
		
	}while(ch!=4);
}
}
