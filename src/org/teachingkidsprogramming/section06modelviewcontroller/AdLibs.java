package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Please enter an adverb.");
    if (currentAdverb.isEmpty())
    {
      MessageBox.showMessage("Don't you want to do AdLibs?");
      return;
    }
    else if (currentAdverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Hello! Numbers are NOT adverbs, try again.");
      return;
    }
    String currentEdverb = MessageBox.askForTextInput("Please enter a verb ending with -ed");
    String currentBodyPart = MessageBox.askForTextInput("Plaese enter a body part.");
    String currentStory = "Today I woke " + currentAdverb + ". " + "Then I " + currentEdverb + " " + "my "
        + currentBodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
}
