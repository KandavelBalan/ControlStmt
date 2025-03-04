public class IfStmt {
    public static void main(String args[]){
        int age = 15;
        int bikecc = 200;
        if(age > 18){
            System.out.println("Carry License");
            if (bikecc > 100){
                System.out.println("Helmet must");
            }
            else {
                System.out.println("No Helmet");
            }
        }
        else{
            System.out.println("No Driving");
        }
//        int no = 30;
        String output = (age%3==0)?"Divisible by 3":"Not divisible by 3";
        System.out.println(output);
    }
}
