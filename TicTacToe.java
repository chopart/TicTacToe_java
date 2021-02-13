/** main class creating a board and the GUI
 * defines the game play
 */
public class TicTacToe {

    /** main method asking user for number of players and then starting game with GUI */    
    public static void main(String[] args) {
        UserInterface ui = args.length > 0 ? new CLI() : new GUI();
        int numPlayers = ui.getParameter("number of players", 2, 6);
        Game game = new TTTGame(numPlayers);
        ui.startGame(game);
    }

}
