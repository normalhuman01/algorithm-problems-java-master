package johnny.hackerrank.algorithm;

/**
 *
 * @author Johnny
 */
public class SherlockandSquares {
    public static int squareNumber(int start, int end) {
        if (start > end) {
            return 0;
        }
        int count = 0;
        int floor = (int)Math.floor(Math.sqrt(start));
        int root = floor * floor;
        while(root <= end) {
            if (root >= start) {
                count++;
            }
            floor++;
            root = floor * floor;       
        }
        
        return count;
    }
}
