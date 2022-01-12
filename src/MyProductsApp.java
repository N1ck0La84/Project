public class MyProductsApp {

    public static void main(String[] args) {

        Products drinks = new Products("бутылка", "Балтика", "золотистый", "1,5");

        System.out.println(drinks.label);
        System.out.println(drinks.volume);
        System.out.println(drinks.container);
        System.out.println(drinks.color);

        Products bread = new Products("пакет", "СМАК", "чёрный", "полкило");

        System.out.println(bread.label);
        System.out.println(bread.volume);
        System.out.println(bread.container);
        System.out.println(bread.color);

        Products meat = new Products("пакет", "корова", "розовый", "килограмм");

        System.out.println(meat.label);
        System.out.println(meat.volume);
        System.out.println(meat.container);
        System.out.println(meat.color);

        Products grocery = new Products("коробка", "гречка", "коричневый", "килограмм");

        System.out.println(grocery.label);
        System.out.println(grocery.volume);
        System.out.println(grocery.container);
        System.out.println(grocery.color);
    }
}
