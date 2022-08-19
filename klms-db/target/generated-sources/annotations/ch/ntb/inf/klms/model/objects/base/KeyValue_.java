package ch.ntb.inf.klms.model.objects.base;

import ch.ntb.inf.klms.model.objects.KeyMaterial;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(KeyValue.class)
public abstract class KeyValue_ {

	public static volatile SingularAttribute<KeyValue, KeyMaterial> keyMaterial;
	public static volatile SetAttribute<KeyValue, Attribute> attributes;
	public static volatile SingularAttribute<KeyValue, String> id;

}

