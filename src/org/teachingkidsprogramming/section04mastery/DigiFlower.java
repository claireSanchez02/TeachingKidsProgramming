package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.PenColors.Oranges;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.PenColors.Yellows;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(Grays.Silver);
    Tortoise.setPenWidth(3);
    for (int i = 0; i < 15; i++)
    {
      Tortoise.turn(15 / 360);
    }
    createColorPalette();
    //
    drawOctogon();
  }
  private static void drawOctogon()
  {
    for (int i = 0; i < 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Reds.Red);
    ColorWheel.addColor(Oranges.DarkOrange);
    ColorWheel.addColor(Yellows.Gold);
    ColorWheel.addColor(Yellows.Yellow);
    ColorWheel.addColor(Yellows.Yellow);
    ColorWheel.addColor(Yellows.Gold);
    ColorWheel.addColor(Oranges.DarkOrange);
  }
}
