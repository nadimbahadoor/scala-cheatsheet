package com.allaboutscala.testing

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by Nadim Bahadoor on 08/04/2017.
  *
  *  Code snippets for ScalaTest
  *
  * [http://allaboutscala.com/scala-cheatsheet/#scalatest-introduction]
  *
  * Copyright 2016 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
class Tutorial_07_Exception_Test  extends FlatSpec with Matchers {

  "Method DonutStore.printName()" should "throw IllegalStateException" in {
    val donutStore = new DonutStore()
    intercept[java.lang.IllegalStateException] {
      donutStore.printName()
    }
  }


  "Exception thrown by method printName()" should "contain message Some Error" in {
    val donutStore = new DonutStore()
    val exception = the [java.lang.IllegalStateException] thrownBy {
      donutStore.printName()
    }
    // here we verify that the exception class and the internal message
    exception.getClass shouldEqual classOf[java.lang.IllegalStateException]
    exception.getMessage should include ("Some Error")
  }


  "Exception thrown by method printName()" should "contain message Some Error using ScalaTest should have message methods" in {
    val donutStore = new DonutStore()
    the [java.lang.IllegalStateException] thrownBy {
      donutStore.printName()
    } should have message "Some Error"
  }


  an [java.lang.IllegalStateException] should be thrownBy {
    new DonutStore().printName()
  }

}
