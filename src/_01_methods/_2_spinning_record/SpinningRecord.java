package _01_methods._2_spinning_record;

import game_tools.Sound;
import processing.core.PApplet;
import processing.core.PImage;


public class SpinningRecord extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 600;
    int scoreTracker;   
    Song song = new Song("awesomeTrack.mp3");
    PImage pictureOfRecord;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        pictureOfRecord = loadImage("images/record.png");
        pictureOfRecord.resize(600, 600);
    }

    @Override
    public void draw() {
       scoreTracker=scoreTracker+1;
       rotateImage(pictureOfRecord, scoreTracker);
       image(pictureOfRecord, 600, 800);
    }

    static public void main(String[] args) {
        PApplet.main(SpinningRecord.class.getName());
   
    
    
    
    
    
    
    
    
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    void rotateImage(PImage image, int amountToRotate) {
        translate(width / 2, height / 2);
        rotate(amountToRotate * TWO_PI / 360);
        translate(-image.width / 2, -image.height / 2);
    }

    class Song extends Sound {
        public Song(String songAddress) {
            super(songAddress);
        }

        @Override
        public void play() {
            if( !super.isPlaying() ) {
                System.out.println("playing");
                super.play();
            }
        }
    }
}
