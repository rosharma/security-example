package com.rew3.core

import com.rew3.sale.{Contact, Account}
import core.Entity

/**
 * Created on 1/18/18.
 *
 * This will be inside Database and loaded in application context when its started
 */
object Entities {

  //We will store the name entities in the database
  //Any future entities needs to be added in the database
  val map = Map("Account" -> new Account, "Contact" -> new Contact) //TODO Replace this map with DB

  //Get entity from the database
  def getEntity(logicalName: String) = map.get(logicalName)

  def getEntity(logicalName: String, id: String) = map(logicalName).get(id)

}
