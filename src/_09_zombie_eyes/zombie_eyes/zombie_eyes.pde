
void setup() {
  size(300,500);


}
void draw() {
  PImage zombie = loadImage("zombie.png");
  zombie.resize(350,500);
image(zombie, -10, 0);

fill(255,mouseX,mouseY);
ellipse(90,172,80,80);

ellipse(230,150,80,80);

fill(0,0,0);
ellipse(90,172,30,30);
ellipse(230,150,30,30);
}
