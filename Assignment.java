import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        //Parallel Arrays
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        //test 
        itemNames[9] = "Banana";
        itemPrices[9] = 0.59;
        itemStocks[9] = 30;
        itemNames[8] = "Apple";
        itemPrices[8] = 0.22;
        itemStocks[8] = 10;

        //Options Menu
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("=== Menu === \n 1. See Inventory \n 2. Restock Item \n 3. Exit ");
            System.out.print("Select an option: ");

            int select = input.nextInt();
            input.nextLine();

            switch(select){
                case 1:
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                case 2:
                    System.out.print("Enter name of item to restock:");
                    String itemTarget = input.nextLine();
                    System.out.print("enter amount to add to stock:");
                    int amount = input.nextInt();
                    
                    restockItem(itemNames, itemStocks, itemTarget, amount);
                    break;
                case 3: 
                    //Ends program through 'return'
                    System.out.println("Closing menu...");
                    return;
                default:
                    System.out.println("invalid choice.");
                    break;

            }


        }

    }
  
    public static void printInventory(String[] names, double[] prices, int[] stocks){
        for (int i = 0; i < names.length; i++){
            if (names[i] != null)
                System.out.println("Item: " + names[i] + " | Price: " + prices[i]  + " | In Stock: " + stocks[i]);
        }
    }

    public static void restockItem(String[] names, int[] stocks, String target, int amount){
        for (int i=0; i < names.length; i++){
            if(names[i] != null && names[i].equalsIgnoreCase(target)){
                stocks[i] += amount;
                System.out.println(amount + " units added to " + target + "'s stock.");
                break;
            }
            else if(i == (names.length - 1))
                System.out.println("Item not found");
        }

    }
}