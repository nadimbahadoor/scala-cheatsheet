package com.allaboutscala.cheatsheet

/**
  * Created by Nadim Bahadoor on 08/04/2017.
  *
  *  Code snippets for Scala Cheatsheet
  *
  * [[http://allaboutscala.com/scala-cheatsheet/]]
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
object GeneralCheatSheet extends App{

  /**
    * Add line break or separator for given platform
    *
    */
  val lineBreak = scala.compat.Platform.EOL
  println(s"First line $lineBreak second line")



  /**
    * Convert multi-line string to single line
    *
    */
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



  /**
    * Check the value of an Option
    */
  Some(5).contains(5)

}
