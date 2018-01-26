package com.rew3.security

/**
 * Created on 1/26/18.
 *
 * https://msdn.microsoft.com/en-us/library/hh547441.aspx
 *
 * Role-based security identify if a user can perform certain action to a Specific Entity Type
 * For e.g.
 * 1.2 If a user has the Deep Read Account privilege, this user can read all accounts in his or her business unit, and all accounts in any child business unit of that business unit.
 * 1.3 If a user has Local Read Account privileges, this user can read all accounts in the local business unit.
 *
 * E.g. Sales Manager, Support User, System Administrator etc
 * https://msdn.microsoft.com/en-us/library/gg334717.aspx
 *
 * It’s not possible to remove access for a particular record. Any change to a security role privilege applies to all records of that record type.
 *
 * Role can be assigned to team and user. You cannot delete or modify default roles.
 */
case class Role(id: String, name: String, accesses: Seq[Access], isDefault: Boolean)

/**
 * Access is a internal class which defines: what privilege of what access level of a entity is provided
 *
 * E.g.
 * (Basic, Read, Account): can read only the accounts that he owns or the accounts that are shared with him
 * (Local, Read, Account): can view account data and run account-related reports for all accounts in his company
*/
case class Access(accessLevel: AccessLevel.Value, privileges: Seq[Privilege.Value], entity: String)