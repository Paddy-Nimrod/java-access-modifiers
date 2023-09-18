// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st static test");
//        System.out.println(firstInstance.getName() + " is instance number: " + firstInstance.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2st static test");
//        System.out.println(secondInstance.getName() + " is instance number: " + secondInstance.getNumInstances());


//        Account cicenicAccount = new Account("Cicenic");
//        cicenicAccount.deposit(100000);
//        cicenicAccount.deposit(234300);
//        cicenicAccount.withdraw(50000);
//        cicenicAccount.getBalance();
//        cicenicAccount.calculateBalance();

        int answer = multiply(6);
        System.out.println("The answer is " + answer);


    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}