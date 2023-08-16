import java.util.Scanner;

public class SecondsConverter 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(" Hours: " + hours);
        System.out.println(" Minutes: " + minutes);
        System.out.println(" Seconds: " + remainingSeconds);


        
        input.close();
    }
}
