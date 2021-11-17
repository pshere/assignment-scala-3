import org.scalatest.funsuite.AnyFunSuite

class LogTest extends AnyFunSuite{
  val log1=new Log
  test("log format when default"){
    val result1:String="[INFO]:hello"
    assert(true, result1==log1.logMessage("hello"))
  }
  test("log format when both arguments is passed"){
    val result1:String="[Developer]:hello"
    assert(true, result1==log1.logMessage("hello","Developer"))
  }

}
