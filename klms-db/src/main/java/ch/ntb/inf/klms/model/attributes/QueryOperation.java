/**
 * QueryOperation.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 *
 * @org.       NTB - University of Applied Sciences Buchs, (CH)
 * @author     Stefanie Meile <stefaniemeile@gmail.com>
 * @author     Michael Guster <michael.guster@gmail.com>
 * @org.       NTB - University of Applied Sciences Buchs, (CH)
 * @license    Simplified BSD License (see LICENSE.TXT)
 * @version    1.0, 2013/08/09
 * @since      Class available since Release 1.0
 *
 * 
 */

package ch.ntb.inf.klms.model.attributes;

import java.util.ArrayList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import ch.ntb.inf.klms.model.klmsenum.EnumOperation;
import ch.ntb.inf.klms.model.objects.base.Attribute;


@Entity
@DiscriminatorValue("Query Operation")
public class QueryOperation extends Attribute {

	
	public QueryOperation(){
		super("Query Operation", "Query Operation", "Enumeration");
		this.values = new ArrayList<KLMSAttributeValue>();
		this.values.add(new KLMSAttributeValue("Enumeration", "Query Operation"));
		this.values.get(0).setName(this.getAttributeName());
	}
	
	public QueryOperation(String value){
		this();
		this.values.get(0).setValue(value);
	}
	
	public String getQueryOperation(){
		int value = Integer.parseInt(this.values.get(0).getValueString());
		EnumOperation qf = new EnumOperation(value);
		return qf.getKey();
	}
	
}
