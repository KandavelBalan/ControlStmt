import java.util.Scanner;
public class Switchstmt {
    public static void  main(String args[]){

        Scanner data = new Scanner(System.in);
        int a= data.nextInt();
        switch(a){
            case 10:
                System.out.println("Given 10");
                break;
            case 20:
                System.out.println("Given 20");
//                break;
            case 30:
                System.out.println("Given 30");
//                break;
            case 40:
                System.out.println("Given 40");
//                break;
            case 50:
                System.out.println("Given 50");
//                break;
            default:
                System.out.println("Not in range");
//                break;
        }
    }
}
