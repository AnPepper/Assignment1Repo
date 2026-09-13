public class Assignment {
    public static void main(String[] args) {
        //Parallel Arrays
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        //test data
        itemNames[8] = "Banaa";
        itemPrices[8] = 0.59;
        itemStocks[8] = 30;
         restockItem(itemNames, itemStocks, "Banana", 20);
        printInventory(itemNames, itemPrices, itemStocks);
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