import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

    int hour = hour();
    int minute = minute();
    int second = second();

    int realHour = (int)(hour + 7);
  
    float circleX = random(0, 500);
    float circleY = random(0, 500);
    float circleDiameter = random(0, 500);

    float rectX = random(0, 500);
    float rectY = random(0, 500);
    float rectXX = random(0, 500);
    float rectYY = random(0, 500);
  
    float quadX = random(0, 500);
    float quadY = random(0, 500);
    float quadXX = random(0, 500);
    float quadYY = random(0, 500);
    float quadXXX = random(0, 500);
    float quadYYY = random(0, 500);
    float quadXXXX = random(0, 500);
    float quadYYYY = random(0, 500);

    float triangleX = random(0, 500);
    float triangleY = random(0, 500);
    float triangleXX = random(0, 500);
    float triangleYY = random(0, 500);
    float triangleXXX = random(0, 500);
    float triangleYYY = random(0, 500);

    


  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
   
    ellipse(circleX, circleY, circleDiameter, circleDiameter); 
    if (circleX < 250 && circleY < 250){
      fill (255, 208, 0);
    }
    else if (circleX < 250 && circleY > 250){
      fill (0, 166, 255);
    }
    else if (circleX > 250 && circleY < 250){
      fill (212, 0, 255);
    }
    else if (circleX > 250 && circleY > 250){
      fill (255, 0, 0);
    }
    
    rect(rectX, rectY, rectXX, rectYY);
     if (rectX < 250 && rectY < 250){
      fill (255, 208, 0);
    }
    else if (rectX < 250 && rectY > 250){
      fill (0, 166, 255);
    }
    else if (rectX > 250 && rectY < 250){
      fill (212, 0, 255);
    }
    else if (rectX > 250 && rectY > 250){
      fill (255, 0, 0);
    }

    quad(quadX, quadY, quadXX, quadYY, quadXXX, quadYYY, quadXXXX, quadYYYY);
    if (quadX < 250 && quadY < 250){
      fill (255, 208, 0);
    }
    else if (quadX < 250 && quadY > 250){
      fill (0, 166, 255);
    }
    else if (quadX > 250 && quadY < 250){
      fill (212, 0, 255);
    }
    else if (quadX > 250 && quadY > 250){
      fill (255, 0, 0);
    }
    
    triangle(triangleX, triangleY, triangleXX, triangleYY, triangleXXX, triangleYYY);
    if (triangleX < 250 && triangleY < 250){
      fill (255, 208, 0);
    }
    else if (triangleX < 250 && triangleY > 250){
      fill (0, 166, 255);
    }
    else if (triangleX > 250 && triangleY < 250){
      fill (212, 0, 255);
    }
    else if (triangleX > 250 && triangleY > 250){
      fill (255, 0, 0);
    }

    size(500, 500);
    textSize(32);
    text ("the time is : " + realHour + ":" + minute + ":" + second, 1, 100); 
    fill(0, 0, 0);

    
    
    
  }
  
  // define other methods down here.
}