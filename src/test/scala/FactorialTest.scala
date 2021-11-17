
import org.scalatest.flatspec.AnyFlatSpec


class FactorialTest extends AnyFlatSpec{

  "This" should "be invalid if 9 will return" in{
    val fact=new Factorial
    assert(!(120==fact.factorialUsingRecursion(9)))
  }
  "This" should "be valid if 0 will return 1" in{
    val fact=new Factorial
    assert(1==fact.factorialUsingRecursion(0))
  }
  "This" should "be valid as 4 will return 24" in{
    val fact=new Factorial
    assert(24==fact.factorialUsingRecursion(4))
  }

  "This" should "be invalid if 5 will return" in{
    val fact1=new Factorial
    assert(!(110==fact1.factorialUsingTailRecursion(5)))
  }
  "This" should "be valid if 1 is returned when 0 is passed" in{
    val fact1=new Factorial
    assert(1==fact1.factorialUsingTailRecursion(0))
  }
  "This" should "be valid as 5 will return 120" in{
    val fact1=new Factorial
    assert(120==fact1.factorialUsingTailRecursion(5))
  }



}
