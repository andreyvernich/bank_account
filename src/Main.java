import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account bigLebowski = new Account("Big Lebowski", new BigDecimal(12000000), false);
        Account spiderman = new Account("Spiderman", new BigDecimal(200000), true);
        Account boJackHorseman = new Account("BoJack Horseman", new BigDecimal(3000000), true);

        List<Account> accountList = new ArrayList<>();
        accountList.add(bigLebowski);
        accountList.add(boJackHorseman);
        accountList.add(spiderman);

        Service.transfer(spiderman, boJackHorseman, new BigDecimal(235));
        Service.transfer(spiderman, bigLebowski, new BigDecimal(1205));
        Service.transfer(spiderman, boJackHorseman, new BigDecimal(235000000));

        System.out.println(Service.getInactiveAccounts(accountList));

        System.out.println(Service.searchById(accountList, 1));

    }
}
