
public class Main {
    public static void main(String[] args) {
        System.out.println("Palindrom tasks");
        String palindrom = "А роза упала на лапу Азора";
        String cleanStr = palindrom.toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        String reversed = new StringBuilder(cleanStr).reverse().toString();

        if (cleanStr.equals(reversed)) {
            System.out.println("Строка " + reversed + " является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}