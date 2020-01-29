package com.allaboutscala.chapter.eight

object ViewTutorial extends App {

  println("Step 1: How to create a large numeric range and take the first 10 odd numbers")
  val largeOddNumberList: List[Int] = (1 to 1000000).filter(_ % 2 != 0).take(10).toList
  println(s"First 100 odd numbers from largeOddNumberList = ${largeOddNumberList}")



  println(s"\nStep 2: How to lazily create a large numeric range and take the first 10 odd numbers")
  val lazyLargeOddNumberList = (1 to 1000000).view.filter(_ % 2 != 0).take(10).toList
  println(s"Lazily take the first 100 odd numbers from lazyLargeOddNumberList = ${lazyLargeOddNumberList}")
}
