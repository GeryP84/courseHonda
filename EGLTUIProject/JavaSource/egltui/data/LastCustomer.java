// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class LastCustomer extends com.ibm.javart.IoContainer
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.IntValue CustomerId;
	
	public LastCustomer() throws com.ibm.javart.JavartException
	{
		this( "LastCustomer", null, com.ibm.javart.util.ServiceUtilities.programInstance("LastCustomer", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/LastCustomer;" );
	}
	public LastCustomer( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		CustomerId = new com.ibm.javart.IntItem( "CustomerId", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( CustomerId );
		
		
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		LastCustomer ezeClone = (LastCustomer)super.clone();
		ezeClone.CustomerId = (com.ibm.javart.IntValue)CustomerId.clone();
		ezeClone.add( ezeClone.CustomerId );
		return ezeClone;
	}
	
	public int getCustomerId()
	{
		return CustomerId.getValue();
	}
	public void setCustomerId( int ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, CustomerId, ezeValue );
	}
	public java.lang.Integer getCustomerId_AsInteger()
	{
		return new java.lang.Integer( CustomerId.getValue() );
	}
	public void setCustomerId_AsInteger( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( LastCustomer.this, "CustomerId", CustomerId, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, CustomerId, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new egltui.data.LastCustomer_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
