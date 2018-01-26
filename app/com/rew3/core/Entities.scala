package com.rew3.core

import core.{Account, Entity}

/**
 * Created on 1/18/18.
 *
 * This will be inside Database and loaded in application context when its started
 */
object Entities {

  //We will store the name entities in the database
  //Any future entities needs to be added in the database
  val map: Map[String, Entity] = Map("Account" -> new Account) //TODO Replace this map with DB

  //Get entity from the database
  def getEntity(logicalName: String): Option[Entity] = {
    map.get(logicalName)
  }

  def getEntity(logicalName: String, id: String): Option[Entity] = {
    map(logicalName).get(id)
  }
}
