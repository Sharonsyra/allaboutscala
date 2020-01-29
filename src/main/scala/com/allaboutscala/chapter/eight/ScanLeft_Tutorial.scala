package com.allaboutscala.chapter.eight

object ScanLeft_Tutorial extends App {

  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")



  println("\nStep 2: How to create a running total using the scanLeft function")
  val runningTotal: Seq[Int] = numbers.scanLeft(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")
  // NOTE: scanLeft method iterations
  // 0 + 1             =   1
  // 1 + 2             =   3
  // 1 + 2 + 3         =   6
  // 1 + 2 + 3 + 4     =   10
  // 1 + 2 + 3 + 4 + 5 =   15



  println("\nStep 3: How to create a running total using the scanLeft function explicitly")
  val runningTotal2: Seq[Int] = numbers.scanLeft(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")
  // NOTE: scanLeft method iterations
  // 0 + 1             =   1
  // 1 + 2             =   3
  // 1 + 2 + 3         =   6
  // 1 + 2 + 3 + 4     =   10
  // 1 + 2 + 3 + 4 + 5 =   15
}
