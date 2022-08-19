package ch.ntb.inf.klms.model.objects.base;

import ch.ntb.inf.klms.model.attributes.CryptographicAlgorithm;
import ch.ntb.inf.klms.model.attributes.CryptographicLength;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(KeyBlock.class)
public abstract class KeyBlock_ {

	public static volatile SingularAttribute<KeyBlock, CryptographicLength> cryptographicLength;
	public static volatile SingularAttribute<KeyBlock, String> keyFormatType;
	public static volatile SingularAttribute<KeyBlock, KeyValue> keyValue;
	public static volatile SingularAttribute<KeyBlock, String> id;
	public static volatile SingularAttribute<KeyBlock, CryptographicAlgorithm> cryptographicAlgorithm;
	public static volatile SingularAttribute<KeyBlock, String> keyCompressionType;

}

