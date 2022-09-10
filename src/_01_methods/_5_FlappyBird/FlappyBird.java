package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdYVelocity = -50;
    int gravity = 1;
    int x=0;
    int y=400;
    int pipeX=400;
    int pipeY=0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
   
    }

    @Override
    public void setup() {
       size(WIDTH, HEIGHT); 
    }

    @Override
    public void draw() {
    	background(255, 21, 21);
    	fill(0, 100, 2);
    	stroke(243, 9, 5);
    	ellipse(x, y, 100, 100);
    	y = y + gravity;
    	fill(0, 0, 0);
    	rect(pipeX, pipeY, 10, 100);
    	

    }
    @Override
    public void mousePressed(){
    	y= y + birdYVelocity;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
      
    }
}
