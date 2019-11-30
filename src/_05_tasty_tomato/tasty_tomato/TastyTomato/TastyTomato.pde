void setup() {
    size(500, 500);
}
void draw() {
    fill(255,50,100);
    background(255, 255, 255);
    noStroke();
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    
    fill(0,200,100);
    rect(176, 103, 12, 32);
    if(mousePressed){
    fill(255,255,255);
    ellipse(100, 200, 100, 100);
    }
}
