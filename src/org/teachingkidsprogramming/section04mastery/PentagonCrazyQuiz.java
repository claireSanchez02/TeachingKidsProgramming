package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuizAdapter;

public class PentagonCrazyQuiz extends PentagonQuizAdapter
{
  public void question1()
  {
    // Question 1 
    //   thread (recipe below) 
    //   ------------- Recipe for thread
    //       that moves the tortoise 6 pixels
    thread();
    //   ------------- End of thread recipe
  }
  private void thread()
  {
    Tortoise.move(6);
  }
  public void question2()
  {
    //        Do the following 76 times
    for (int i = 0; i < 76; i++)
    {
      stitch();
    }
    //           call stitch
    //        Repeat
  }
  public void question3()
  {
    //        Add lime to the color wheel
    ColorWheel.addColor(Greens.Lime);
  }
  public void question4()
  {
    //        Add red to the color wheel
    ColorWheel.addColor(Reds.Red);
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
