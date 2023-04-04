import java.util.Scanner;
class Bank {
    String name,acc_type;
    Long account_no;
    int balance_amt;
    Bank(String n,String t,Long ac,int ba){
        name=n;
        acc_type=t;
        account_no=ac;
        balance_amt=ba;
    }
    void display(){
        System.out.println("Account holder: "+name+"\nAccount type: "+acc_type+"\nAccount Number: "+account_no+"\nBalance amount: "+balance_amt);
    }
    void deposit(int d){
        if(d>0){
            balance_amt=balance_amt+d;
            System.out.println("Deposited amount : "+d+ "\nBalance amount : "+balance_amt);
        }
        else{
            System.out.println("Enter right amount!");
        }
    }
    void withdrawal(int w){
        if(w<balance_amt){
            balance_amt=balance_amt-w;
            System.out.println("Withdrawal Amount : "+w+ "\nBalance amount : "+balance_amt);
        }
        else{
            System.out.println("Insufficient amount!");
        }
    }
}
public class BankAccount{
    public static void main(String[] args){
        Long ac;
        int ba,d,w;
        String n,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the Depositer :");
        n=sc.nextLine();
        System.out.println("Enter Account type : ");
        t=sc.nextLine();
        System.out.println("Enter Account number : ");
        ac=sc.nextLong();
        System.out.println("Enter balance amount : ");
        ba=sc.nextInt();
        System.out.println("Enter the amount to deposit : ");
        d=sc.nextInt();
        System.out.println("Enter the amount to withdrawal: ");
        w=sc.nextInt();
        Bank b=new Bank(n,t,ac,ba);
        b.display();
        b.deposit(d);
        b.withdrawal(w);
    }
}
