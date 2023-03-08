public class A03 {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
            sum += numbers[i];
        }

        double average = (double) sum / 100;
        int aboveAverageCount = 0;
        int i = 0;
        while (i < 100) {
            if (numbers[i] > average) {
                aboveAverageCount++;
            }
            i++;
        }

        System.out.println("Average: " + average);
        System.out.println("Number of elements above the average: " + aboveAverageCount);
    }
}
