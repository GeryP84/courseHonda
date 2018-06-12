// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui;

public class StatusRec extends com.ibm.javart.Container
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.BooleanValue succeeded;
	public com.ibm.javart.IntValue statusCode;
	public com.ibm.javart.StringValue message;
	
	public StatusRec() throws com.ibm.javart.JavartException
	{
		this( "StatusRec", null, com.ibm.javart.util.ServiceUtilities.programInstance("StatusRec", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/StatusRec;" );
	}
	public StatusRec( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		succeeded = new com.ibm.javart.BooleanItem( "succeeded", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		add( succeeded );
		statusCode = new com.ibm.javart.IntItem( "statusCode", com.ibm.javart.Value.SQL_NULL, com.ibm.javart.Constants.SIGNATURE_INT_NULLABLE );
		add( statusCode );
		message = new com.ibm.javart.StringItem( "message", com.ibm.javart.Value.SQL_NULL, com.ibm.javart.Constants.SIGNATURE_STRING_NULLABLE );
		add( message );
		
		
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		StatusRec ezeClone = (StatusRec)super.clone();
		ezeClone.succeeded = (com.ibm.javart.BooleanValue)succeeded.clone();
		ezeClone.add( ezeClone.succeeded );
		ezeClone.statusCode = (com.ibm.javart.IntValue)statusCode.clone();
		ezeClone.add( ezeClone.statusCode );
		ezeClone.message = (com.ibm.javart.StringValue)message.clone();
		ezeClone.add( ezeClone.message );
		return ezeClone;
	}
	
	public boolean getsucceeded()
	{
		return succeeded.getValue();
	}
	public void setsucceeded( boolean ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, succeeded, ezeValue );
	}
	public java.lang.Boolean getsucceeded_AsBoolean()
	{
		return new java.lang.Boolean( succeeded.getValue() );
	}
	public void setsucceeded_AsBoolean( java.lang.Boolean ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( StatusRec.this, "succeeded", succeeded, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, succeeded, ezeValue );
		}
	}
	public java.lang.Integer getstatusCode()
	{
		if ( statusCode.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return new java.lang.Integer( statusCode.getValue() );
		}
	}
	public void setstatusCode( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( StatusRec.this, "statusCode", statusCode, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, statusCode, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, statusCode, ezeValue );
		}
	}
	public java.lang.String getmessage()
	{
		if ( message.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return message.getValue();
		}
	}
	public void setmessage( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( StatusRec.this, "message", message, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, message, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, message, ezeValue );
		}
	}
	public java.lang.String getmessage_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( message.getValue() );
	}
	public void setmessage_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( StatusRec.this, "message", message, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, message, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, message, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new egltui.StatusRec_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
