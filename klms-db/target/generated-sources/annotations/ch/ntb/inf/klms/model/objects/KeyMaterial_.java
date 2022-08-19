package ch.ntb.inf.klms.model.objects;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(KeyMaterial.class)
public abstract class KeyMaterial_ {

	public static volatile SingularAttribute<KeyMaterial, byte[]> kmByteString;
	public static volatile SingularAttribute<KeyMaterial, String> id;

}

