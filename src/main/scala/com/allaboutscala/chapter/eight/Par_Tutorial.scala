package com.allaboutscala.chapter.eight

import scala.collection.parallel.ParSeq

object Par_Tutorial extends App {

  println("Step 1: How to initialize an Immutable Sequence of various donut flavours")
  val donutFlavours: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donutFlavours immutable sequence = $donutFlavours")

  println("\nStep 2: Convert the Immutable donut flavours Sequence into Parallel Collection")
  val donutFlavoursParallel: ParSeq[String] = donutFlavours.par

  println("\nStep 3: How to use Scala Parallel Collection")
  val donuts: ParSeq[String] = donutFlavoursParallel.map(d => s"$d donut")
  println(s"Elements of donuts parallel collection = $donuts")

}
