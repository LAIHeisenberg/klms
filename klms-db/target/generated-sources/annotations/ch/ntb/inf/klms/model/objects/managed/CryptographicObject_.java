package ch.ntb.inf.klms.model.objects.managed;

import ch.ntb.inf.klms.model.attributes.ActivationDate;
import ch.ntb.inf.klms.model.attributes.CompromiseDate;
import ch.ntb.inf.klms.model.attributes.CompromiseOccurrenceDate;
import ch.ntb.inf.klms.model.attributes.CryptographicUsageMask;
import ch.ntb.inf.klms.model.attributes.DeactivationDate;
import ch.ntb.inf.klms.model.attributes.DestroyDate;
import ch.ntb.inf.klms.model.attributes.Digest;
import ch.ntb.inf.klms.model.attributes.LeaseTime;
import ch.ntb.inf.klms.model.attributes.Link;
import ch.ntb.inf.klms.model.attributes.RevocationReason;
import ch.ntb.inf.klms.model.attributes.State;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CryptographicObject.class)
public abstract class CryptographicObject_ extends ch.ntb.inf.klms.model.objects.managed.ManagedObject_ {

	public static volatile SingularAttribute<CryptographicObject, DeactivationDate> deactivationDate;
	public static volatile SingularAttribute<CryptographicObject, LeaseTime> leaseTime;
	public static volatile SingularAttribute<CryptographicObject, CryptographicUsageMask> cryptographicUsageMask;
	public static volatile SingularAttribute<CryptographicObject, DestroyDate> destroyDate;
	public static volatile SetAttribute<CryptographicObject, Digest> digests;
	public static volatile SingularAttribute<CryptographicObject, CompromiseOccurrenceDate> compromiseOccurrenceDate;
	public static volatile SetAttribute<CryptographicObject, Link> links;
	public static volatile SingularAttribute<CryptographicObject, CompromiseDate> compromiseDate;
	public static volatile SingularAttribute<CryptographicObject, State> state;
	public static volatile SingularAttribute<CryptographicObject, RevocationReason> revocationReason;
	public static volatile SingularAttribute<CryptographicObject, ActivationDate> activationDate;

}

