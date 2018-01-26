package com.rew3.security.service

import com.rew3.security.{SecurityUtil, SecurityContext, Role}

/**
 * Created on 1/26/18.
 *
 * For Role-Based Security
 */
class RoleService {

  /**
   * TODO Add a new user defined role in Database
   * @param role
   */
  def addRole(role: Role, context: SecurityContext) = ???

  /**
   * Assign some role to a Principal (Team or User)
   *
   * @param principalId
   * @param role
   * @return
   */
  def assignRoleToPrincipal(principalId: String, role: Role) = {
    val principal = SecurityUtil.parsePrincipal(principalId)
    //TODO
  }
}
