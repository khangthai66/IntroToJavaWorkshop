void setup()
{
  size(500, 450);
  background(0, 221, 102);
}
void draw()
{
  ellipse (mouseX, mouseY, 29, 29);
  ellipse (40, 40, 28, 28);
  ellipse (60, 22, 29, 29);
  if (mousePressed)
  {
    fill(051, 255, 204);
  } else {
    fill(random(255),random(255),random(255));
  }
}

