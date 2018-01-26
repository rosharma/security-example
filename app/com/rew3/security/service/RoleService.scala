package com.rew3.security.service

import com.rew3.security.{Privilege, SecurityUtil, SecurityContext, Role}
import core.EntityReference

/**
 * Created on 1/26/18.
 *
 * For Role-Based Security
 *
 * Role has multiple privileges for multiple entity types. An user can have multiple roles. His access is determined by
 * aggregation of all the privileges of his roles assigned to him OR the team which he is member of
 *
 */
object RoleService {

  /**
   * TODO Add a new user defined role in Database
   * @param role
   */
  def addRole(role: Role, context: SecurityContext) = ???

  /**
   * Check if a user or team has specific role to perform action on some entity
   *
   * @param principalId
   * @param privilege
   * @param entityReference
   * @return
   */
  def hasRole(principalId: String, privilege: Privilege.Value, entityReference: EntityReference ) = ???

  /**
   * Assign some role to a Principal (Team or User)
   *
   * @param principalId
   * @param role
   * @return
   */
  def addRoleToPrincipal(principalId: String, role: Role) = {
    val principal = SecurityUtil.parsePrincipal(principalId)
    //TODO
  }
}
