object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(59, 102, 10, 15, 11)
    assert(Policy.score(signalcase_1) == 161)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(83, 85, 8, 11, 10)
    assert(Policy.score(signalcase_2) == 218)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(93, 90, 21, 9, 6)
    assert(Policy.score(signalcase_3) == 207)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
