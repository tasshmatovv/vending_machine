package model;

public class CoinAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount ( int newAmount){
        this.amount = newAmount;
    }

   public void AddFundsFromCard(int amounToAdd){
        if (amounToAdd > 0){
            amount += amounToAdd;
            System.out.println("Баланс успешно пополнен на " +amounToAdd + "рублей");
       }else{
            System.out.println("Неверная сумма");
        }
   }
}
