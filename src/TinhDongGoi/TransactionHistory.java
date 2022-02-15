package TinhDongGoi;

public class TransactionHistory {


    public static void saveTransaction(){
        // mong muon phi la 10.000
        int moneyTransfer = 1000000;
        Transaction transaction = new Transaction();
        transaction.transactionFee = 0.03;
        double money = transaction.getMoneyinMonth(moneyTransfer);
        System.out.println(money);
    }

    public static void main(String[] args) {
        saveTransaction();
    }
}
