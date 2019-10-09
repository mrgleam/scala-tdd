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
  }
}
