package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Evens_2
{
  public static void main(String[] args)
  {
    int numbers = MessageBox.askForNumericalInput("How high do you want the numbers to go?");
    for (int i = 0; i < numbers; i++)
    {
      if (i % 5 == 0)
        System.out.println(i);
    }
  }
}
