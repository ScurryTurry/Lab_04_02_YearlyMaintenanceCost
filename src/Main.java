public class Main
{
    public static void main(String[] args)
    {
        double springCost = 150.42;
        double summerCost = 60.56;
        double fallCost = 75.40;
        double winterCost = 80.07;
        double maintenanceCost = 0.00;

        maintenanceCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The yearly maintenance cost is $" + maintenanceCost);
    }
}