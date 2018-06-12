package com.allaboutscala.testing

import scala.concurrent.Future

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
class DonutStore {

  def favouriteDonut(): String = "vanilla donut"

  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")

  def printName(): Unit = {
    throw new IllegalStateException("Some Error")
  }

  def donutPrice(donut: String): Option[Double] = {
    val prices = Map(
      "vanilla donut" -> 2.0,
      "plain donut"   -> 1.0,
      "glazed donut"  -> 3.0
    )
    val priceOfDonut = prices.get(donut)
    priceOfDonut.map{ price => price * (1 - discountByDonut(donut)) }
  }

  private def discountByDonut(donut: String): Double = {
    val discounts = Map(
      "vanilla donut" -> 0.2,
      "plain donut"   -> 0.1,
      "glazed donut"  -> 0.3
    )
    discounts.getOrElse(donut, 0)
  }

  import scala.concurrent.ExecutionContext.Implicits.global
  def donutSalesTax(donut: String): Future[Double] = Future {
    Thread.sleep(3000)  // assume an external call to calculate sales tax
    0.15
  }
}
