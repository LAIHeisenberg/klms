package ch.ntb.inf.klms.model.objects.base;

import ch.ntb.inf.klms.model.attributes.KLMSAttributeValue;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Attribute.class)
public abstract class Attribute_ {

	public static volatile ListAttribute<Attribute, KLMSAttributeValue> values;
	public static volatile SingularAttribute<Attribute, Integer> attributeIndex;
	public static volatile SingularAttribute<Attribute, String> attributeName;
	public static volatile SingularAttribute<Attribute, String> id;
	public static volatile SingularAttribute<Attribute, String> tag;
	public static volatile SingularAttribute<Attribute, String> type;

}

