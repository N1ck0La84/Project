package Construct;

public class Prod {

    public static void main(String[] args) {

        int b = 5; //количество коробок с товаром
        int p = 10; //количество ед-ц товара в коробке
        int t = b*p; //общее количество товара
        System.out.println("На склад поступило" + " " + b + " " + "коробок");
        System.out.println("В коробке по" + " " + p + " " + "единиц товара");
        for (int box=b; box > 0; box--) {
            for (int prod=p; prod > 0; prod--) {
                System.out.println("Осталось" + " " + t-- + " " + "единиц товара и" + " " + box + " " + "коробки");
                if (box < 2) {
                    System.out.println("Пора делать новый заказ");
                }

            }
        }
    }
}
