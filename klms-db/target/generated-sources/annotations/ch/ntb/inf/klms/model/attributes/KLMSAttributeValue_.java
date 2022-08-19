package ch.ntb.inf.klms.model.attributes;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(KLMSAttributeValue.class)
public abstract class KLMSAttributeValue_ {

	public static volatile SingularAttribute<KLMSAttributeValue, String> name;
	public static volatile SingularAttribute<KLMSAttributeValue, Integer> length;
	public static volatile SingularAttribute<KLMSAttributeValue, String> id;
	public static volatile SingularAttribute<KLMSAttributeValue, String> tag;
	public static volatile SingularAttribute<KLMSAttributeValue, String> type;
	public static volatile SingularAttribute<KLMSAttributeValue, String> value;

}

