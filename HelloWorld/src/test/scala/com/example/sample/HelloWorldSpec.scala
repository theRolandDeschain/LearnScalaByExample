package com.example.sample

import org.scalatest.{FlatSpec, Matchers}

class HelloWorldSpec extends FlatSpec with Matchers {

  "HelloWorld" should "have tests" in {
    true should be (true)
  }

}
