import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class GamePanel extends JPanel implements Runnable{

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_D = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;


    // initializing the values
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;


    GamePanel(){

        newPaddles();
        newBall();

        score = new Score(GAME_WIDTH, GAME_HEIGHT);

    // will read key pressing
        this.setFocusable(true);

        this.addKeyListener(new AL());

        //already have an initialized screen size above
        this.setPreferredSize(SCREEN_SIZE);

        gameThread = new Thread(this);
        gameThread.start();


    }

    public void newBall(){
        random = new Random();

        // can delete int y & make ball pawn at a random in the middle. Just add random.nextInt(GAME_HEIGHT - BALL_D) to the y
        ball = new Ball((GAME_WIDTH/2) - (BALL_D/2), (GAME_HEIGHT/2) - (BALL_D/2), BALL_D, BALL_D);

    }

    public void newPaddles(){
        paddle1 = new Paddle(0, (GAME_HEIGHT/2) - (PADDLE_HEIGHT/2), PADDLE_WIDTH, PADDLE_HEIGHT, 1);
        paddle2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH, (GAME_HEIGHT/2) - (PADDLE_HEIGHT/2), PADDLE_WIDTH, PADDLE_HEIGHT, 2);

    }

    public void paint(Graphics g){

        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();


        //gonna pass in graphics that we drew from image above;
        draw(graphics);

        g.drawImage(image, 0,0,this);

    }

    public void draw(Graphics g){
        paddle1.draw(g);
        paddle2.draw(g);
        ball.draw(g);
        score.draw(g);
    }

    public void move(){
        paddle1.move();
        paddle2.move();
        ball.move();

    }

    public void checkCollision(){

        //bounce ball off top & bottom window edges

        if (ball.y <= 0){
            ball.setYDirection(-ball.yVelocity);
        }
        if (ball.y >= GAME_HEIGHT - BALL_D){
            ball.setYDirection(-ball.yVelocity);
        }


        if(ball.x <= 0){
            ball.setXDirection(-ball.xVelocity);
        }
        if (ball.x >= GAME_WIDTH - BALL_D){
            ball.setXDirection(-ball.xVelocity);
        }
        

        //stops paddles at the end of window edges

        //if you move up
        if(paddle1.y <= 0){
            paddle1.y = 0;
        }
        // if you move down
        if(paddle1.y >= (GAME_HEIGHT - PADDLE_HEIGHT)){
            paddle1.y = GAME_HEIGHT - PADDLE_HEIGHT;
        }
        if(paddle2.y <= 0){
            paddle2.y = 0;
        }
        // if you move down
        if(paddle2.y >= (GAME_HEIGHT - PADDLE_HEIGHT)){
            paddle2.y = GAME_HEIGHT - PADDLE_HEIGHT;
        }

        // give a player 1 point & creates new paddles & ball
        if(ball.x<=0){
            score.player2++;
            newPaddles();
            newBall();
            System.out.println("Player 2: " + score.player2);
        }
        if (ball.x>=GAME_WIDTH-BALL_D){
            score.player1++;
            newPaddles();
            newBall();
            System.out.println("Player 1: " + score.player1);
        }


        // bounces off paddles
        // you can use intersect, since it's a property of Rectangle

        if(ball.intersects(paddle1)){
            ball.xVelocity = Math.abs(ball.xVelocity);
            ball.xVelocity++; // optional for more difficulty
            if(ball.yVelocity > 0)
                ball.yVelocity++; // optional for more difficulty
            
            else
                ball.yVelocity--;
            
            ball.setXDirection(ball.xVelocity);
            ball.setYDirection(ball.yVelocity);
        }

        if(ball.intersects(paddle2)){
            ball.xVelocity = Math.abs(ball.xVelocity);
            ball.xVelocity++; // optional for more difficulty
            if(ball.yVelocity > 0)
                ball.yVelocity++; // optional for more difficulty
            
            else
                ball.yVelocity--;
            
            ball.setXDirection(-ball.xVelocity);
            ball.setYDirection(ball.yVelocity);
        }
    }

    public void run(){

        //game loop

        // from minecraft lol
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000/ amountOfTicks;
        double delta = 0;

        // pawning the game loop
        while(true){
            long now = System.nanoTime();
            delta += (now - lastTime)/ns;
            lastTime = now;
            if(delta >= 1){
                move();
                checkCollision();
                repaint();
                delta--;
                
            }
        }

    }






    public class AL extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            paddle1.keyPressed(e);
            paddle2.keyPressed(e);
        }

        public void keyReleased(KeyEvent e){
            paddle1.keyReleased(e);
            paddle2.keyReleased(e);
        }

    }


}