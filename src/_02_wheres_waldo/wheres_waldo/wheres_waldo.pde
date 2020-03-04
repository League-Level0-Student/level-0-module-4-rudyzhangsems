import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(2000, 1000);
waldo.resize(2000,1000);
  image(waldo, 0, 0);
 // doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
 // woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
     println("X: " + mouseX + " Y: " + mouseY); 

      // If the mouse is on Waldo, print “Waldo found!”
      if(mouseX<482&&mouseY==127&&422<mouseX&&67<mouseY)  {
        println("You found This person!");
      }
      else if(mouseX<1486&&mouseY==517&&1466<mouseX&&497<mouseY)  {
        println("You found This person!");
      }
      
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
