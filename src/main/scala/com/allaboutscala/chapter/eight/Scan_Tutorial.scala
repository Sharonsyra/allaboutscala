package com.allaboutscala.chapter.eight

object Scan_Tutorial extends App {

  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")

  println("\nStep 2: How to create a running total using the scan function")
  val runningTotal: Seq[Int] = numbers.scan(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")

  println("\nStep 3: How to create a running total using the scan function explicitly")
  val runningTotal2: Seq[Int] = numbers.scan(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")

}
