import java.util.Scanner;

public class rickshaw
{
    public static void main (String[]args){
    
        
    int basefare = 25;
    int perkilometercharge = 10;
    int permincharge = 5;
    
    Scanner input = new Scanner (System.in);
    System.out.println("ENTER DISTANCE in Km");
    double Dis = input.nextDouble();
    System.out.println("distance in kilometer"+ Dis+"Km");
    input.nextLine();
     
    System.out.println("ENTER TIME in minute");
    int time = input.nextInt();
    System.out.println("Time in minutes is"+ time+"min");
    input.nextLine();
    
    System.out.println("IS CUSTOMER LOCAL?");
    String islocal = input.next();
    
    String check = (islocal.equalsIgnoreCase("yes"))?"CUSTOMER IS LOCAL":"CUSTOMER IS NOT LOCAL";
    System.out.println(check);
    
    System.out.println("IS RIDE NIGHT ?");
    String ride = input.next();
    
    String checkr = (ride.equalsIgnoreCase("yes"))?"NIGHT RIDE":"DAY RIDE";
    System.out.println(checkr);
    
    double total = (Dis*perkilometercharge) +(time*permincharge)+ basefare;
    
    double total1 = check.equalsIgnoreCase("CUSTOMER IS LOCAl") ? total * 0.9 : total; //10%
    double total2= checkr.equalsIgnoreCase("night ride") ? total1*1.15 : total1; //15%
    
    
    System.out.println("TOTAL Fare: " + total2);
    
   
    
    }
}