package com.allaboutscala.chapter

class Cheatsheet extends App {


  // Step 1: Import converters
  import scala.collection.JavaConverters._

  // Step 2: Assume you have a Java Map
  val donutJavaMap: java.util.Map[String, Double] = new java.util.HashMap[String, Double]()
  donutJavaMap.put("Plain Donut", 2.50)
  donutJavaMap.put("Vanilla Donut", 3.50)

  // Step 3: Convert the Java Map by calling .asScala
  val donutScalaMap = donutJavaMap.asScala

  // Step 4: You now have a Scala Map
  val pricePlainDonut = donutScalaMap("Plain Donut")
  val setDonuts = donutScalaMap.map(_._1).toSet

  /** Add line break or separator for given platform **/
  val lineBreak = scala.compat.Platform.EOL
  println(s"First line $lineBreak second line")


  /** Convert multi-line string to single line **/
  // Step 1: Define an implicit class to strip out line endings
  implicit class StringConversion(str: String) {

    def inline(): String = str.replaceAll(scala.compat.Platform.EOL," ")

  }

  // Step 2: Create a multi-line string
  val multilineStr =
    """
      |Plain Donut
      |Vanilla Donut
    """.stripMargin


  println(s"Multi-line as single line = ${multilineStr.inline()}")


  /** Check the value of an Option **/
  Some(5).contains(5)

  /** Cannot find an implicit ExecutionContext **/
  // Step 1: Need to import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.ExecutionContext.Implicits.global

//  val future: Future[Int] = Future {
//    // some long running operation
//    1
//  }


//  /** Function to read a file and return a String of its contents **/
//  def readFile(file: String): String = {
//    Source
//      .fromInputStream(getClass.getResourceAsStream(file))
//      .getLines
//      .mkString("\n")
//  }

  /** Create enum using sealed trait **/
  sealed trait Donut
  case object Vanilla extends Donut
  case object Chocolate extends Donut
  case object Plain extends Donut

  def isValidDonut(donut: Donut) = {
    donut match {
      case Vanilla | Chocolate | Plain => println("Valid donut")
      case _ => println("Unknown donut!")
    }
  }

  /** Int division in Scala and return a float which keeps the decimal values: **/
  val donutQuantity: Int = 10
  val donutTotalCost: Int = 25
  val donutPrice = donutTotalCost.toFloat / donutQuantity
  println(s"Cost of one donut = $donutPrice")


}
