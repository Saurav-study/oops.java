package assignment2;
class Bank {
    String bankName;
    int depositAmount;
    static double totalAmount=0;
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAmount(int depositAmount){
        this.depositAmount=depositAmount;
    }
    public void showData(){
        System.out.println(bankName+ "is the name of the bank with deposite amount" +depositAmount);
    }
}
public class h2q3 {
    public static void main(String[] args) {
        String[] bankNames={"abcd","ruf","fr","rjit","rijtug"};
        int[] depositeAmounts={1220,4340,4500,1000,2000};
        Bank[] banks=new Bank[5];
        for (int i=0;i<5;i++){
            banks[i]=new Bank();
            banks[i].setBankName(bankNames[i]);
            banks[i].setAmount(depositeAmounts[i]);
        }
        for (Bank bank:banks){
            bank.showData();
        }

            

        }

    }

