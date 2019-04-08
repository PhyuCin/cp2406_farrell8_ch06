public class Perfect {
    public static void main(String[] args){
        final int MAX = 1000;
        double perfect;
        System.out.println("Perfect numbers from 1 through 1000:");
        for(int num = 1; Math.pow(2, num-1) * ( Math.pow(2, num) - 1 ) < MAX; ++num){
            perfect = Math.pow(2, num-1) * ( Math.pow(2, num) - 1 );
            System.out.println(perfect);
        }
        System.out.println("End.");
    }

}
