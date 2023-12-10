package johnny.leetcode.algorithm;

/**
 * 860. Lemonade Change
 * At a lemonade stand, each lemonade costs $5.
 * <p>
 * Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
 * <p>
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
 * <p>
 * Note that you don't have any change in hand at first.
 * <p>
 * Return true if and only if you can provide every customer with correct change.
 * <p>
 * Example 1:
 * Input: [5,5,5,10,20]
 * Output: true
 * Explanation:
 * From the first 3 customers, we collect three $5 bills in order.
 * From the fourth customer, we collect a $10 bill and give back a $5.
 * From the fifth customer, we give a $10 bill and a $5 bill.
 * Since all customers got correct change, we output true.
 * <p>
 * Example 2:
 * Input: [5,5,10]
 * Output: true
 * <p>
 * Example 3:
 * Input: [10,10]
 * Output: false
 * <p>
 * Example 4:
 * Input: [5,5,10,10,20]
 * Output: false
 * Explanation:
 * From the first two customers in order, we collect two $5 bills.
 * For the next two customers in order, we collect a $10 bill and give back a $5 bill.
 * For the last customer, we can't give change of $15 back because we only have two $10 bills.
 * Since not every customer received correct change, the answer is false.
 * <p>
 * Note:
 * {@code 0 <= bills.length <= 10000}
 * bills[i] will be either 5, 10, or 20.
 *
 * @author Johnny
 */
public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) {
            return true;
        }

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < bills.length; i++) {
            int bill = bills[i];
            if (bill == 5) {
                count1++;
            } else if (bill == 10) {
                if (count1 > 0) {
                    count1--;
                    count2++;
                } else {
                    return false;
                }
            } else {
                if (count2 > 0) {
                    if (count1 > 0) {
                        count1--;
                        count2--;
                    } else {
                        return false;
                    }
                } else {
                    if (count1 > 2) {
                        count1 = count1 - 3;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
