package com.rew3.resources

import com.rew3.core.Entities
import com.rew3.security._
import com.rew3.security.service.SharingService
import core.EntityReference
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Created on 1/26/18.
 */
class SecurityController extends Controller {

  /**
   * List of Privileges for the UI
   * @return
   */
  def privileges() = Action.async {
    Future(Ok(Json.toJson(Privilege.values.toSeq)))
  }

  /**
   * List of entities for the UI
   * @return
   */
  def entities = Action.async {
    Future(Ok(Json.toJson(Entities.map.keys.toSeq)))
  }

  /**
   * List of access levels for the UI
   * @return
   */
  def accessLevel = Action.async {
    Future(Ok(Json.toJson(AccessLevel.values.toSeq)))
  }

  /**
   * Add new role to database
   * @return
   */
  def addRole() = ???

  /**
   * Retrieve the access rights of the specified security principal (team or user) to the specified record.
   * PrincipalId can be Team ID or User ID
   *
   * @param principalId
   * @param entityType
   * @param entityId
   * @return
   */
  def retrievePrincipalAccess(principalId: String, entityType: String, entityId: String) = {
    val target = EntityReference(entityType, entityId)
    SharingService.getAccessForPrincipal(principalId, target)
  }



}
