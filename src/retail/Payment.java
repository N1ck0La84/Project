package ru.retail;

public class Payment {

    private String paymentType;
    private Order order;
    private float sum;
    private String state;

    public Payment(String paymentType, float sum, String state, Order order){
        this.paymentType = paymentType;
        this.order = order;
        this.sum = sum;
        this.state = state;
    }

    public void printCheck(String paymentTypeSign){
        System.out.println("Напечатан чек по об оплате. Сумма " + sum);
        System.out.println("Тип оплаты: " + paymentType);
        System.out.println("Признак способа расчета: " + paymentTypeSign);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}