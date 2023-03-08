public class While {
    public static void main(String[] args) {

        int num = 10;
        int i = 1, j;
        while (i <= num) {
            j = 1;
            while (j <= num) {
                System.out.print(i*j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
