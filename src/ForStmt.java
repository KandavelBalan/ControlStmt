public class ForStmt {

    public static void main(String[] args){

//        int a=5;
//
//        for(int i = a ; i >= 0;  i--){
//
//            for(int j=0;j<=i; j++){
//                System.out.print(" ");
//            }
//
//            for(int j=i;j<=a; j++){
////                System.out.println(j);
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }
//        for(int i = 0 ; i <= a;  i++){
//
//            for(int j=i;j>=0; j--){
//                System.out.print(" ");
//            }
//
//            for(int j=a;j>=i; j--){
////                System.out.println(j);
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }
//    int arr[] = {1,3,4,5,7};
//        for (int i:arr){
//            System.out.println(i);
//        }
        aa:
        for (int i=1; i<=3; i++){
            bb:
            for(int j=1; j<=3; j++ ){
                if(i==2 && j==2){
                    continue bb;
                }
                System.out.println(i + " "+ j);
            }
        }
    }

}
