package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args;
  {
    Tortoise.setSpeed(10);
    Tortoise.hide();
    Tortoise.getBackgroundWindow().setColor(PenColors.Blues.LightSkyBlue);
    Tortoise.setX(650);
    Tortoise.setY(550);
    int branch = 100;
    //
    drawBranch(branch);
  }
  /**
   * @param branch
   */
  private static void drawBranch(int branch)
  {
    if (branch > 0)
    {
      adjustColor(branch);
      //
      Tortoise.move(branch);
      //
      drawLowerBranches(branch);
    }
  }
  /**
   * 
   */
  private static void adjustColor(int b)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    Tortoise.setPenWidth(5);
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, Greens.Lime);
    colors.put(30, PenColors.Greens.DarkOliveGreen);
    colors.put(40, PenColors.Greens.ForestGreen);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(b));
  }
  /**
   * @param branch
   */
  private static void drawLowerBranches(int branch)
  {
    Tortoise.turn(30);
    drawShorterBranch(branch);
    Tortoise.turn(-60);
    drawShorterBranch(branch);
    Tortoise.turn(30);
    adjustColor(branch);
    Tortoise.move(-1 * branch);
    //
  }
  /**
   * @param branch
   */
  private static void drawShorterBranch(int branch)
  {
    drawBranch(branch - 10);
  }
}