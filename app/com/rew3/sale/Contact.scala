package com.rew3.sale

import com.rew3.util.DataType
import core.{Entity, Field}

class Contact extends Entity[Contact] {

  override def logicalName: String = "Contact"

  override val fields: Seq[Field] = {
    val id = Field("id", "id", DataType.String)
    val name = Field("name", "name", DataType.String)
    val owner = Field("owner", "owner_id", DataType.String)

    Seq(id, name, owner)
  }

  override def get(id: String): Option[Contact] = {
    Some(new Contact())
  }

  override def id: String = ???

  override def tableName: String = "crm.contacts"


}