package me.sti

import org.scalatest.{ Matchers, WordSpec }

class StringCalculatorSpec extends WordSpec with Matchers {
  "StringCalculatorSpec" should {
    "return 0 for empty string" in {
      new StringCalculator("").add shouldBe 0
    }
    "return 1 for 1" in {
      new StringCalculator("1").add shouldBe 1
    }
    "return 42 for 42" in {
      new StringCalculator("42").add shouldBe 42
    }
    "return 3 for 1,2" in {
      new StringCalculator("1,2").add shouldBe 3
    }
    "return 6 for 1,2,3" in {
      new StringCalculator("1,2,3").add shouldBe 6
    }
    "accept new line as delimiter" in {
      new StringCalculator("1\n2").add shouldBe 3
    }
    "accept custom delimiter" in {
      new StringCalculator("//;\n1;2").add shouldBe 3
    }
    "accept only positive numbers" in {
      an[IllegalArgumentException] shouldBe thrownBy {
        new StringCalculator("1,-2,-3").add
      }
    }
    "show negative numbers in exception" in {
      the[IllegalArgumentException] thrownBy {
        new StringCalculator("1,-2,-3").add
      } should have message ("requirement failed: -2,-3")
    }
  }
}
