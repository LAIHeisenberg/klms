package ch.ntb.inf.klms.model.objects;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CredentialValue.class)
public abstract class CredentialValue_ {

	public static volatile SingularAttribute<CredentialValue, String> password;
	public static volatile SingularAttribute<CredentialValue, String> id;
	public static volatile SingularAttribute<CredentialValue, String> username;

}

