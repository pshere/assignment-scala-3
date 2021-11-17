class Factorial {

  def factorialUsingRecursion(i:Int): Int ={
    if (i==1||i==0) 1
    else factorialUsingRecursion(i-1)*i
  }
  def factorialUsingTailRecursion(i:Int,factorial:Int=1): Int ={
    if(i==1|| i==0) factorial
    else factorialUsingTailRecursion(i-1,factorial*i)
  }
}
