package ch.ntb.inf.klms.model.objects.base;

import ch.ntb.inf.klms.model.objects.CredentialValue;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Credential.class)
public abstract class Credential_ {

	public static volatile SingularAttribute<Credential, String> credentialType;
	public static volatile SingularAttribute<Credential, CredentialValue> credentialValue;
	public static volatile SingularAttribute<Credential, String> id;

}

