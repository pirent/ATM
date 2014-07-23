package AtmGeneratedCode;

public enum MainMenuOption
{
    BALANCE_INQUIRY(1, "View my balance"),
    WITHDRAWAL(2, "Withdraw cash"),
    DEPOSIT(3, "Deposit funds"),
    EXIT(4, "Exit");
    
    private final int value;
    private final String name;
    
    private MainMenuOption(final int value, final String name)
    {
        this.value = value;
        this.name = name;
    }

    public int getValue()
    {
        return value;
    }

    public String getName()
    {
        return name;
    }

    public static MainMenuOption convert(int value)
    {
        switch (value)
        {
            case 1:
                return BALANCE_INQUIRY;

            case 2:
                return WITHDRAWAL;
                
            case 3:
                return DEPOSIT;
                
            case 4:
                return EXIT;

            default:
                return null;
        }
    }
}
