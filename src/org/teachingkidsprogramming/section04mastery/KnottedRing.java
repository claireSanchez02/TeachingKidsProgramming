package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Pinks;
import org.teachingextensions.logo.PenColors.Purples;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //
    createColorPalette();
    for (int i = 0; i < 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
      drawOctagonWithOverlap();
      Tortoise.turn(365 / 3);
    }
  }
  /**
   * 
   */
  private static void drawOctagonWithOverlap()
  {
    for (int i = 0; i < 9; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
  /**
   * 
   */
  private static void createColorPalette()
  {
    ColorWheel.addColor(Pinks.HotPink);
    ColorWheel.addColor(Reds.Red);
    ColorWheel.addColor(Pinks.Fuchsia);
    ColorWheel.addColor(Reds.OrangeRed);
    ColorWheel.addColor(Pinks.DeepPink);
    ColorWheel.addColor(Purples.MediumVioletRed);
    ColorWheel.addColor(Reds.Crimson);
    ColorWheel.addColor(Reds.Tomato);
  }
}
