package core

import java.util.UUID

import com.rew3.core.Exceptions.FieldTypeException
import org.joda.time.DateTime

/**
 * Created on 1/17/18.
 */
trait Entity[T] {

  val logicalName: String

  val id: String = generateId

  def tableName: String

  def fields: Seq[Field]

  def deleted: Boolean = false

  //Get entity from database
  def get(id: String): Option[T]

  //Get list
  def all(): Seq[T]

  /**
   * Insert into [[tableName]]
   */
  def insert: T = ???

  //TODO Check other validation rules for fields
  def validate: Boolean = {
    fields.forall(p => p.data.getClass == p.`type`.getClass)
  }

  private def generateId: String = UUID.randomUUID().toString

  def getFieldByName(name: String): Field = {
    fields.find(_.name == name).getOrElse(throw new FieldTypeException(s"Cannot find field: $name"))
  }
}

case class Field(name: String, column: String, `type`: String, data: Any = null)

private case class Data(fields: Seq[Field], meta: MetaInfo)

case class MetaInfo(createdBy: String, createdDate: DateTime)
