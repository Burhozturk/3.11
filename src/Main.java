import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner p0=new Scanner(System.in);
        Scanner p1=new Scanner(System.in);
        Scanner p2=new Scanner(System.in);

        System.out.println("Indtast et tal for p0");
        double doubleP0=p0.nextDouble();
        System.out.println("Indtast et tal for p1");
        double douubleP1=p1.nextDouble();
        System.out.println("Indtast et tal for p2");
        double doubleP2=p2.nextDouble();
        if(doubleP0>douubleP1&&douubleP1>doubleP2)
        {
            System.out.println("p0 er på venstre side og p1 er på venstre side");
        }
        if(doubleP0<douubleP1&&douubleP1<doubleP2)
        {
            System.out.println("p0 er på højre sie og p1 er på højre side");
        }



    }
}
