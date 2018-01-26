package core

import com.rew3.core.Entities

/**
 * Created on 1/18/18.
 */
object EntityFactory {

  //Get entity from the database
  def getEntity(logicalName: String): Option[Entity] = {
    Entities.map.get(logicalName)
  }

  def getEntity(logicalName: String, id: String): Option[Entity] = {
    Entities.map(logicalName).get(id)
  }
}
