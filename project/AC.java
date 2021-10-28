
package project;

public class AC {
    void ac(){
        System.out.println("                                                -----------------------------------");
        System.out.println("                                                | Toilet |              |  Toilet |");
        System.out.println("                                                ----------              -----------");
        System.out.println("                                                |                                 |");
        System.out.println("                                                |1||2| |3|               |7||8| |9|");
        System.out.println("                                                |4||5| |6|               |10|11|12|");
        System.out.println("                                                |                                 |");
        System.out.println("                                                |13|14|15|               |19|20|21|");
        System.out.println("                                                |16|17|18|               |22|23|24|");
        System.out.println("                                                |                                 |");
        System.out.println("                                                ----------              -----------");
        System.out.println("                                                | Toilet |              |  toilet|");
        System.out.println("                                                -----------------------------------");                                       
    
}
}


class Temperature {
    Scanner sc = new Scanner(System.in);
    double temperature, celsius, fahrenheit, kelvin;
    DecimalFormat f = new DecimalFormat("##.##");
 
    Temperature() {
        System.out.println("\t Welcome to Temperature Converter!\t\n");
        System.out.println("\tMain menu of Temperature conversion.\t");
        System.out.println("\t----------------------------------");
        System.out.println("1:Celsius.....\n2:Fahrenheit....... \n3:Kelvin.........");
        System.out.println("Enter your choice: ");
        int a = sc.nextInt();
        switch (a) {
        case 1:
            Celsius();
            break;
        case 2:
            Fahrenheit();
            break;
        case 3:
            Kelvin();
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }
