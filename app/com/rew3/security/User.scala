package com.rew3.security

/**
 * Created on 1/26/18.
 */
class User {

}

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
