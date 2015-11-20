package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 60;
    //drawhousewithFlatRoof(height);
    drawhousewithSlantyRoof(140);
    drawhousewithFlatRoof(110);
    //drawhousewithStairRoof(120);
    drawhousewithPointRoof(130);
  }
  private static void drawhousewithFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawhousewithSlantyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantyRoof();
    //Tortoise.move(120);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawhousewithPointRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointRoof();
    Tortoise.turn(360);
    Tortoise.move(130);
    Tortoise.turn(-90);
    Tortoise.move(10);
  }
  private static void drawhousewithStairRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawStairRoof();
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void drawPointRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(45);
    //Tortoise.move(130);
  }
  private static void drawSlantyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(135);
    Tortoise.move(160);
  }
  private static void drawStairRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
