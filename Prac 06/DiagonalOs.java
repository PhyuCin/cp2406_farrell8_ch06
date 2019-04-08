public class DiagonalOs {
    public static void main(String[] args){
        final int NUM = 10;
        StringBuilder space = new StringBuilder();
        int number;

        for(number = 0; number < NUM; ++number){
            System.out.println(space+ "O");
            space.append(" ");
        }
    }
}
