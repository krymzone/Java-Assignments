import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] brackets = {
                {0.1, 0.15, 0.25, 0.28, 0.33, 0.35},
                {0, 8350, 33950, 82250, 171550, 372950},
                {0, 16700, 67900, 137050, 208850, 372950},
                {0, 8350, 33950, 68525, 104425, 186475, 372950},
                {0, 11950, 45500, 117450, 190200, 372950}
        };

        System.out.println("Enter your filing status:");
        System.out.println("1 - Single");
        System.out.println("2 - Married Filing Jointly or Qualified Widow(er)");
        System.out.println("3 - Married Filing Separately");
        System.out.println("4 - Head of Household");
        int status = input.nextInt() - 1;

        System.out.println("Enter your taxable income:");
        double income = input.nextDouble();

        double tax = 0.0;
        for (int i = brackets[0].length - 1; i >= 0; i--) {
            if (income > brackets[status][i]) {
                tax += (income - brackets[status][i]) * brackets[0][i];
                income = brackets[status][i];
            }
        }

        System.out.printf("Your federal income tax is: $%.2f%n", tax);

        input.close();
    }
}
