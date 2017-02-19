void setup() {
  size(300, 300);
}

void draw() {
  background(200, 200, 200);
  drawCar(mouseX, mouseY);
}

/**
 * Draws a car (ice cream truck) at a given x and y position
 */
void drawCar(int x, int y) {
  noStroke();
  // truck body
  fill(0, 0, 0);
  rect(x, y, 100, 50);
  // g.fillRect(10, 30, 100, 50);
  // Tires
  fill(255, 0, 0); 
  ellipse(x + 20, y + 50, 20, 20); 
  ellipse(x + 80, y + 50, 20, 20);
  // Window
  fill(0, 0, 200);
  rect(x + 70, y + 10, 30, 20);
}