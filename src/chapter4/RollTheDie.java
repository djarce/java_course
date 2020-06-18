package chapter4;

/*
 * ROLL THE DIE GAME
 * Objective: Travel the entire board of 20 spaces within 5 die rolls.
 */

import java.util.Random;

public class RollTheDie {
    public static void main(String [] args){

        // Declare things we know.
        int rollNum = 5;
        int space = 0;
        int boardSpaces = 20;

        // Say hi. :D
        System.out.println("Welcome to the Roll the Die Game!");

       for(int i=0; i<rollNum; i++){
            // Roll the dice for the user (generate a random number between 1-6).
            Random random = new Random();
            int die = random.nextInt(6) + 1;

            // Advance the user that number of spaces on the board.
            space = space + die;

            // Tell the user which game space they're on.
            System.out.println("Roll #" + (i+1) + ": You've got a " + die + ". You're on space " + space + ".");

            if(space==boardSpaces){
                System.out.println("Congrats! You win n.n");
            }else if(space>boardSpaces){
                System.out.println("Oops, you've gone too far... Game over u.u");
            }else if(i == (rollNum - 1)){
                System.out.println("You've run out of turns... Game over u.u");
            }else if(space<boardSpaces){
                System.out.println("You have " + (boardSpaces-space) + " spaces to go.");
            }

       }
    }
}
