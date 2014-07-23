package AtmGeneratedCode;

import java.util.HashMap;
import java.util.Map;

public enum WithdrawalAmountOption
{
    TWENTY(1, 20),
    FOURTY(2,40),
    SIXTY(3,60),
    ONE_HUNDRED(4,100),
    TWO_HUNDRED(5,100),
    EXIT(6,0);
    
    private static Map<Integer, WithdrawalAmountOption> map = new HashMap<Integer, WithdrawalAmountOption>();
    static
    {
        for (WithdrawalAmountOption wao : WithdrawalAmountOption.values())
        {
            map.put(wao.getChoice(), wao);
        }
    }
    private final int choice;
    private final int amount;
    
    private WithdrawalAmountOption(int choice, int amount)
    {
        this.choice = choice;
        this.amount = amount;
    }

    public int getChoice()
    {
        return choice;
    }

    public int getAmount()
    {
        return amount;
    }
    
    public static WithdrawalAmountOption convert(int choice)
    {
        WithdrawalAmountOption wao = map.get(choice);
        if (wao == null)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            return wao;
        }
    }
}
