package TinhDongGoi;

public class Transaction {
    public double transactionFee = 0.01;
    public double getMoneyinMonth( int moneyTransfer){
        return moneyTransfer * transactionFee;
    }
}
