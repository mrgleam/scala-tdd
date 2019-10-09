package me.sti

class StringCalculator(digits: String) {
  def add = {
    if (digits.length == 0) 0 else {
      (0 /: numbers) { _ + _ } // numbers.foldLeft(0)(_+_)
    }
  }

  def numbers = digits split ",|\n" map { _.toInt }
}
