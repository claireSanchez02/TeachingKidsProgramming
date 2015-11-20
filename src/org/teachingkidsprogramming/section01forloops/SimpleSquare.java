package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(5);
    int sides = MessageBox.askForNumericalInput("How many sides?");
    sides = 34;
    for (int i = 0; i < sides * 16; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(80);
      Tortoise.setPenWidth(9);
      Tortoise.turn(360.0 * 12 / sides);
      for (int j = 0; j < sides; j++)
      {
        Tortoise.move(60);
        Tortoise.turn(90);
      }
    }
  }
}
