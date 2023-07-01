//ITERATIVE
//
// public class countDigit {
//    static int countDigit(long n) {
//        int res = 0;
//        while (n > 0) {
//            n = n / 10;
//            res++;
//        }
//        return res++;
//    }
//
//    public static void main(String[] args) {
//        int n  = 356564;
//        System.out.println("total number is" + countDigit(n));
//    }
//}


//
//RECURRSIVE METHOD

public class countDigit{
    static int countDigit( long n){
        if(n/10 == 0)
            return 1;
        return 1+(countDigit(n/10));
    }

    public static void main(String[] args) {
        int n = 686465695;
        System.out.println("total "+ countDigit(n));
    }
}
