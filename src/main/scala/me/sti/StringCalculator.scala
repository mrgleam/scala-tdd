package me.sti

class StringCalculator(rawDigits: String) {
  require(negative_numbers isEmpty, negative_numbers.mkString(","))

  def add = (0 /: numbers) { _ + _ } // numbers.foldLeft(0)(_+_)

  def numbers = digits split ",|\n" map { _.toInt }

  def negative_numbers = numbers filter { _ < 0 }

  def digits = {
    val delimiter_extractor = "//(.)\n(.*)".r

    rawDigits match {
      case "" => "0"
      case delimiter_extractor(delimiter, digits) => digits.replace(delimiter, ",")
      case _ => rawDigits
    }
  }
}
