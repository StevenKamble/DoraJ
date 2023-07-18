
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class pro5 extends Applet implements Runnable
{

    private int x, y; // Coordinates of the circle
    private int dx, dy; // Velocity of the circle
    private Thread animationThread;
    private boolean isRunning;

    @Override
    public void init() {
        x = 50;
        y = 50;
        dx = 2; // Change this value to control the speed and direction along the x-axis
        dy = 1; // Change this value to control the speed and direction along the y-axis
    }

    @Override
    public void start() {
        if (animationThread == null) {
            animationThread = new Thread(this);
            isRunning = true;
            animationThread.start();
        }
    }

    @Override
    public void stop() {
        isRunning = false;
        animationThread = null;
    }

    @Override
    public void run() {
        while (isRunning) {
            // Move the circle
            x += dx;
            y += dy;

            // Check for collisions with the applet's boundaries
            int appletWidth = getWidth();
            int appletHeight = getHeight();

            if (x < 0 || x + 50 > appletWidth) {
                dx = -dx; // Reverse the x-direction when hitting the left or right edge
            }

            if (y < 0 || y + 50 > appletHeight) {
                dy = -dy; // Reverse the y-direction when hitting the top or bottom edge
            }

            // Repaint the applet to update the circle's position
            repaint();

            // Delay the animation
            try {
                Thread.sleep(20); // You can adjust this value to control the animation speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        // Clear the applet
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw the moving circle
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }


     
}