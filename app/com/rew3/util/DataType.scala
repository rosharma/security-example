package com.rew3.util

/**
 * Created on 1/27/18.
 */
object DataType extends Enumeration {
  val String, Integer, Email = Value

  def validate(dataType: DataType.Value, data: Any): Boolean = {
    dataType match {
      case String => data.isInstanceOf[Predef.String]
    }
  }
}
