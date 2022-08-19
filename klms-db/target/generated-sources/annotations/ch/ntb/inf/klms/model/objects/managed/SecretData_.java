package ch.ntb.inf.klms.model.objects.managed;

import ch.ntb.inf.klms.model.objects.base.KeyBlock;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SecretData.class)
public abstract class SecretData_ extends ch.ntb.inf.klms.model.objects.managed.CryptographicObject_ {

	public static volatile SingularAttribute<SecretData, String> secretDataType;
	public static volatile SingularAttribute<SecretData, KeyBlock> keyBlock;

}

