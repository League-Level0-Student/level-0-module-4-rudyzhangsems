PImage face;
void setup() {
  size(900, 1020);
   face = loadImage("facey.jpg");
  face.resize(900, 1020);
  background(face);
}
int x=370;
int y=509;
void draw() {
  background(face);
  fill(#FFFFFF);

  ellipse(370,509,130,130);
  ellipse(610,509,130,130);
    if (337<mouseX&&mouseX<403){
    if(476<mouseY&&mouseY<542){
  x=mouseX;
  y=mouseY;
    }
  }
    fill(#000000);
  ellipse(x,y,65,65);
  ellipse(x+240,y,65,65);
}
