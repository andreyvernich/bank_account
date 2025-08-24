import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Account bigLebowski = new Account("Big Lebowski", new BigDecimal(12000000), false);
        Account spiderman = new Account("Spiderman", new BigDecimal(200000), true);
        Account boJackHorseman = new Account("BoJack Horseman", new BigDecimal(3000000), true);

        List<Account> accountList = new ArrayList<>();
        accountList.add(bigLebowski);
        accountList.add(boJackHorseman);
        accountList.add(spiderman);

        service.transfer(spiderman, boJackHorseman, new BigDecimal(235));
        service.transfer(spiderman, bigLebowski, new BigDecimal(1205));
        service.transfer(spiderman, boJackHorseman, new BigDecimal(235000000));


        System.out.println(service.getInactiveAccounts(accountList));

        System.out.println(service.searchById(accountList, 1));

    }
}
