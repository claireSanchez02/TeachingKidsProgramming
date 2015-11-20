package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;

public class BackgroundPhoto
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //  Set the current picture to this url "http://img2.timeinc.net/ew/dynamic/imgs/101110/sonny-cher_240.jpg" --#7.1
    //  Set the background image to the current picture--#7.2
    //  Set the current side to 2 pixels long --#4.1
    Tortoise.move(2);
    for (int i = 0; i < 72; i++)
    {
      //     Set the current pen color to crimson --#8.1
      //     Use the current pen color for the line the tortoise draws --#8.2
      //     Increase the length of a side by 1 pixel --#5
      //     Move the tortoise the length of the current side --#4.2
      //     Set the X position of the tortoise to 555 pixels --#4.3
      //     Set the Y position of the tortoise to 65 pixels --#4.4
      Tortoise.turn(360 / 3);
      //     Turn the tortoise 1 more degree --#6
    }
    //  Repeat --#2.2
  }
}
