package com.rew3.security

/**
 * Created on 1/26/18.
 *
 * There are for Role-Based Sharing
 */
object Privilege extends Enumeration {
  val Create, Read, Write, Delete, Append, Assign, Share = Value
}
