package Primitive;

public class Primitive {

    public static void main(String[] args) {
        int sum = 0;
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 7; n++) {
                System.out.println("Полка и ячейка [" + m + "][" + n + "]");
                sum++;
            }
        }
        System.out.println(sum);
    }
}
