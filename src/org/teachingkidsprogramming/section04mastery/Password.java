package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Password
{
  public static void main(String[] args)
  {
    {
      //specification - Create a little message box app for a login system that checks 
      //for an integer password and limits the number of attempts to enter it before 
      //it locks you out (like my phone)
      //what do we need?
      int password = 14;
      int guess = MessageBox.askForNumericalInput("Please enter your password");
      for (int i = 0; i < 5; i++)
      {
        MessageBox.askForNumericalInput("Please enter your password");
        if (guess == password)
        {
          MessageBox.showMessage("Welcome!!");
          System.exit(0);
        }
        else if (guess != password)
        {
          MessageBox
              .showMessage("You have entered the wrong password. You have " + (4 - i) + " tries left. Try again");
        }
      }
      MessageBox.showMessage("You have no more tries left.");
      System.exit(0);
    }
  }
}
