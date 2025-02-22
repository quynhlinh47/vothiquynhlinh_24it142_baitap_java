package exercise3_7;

public class TestMain {

	    public static void main(String[] args) {
	    	Ball ball = new Ball(10, 10, 0);
	        Player player = new Player(7, 5.5f, 5.5f);

	        System.out.println("Initial Positions:");
	        System.out.println("Player: " + player);
	        System.out.println("Ball: " + ball);
	       
	        if (player.near(ball))
	        {
	            player.kick(ball); 
	        } else {
	            System.out.println(player + " is too far from the ball to kick it.");
	        }
	        System.out.println("New Positions After Kick:");
	        System.out.println("Player: " + player);
	        System.out.println("Ball: " + ball);
	    }
}
