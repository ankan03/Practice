//The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days.
//
//For example -  If the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
//
//Output format:
//
//Buy on day: 0 Sell on day: 3
//
//Buy on day: 4 Sell on day: 6
//
//User Input Description:
//First line - Number of elements in an array, N
//Second line -Space separated N elements of an array


//7
//100 180 260 310 40 535 695
//Buy on day: 0 Sell on day: 3
//Buy on day: 4 Sell on day: 6

//6
//120 100 85 225 150 200
//Buy on day: 2 Sell on day: 3
//Buy on day: 4 Sell on day: 5

//6
//20 10 85 25 50 20
//Buy on day: 1 Sell on day: 2
//Buy on day: 3 Sell on day: 4

package myPerfectice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Interval {
    int buy, sell;
}

class Q20 {
    void stockBuySell(int price[], int n) {
        if (n == 1)
            return;
        int count = 0;
        ArrayList<Interval> sol = new ArrayList<Interval>();
        int i = 0;
        while (i < n - 1) {
            while ((i < n - 1) && (price[i + 1] <= price[i]))
                i++;
            if (i == n - 1)
                break;
            Interval e = new Interval();
            e.buy = i++;
            while ((i < n) && (price[i] >= price[i - 1]))
                i++;
            e.sell = i - 1;
            sol.add(e);
            count++;
        }
        if (count == 0)
            System.out.println("There is no day when buying the stock "
                    + "will make profit");
        else
            for (int j = 0; j < count; j++)
                System.out.println("Buy on day: " + sol.get(j).buy
                        + " " + "Sell on day: " + sol.get(j).sell);
        return;
    }

    public static void main(String args[]) {
        Q20 stock = new Q20();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = in.nextInt();
        stock.stockBuySell(price, n);
        stock.stockBuySell1(price, n);
    }

    private void stockBuySell1(int[] price, int n) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(0);
        for (int i = 1; i < n; i++) {
            if (price[i] < price[i - 1]) {
                l2.add(i - 1);
                l1.add(i);
            }
        }
        l2.add(n - 1);
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) != l2.get(i))
                System.out.println("Buy on day: " + l1.get(i) + " Sell on day: " + l2.get(i));
        }
    }
}
