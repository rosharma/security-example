package com.rew3.collaboration

import com.rew3.security.Role

/**
 * Created on 1/26/18.
 */
trait Group {

  def ownerId: String //Id of the user which own the Group

  def `type`: GroupType //Type of Group e.g. Team, Community, Network Group, Chat Group

  def members: Seq[GroupMember] //List of user or team
}

trait GroupType {

}


case class GroupRole()

/**
 *
 * The role of a group member. Group owners and managers can change roles for members of their groups. The valid values are:
 * Standard — Indicates that a user is a group member. Members can post and comment in the group.
 * Admin — Indicates that a user is a group manager. Managers can post and comment, change member roles, edit group settings, add and remove members, delete posts and comments, and edit the group information field.
 *
 * @param principalId can be user id or team id
 * @param role
 * @param subsctibeEmail
 */
case class GroupMember(principalId: String, role: Role, subsctibeEmail: Boolean)
