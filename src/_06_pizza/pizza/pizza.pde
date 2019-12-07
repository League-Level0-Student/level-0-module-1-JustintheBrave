    import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch

void setup() {
    size(500,500);
    minim = new Minim(this);      //in the setup method
sound = minim.loadFile("ding.wav");      //in the setup method
}
void draw() {
    background(255,255,255);
    noStroke();
    fill(199,109,18);
    ellipse(250,250,500,500);
    noStroke();
    fill(250,226,8);
    ellipse(250,250,400,400);
    
    PImage pepperoni = loadImage("Pepperoni.png");
    pepperoni.resize(200,100);
    image(pepperoni, 250,250);
   
   
    if(mousePressed){// Put next 2 lines where you want the sound to play
sound.play();
sound.rewind();
    }
}
