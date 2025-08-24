import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Service {

    public void transfer(Account sender, Account recipient, BigDecimal amount) {
        preliminaryTransferCheck(sender, recipient, amount);

        System.out.println(amount + "$ from " + sender.getName() + " to " + recipient.getName());
        sender.setAmount(sender.getAmount().subtract(amount));
        recipient.setAmount(recipient.getAmount().add(amount));
        System.out.println("Перевод успешно выполнен");
        System.out.println(sender.getName() + " amount: " + sender.getAmount());
        System.out.println(recipient.getName() + " amount: " + recipient.getAmount());
    }
    public void preliminaryTransferCheck(Account sender, Account recipient, BigDecimal amount) {
        if (!sender.isActive()) {
            throw new InactiveAccountException("Ошибка. Счет отправителя не активен");
        }
        if (!recipient.isActive()) {
            throw new InactiveAccountException("Ошибка. Счет получателя не активен");
        }
        if (sender.getAmount().compareTo(amount) < 1) {
            throw new InsufficientFundsException("Ошибка. На счете недостаточно средств");
        }
    }


    public List<Account> getInactiveAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> !account.isActive())
                .toList();
    }

    public Optional<Account> searchById(List<Account> accounts, int id) {
        for (Account account : accounts) {
            if (account.getID() == id) {
                return Optional.of(account);
            }
        }
        return Optional.empty();
    }
}



