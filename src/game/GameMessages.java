package game;

import static game.ascii_art.Colors.*;

/**
 * Messages sent to the player during the game
 */
public final class GameMessages {

    public static final String WELCOME_MESSAGE = "~~ Welcome to GUESS WHO! Are you ready? ~~\n";
    public static final String ENTER_NAME = "Please enter your name:";
    public static final String WAITING_FOR_PLAYER_JOIN = "Waiting for another player to join...";
    public static final String WAITING_FOR_PLAYER_NAME = "The other player is still choosing a name. Please wait...";
    public static final String CLIENT_ERROR = "Something went wrong with this client's connection. Error: ";
    public static final String START_GAME = "\nTHE GAME IS ON!\n";
    public static final String PLAYER_CARD = YELLOW.getAsciiCode() + "Your character is: %s" + RESET.getAsciiCode();
    public static final String GAME_RULES = """
             \\nList of rules:
            1 - Two players are required to play the game
            2 - Each player takes a mystery character card from a set of predefined character cards. These cards represent the mystery characters.
            3 - In first round each player must use yes or no questions to narrow down the possibilities to try to figure out the other player's mystery character
            4 - In the next rounds they can choose ask a new question or try to guess the opponent's mystery character
            5 - Each player must eliminate characters from the board based on the answers
            6 - If the guess is incorrect, that player loses the game
            7 - The first player to correctly guess the opponent's mystery character automatically wins the game
            8 - In the end, players can choose to play another round or quit the game
            """;
    public static final String COMMAND_HELP = """
            \nList of available commands:
            /help\t\t\t Shows the help menu
            /rules\t\t\t Brings up the rulebook
            /board\t\t\t Shows the current board state
            /mycard\t\t\t Check player own character
            /hide <name>\t Hides one or more characters from your board
            /question\t\t Ask the opponent a question
            /guess <name>\t Attempt to guess the opponent character
            /quit\t\t\t Quits the game
            """;

    public static final String THIS_IS_THE_CHARACTER = "This is the character that you will try to guess\n";
    public static final String WAITING_PLAYER_QUESTION= "We're waiting for %s to ask a question...\n";
    public static final String PLAYER_GUESS = "Please, choose a character (if you miss, you lose): ";
    public static final String CHOOSE_A_QUESTION = "Please choose one question:\n"+
            "1 Is he a man?\n" +
            "2 Is she a woman?\n" +
            "3 Are they old?\n" +
            "4 Is their hair blond?\n" +
            "5 Is their hair brown?\n" +
            "6 Is their hair red?\n" +
            "7 Do they wear glasses?\n" +
            "8 Are their eyes blue?\n" +
            "9 Are their eyes brown?\n" +
            "10 Is their shirt green?\n";
    public static final String INVALID_QUESTION = "Please choose a valid question.\n";
    public static final String FAIL_GUESS = "%s has guessed %s and... Wrong character, try again next turn\n";
    public static final String INVALID_COMMAND = "No such command\n";
    public static final String MISS_TURN= "%s loss the turn, wait for the next turn :(\n";
    public static final String PLAYER_TURN = "It's your turn, ask a question or try to guess.\n";
    public static final String OPPONENT_TURN = "It's %s's turn.\n";
    public static final String PLAYER_WON = "%s is the WINNER\n\n";
    public static final String PLAYER_LEFT_GAME = "%s has left the game\n";
    public static final String GAME_OVER = "This game is now over. Nice to see you\n";
}

