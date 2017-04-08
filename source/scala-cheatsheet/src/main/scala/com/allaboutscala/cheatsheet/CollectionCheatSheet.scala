package com.allaboutscala.cheatsheet

/**
  * Created by Nadim Bahadoor on 08/04/2017.
  *
  *  Code snippets for Scala Cheatsheet
  *
  * [http://allaboutscala.com/scala-cheatsheet/]
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
object CollectionCheatSheet extends App {


  /**
    * Convert Java collection to Scala collection
    */
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
}
