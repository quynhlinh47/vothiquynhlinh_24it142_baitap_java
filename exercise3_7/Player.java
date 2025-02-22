package exercise3_7;

public class Player {
	private int number;
	private float x, y, z;
	
	public Player(int number, float x, float y) {
		this.number = number;
		this.x = x;
		this.y = y;
		this.z = 0.0f;
	}
	public void move(float xDisp, float yDisp) {
		this.x += xDisp;
		this.y += yDisp;
	}
	public void jump(float zDisp) {
		this.z += zDisp;
	}
	public boolean near(Ball ball) {
		float distance = (float) Math.sqrt(Math.pow(this.x - ball.getX(), 2)+ Math.pow(this.y - ball.getY(), 2)+
                Math.pow(this.z - ball.getZ(), 2));
		return distance < 8;
	}
	public void kick(Ball ball) {
		if (!near(ball)) {
            System.out.println("Player " + number + " is too far to kick the ball.");
            return;
        }
        
        double angle = Math.random() * 360;
        double speed = 5.0;
        double angleInRadians = Math.toRadians(angle);

        float xDisp = (float) (speed * Math.cos(angleInRadians));
        float yDisp = (float) (speed * Math.sin(angleInRadians));
        ball.move(xDisp, yDisp);

        System.out.println("Player " + number + " kicks the ball at " + angle + " degrees.");
        System.out.println("Ball moves by (" + xDisp + ", " + yDisp + ")");
    }
	
}
