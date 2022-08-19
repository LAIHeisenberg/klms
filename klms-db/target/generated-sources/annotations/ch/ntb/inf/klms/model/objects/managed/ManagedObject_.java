package ch.ntb.inf.klms.model.objects.managed;

import ch.ntb.inf.klms.model.attributes.ApplicationSpecificInformation;
import ch.ntb.inf.klms.model.attributes.ArchiveDate;
import ch.ntb.inf.klms.model.attributes.ContactInformation;
import ch.ntb.inf.klms.model.attributes.CustomAttribute;
import ch.ntb.inf.klms.model.attributes.InitialDate;
import ch.ntb.inf.klms.model.attributes.LastChangeDate;
import ch.ntb.inf.klms.model.attributes.Name;
import ch.ntb.inf.klms.model.attributes.ObjectGroup;
import ch.ntb.inf.klms.model.attributes.ObjectType;
import ch.ntb.inf.klms.model.attributes.OperationPolicyName;
import ch.ntb.inf.klms.model.attributes.UniqueIdentifier;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ManagedObject.class)
public abstract class ManagedObject_ {

	public static volatile SetAttribute<ManagedObject, ApplicationSpecificInformation> applicationSpecificInformation;
	public static volatile SetAttribute<ManagedObject, Name> names;
	public static volatile SingularAttribute<ManagedObject, ContactInformation> contactInformation;
	public static volatile SetAttribute<ManagedObject, ObjectGroup> objectGroups;
	public static volatile SingularAttribute<ManagedObject, OperationPolicyName> operationPolicyName;
	public static volatile SingularAttribute<ManagedObject, ArchiveDate> archiveDate;
	public static volatile SingularAttribute<ManagedObject, LastChangeDate> lastChangeDate;
	public static volatile SingularAttribute<ManagedObject, String> id;
	public static volatile SingularAttribute<ManagedObject, InitialDate> initialDate;
	public static volatile SingularAttribute<ManagedObject, UniqueIdentifier> uniqueIdentifier;
	public static volatile SingularAttribute<ManagedObject, ObjectType> objectType;
	public static volatile SetAttribute<ManagedObject, CustomAttribute> customAttributes;

}

