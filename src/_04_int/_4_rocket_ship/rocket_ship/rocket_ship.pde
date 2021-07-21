int y = 800;
int x = 400;

void setup() {
    size(800, 800);
    background(0, 0, 20); 
}

void draw() {
  noStroke();
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
  stroke(5);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    
    y -= 1;
}
