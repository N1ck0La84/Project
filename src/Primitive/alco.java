package Primitive;

public class alco {
    public static void main(String[] args) {
        // boolean beard = true; // true - борода есть, false - бороды нет
        // boolean passport = false; // true - показал паспорт, false - не показал паспорт
        int age = 17;

        if (beard()) {
            System.out.println("Продаём алкоголь");
        } else if(passport() && age > 17)
        {
            System.out.println("Продаём алкоголь");
        }   else {
            System.out.println("Подрасти ещё, сынок!");
        }
    }

    private static boolean beard() {
        return false;
    }

    private static boolean passport() {
        return true;
    }
}