package ch.ntb.inf.klms.model.objects.managed;

import ch.ntb.inf.klms.model.attributes.CryptographicParameters;
import ch.ntb.inf.klms.model.attributes.ProcessStartDate;
import ch.ntb.inf.klms.model.attributes.ProtectStopDate;
import ch.ntb.inf.klms.model.attributes.UsageLimits;
import ch.ntb.inf.klms.model.objects.base.KeyBlock;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SymmetricKey.class)
public abstract class SymmetricKey_ extends ch.ntb.inf.klms.model.objects.managed.CryptographicObject_ {

	public static volatile SingularAttribute<SymmetricKey, ProtectStopDate> protectStopDate;
	public static volatile SingularAttribute<SymmetricKey, UsageLimits> usageLimits;
	public static volatile SetAttribute<SymmetricKey, CryptographicParameters> cryptographicParameters;
	public static volatile SingularAttribute<SymmetricKey, KeyBlock> keyBlock;
	public static volatile SingularAttribute<SymmetricKey, ProcessStartDate> processStartDate;

}

