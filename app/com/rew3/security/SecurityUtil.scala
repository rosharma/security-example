package com.rew3.security

import java.util.UUID

/**
 * Created on 1/26/18.
 */
object SecurityUtil {

  def generateTeamId = 't'+ UUID.randomUUID().toString

  def generateUserId = 'u'+ UUID.randomUUID().toString

  def checkUUID(uuid: String): Boolean = {
    try {
      UUID.fromString(uuid)
      true
    } catch {
      case e: Exception => false
    }
  }

  case class InvalidIdentifierException() extends Exception

  @throws(classOf[Exception])
  def parsePrincipal(id: String): Principal = {
    id.splitAt(1)match{
      case (i, o) =>
        val principal = if(i.equals("t")) PrincipalType.Team else if(i.equals("t")) PrincipalType.User else throw new InvalidIdentifierException
        val uuid = if(checkUUID(o)) o else throw new InvalidIdentifierException
        new Principal(uuid, principal)
      case (_, _) => throw new InvalidIdentifierException
    }
  }

}
