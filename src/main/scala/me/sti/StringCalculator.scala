package me.sti

class StringCalculator(digits: String) {
  def add = {
    if (digits.length == 0) 0 else {
      val numbers = digits split "," map { _.toInt }
      (0 /: numbers) { _ + _ } // numbers.foldLeft(0)(_+_)
    }
  }
}
