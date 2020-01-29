package com.allaboutscala.chapter.eight

object ZipWIthIndex extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to zip the donuts Sequence with their corresponding index using zipWithIndex method")
  val zippedDonutsWithIndex: Seq[(String, Int)] = donuts.zipWithIndex
  zippedDonutsWithIndex.foreach{ donutWithIndex =>
    println(s"Donut element = ${donutWithIndex._1} is at index = ${donutWithIndex._2}")
  }
}
