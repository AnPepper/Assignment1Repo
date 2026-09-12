public class Assignment {
    public static void main(String[] args) {
        //Parallel Arrays
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }
  
    public static void printInventory(String[] names, double[] prices, int[] stocks){
        for (int i = 0; i < names.length; i++){
            if (names[i] != null)
                System.out.println("Item: " + names[i] + " | Price: " + prices[i]  + " | Stock: " + stocks[i]);
        }
    }
}