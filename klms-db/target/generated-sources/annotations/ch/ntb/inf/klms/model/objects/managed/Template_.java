package ch.ntb.inf.klms.model.objects.managed;

import ch.ntb.inf.klms.model.objects.base.Attribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Template.class)
public abstract class Template_ extends ch.ntb.inf.klms.model.objects.managed.ManagedObject_ {

	public static volatile ListAttribute<Template, Attribute> attributes;

}

