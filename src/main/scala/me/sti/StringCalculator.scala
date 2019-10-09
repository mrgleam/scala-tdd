package me.sti

class StringCalculator(digits: String) {
  def add = {
    if (digits.length == 0) 0 else {
      val numbers = digits split ","
      if (numbers.length == 1)
        numbers(0).toInt
      else
        numbers(0).toInt + numbers(1).toInt
    }
  }
}
