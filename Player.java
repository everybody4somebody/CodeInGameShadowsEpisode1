import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        
        int minHeight = H;
        int maxHeight = 0;
        int minWidth = 0;
        int maxWidth = W;
        int currentWidth = X0;
        int currentHeight = Y0;
        
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            char direction = '\0';
            
            for(int i = 0; i < bombDir.length(); i++){
               direction = bombDir.charAt(i);
               System.err.println(direction);
               if(direction == 'U'){
                   minHeight = currentHeight;
               } else if(direction == 'D'){
                   maxHeight = currentHeight;
               } else if(direction == 'L'){
                   maxWidth = currentWidth;
               } else if(direction == 'R'){
                   minWidth = currentWidth;
               }
               
            }
            
            currentHeight = (minHeight + maxHeight)/2;
            currentWidth = (maxWidth + minWidth)/2;
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // the location of the next window Batman should jump to.
            System.out.println(currentWidth + " " + currentHeight);
        }
    }
}
