package com.allaboutscala.chapter.four

object Covariance_Tutorial extends App {

  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String) {

    def printName: Unit

  }

  println("\nStep 2: How to extend abstract class Donut and define a case class called VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  println("\nStep 3: How to extend abstract class Donut and define another case class called GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: VanillaDonut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  println("\nStep 5: How to define a ShoppingCart type class which expects Donut types")
  class ShoppingCart[D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  println("\nStep 6: How to create instances or objects of ShoppingCart class")
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems

//  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart[VanillaDonut](Seq(vanillaDonut))

  println(s"\nStep 7: How to enable covariance on ShoppingCart")
  class ShoppingCart2[+D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  val shoppingCart2: ShoppingCart2[Donut] = new ShoppingCart2[VanillaDonut](Seq(vanillaDonut))
  shoppingCart2.printCartItems

}
