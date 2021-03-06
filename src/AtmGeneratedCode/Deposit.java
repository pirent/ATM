//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Deposit.java
//  @ Date : 7/18/2014
//  @ Author : 
//
//
package AtmGeneratedCode;

public class Deposit extends Transaction
{
    // Constant for cancel option
    private static final int CANCELED = 0; 

    private double amount;
    private Keypad keypad;
    private DepositSlot depositSlot;

    public Deposit(int accountNumber, Screen screen, BankDatabase bankDatabase,
            Keypad keypad, DepositSlot depositSlot)
    {
        super(accountNumber, screen, bankDatabase);
        this.keypad = keypad;
        this.depositSlot = depositSlot;
    }

    @Override
    public void execute()
    {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
        
        amount = promptForDepositAmount();
        
        if (amount != CANCELED)
        {
            // Request deposit envelope containing specified amount
            StringBuilder sb = new StringBuilder(
                    "\nPlease insert a deposit envolope containing ").append(amount).append(".");
            screen.displayMessageLine(sb.toString());
            
            if(depositSlot.isEnvelopeReceived())
            {
                sb = new StringBuilder("\nYour envelope has been received. ")
                        .append("\nNOTE: The money just deposited will not be available ")
                        .append("until we verify the amount of any enclosed cash and your checks clear.");
                screen.displayMessageLine(sb.toString());
                
                bankDatabase.credit(getAccountNumber(), amount);
            }      
            else 
            {
                sb = new StringBuilder("\nYou did not insert an envelope, ")
                        .append("so the ATM has canceled your transaction.");
                screen.displayMessageLine(sb.toString());
            }
        }
        else 
        {
            screen.displayMessageLine( "\nCanceling transaction..." );
        }
    }

    private double promptForDepositAmount()
    {
        Screen screen = getScreen();
        screen.displayMessage("Please enter a deposit amount in CENTS (or 0 to cancel): ");
        int input = keypad.getInput();
        
        return (input == CANCELED) ? CANCELED : input/100;
    }

}
