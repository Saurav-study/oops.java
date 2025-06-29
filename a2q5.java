package assignment2;
class Deposit{
    long principle;
    int time;
    double rate;
    double Total_amt;
    public  Deposit(){
        this.principle=0;
        this.time=0;
        this.rate=0.0;
        this.Total_amt=0.0;
    }

    public  Deposit(long principle,int time,double rate) {
        this.principle=principle;
        this.time=time;
        this.rate=rate;
        calcAmt();
    }
   public Deposit (long principle, int time){
        this.principle=principle;
        this.time=time;
        this.rate=0;
        calcAmt();
   }
   public Deposit(long principle,double rate){
       this.principle=principle;
       this.time=0;
       this.rate=rate;
       calcAmt();
   }
   public void calcAmt(){
        Total_amt=principle+(principle*rate*time)/100;
   }
   public void display(){
       System.out.println("Principal: " + principle);
       System.out.println("Time: " + time);
       System.out.println("Rate: " + rate);
       System.out.println("Total Amount: " + Total_amt);
   }

}

public class a2q5 {
    public static void main(String[] args) {
        Deposit deposit1=new Deposit();
        deposit1.display();
        Deposit deposit2=new Deposit(12, 12.2);
        deposit1.display();
        Deposit deposit3 = new Deposit(10000, 5);
        deposit3.display();

        Deposit deposit4 = new Deposit(10000, 5.0);
        deposit4.display();
    }
}
