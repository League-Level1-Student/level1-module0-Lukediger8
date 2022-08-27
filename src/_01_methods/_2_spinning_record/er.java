/*
 * Goal: Make a record spin and play music!
 * 
 * 1. Make an int variable to keep track of how much the record will spin.
 
 * In the setup() method:
 * 2. Load a picture of a record using the loadImage() method:
 *    pictureOfRecord = loadImage("images/record.png");
 * 
 * 3. Call the image variable's resize() method to set the image's width and
 *    height to the window's width and height.
 * 
 * 4. Call the image() method to display the record image. Do you see it?
 * 
 * In the draw() method:
 * 
 * 5. Make the record spin by increasing the variable from step 1.
 * 
 * 6. Call the rotateImage() method to rotate record by the specified amount
 *    rotateImage(PImage image, int amountToRotate);
 * 
 * 7. Call the image() method to display the record image
 *    Make sure to put this code AFTER the rotateImage() method.
 * 
 * 8. Does the record rotate when the mouse is pressed?
 * 
 * 9. Modify your code so the record only spins when the mouse is pressed.
 * 
 * 10.Use the song.play() and song.stop() methods to play a song ONLY when
 *    the record is spinning.
 */