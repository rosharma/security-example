package com.rew3.sale

import core.{Entity, Field}

class Account extends Entity[Account] {

  val logicalName: String = "Account"

  val tableName: String = "crm.accounts"

  override def get(id: String): Option[Account] = {

    //Perform a database-query to get following record
    val id = new Field("id", "c_id", "java.lang.String", "12345")
    val name = new Field("name", "c_name", "java.lang.String", "Roshan Sharma")
    val owner = new Field("owner", "c_owner_id", "java.lang.String", "123")

    val databaseResult = Seq(id, name, owner)

    val account = new Account(){override val fields = databaseResult}

    Some(account)
  }

  override def all(): Seq[Account] = {
    Seq()
  }

  override val fields: Seq[Field] = {
    val id = Field("id", "c_id", classOf[String].getName)
    val name = Field("name", "c_name", classOf[String].getName)
    val owner = Field("owner", "c_owner_id", classOf[String].getName)

    Seq(id, name, owner)
  }

  override def insert: Account = ???
}