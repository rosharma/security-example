# Security Concepts
The security model promotes efficient data access and collaboration. The goals of the model are as follows:
- Provide a multi-tiered licensing model for users.
- Grant users access that allows only the levels of information required to do their jobs.
- Categorize users and teams by security role and restrict access based on those roles.
- Support data sharing so that users can be granted access to objects they do not own for a one-time collaborative effort.
- Prevent access to objects a user does not own or share.

## Security Services
There are two types of security:
1. Role-Based
2. Record-Based

#### Role Based
This security identify if a user can perform certain action to a Specific [Entity Type](app/com/rew3/core/Entities.scala). There are [Privileges](app/com/rew3/security/Privilege.scala) which identify the action user can do on the entity type. There are [Access Levels](app/com/rew3/security/AccessLevel.scala) to limit the scope of the users's data access.

For e.g.
 * If a user has the **Global Read Account** privilege, this user can read all accounts in his organization, and all accounts in any child organization.
 * If a user has **Local Read Account**, privilege this user can read all accounts in his organization.
 * If a user is assigned the **Basic Read Account** privilege, this user can read only the accounts that he owns or the accounts that are shared with him.

See [RoleService](app/com/rew3/security/service/RoleService.scala) for more details.

#### Record Based
This security identify if a ***user or team*** has right to perform action to a [Record](app/com/rew3/core/Entity.scala). There are [Access Rights](app/com/rew3/security/AccessRights.scala) which will identify the action ***user or team*** can do on the record. There are ***two*** ways to do record-based sharing:
 * Sharing: User can share a record with team or user with some Access Rights
 * Assigning: This is same as changing the owner

See [SharingService](app/com/rew3/security/service/SharingService.scala) for more details.


## TODO
1. How to manage roles based on specific feature: E.g. Group can have special collaboration roles:
    * Standard — Indicates that a user is a group member. Members can post and comment in the group.
    * Admin — Indicates that a user is a group manager. Managers can post and comment, change member roles, edit group settings, add and remove members, delete posts and comments, and edit the group information field.

    These "standard" and "admin" are special cases. May be we need to add one more layer to check these ***CollaborationRole***.
2. In the nested entity cases, create a workflow to manage the security. For e.g. Account is related to Contact, Case, Lead etc. If someone's role enable to edit Account but can't view the Contact. In this case how to manage him to view only contact linked with this Account?

### References
* [Role Based Security](https://msdn.microsoft.com/en-us/library/gg334717.aspx)
* [Record Based Security](https://msdn.microsoft.com/en-us/library/gg334673.aspx)
* [Managing Role From UI](https://ukcrmguru.files.wordpress.com/2015/02/system-administrator-security-role.png)