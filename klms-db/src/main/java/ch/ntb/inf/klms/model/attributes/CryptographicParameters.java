/**
 * CryptographicParameters.java
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
@DiscriminatorValue("Cryptographic Parameters")
public class CryptographicParameters extends Attribute {
	
	
	public CryptographicParameters(){
		super("Cryptographic Parameters", "CryptographicParameters", "Structure");
		this.values = new ArrayList<KLMSAttributeValue>();
		
		this.values.add(new KLMSAttributeValue("Enumeration", "KeyRoleType"));
		this.values.get(0).setName("Key Role Type");
		
		this.values.add(new KLMSAttributeValue("Enumeration", "PaddingMethod"));
		this.values.get(1).setName("Padding Method");
		
		this.values.add(new KLMSAttributeValue("Enumeration", "BlockCipherMode"));
		this.values.get(2).setName("Block Cipher Mode");
	}
	
}
