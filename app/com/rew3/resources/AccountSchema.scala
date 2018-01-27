package com.rew3.resources

import com.rew3.sale.Account
import sangria.schema._
import sangria.macros.derive._

/**
 * Created on 1/27/18.
 */
object AccountSchema {
  val AccountType = ObjectType(
    "Account",
    "The product picture",
    fields[Unit, Account](
      Field("id", IntType, resolve = _.value.getFieldByName("id").data.asInstanceOf[Int]),
      Field("name", StringType, resolve = _.value.getFieldByName("name").data.asInstanceOf[String]),
      Field("author", OptionType(StringType), description = Some("Id of the owner"), resolve = _.value.getFieldByName("owner").data.asInstanceOf[String])))

  val id = Argument("id", StringType)

  val QueryType = ObjectType("Query", fields[Account, Unit](
    Field("account", OptionType(AccountType),
      arguments = id :: Nil,
      description = Some("Returns a product with specific `id`."),
      resolve = c => c.ctx.get(c arg id)),

    Field("accounts", ListType(AccountType),
      description = Some("Returns a list of all available accounts."),
      resolve = _.ctx.all())))

  val schema = Schema(QueryType)
}
