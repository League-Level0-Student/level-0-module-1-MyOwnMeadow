void setup() {
size(1000,600);
noStroke();

//Ciriculs
  fill(255,0,0,100);
  ellipse(400,200,220,220);

  fill(0,0,255,100);
  ellipse(475,325,220,220);

  fill(0,255,0,100);
  ellipse(550,200,220,220);

//Text color
  fill(255,255,255);
  
  //Text
    text("Energentic",350,200);
    text("''I'll put\n" + "something\n" + "here later''",500,260);
    text("FILLER TEXT",440,350);
 //   text(
    
}
void draw() {
  if(mousePressed) {
    println("X = " + mouseX + "\n" + "Y = " + mouseY + "\n");
  }
}
