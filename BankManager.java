import java.math.BigDecimal;
import java.util.Scanner;

public class BankManager {
    private Card card;
    // Открытая карта
    public Card createCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Выведите номер карты:");
        String id = scanner.nextLine();

        while(id == null || "".equals(id)) {
            System.out.println ("Выведите номер карты:");
            id = scanner.nextLine();
        }

        System.out.println ("Выведите сумму депозита:");
        BigDecimal amount = scanner.nextBigDecimal();
        Card newCard = new Card(id,amount);
        scanner.close();
        this.card = newCard;
        return newCard;
    }

    public void saveMoney(BigDecimal amount) {
        this.card.save(amount);
    }

    public void withdrawMoney(BigDecimal amount) {
        this.card.withdraw(amount);
    }

    public void transferMoney(Card to,BigDecimal amount) {
        this.card.transfer(to,amount);
    }

    public void queryBalance() {
        System.out.println(this.card.queryBalance());
    }

    public void exit() {
        System.out.println ("Операция завершена, запускаем систему!");
        this.card = null;
    }

    public static void main(String[] args) {
        BankManager manager = new BankManager();
        manager.createCard();
        manager.queryBalance();
        manager.saveMoney(new BigDecimal(10));
        manager.withdrawMoney(new BigDecimal(100));
        manager.transferMoney(null, new BigDecimal(10000));
        manager.exit();
    }
}

