package com.allaboutscala.chapter.one.tutorial_06

object HelloWorldWithArguments extends App {

  println("Hello world with arguments Scala application")

  println("Command line arguments are: ")
  println(args.mkString(","))
  print(args(0))

}
