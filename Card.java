import java.math.BigDecimal;

public class Card {
    private String id; // номер карты
    private String type; // Тип карты: дебетовая карта, кредитная карта
    private BigDecimal balance = BigDecimal.ZERO; // Баланс карты

    public Card(String id, BigDecimal balance) {
        super();
        this.id = id;
        this.balance = balance;
    }

    // Проверяем остатки
    public BigDecimal queryBalance() {
        return balance;
    }

    //Перевод
    public boolean transfer(Card toCard,BigDecimal amount) {
        // Оценка параметра
        if(toCard == null || toCard.getBalance()==null || amount == null || amount.compareTo(BigDecimal.ZERO)<=0) {
            System.out.println ("Ошибка параметра!");
            return false;
        }

        if(amount.compareTo(balance)>=0) {
            System.out.println ("Недостаточный остаток на счете!");
            return false;
        }

        // Целевая карта плюс сумма
        toCard.setBalance(toCard.getBalance().add(amount));

        // Текущая сумма списания с карты
        this.setBalance(getBalance().subtract(amount));

        System.out.println ("Передача прошла успешно!");
        return true;
    }

    //Изымать
    public boolean withdraw(BigDecimal amount) {
        if(getBalance()==null || amount == null ||amount.compareTo(BigDecimal.ZERO)<=0 ) {
            System.out.println ("Ошибка параметра!");
            return false;
        }

        if(amount.compareTo(balance)>=0) {
            System.out.println ("Недостаточный остаток на счете!");
            return false;
        }

        // Текущая сумма списания с карты
        this.setBalance(getBalance().subtract(amount));

        System.out.println ("Вывод прошел успешно!");
        return true;
    }

    //Изымать
    public boolean save(BigDecimal amount) {
        if(amount == null || amount.compareTo(BigDecimal.ZERO)<=0 ) {
            System.out.println ("Ошибка параметра!");
            return false;
        }

        // Текущая карта плюс сумма
        this.setBalance(getBalance().add(amount));

        System.out.println ("Депозит успешен!");
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

