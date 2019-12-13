import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        KasaProcessor kasaProcessor = new KasaProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Zlevněné itemy");
        System.out.println("2. Serazene itemy");
        System.out.println("3. ");
        System.out.println("4. Strom kategorií");
        System.out.println("5. Strom kategorií s počtem itemů");
        System.out.println("6. ");

        String SCANNER = scanner.nextLine();

        if (SCANNER.equals("1")) {
            kasaProcessor.printOnlyDiscountedProducts();
        } else if (SCANNER.equals("2")) {
            kasaProcessor.sortProductByPrice();
        } else if (SCANNER.equals("3")) {
            kasaProcessor.printFirstSortedProducts();
        }else if(SCANNER.equals("4")){
            kasaProcessor.createCategoryTree();
        }else if(SCANNER.equals("5")){
            kasaProcessor.createCategoryTreeWithProductsCount();
        }else if(SCANNER.equals("6")){
            kasaProcessor.createMap();
        }
    }
}
