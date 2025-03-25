public class Main {
    public static void main(String[] args) {
        Beverage whiskey = new Whiskey();
        Beverage beer = new Beer();

        System.out.println("Preparing Whiskey:");
        whiskey.templateMethod(30);

        System.out.println("\nPreparing Beer:");
        beer.templateMethod(200);
    }
}
