package com.allaboutscala.chapter.eight

object ScanRight_Tutorial extends App {

  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")



  println("\nStep 2: How to create a running total using the scanRight function")
  val runningTotal: Seq[Int] = numbers.scanRight(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")
  // NOTE: scanRight method iterations
  // 5 + 4 + 3 + 2 + 1   = 15
  // 5 + 4 + 3 + 2       = 14
  // 5 + 4 + 3           = 12
  // 5 + 4               = 9
  // 5 + 0               = 5
  // 0                   = 0



  println("\nStep 3: How to create a running total using the scanRight function explicitly")
  val runningTotal2: Seq[Int] = numbers.scanRight(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")
  // NOTE: scanRight method iterations
  // 5 + 4 + 3 + 2 + 1   = 15
  // 5 + 4 + 3 + 2       = 14
  // 5 + 4 + 3           = 12
  // 5 + 4               = 9
  // 5 + 0               = 5
  // 0                   = 0
}
