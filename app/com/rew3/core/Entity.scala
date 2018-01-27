package core

import com.rew3.core.Exceptions.FieldTypeException
import com.rew3.util.DataType
import com.sun.xml.internal.ws.developer.ServerSideException

/**
 * Created on 1/17/18.
 */
trait Entity[T] {

  def logicalName: String

  def id: String

  def tableName: String

  def fields: Seq[Field]

  def deleted: Boolean = false

  def generateId: String = ???

  //Get entity from database
  def get(id: String): Option[T] = {
    null
  }

  //Get list
  def all(): Seq[T] = {
    null
  }

  //Check the validatation rules for fields
  def validate: Boolean = {
    fields.forall(f=> DataType.validate(f.`type`, f.data))
  }

  def getFieldByName(name: String): Field = fields.find(_.name == name).getOrElse(throw new FieldTypeException("hh"))
}

case class Field(name: String, column: String, `type`: DataType.Value, data: Any = null)
