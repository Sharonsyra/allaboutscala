package com.allaboutscala.chapter.seven

import scala.collection.mutable.TreeSet

object MutableTreeSet_Tutorial extends App {

  println("\nStep 1: How to initialize a TreeSet with 3 elements")
  val treeSet1: TreeSet[String] = TreeSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of treeSet1 = $treeSet1")

  println("\nStep 2: How to check specific elements in TreeSet")
  println(s"Element Plain Donut = ${treeSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${treeSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${treeSet1("Chocolate Donut")}")

  println("\nStep 3: How to add elements to TreeSet using +=")
  treeSet1 += "Vanilla Donut"
  println(s"Elements of treeSet1 after adding Vanilla Donut element = $treeSet1")

  println("\nStep 4: How to add two TreeSets together using ++=")
  treeSet1 ++= TreeSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of treeSet1 after adding second set = $treeSet1")

  println("\nStep 5: How to remove element from TreeSet using -=")
  treeSet1 -= "Plain Donut"
  println(s"treeSet1 without Plain Donut element = $treeSet1")

  println("\nStep 6: How to find the intersection between two TreeSets using &")
  val treeSet2: TreeSet[String] = TreeSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of treeSet1 and treeSet2 = ${treeSet1 & treeSet2}")

  println("\nStep 7: How to find the difference between two TreeSets using &~")
  println(s"Difference of treeSet1 and treeSet2 = ${treeSet1 &~ treeSet2}")

  println("\nStep 8: How to change ordering to descending alphabet in TreeSet")
  object DescendingAlphabetOrdering extends Ordering[String] {
    def compare(element1:String, element2:String) = element2.compareTo(element1)
  }
  val treeSet3: TreeSet[String] = TreeSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(DescendingAlphabetOrdering)
  println(s"Elements of treeSet3 = $treeSet3")

  println("\nStep 9: How to initialize an empty TreeSet")
  val emptyTreeSet: TreeSet[String] = TreeSet.empty[String]
  println(s"Empty TreeSet = $emptyTreeSet")

}
