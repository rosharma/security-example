package core

class Account extends Entity {
  override def logicalName: String = "Account"

  override val fields: Option[Seq[Field]] = {
    val name = Field("name", "acc_name", None)

    Some(Seq(name))
  }

  override def id: String = ???

  override def tableName: String = "crm.accounts"


}