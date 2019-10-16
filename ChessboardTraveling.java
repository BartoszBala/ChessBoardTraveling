package Coderbyte;

public class ChessboardTraveling {

    int horizontal;
    int vertical;


    public void setXY(String string) {
        int x = Integer.parseInt(string.substring(1, 2));
        int y = Integer.parseInt(string.substring(3, 4));
        int a = Integer.parseInt(string.substring(6, 7));
        int b = Integer.parseInt(string.substring(8, 9));

        this.horizontal = a - x;
        this.vertical = b - y;
        System.out.println(a - x);
        System.out.println(b - y);

    }


    public static long factorial(int n) {
        long factorial = 1;
        while (n != 0) {
            factorial = factorial * n;
            n--;

        }

        return factorial;

    }

    private static long returnNumberOfPosibility(int x, int y) {

        long numberOfStep;

        numberOfStep = (factorial(x + y) / (factorial(x) * factorial(y)));


        return numberOfStep;

    }


    public static void main(String[] args) {

        ChessboardTraveling chessboardTraveling = new ChessboardTraveling();
        chessboardTraveling.setXY("(1 1)(4 6)");
        long x =returnNumberOfPosibility(chessboardTraveling.horizontal, chessboardTraveling.vertical);
        System.out.println(x);
    }


}
