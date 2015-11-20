package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random randomGenerator = new Random();
    int maxGuessValue = MessageBox.askForNumericalInput("Please enter max guess value:");
    if (maxGuessValue < 0)
    {
      MessageBox.showMessage("Guess value is invaid.");
      System.exit(0);
    }
    int answer = randomGenerator.nextInt(maxGuessValue + 1);
    int numberOfGuesses = MessageBox.askForNumericalInput("Please enter the number of guesses:");
    for (int i = 0; i < numberOfGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Please enter a number between 1 and " + maxGuessValue + ".");
      if (guess > maxGuessValue)
      {
        MessageBox.showMessage("Guess value is invaid.");
        System.exit(0);
      }
      if (guess < 0)
      {
        MessageBox.showMessage("Guess is invaid.");
        System.exit(0);
      }
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won!!!");
        System.exit(0);
      }
      if (guess > answer)
      {
        MessageBox.showMessage("You're guess is too high.");
      }
      if (guess < answer)
      {
        MessageBox.showMessage("You're guess is too low.");
      }
    }
    MessageBox.showMessage("You lose. You took more than " + numberOfGuesses + " guesses.");
  }
}