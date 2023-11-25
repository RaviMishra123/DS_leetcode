import java.util.*;
public class StockProfit {

    public static int maxStock(List<Integer> stock){
        if(stock.size() <= 1)
            return 0;
        int buy = stock.get(0);
        int profit = 0;
        for(int i=1;i<stock.size();i++){
            buy = Math.min(buy,stock.get(i));
            profit = Math.max(profit, (stock.get(i) - buy));
        }
        return profit;
    }

    public static void main (String[] args) {
        List<Integer> stock = Arrays.asList(7, 1, 8, 3, 6, 4);
        int max  = maxStock(stock);
        System.out.print(max);
    }
}