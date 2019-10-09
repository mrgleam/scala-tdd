package me.sti

class StringCalculator(rawDigits: String) {
  def add = {
    if (digits.length == 0) 0 else {
      (0 /: numbers) { _ + _ } // numbers.foldLeft(0)(_+_)
    }
  }

  def numbers = digits split ",|\n" map { _.toInt }

  def digits = {
    val delimiter_extractor = "//(.)\n(.*)".r

    rawDigits match {
      case delimiter_extractor(delimiter, digits) => digits.replace(delimiter, ",")
      case _ => rawDigits
    }
  }
}
