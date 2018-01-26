package com.rew3.security

/**
 * Created on 1/26/18.
 */
class User {

}

/**
 * Teams are used primarily for sharing records that team members ordinarily couldn't access.
 *
 * @param isPrivate
 * @param isPublic
 */
class Team (isPrivate: Boolean = true, isPublic: Boolean = false)

/**
 *
 */
object PrincipalType extends Enumeration {
  val User, Team = Value
}


/**
 * Security Principal are User or Team
 * @param id
 * @param `type`
 */
class Principal(id: String, `type`: PrincipalType.Value)
