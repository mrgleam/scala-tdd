package me.sti

class StringCalculator(digits: String) {
  def add = {
    if (digits.length == 0) 0 else {
      val numbers = digits split "," map { _.toInt }
      if (numbers.length == 1)
        numbers(0)
      else
        numbers(0) + numbers(1)
    }
  }
}
