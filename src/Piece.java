import java.util.ArrayList;
import java.util.Arrays;

public class Piece {
    ArrayList<Integer> position = new ArrayList(Arrays.asList(0, 0, 0));
    ArrayList<Character> colors = new ArrayList(Arrays.asList('0', '0', '0'));

    public Piece(int[] positionInput, char[] colorsInput){

        //Set position vector (x, y, z)
        for(int i = 0; i < position.size(); i++)
            position.set(i, positionInput[i]);
        //Set color order (x, y, z)
        for(int i = 0; i < colors.size(); i++)
            colors.set(i, colorsInput[i]);

    }

    public String toString(){
        return ("Position{x, y, z} = " + this.position + "\n")
        +      ("Colors{x, y, z} = " + this.colors);
    }

}
