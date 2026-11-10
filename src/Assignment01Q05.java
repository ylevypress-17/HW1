import java.util.Arrays;

public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;
        //dist is an array that will hold the distance from the starting point to each point in the matrix. -1 means unviseted
        int[] dist = new int[n];
        for (int k=0; k<n; k++) {
            dist[k] = -1;
        }
        dist[i] = 0;
        //implementing a queue of visited nodes
        int[] queue = new int[n];
        int head = 0, tail = 0;
        queue[tail++] = i;
        //each node is only added and proccesd once, once we finish the loop (at most n iterations)
        //we access the distance we had when we first reached j. so we have n iterations and each iteration preforms at O(n) therfore
        //complexity is O(n^2)
        // לא הצלחתי לחשוב על דרך טובה יותר, כנראה שאפשר לעצור ברגע שמגיעים לאיבר הנדרש אבל זה לא משפר במקרה הגרוע
        // חשבתי על עוד מימוש אבל הוא פחות אופטימלי אבל עדיין O(n^2)
        /*
current = [i]; dist[i] = 0; d = 0
while current is not empty:
    next = []
    for u in current:
        for v in 0..n-1:
            if m[u][v] == 1 and dist[v] == -1:
                dist[v] = d + 1
                add v to next
    current = next
    d = d + 1
return dist[j] */

        while (head < tail) {
            int u = queue[head++];
            for (int v = 0; v < n; v++) {
                if (m[u][v] == 1 && dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    queue[tail++] = v;
                }
            }
        }

        return dist[j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}