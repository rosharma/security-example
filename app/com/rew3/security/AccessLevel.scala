package com.rew3.security

/**
 * Created on 1/26/18.
 */
object AccessLevel extends Enumeration {

  val Global = Value //This access level gives a user access to all records in the organization
  val Local = Value //This access level gives a user access to records in the user's business unit
  val Basic = Value //This access level gives a user access to records that the user owns, objects that are shared with the user, and objects that are shared with a team that the user is a member of.
  val None = Value //No access is allowed.
}
