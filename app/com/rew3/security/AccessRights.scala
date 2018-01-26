package com.rew3.security

import com.rew3.security.Privilege._

/**
 * Created on 1/26/18.
 *
 * There are the rights for Record-Based Sharing
 */
object AccessRights extends Enumeration {
  val Create, Read, Write, Delete, Append, Assign, Share = Value
}
