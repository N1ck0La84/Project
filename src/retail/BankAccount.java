package ru.retail;

public class BankAccount {

    private String id;
    private float sum;

    public BankAccount(String id, float sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void putMoney(float sum) {
        this.sum += sum;
        System.out.println("На рассчетный счет " + id + " перечислили " + sum);
    }

    public void takeMoney(float sum) {
        this.sum -= sum; //TODO добавить проверку баланса
        System.out.println("С расчетного счета " + id + " снято " + sum);
    }
}
