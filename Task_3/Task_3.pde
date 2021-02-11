int x=250;
int y=100;
int w=120;
int h=120;

// Draw the rect, fill it black and make the background white.
void setup() {
  size(500, 500);
  background(255);
  rectMode(CENTER);
  fill(0);
  rect(x, y+130, w, h+280);
}

//Draw 3 ellipse, i was trying to make it in a loop, but couldn't figure it out
//Fill the ellipse with red, yellow and green. 
void draw() {
  stroke(0);
  fill(255,0,0);
  ellipse(x, y, w, h);
  fill(255, 204, 0);
  ellipse(x, y+130, w, h);
  fill(0,255,0);
  ellipse(x, y+260, w, h);
}
