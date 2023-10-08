package assignment1;

import java.util.Scanner;

class Acc_Holder {

	  private int acc_num;
	  private String acc_holder_name;
	  private double balance;
	  
	  public Acc_Holder(){
		  acc_num=120220;
		  acc_holder_name="Akshay";
		  balance=45000;
	  }
	public int getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}
	public String getAcc_holder_name() {
		return acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposite(double deposite) {
		     balance=balance+deposite;
	}
	public void withdraw(double withdraw) {
		     if(balance<withdraw) {
		    	 System.out.println("...insufficiant balance...\n...");
		    	 System.out.println("your balance is = "+balance);
		     }
		     else {
		    	 balance=balance-withdraw;
		    	 System.out.println("balance after withdrawal is = "+getBalance());
		     }	
	}
	public Acc_Holder(int acc_num, String acc_holder_name, double balance) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.balance = balance;
		System.out.println("Congratulations.... your account is created successfully..");
	}
	@Override
	public String toString() {
		return "Acc_Holder [acc_num=" + acc_num + ", acc_holder_name=" + acc_holder_name + ", balance=" + balance + "]";
	}
}
public class AccountHolder{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);              //we can decleare it globally so that no need to write again and again
	   Acc_Holder acc[]=new Acc_Holder[100];
	   int i=0;
	   boolean t=true;
	   while(t) {
		   System.out.println(" 1. Add record for Account holder");
		   System.out.println(" 2. Display the details of all account holder");
		   System.out.println(" 3. Deposite an amount into perticular Account");
		   System.out.println(" 4. Withdraw an amount from perticular Account");
		   System.out.println(" 0. EXIT ");
		   int ch = sc.nextInt();
		   switch(ch) {
		   case 1:
			     System.out.println("enter the Account number to be created");
			     int num=sc.nextInt();
			 	 if(acc[i].getAcc_num()==num) {
					System.out.println("SORRY.....Account with this account number already exist..\n..please try with different account number");
				 }
			     sc.nextLine();               //to accept the string/char after integer
			     System.out.println("enter the Account Holder name for which account to be created");
			     String name=sc.nextLine();
			     System.out.println("enter the Account balance of which Account to be created");
			     double bal=sc.nextDouble();
			     acc[i] = new Acc_Holder(num, name, bal);
			     i++;
			     break;
		   case 2:
	             try {
		               for(int j=0; j<acc.length;j++) {
	    	                System.out.println(acc[j].toString());
	                 }
	              } catch (Exception e) {
		          //e.printStackTrace();s
	             }
			     break;
		   case 3:
			     System.out.println("enter the Account number on which balance is to deposited");
			     int acc_num=sc.nextInt();
			try {
				for(i=0;i<acc.length;i++) {
			    	 if(acc[i].getAcc_num()==acc_num) {
			    		 System.out.println("enter the balance to be deposited into your account");
					     double balance=sc.nextDouble();
			    		 acc[i].deposite(balance);
			    		 System.out.println("updated balance is = "+acc[i].getBalance());
			    	 }
			    	 else {
			    		 System.out.println("..Account with this account number does not exist..");
			    	 }
			     }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			     break;
		   case 4:
			     System.out.println("enter the Account number from which amount is to be withdraw");
			     int acc_num1=sc.nextInt();
			     try {
				     for(i=0;i<acc.length;i++) {
			    	      if(acc[i].getAcc_num()==acc_num1) {
			    		     System.out.println("enter the amount to be withdraw from your account");
			    		     double withdraw=sc.nextDouble();
			    		     acc[i].withdraw(withdraw);
			    		     //System.out.println("balance after withdrawal is = "+acc[i].getBalance());
			    	      }
			    	      else {
			    	    	  System.out.println("..Account with this account number does not exist..");
			    	      }
			           }
			      } catch (Exception e) {
				      // TODO Auto-generated catch block
				       //e.printStackTrace();
			      }
	             break;	   
		   case 0:
			      t=false;
			      sc.close();      
			      
		   }
	   }
	   
	}
}

