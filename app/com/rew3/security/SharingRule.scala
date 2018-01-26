package com.rew3.security

/**
 * Created on 1/26/18.
 *
 * Any user who has share privileges on a given entity type can share records of that type with any other user or team.
 * This is useful for sharing information with users in roles that have only the Basic access level.
 *
 * For example, in an organization that gives salespeople Basic read and write access to accounts,
 * a salesperson can share an opportunity with another salesperson so that they can both track the
 * progress of an important sale.
 *
 * A user might have access to the same record in more than one context. For example, a user might share a record
 * directly with specific access rights, and he or she might also be on a team in which the same record is shared with
 * different access rights. In this case, the access rights that this user has on the record are the union of
 * all the rights.
 *
 * Sharing is maintained on individual records. A record inherits the sharing properties from its parent and
 * also maintains its own sharing properties. Therefore, a record can have two sets of sharing properties—one that
 * it has on its own and one that it inherits from its parent.
 *
 * Removing the share of a parent record removes the sharing properties of objects (records) that it inherited
 * from the parent. That is, all users who previously had visibility into this record no longer have visibility.
 * Child objects still could be shared to some of these users if they were shared individually, not from
 * the parent record.
 *
 * Share: GrantAccessRequest
 * Modify share: ModifyAccessRequest
 * Remove share: RevokeAccessRequest
 */
case class SharingRule()

/**
 * Assigning a data is also a way to share a data. Anyone with Assign privileges on a record can assign that record
 * to another user. When a record is assigned, the new user or team becomes the owner of the record and
 * its related records.
 *
 * AssignRequest
 *
 * https://msdn.microsoft.com/en-us/library/gg334673.aspx#BKMK_SharingInstances
 */
case class Assign()
