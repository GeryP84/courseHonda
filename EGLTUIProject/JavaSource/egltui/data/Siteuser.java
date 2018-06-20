// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class Siteuser extends com.ibm.javart.IoContainer
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.IntValue SiteuserId;
	public com.ibm.javart.CharValue Firstname;
	public com.ibm.javart.CharValue Lastname;
	public com.ibm.javart.CharValue UserId;
	public com.ibm.javart.CharValue PassWord;
	public com.ibm.javart.CharValue StreetAddress;
	public com.ibm.javart.CharValue City;
	public com.ibm.javart.CharValue State;
	public com.ibm.javart.CharValue Zip;
	public com.ibm.javart.IntValue SuType;
	public com.ibm.javart.IntValue ReceiveUpdates;
	public com.ibm.javart.IntValue JoinClub;
	public com.ibm.javart.CharValue Comments;
	
	public Siteuser() throws com.ibm.javart.JavartException
	{
		this( "Siteuser", null, com.ibm.javart.util.ServiceUtilities.programInstance("Siteuser", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Siteuser;" );
	}
	public Siteuser( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		SiteuserId = new com.ibm.javart.IntItem( "SiteuserId", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( SiteuserId );
		Firstname = new com.ibm.javart.CharItem( "Firstname", com.ibm.javart.Value.SQL_NOT_NULL, 20, true, "C20;" );
		add( Firstname );
		Lastname = new com.ibm.javart.CharItem( "Lastname", com.ibm.javart.Value.SQL_NOT_NULL, 20, true, "C20;" );
		add( Lastname );
		UserId = new com.ibm.javart.CharItem( "UserId", com.ibm.javart.Value.SQL_NOT_NULL, 8, true, "C8;" );
		add( UserId );
		PassWord = new com.ibm.javart.CharItem( "PassWord", com.ibm.javart.Value.SQL_NOT_NULL, 8, true, "C8;" );
		add( PassWord );
		StreetAddress = new com.ibm.javart.CharItem( "StreetAddress", com.ibm.javart.Value.SQL_NOT_NULL, 20, true, "C20;" );
		add( StreetAddress );
		City = new com.ibm.javart.CharItem( "City", com.ibm.javart.Value.SQL_NOT_NULL, 20, true, "C20;" );
		add( City );
		State = new com.ibm.javart.CharItem( "State", com.ibm.javart.Value.SQL_NOT_NULL, 2, true, "C2;" );
		add( State );
		Zip = new com.ibm.javart.CharItem( "Zip", com.ibm.javart.Value.SQL_NOT_NULL, 5, true, "C5;" );
		add( Zip );
		SuType = new com.ibm.javart.IntItem( "SuType", com.ibm.javart.Value.SQL_NOT_NULL, com.ibm.javart.Constants.SIGNATURE_INT );
		add( SuType );
		ReceiveUpdates = new com.ibm.javart.IntItem( "ReceiveUpdates", com.ibm.javart.Value.SQL_NOT_NULL, com.ibm.javart.Constants.SIGNATURE_INT );
		add( ReceiveUpdates );
		JoinClub = new com.ibm.javart.IntItem( "JoinClub", com.ibm.javart.Value.SQL_NOT_NULL, com.ibm.javart.Constants.SIGNATURE_INT );
		add( JoinClub );
		Comments = new com.ibm.javart.CharItem( "Comments", com.ibm.javart.Value.SQL_NOT_NULL, 255, false, "C255;" );
		add( Comments );
		
		
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		Siteuser ezeClone = (Siteuser)super.clone();
		ezeClone.SiteuserId = (com.ibm.javart.IntValue)SiteuserId.clone();
		ezeClone.add( ezeClone.SiteuserId );
		ezeClone.Firstname = (com.ibm.javart.CharValue)Firstname.clone();
		ezeClone.add( ezeClone.Firstname );
		ezeClone.Lastname = (com.ibm.javart.CharValue)Lastname.clone();
		ezeClone.add( ezeClone.Lastname );
		ezeClone.UserId = (com.ibm.javart.CharValue)UserId.clone();
		ezeClone.add( ezeClone.UserId );
		ezeClone.PassWord = (com.ibm.javart.CharValue)PassWord.clone();
		ezeClone.add( ezeClone.PassWord );
		ezeClone.StreetAddress = (com.ibm.javart.CharValue)StreetAddress.clone();
		ezeClone.add( ezeClone.StreetAddress );
		ezeClone.City = (com.ibm.javart.CharValue)City.clone();
		ezeClone.add( ezeClone.City );
		ezeClone.State = (com.ibm.javart.CharValue)State.clone();
		ezeClone.add( ezeClone.State );
		ezeClone.Zip = (com.ibm.javart.CharValue)Zip.clone();
		ezeClone.add( ezeClone.Zip );
		ezeClone.SuType = (com.ibm.javart.IntValue)SuType.clone();
		ezeClone.add( ezeClone.SuType );
		ezeClone.ReceiveUpdates = (com.ibm.javart.IntValue)ReceiveUpdates.clone();
		ezeClone.add( ezeClone.ReceiveUpdates );
		ezeClone.JoinClub = (com.ibm.javart.IntValue)JoinClub.clone();
		ezeClone.add( ezeClone.JoinClub );
		ezeClone.Comments = (com.ibm.javart.CharValue)Comments.clone();
		ezeClone.add( ezeClone.Comments );
		return ezeClone;
	}
	
	public int getSiteuserId()
	{
		return SiteuserId.getValue();
	}
	public void setSiteuserId( int ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, SiteuserId, ezeValue );
	}
	public java.lang.Integer getSiteuserId_AsInteger()
	{
		return new java.lang.Integer( SiteuserId.getValue() );
	}
	public void setSiteuserId_AsInteger( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "SiteuserId", SiteuserId, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, SiteuserId, ezeValue );
		}
	}
	public java.lang.String getFirstname()
	{
		if ( Firstname.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Firstname.getValueAsString();
		}
	}
	public void setFirstname( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Firstname", Firstname, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Firstname, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Firstname, ezeValue );
		}
	}
	public java.lang.String getFirstname_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Firstname.getValueAsString() );
	}
	public void setFirstname_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Firstname", Firstname, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Firstname, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Firstname, ezeValue );
		}
	}
	public java.lang.String getLastname()
	{
		if ( Lastname.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Lastname.getValueAsString();
		}
	}
	public void setLastname( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Lastname", Lastname, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Lastname, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Lastname, ezeValue );
		}
	}
	public java.lang.String getLastname_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Lastname.getValueAsString() );
	}
	public void setLastname_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Lastname", Lastname, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Lastname, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Lastname, ezeValue );
		}
	}
	public java.lang.String getUserId()
	{
		if ( UserId.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return UserId.getValueAsString();
		}
	}
	public void setUserId( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "UserId", UserId, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, UserId, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, UserId, ezeValue );
		}
	}
	public java.lang.String getUserId_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( UserId.getValueAsString() );
	}
	public void setUserId_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "UserId", UserId, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, UserId, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, UserId, ezeValue );
		}
	}
	public java.lang.String getPassWord()
	{
		if ( PassWord.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return PassWord.getValueAsString();
		}
	}
	public void setPassWord( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "PassWord", PassWord, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, PassWord, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, PassWord, ezeValue );
		}
	}
	public java.lang.String getPassWord_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( PassWord.getValueAsString() );
	}
	public void setPassWord_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "PassWord", PassWord, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, PassWord, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, PassWord, ezeValue );
		}
	}
	public java.lang.String getStreetAddress()
	{
		if ( StreetAddress.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return StreetAddress.getValueAsString();
		}
	}
	public void setStreetAddress( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "StreetAddress", StreetAddress, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, StreetAddress, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, StreetAddress, ezeValue );
		}
	}
	public java.lang.String getStreetAddress_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( StreetAddress.getValueAsString() );
	}
	public void setStreetAddress_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "StreetAddress", StreetAddress, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, StreetAddress, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, StreetAddress, ezeValue );
		}
	}
	public java.lang.String getCity()
	{
		if ( City.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return City.getValueAsString();
		}
	}
	public void setCity( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "City", City, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, City, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, City, ezeValue );
		}
	}
	public java.lang.String getCity_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( City.getValueAsString() );
	}
	public void setCity_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "City", City, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, City, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, City, ezeValue );
		}
	}
	public java.lang.String getState()
	{
		if ( State.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return State.getValueAsString();
		}
	}
	public void setState( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "State", State, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, State, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, State, ezeValue );
		}
	}
	public java.lang.String getState_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( State.getValueAsString() );
	}
	public void setState_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "State", State, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, State, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, State, ezeValue );
		}
	}
	public java.lang.String getZip()
	{
		if ( Zip.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Zip.getValueAsString();
		}
	}
	public void setZip( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Zip", Zip, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Zip, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Zip, ezeValue );
		}
	}
	public java.lang.String getZip_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Zip.getValueAsString() );
	}
	public void setZip_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Zip", Zip, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Zip, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Zip, ezeValue );
		}
	}
	public java.lang.Integer getSuType()
	{
		if ( SuType.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return new java.lang.Integer( SuType.getValue() );
		}
	}
	public void setSuType( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "SuType", SuType, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, SuType, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, SuType, ezeValue );
		}
	}
	public java.lang.Integer getReceiveUpdates()
	{
		if ( ReceiveUpdates.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return new java.lang.Integer( ReceiveUpdates.getValue() );
		}
	}
	public void setReceiveUpdates( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "ReceiveUpdates", ReceiveUpdates, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, ReceiveUpdates, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, ReceiveUpdates, ezeValue );
		}
	}
	public java.lang.Integer getJoinClub()
	{
		if ( JoinClub.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return new java.lang.Integer( JoinClub.getValue() );
		}
	}
	public void setJoinClub( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "JoinClub", JoinClub, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, JoinClub, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, JoinClub, ezeValue );
		}
	}
	public java.lang.String getComments()
	{
		if ( Comments.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Comments.getValueAsString();
		}
	}
	public void setComments( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Comments", Comments, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Comments, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Comments, ezeValue );
		}
	}
	public java.lang.String getComments_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Comments.getValueAsString() );
	}
	public void setComments_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Siteuser.this, "Comments", Comments, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Comments, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Comments, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new egltui.data.Siteuser_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
