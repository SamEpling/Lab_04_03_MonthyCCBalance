public class Main
{
    public static void main(String[] args)
    {
        double initialBalance = 5000;
        double interestAfter1Month = initialBalance * .17;
        double interestAfter2Months = (initialBalance + interestAfter1Month) * .17;
        System.out.println("The interest on " + initialBalance + " after one month is " + interestAfter1Month);
        System.out.println("The interest on " + initialBalance + " after two months is " + interestAfter2Months);
    }
}