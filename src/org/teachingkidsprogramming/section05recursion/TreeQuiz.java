package org.teachingkidsprogramming.section05recursion;

import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

public class TreeQuiz extends TreeQuizAdapter
{
  public void questions1To4()
  {
    //   Question 1 
    //   doubleLength (recipe below) 
    //   ------------- Recipe for doubleLength 
    //       make the current length twice what it is
    doubleLength();
    //   ------------- End of doubleLength recipe
    //
    //   Question 2 
    //   decreaseTurn (recipe below) 
    //   ------------- Recipe for decreaseTurn 
    //      decrease the current turn by 1
    decreaseTurn();
    //   ------------- End of decreaseTurn recipe
    //
    //   Question 3 
    //   setNinety (recipe below) 
    //   ------------- Recipe for setNinety 
    //       set the current turn angle to 90, HINT: Use angles.put(key,value);
    setNinety();
    //   ------------- End of setNinety recipe
    //
    //   Question 4 
    //   angleFive (recipe below) 
    //   ------------- Recipe for angleFive 
    //       sets the 5th angle to 36 degrees
    angleFive();
    //   ------------- End of angleFive recipe
  }
  /**
   * 
   */
  private void angleFive()
  {
    angles.put(5, 36);
  }
  /**
   * 
   */
  private void setNinety()
  {
    angles.put(turn, 90);
  }
  /**
   * 
   */
  private void decreaseTurn()
  {
    turn = turn - 1;
  }
  /**
   * 
   */
  private void doubleLength()
  {
    length = length * 2;
  }
  public static void main(String[] args)
  {
    new TreeQuizGrader().grade(new TreeQuiz());
  }
}
