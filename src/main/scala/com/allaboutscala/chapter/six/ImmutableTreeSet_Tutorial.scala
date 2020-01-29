package com.allaboutscala.chapter.six

import scala.collection.immutable.TreeSet

object ImmutableTreeSet_Tutorial extends App {

  println("Step 1: How to initialize a TreeSet with 3 elements")
  val treeSet1: TreeSet[String] = TreeSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of treeSet1 = $treeSet1")

  println("\nStep 2: How to check specific elements in TreeSet")
  println(s"Element Plain Donut = ${treeSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${treeSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${treeSet1("Chocolate Donut")}")

  println("\nStep 3: How to add elements to TreeSet using +")
  val treeSet2: TreeSet[String] = treeSet1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to TreeSet using + = $treeSet2")

  println("\nStep 4: How to add two TreeSets together using ++")
  val treeSet3: TreeSet[String] = treeSet1 ++ TreeSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two TreeSets together using ++ = $treeSet3")

  println("\nStep 5: How to remove element in TreeSet using -")
  val treeSet4: TreeSet[String] = treeSet1 - "Plain Donut"
  println(s"TreeSet without Plain Donut element = $treeSet4")

  println("\nStep 6: How to find the intersection between two TreeSets using &")
  val treeSet5: TreeSet[String] = TreeSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of treeSet1 and treeSet5 = ${treeSet1 & treeSet5}")

  println("\nStep 7: How to find the difference between two TreeSets using &~")
  println(s"Difference of treeSet1 and treeSet5 = ${treeSet1 &~ treeSet5}")

  println("\nStep 8: How to change ordering of TreeSet to descending alphabet")
  object AlphabetOrdering extends Ordering[String] {
    def compare(element1:String, element2:String) = element2.compareTo(element1)
  }
  val treeSet6: TreeSet[String] = TreeSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(AlphabetOrdering)
  println(s"Elements of treeSet6 = $treeSet6")

  println("\nStep 9: How to initialize an empty TreeSet")
  val emptyTreeSet: TreeSet[String] = TreeSet.empty[String]
  println(s"Empty TreeSet = $emptyTreeSet")

}
