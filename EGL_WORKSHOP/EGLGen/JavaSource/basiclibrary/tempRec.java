// Generated at Tue Jun 19 11:55:55 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package basiclibrary;

public class tempRec extends com.ibm.javart.Container
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.NumericDecValue tempC;
	public com.ibm.javart.NumericDecValue tempF;
	
	public tempRec() throws com.ibm.javart.JavartException
	{
		this( "tempRec", null, com.ibm.javart.util.ServiceUtilities.programInstance("tempRec", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "TBasicLibrary/tempRec;" );
	}
	public tempRec( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		tempC = new com.ibm.javart.NumericDecItem( "tempC", com.ibm.javart.Value.SQL_NOT_NULLABLE, 5, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d5:2;" );
		add( tempC );
		tempF = new com.ibm.javart.NumericDecItem( "tempF", com.ibm.javart.Value.SQL_NOT_NULLABLE, 5, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d5:2;" );
		add( tempF );
		
		
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		tempRec ezeClone = (tempRec)super.clone();
		ezeClone.tempC = (com.ibm.javart.NumericDecValue)tempC.clone();
		ezeClone.add( ezeClone.tempC );
		ezeClone.tempF = (com.ibm.javart.NumericDecValue)tempF.clone();
		ezeClone.add( ezeClone.tempF );
		return ezeClone;
	}
	
	public java.math.BigDecimal gettempC() throws com.ibm.javart.JavartException
	{
		return tempC.getValue( ezeProgram );
	}
	public void settempC( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( tempRec.this, "tempC", tempC, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, tempC, ezeValue );
		}
	}
	public java.math.BigDecimal gettempF() throws com.ibm.javart.JavartException
	{
		return tempF.getValue( ezeProgram );
	}
	public void settempF( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( tempRec.this, "tempF", tempF, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, tempF, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new basiclibrary.tempRec_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
