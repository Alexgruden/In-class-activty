public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int sumEven = 0;
        sumEven += b;
        while (b < 1) {
            if (b % 2 == 0) {

                b = a + b;
            }
            int temp = a;
            b = temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
