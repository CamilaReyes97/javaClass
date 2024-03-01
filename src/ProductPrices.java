public class ProductPrices {
    public static void main(String[] args) {

        String[] products = {"Product 1", "Product 2", "Product 3", "Product 4", "Product 5",
                "Product 6", "Product 7", "Product 8", "Product 9", "Product 10"};
        double[] prices = {10.50, 20.30, 5.75, 22.00, 8.25, 11.00, 19.95, 2.99, 100.00, 50.00};

        double totalCost = 0.0;
        double highestPrice = prices[0];
        String highestPriceProduct = products[0];
        double lowestPrice = prices[0];
        String lowestPriceProduct = products[0];

        for (int i = 0; i < prices.length; i++) {
            // Calculate total cost
            totalCost += prices[i];


            if (prices[i] > highestPrice) {
                highestPrice = prices[i];
                highestPriceProduct = products[i];
            }


            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
                lowestPriceProduct = products[i];
            }
        }


        double averageCost = totalCost / prices.length;


        System.out.println("Product with the highest price: " + highestPriceProduct + " - $" + highestPrice);
        System.out.println("Total cost for all products: $" + totalCost);
        System.out.println("Average cost for the products: $" + String.format("%.2f", averageCost));
        System.out.println("Least expensive product: " + lowestPriceProduct + " - $" + lowestPrice);
    }
}

