public interface UserInterface {

    /** ask the user for a parameter between min and max */
    int getParameter(String message, int min, int max);

    /** start the game */
    void startGame(Game game);

    /** show a final result and exit */
    void showResult(String message);

}
