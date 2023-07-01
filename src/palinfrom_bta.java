public class palinfrom_bta {
    static boolean palindrom(int n) {
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int ld = temp%10;
            rev = rev * 10 + ld;
            temp = temp /10;
        }
        return(rev == n);
    }

    public static void main(String[] args) {
        int n = 45654;
        System.out.println("palindrem :" + palindrom(n));
    }
}
