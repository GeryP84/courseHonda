// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.zzz.common;

public class xyzTransferData extends com.ibm.javart.OverlayContainer
{
	private static final long serialVersionUID = 70L;
	
	
	private static byte[] ezeInitialData;
	private static byte[] ezeEmptyData;
	
	public com.ibm.javart.CharValue SiteuserFirstname;
	public com.ibm.javart.IntValue CustomerId;
	
	public xyzTransferData( java.lang.String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, java.lang.String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus, 0, 24 );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		if ( ezeInitialData == null )
		{
			SiteuserFirstname = new com.ibm.javart.OverlayCharItem( "SiteuserFirstname", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, true, 0, 0, "C20;", true );
			add(SiteuserFirstname);
			CustomerId = new com.ibm.javart.OverlayIntItem( "CustomerId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, true, 0, 20, com.ibm.javart.Constants.SIGNATURE_INT );
			add(CustomerId);
			
			ezeEmptyData = new byte[ 24 ];
			System.arraycopy( com.ibm.javart.util.JavartUtil.getByteStorage( ezeProgram, this ).getBytes(), 0, ezeEmptyData, 0, 24 );
			
			ezeInitialData = ezeEmptyData;
		}
		else
		{
			SiteuserFirstname = new com.ibm.javart.OverlayCharItem( "SiteuserFirstname", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, true, 0, 0, "C20;", true );
			add(SiteuserFirstname);
			CustomerId = new com.ibm.javart.OverlayIntItem( "CustomerId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, true, 0, 20, com.ibm.javart.Constants.SIGNATURE_INT );
			add(CustomerId);
			ezeSetInitial( ezeProgram );
		}
	}
	
	
	
	public xyzTransferData() throws com.ibm.javart.JavartException
	{
		this( "xyzTransferData", null, com.ibm.javart.util.ServiceUtilities.programInstance("xyzTransferData", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/zzz/common/xyzTransferData;" );
	}
	
	public xyzTransferData( java.lang.String ezeName, com.ibm.javart.Container ezeContainer, com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, boolean ezeRedefinedFlag, java.lang.String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus, 24, 24 );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		if ( ezeRedefinedFlag )
		{
			SiteuserFirstname = new com.ibm.javart.OverlayCharItem( "SiteuserFirstname", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 0, 0, "C20;", true );
			add(SiteuserFirstname);
			CustomerId = new com.ibm.javart.OverlayIntItem( "CustomerId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 20, 20, com.ibm.javart.Constants.SIGNATURE_INT );
			add(CustomerId);
		}
		else
		{
			SiteuserFirstname = new com.ibm.javart.OverlayCharItem( "SiteuserFirstname", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 0, 0, "C20;", true );
			add(SiteuserFirstname);
			CustomerId = new com.ibm.javart.OverlayIntItem( "CustomerId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 20, 20, com.ibm.javart.Constants.SIGNATURE_INT );
			add(CustomerId);
			ezeSetInitial( ezeProgram );
		}
	}
	
	
	
	
	public java.lang.Object clone() throws java.lang.CloneNotSupportedException
	{
		xyzTransferData ezeClone = (xyzTransferData)super.clone();
		ezeClone.SiteuserFirstname = (com.ibm.javart.CharValue)SiteuserFirstname.clone();
		((com.ibm.javart.OverlayCharItem)ezeClone.SiteuserFirstname).setContainer( ezeClone );
		ezeClone.add( ezeClone.SiteuserFirstname );
		ezeClone.CustomerId = (com.ibm.javart.IntValue)CustomerId.clone();
		((com.ibm.javart.OverlayIntItem)ezeClone.CustomerId).setContainer( ezeClone );
		ezeClone.add( ezeClone.CustomerId );
		return ezeClone;
	}
	
	public java.lang.String getSiteuserFirstname()
	{
		return SiteuserFirstname.getValueAsString();
	}
	public void setSiteuserFirstname( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( xyzTransferData.this, "SiteuserFirstname", SiteuserFirstname, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, SiteuserFirstname, ezeValue );
		}
	}
	public java.lang.String getSiteuserFirstname_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( SiteuserFirstname.getValueAsString() );
	}
	public void setSiteuserFirstname_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( xyzTransferData.this, "SiteuserFirstname", SiteuserFirstname, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, SiteuserFirstname, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, SiteuserFirstname, ezeValue );
		}
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
		ezeProgram._setModified( xyzTransferData.this, "CustomerId", CustomerId, ezeValue );
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
		if ( ezeHelper == null )
		{
			ezeHelper = new egltui.zzz.common.xyzTransferData_Helper( ezeProgram );
		}
		return ezeHelper;
	}
	public void ezeSetEmpty( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
	{
		if ( ezeEmptyData == null )
		{
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, this );
			ezeEmptyData = new byte[ 24 ];
			System.arraycopy( com.ibm.javart.util.JavartUtil.getByteStorage( ezeProgram, this ).getBytes(), 0, ezeEmptyData, 0, 24 );
		}
		else
		{
			loadFromBuffer( new com.ibm.javart.ByteStorage( ezeEmptyData ), ezeProgram );
		}
	}
	public void ezeSetInitial( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
	{
		if ( ezeInitialData == null )
		{
			ezeSetEmpty( ezeProgram );
			ezeInitialData = ezeEmptyData;
		}
		else
		{
			loadFromBuffer( new com.ibm.javart.ByteStorage( ezeInitialData ), ezeProgram );
		}
	}
	
}
