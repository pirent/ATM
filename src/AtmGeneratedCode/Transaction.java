//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Transaction.java
//  @ Date : 7/18/2014
//  @ Author : 
//
//
package AtmGeneratedCode;

public abstract class Transaction
{
    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;

    public Transaction(int accountNumber, Screen screen,
            BankDatabase bankDatabase)
    {
        super();
        this.accountNumber = accountNumber;
        this.screen = screen;
        this.bankDatabase = bankDatabase;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public Screen getScreen()
    {
        return screen;
    }

    public BankDatabase getBankDatabase()
    {
        return bankDatabase;
    }

    public abstract void execute();
}
