import java.util.*;

public class CLI implements UserInterface {
    
    @Override
    public int getParameter(String message, int min, int max) {
        int result = min-1;
        while (result < min || result > max) {
            System.out.print("Please enter "+message+" between "+min+" and "+max+": ");
            try {
                result = Integer.parseInt(new Scanner(System.in).nextLine());
            } catch (NumberFormatException e) {}
        }
        return result;
    }

    @Override
    public void showResult(String message) {
        System.out.println(message+"\n\nThanks for playing.");
        System.exit(0);
    }

    @Override
    public void startGame(Game game) {
        game.setUserInterface(this);
        while (true) {
            System.out.println(game);
            game.checkResult();
            Coordinate pos = null;
            while (true) {
                int x = this.getParameter("x coordinate", 1, game.getHorizontalSize())-1;
                int y = this.getParameter("y coordinate", 1, game.getVerticalSize())-1;
                pos = new Coordinate(x,y);
                if (game.isFree(pos)) {
                    break;
                }
                System.out.println("The position is not free!");
            }
            game.addMove(pos);
        }
    }

}
