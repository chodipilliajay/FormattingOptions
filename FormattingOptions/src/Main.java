public class Main {
    public static void main(String[] args) {

        String bullet = "Print a Bullet List:\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Sub Point";
        System.out.println(bullet);
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                       \u2022 Sub Point""";
        System.out.println(textBlock);
        int age = 35;
        System.out.printf("your age is %d\n",age);
        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %.2f, Birth year = %d%n", (float) age, yearOfBirth);
        String name = "Ajay";
        System.out.printf("My name is %s%n",name);

        for (int i = 1; i<=100000; i*=10){
            System.out.printf("Printing %6d%n", i);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}