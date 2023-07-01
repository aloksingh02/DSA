//ITERATIVE METHOD

//public class factorial {
//    static int factorial(int n){
//        int res = 1;
//        for( int i = 2; i<=n; i++){
//            res = res *i;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int n = 9;
//        System.out.println("factorial is:" +factorial(n));
//    }
//}


//RECURSIVE METHOD
public class  factorial {
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial is:" +factorial(n));
    }
}



