import java.util.Scanner;

public class HeighthForTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the heighth of the child:");
        double H=sc.nextDouble();
        boolean resultat=(H<=1.2);
        if (resultat=true)
        System.out.println("Needn't to pay for the ticket.");
        else
            System.out.println("Need to pay for the ticket.");
    }

}