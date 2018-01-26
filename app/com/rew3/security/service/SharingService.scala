package com.rew3.security.service

import com.rew3.security.{SecurityUtil, SecurityContext, AccessRights}
import core.EntityReference

/**
 * Created on 1/26/18.
 */
object SharingService {

  /**
   * Share a record to a Principal (Team or User)
   *
   * 1. First check if a logged in user has [[com.rew3.security.Privilege.Share]] Role-Based permission
   * 2. Check if the Entity is allowed/disallowed [[AccessRights.Share]] Record-Based permission
   * 3. If User has role-based permission but restricted in record-based, he cannot share.
   * 4. If User has restricted in role-based permission but allowed in record-based, he can share.
   *
   * @param principalId
   * @param accessRights
   * @param entityReference
   * @return
   */
  def grantAccess(principalId: String, accessRights: Seq[AccessRights.Value], entityReference: EntityReference)(implicit context: SecurityContext) = ???

  /**
   * Revoke access for an entity to a Principal (Team or User)
   *
   * 1. First check if a logged in user has [[com.rew3.security.Privilege.Share]] Role-Based permission
   * 2. Check if the Entity is allowed/disallowed [[AccessRights.Share]] Record-Based permission
   * 3. If User has role-based permission but restricted in record-based, he cannot revoke.
   * 4. If User has restricted in role-based permission but allowed in record-based, he can revoke.
   *
   * @param principalId
   * @param entityReference
   * @return
   */
  def revokeAccess(principalId: String, entityReference: EntityReference)(implicit context: SecurityContext) = ???

  /**
   * Anyone with Assign privileges on a record can assign that record to another user or Team
   * This is same as changing the owner
   *
   * 1. First check if a logged in user has [[com.rew3.security.Privilege.Assign]] Role-Based permission
   * 2. Check if the Entity is allowed/disallowed [[AccessRights.Assign]] Record-Based permission
   * 3. If User has role-based permission but restricted in record-based, he cannot assign.
   * 4. If User has restricted in role-based permission but allowed in record-based, he can assign.
   *
   * @param principalId
   * @param entityReference
   */
  def assignRecord(principalId: String, entityReference: EntityReference)(implicit context: SecurityContext) = ???

  /**
   * Get the list of [[AccessRights]] provided to a user for a particular Record
   *
   * @param principalId
   * @param target
   * @return
   */
  def getAccessForPrincipal(principalId: String, target: EntityReference): Seq[AccessRights.Value] = {
    val principal = SecurityUtil.parsePrincipal(principalId)
    //TODO Check in database for the target entity for shared data access rights
    Seq()
  }

}
