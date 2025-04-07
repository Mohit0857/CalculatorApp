// backend

import java.util.Random;

public class RockPaperScissor {
    // all of the choices that a computer can choose
    private static final String[] computerChoices = { "Rock", "Paper", "Scissor" };

    // Store the computer choice
    private String computerChoice;

    // store the scores so that we can retrieve the values and display it to the
    // frontned
    private int computerScore, playerScore;

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    // use to generate a random number to randomly chhose
    private Random random;

    // constructor - to initailize random object

    public RockPaperScissor() {
        random = new Random();
    }

    // call this method to begin playin rock paper scissor
    // this method will return the result of the game
    public String playRockPaperrScissor(String playerChoice) {
        // genera5e computer choice

        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning messageindicate the result of the game
        String result;

        // evealute the winner

        if (computerChoice.equals("Rock")) {
            if (playerChoice.equals("Paper")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Scissor")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else if (computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissor")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else {
            // computer choose scissor
            if (playerChoice.equals("Rock")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Paper")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        }
        return result;
    }
}
