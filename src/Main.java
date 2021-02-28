public class Main {

     public static void main(String[] args)
     {
         char[] colorsInput = {'W', 'R', 'G'};
         int[] positionInput = {0, 0, 0};

         Piece myPiece = new Piece(positionInput, colorsInput);
         System.out.println(myPiece);
     }

}
