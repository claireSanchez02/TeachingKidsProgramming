package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    MessageBox.showMessage("One morning the Tortoise woke up to a dream");
    //
    //
    animateStartStory();
    //
    int answer = MessageBox.askForNumericalInput("Do you want to 'wake up'(1) or 'explore'(2) the dream?");
    if (answer == 1)
    {
      wakeUp();
    }
    //
    else if (answer == 2)
    {
      approachOoze();
    }
    //
    //
    if (answer > 2)
    {
      badAnswer();
    }
    //
    //
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  //              Lighten the current pen color --#42
  //         Repeat --#41.2
  private static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions.  You can't play this game.  The End.");
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.");
    int answer = MessageBox
        .askForNumericalInput("Do you want to pour the ooze into the 'backyard'(3) or 'toilet'(4)?");
    if (answer == 4)
    {
      pourIntoToilet();
    }
    if (answer == 3)
    {
      pourIntoBackyard();
    }
    //
    if (answer > 4)
    {
      badAnswer();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    int answer = MessageBox
        .askForNumericalInput("As the man starts to prepare you as soup, do you... 'Scream'(5) or 'Faint'(6)?");
    if (answer == 6)
    {
      tortoiseSoup();
    }
    //
    //
    //
    if (answer == 5)
    {
      startStory();
    }
    //
    if (answer > 6)
    {
      badAnswer();
    }
    //
  }
  private static void tortoiseSoup()
  {
    MessageBox.showMessage("You made a delicious soup!  Yum!  The End.");
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radio-active waste.");
    int answer = MessageBox
        .askForNumericalInput("Do you want to train to be a NINJA?  'Yes'(7) or 'HECK YES'(8)?");
    if (answer == 7)
    {
      ninjaTortoise();
    }
    //
    //
    if (answer == 8)
    {
      ninjaTortoise();
    }
    //
    if (answer > 8)
    {
      badAnswer();
    }
  }
  private static void ninjaTortoise()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You wake up and have a boring day. The End.");
  }
}
