package com.rew3.sale

import core.{Entity, Field}

class Contact extends Entity[Contact] {

  override val logicalName: String = "Contact"

  override def get(id: String): Option[Contact] = {
    Some(new Contact())
  }

  override val tableName: String = "crm.contacts"

  //Get list
  override def all(): Seq[Contact] = Seq()

  override val fields: Seq[Field] = {
    val id = Field("id", "id", classOf[String].getName)
    val name = Field("name", "name", classOf[String].getName)
    val owner = Field("owner", "owner_id", classOf[String].getName)

    Seq(id, name, owner)
  }
}