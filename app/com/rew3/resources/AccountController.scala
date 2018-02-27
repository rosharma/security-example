package com.rew3.resources

import com.rew3.sale.Account
import play.api.mvc.{Action, Controller}
import scala.concurrent.Future
import scala.util.{Failure, Success}

import sangria.parser.QueryParser
import sangria.execution._
import sangria.marshalling.circe._
import io.circe.Json

import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Created on 1/27/18.
 */
class AccountController extends Controller{

  def accounts = Action.async {request =>

    val query = """{account(id: "12345"){name, author}}"""

    //val operation = (request.body \ "operationName").asOpt[String]

    QueryParser.parse(query) match {
      case Success(queryAst) =>
        val result: Future[Json] = Executor.execute(AccountSchema.schema, queryAst, new Account())
        result.map{t=>
          Ok(t.toString())
        }

      case Failure(error) => throw error

    }
  }
}
