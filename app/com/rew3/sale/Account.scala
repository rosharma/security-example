package com.rew3.sale

import com.rew3.util.DataType
import core.{Entity, Field}

class Account extends Entity[Account] {

  override val logicalName: String = "Account"

  override val fields: Seq[Field] = {
    val id = Field("id", "id", DataType.String)
    val name = Field("name", "name", DataType.String)
    val owner = Field("owner", "owner_id", DataType.String)

    Seq(id, name, owner)
  }

  override def get(id: String): Option[Account] = {
    println("-------------------------------")
    val f = Field("name", "name", DataType.String, "Hello")

    val account = new Account()
    Some(account)
  }

  override def all(): Seq[Account] = {
    Seq(new Account)
  }

  override def id: String = ???

  override def tableName: String = "crm.accounts"


}