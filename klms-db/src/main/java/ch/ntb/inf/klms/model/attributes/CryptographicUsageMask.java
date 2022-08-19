/**
 * CryptographicUsageMask.java
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

import ch.ntb.inf.klms.model.objects.base.Attribute;

@Entity
@DiscriminatorValue("Cryptographic Usage Mask")
public class CryptographicUsageMask extends Attribute {

	public CryptographicUsageMask(){
		super("Cryptographic Usage Mask", "CryptographicUsageMask", "Integer");
		this.values = new ArrayList<KLMSAttributeValue>();
		this.values.add(new KLMSAttributeValue("Integer", "CryptographicUsageMask"));
		this.values.get(0).setName(this.getAttributeName());
	}
	
	public CryptographicUsageMask(String value){
		this();
		this.values.get(0).setValue(value);
	}
	
	public int getUsageMask(){
		return Integer.parseInt(this.values.get(0).getValueString());
	}
	
}
