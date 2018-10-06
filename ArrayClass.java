import java.util.Arrays;
class ArrayClass
{
  public static void main(String [] args) 
  {
    String [] word = new String [5];
    String firstWord = "Hi,";
    String secondWord = "my";
    String thirdWord = "name";
    String fourthWord = "is";
    String fifthWord = "Heeju";
    word[0] = firstWord;
    word[1] = secondWord;
    word[2] = thirdWord;   
    word[3] = fourthWord;
    word[4] = fifthWord;
      
    int[]num = new int [10];
    int firstNum = 0;
    int secondNum = 1;
    int thirdNum = 2;
    int fourthNum = 3;
    int fifthNum = 4;
    int sixthNum = 5;
    int seventhNum = 6;
    int eighthNum = 7;
    int ninthNum = 8;
    int tenthNum = 9;
    num[0] = firstNum;
    num[1] = secondNum;
    num[2] = thirdNum;
    num[3] = fourthNum;
    num[4] = fifthNum;
    num[5] = sixthNum;
    num[6] = seventhNum;
    num[7] = eighthNum;
    num[8] = ninthNum;
    num[9] = tenthNum;
    //the loop will fo from the initial value to the end of the array
    int arraySize = 5;
    for (int loopVal = 0; loopVal < 5; loopVal++) {
      System.out.println("Array Value: " + word[loopVal]);
    }
  }
}
