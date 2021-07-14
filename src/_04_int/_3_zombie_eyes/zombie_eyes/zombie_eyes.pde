void setup() {
  PImage face = loadImage("Face.jpg");
   size(400,400);
   face.resize(400,400);
   image(face, 0,0);
}
void draw() {
  if(mousePressed) {
    System.out.println("X = " + mouseX + "  Y + " + mouseY);
  }
}
