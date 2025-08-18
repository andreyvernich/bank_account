import java.math.BigDecimal;

public class Account {
    static int count = 0;

    private final int ID;
    private String name;
    private BigDecimal amount;
    private boolean isActive;

    public Account(String name, BigDecimal amount, boolean isActive) {
        this.ID = count;
        Account.count++;
        this.name = name;
        this.amount = amount;
        this.isActive = isActive;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", isActive=" + isActive +
                '}';
    }
}
