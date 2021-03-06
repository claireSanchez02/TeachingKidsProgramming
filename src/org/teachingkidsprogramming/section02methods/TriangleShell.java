package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int j = 0; j < 1000; j++)
    {
      Tortoise.setPenColor(PenColors.Greens.LightSeaGreen);
      length = length + 4;
      //
      for (int i = 0; i < 3; i++)
      {
        drawTriangle();
        Tortoise.setPenWidth(2);
      }
      //
      Tortoise.turn(360 / 60);
    }
  }
  private static void drawTriangle()
  {
    Tortoise.move(length);
    Tortoise.turn(360 / 3);
  }
}
