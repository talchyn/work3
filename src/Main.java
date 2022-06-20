public class Main {
    public static void main(String[] args) {
        System.out.println(maxFinder( 16, 30));
        System.out.println(maxFinder(12, 32));
        System.out.println(maxFinder(22, 25));
        System.out.println(maxFinder(14, 14));
        System.out.println(maxFinder(10, 19));
        System.out.println(maxFinder(17, 30));

    }

    public static String maxFinder (int age, int temperature) {
        if (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
        return "Can go outside";



        else if (age < 20 && temperature >= 0 && temperature <= 28)
                return "Can go outside";
        else if (age < 45 && temperature >= -10 && temperature <= 25)
                return "Can go outside";
        else
                return "Stay at home";












    }
}
