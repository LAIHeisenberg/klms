package ch.ntb.inf.klms.accesscontrol;

import ch.ntb.inf.klms.model.objects.base.Credential;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(UserPermissionEntry.class)
public abstract class UserPermissionEntry_ {

	public static volatile SingularAttribute<UserPermissionEntry, String> uid;
	public static volatile SingularAttribute<UserPermissionEntry, Credential> credential;
	public static volatile SingularAttribute<UserPermissionEntry, String> id;

}

