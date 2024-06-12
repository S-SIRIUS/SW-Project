package final_practice;

import javax.naming.InsufficientResourcesException;

class InsufficientException extends Exception{
    public InsufficientException(){}
    public InsufficientException(String message){
        super(message);
    }
}
class Account{
    private long balance;

    public Account(){};
    public long getBalance(){
        return balance;
    }
    public void deposit(long money){
        balance += money;
    }
    public void withdraw(long money) throws InsufficientException{
        if(balance < money){
            throw new InsufficientException("Insufficeint balance: need more"+(money-balance)+"won");
        }
        balance -= money;
    }
}
public class AccountExample {
    public static void main(String[] args){
        Account account = new Account();
        account.deposit(10000);
        try{
            account.withdraw(50000);
        } catch(InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }
        finally{
            System.out.println("Deposit" + account.getBalance());
        }
    }
}
