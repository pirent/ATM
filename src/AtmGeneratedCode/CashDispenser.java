//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : CashDispenser.java
//  @ Date : 7/18/2014
//  @ Author : 
//
//
package AtmGeneratedCode;

public class CashDispenser
{
    private static final int INITIAL_COUNT = 500;
    private int count;
    
    public CashDispenser()
    {
        this.count = INITIAL_COUNT;
    }

    public void dispenseCash(int amount)
    {
        /*
         * The class trusts that a client (i.e., Withdrawal) calls dispenseCash
         * only after establishing that sufficient cash is available by calling
         * isSufficientCashAvailable. Thus, dispenseCash simply simulates
         * dispensing the requested amount without checking whether sufficient
         * cash is available.
         */
        
        // number of $20 bills required
        int billRequired = amount/20;
        
        // update the count of bill
        count -= billRequired;  
    }

    /**
     * Indicates whether cash dispenser can dispense desired amount

     * @param amount
     * @return
     */
    public boolean isSufficientCashAvailable(int amount)
    {
        int billRequired = amount/20;
        return (count >= billRequired);
    }
}