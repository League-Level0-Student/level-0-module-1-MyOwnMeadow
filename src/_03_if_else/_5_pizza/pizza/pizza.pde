PImage pep;
PImage mush;
PImage olive;

void setup() {
    size(500, 500);
    noStroke();

//Pizza Topings List
    pep=loadImage("pepperoni.png");
    pep.resize(85,85);
    
    mush=loadImage("mushroom.png");
    mush.resize(70,70);
    
    olive=loadImage("olive.png");
    olive.resize(50,50);
 
  //Pizza Base  
    fill(#E5B800);
    ellipse(250, 250, 450, 450);
    
    fill(200, 0, 0);
    ellipse(250, 250, 400, 400);
    
    fill(#FCE000);
    ellipse(250, 250, 380, 390);
}
void draw() {
//Pizza Topings
  if(mouseButton == LEFT) {
    image(pep,mouseX-42,mouseY-42);
  }
  
  if(mouseButton == RIGHT) {
    image(mush,mouseX-45,mouseY-45);
  }
  
  if(keyPressed) {
    image(olive,mouseX-15,mouseY-15);
  }
}
