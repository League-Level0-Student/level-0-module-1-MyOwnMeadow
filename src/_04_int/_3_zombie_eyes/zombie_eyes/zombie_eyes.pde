 void setup() {
  PImage face = loadImage("Scary Face.jpg");
   size(500,450);
   face.resize(500,450);
   image(face, 0,0);
}
void draw() {
//Eyes
  noStroke();
  
 //Irises
  fill(mouseX/8+mouseY/8,mouseX/2, mouseY/2);
  ellipse(154,160,85,70);
  ellipse(359,160,85,70);
  
 //Pupils
  fill(255,255,255);
  ellipse(157,160,25,55);
  ellipse(355,160,25,55);
  
  if(mousePressed) {
    System.out.println("X = " + mouseX + "  Y + " + mouseY);
  }
}
