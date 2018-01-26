package core

/**
 * Created on 1/17/18.
 */
trait Entity {

  def logicalName: String

  def id: String

  def tableName: String

  def fields: Option[Seq[Field]]

  def deleted: Boolean = false

  def generateId: String = ???

  //Get entity from database
  def get(id: String): Option[Entity] = {
    null
  }

  //Check the validatation rules for fields
  def validate: Boolean = {
    true
  }
}

case class Field(name: String, column: String, rule: Option[ValidationRule])

case class ValidationRule(required: Boolean)
