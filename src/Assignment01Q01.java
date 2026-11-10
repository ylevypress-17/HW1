public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String candidate : args) {
             if (candidate.isEmpty()) {
                continue;
            }
            char ch = candidate.charAt(0);
            if (ch%5==0) {
                System.out.println(ch);
            }

        }
    }
}