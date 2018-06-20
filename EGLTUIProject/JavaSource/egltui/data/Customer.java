// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class Customer extends com.ibm.javart.IoContainer
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.IntValue CustomerId;
	public com.ibm.javart.CharValue FirstName;
	public com.ibm.javart.CharValue LastName;
	public com.ibm.javart.CharValue Password;
	public com.ibm.javart.CharValue Phone;
	public com.ibm.javart.CharValue EmailAddress;
	public com.ibm.javart.CharValue Street;
	public com.ibm.javart.CharValue Apartment;
	public com.ibm.javart.CharValue City;
	public com.ibm.javart.CharValue State;
	public com.ibm.javart.CharValue Postalcode;
	public com.ibm.javart.CharValue Directions;
	
	public Customer() throws com.ibm.javart.JavartException
	{
		this( "Customer", null, com.ibm.javart.util.ServiceUtilities.programInstance("Customer", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
	}
	public Customer( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		CustomerId = new com.ibm.javart.IntItem( "CustomerId", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( CustomerId );
		FirstName = new com.ibm.javart.CharItem( "FirstName", com.ibm.javart.Value.SQL_NOT_NULL, 30, false, "C30;" );
		add( FirstName );
		LastName = new com.ibm.javart.CharItem( "LastName", com.ibm.javart.Value.SQL_NOT_NULL, 30, false, "C30;" );
		add( LastName );
		Password = new com.ibm.javart.CharItem( "Password", com.ibm.javart.Value.SQL_NOT_NULL, 8, true, "C8;" );
		add( Password );
		Phone = new com.ibm.javart.CharItem( "Phone", com.ibm.javart.Value.SQL_NOT_NULL, 14, false, "C14;" );
		add( Phone );
		EmailAddress = new com.ibm.javart.CharItem( "EmailAddress", com.ibm.javart.Value.SQL_NOT_NULL, 50, false, "C50;" );
		add( EmailAddress );
		Street = new com.ibm.javart.CharItem( "Street", com.ibm.javart.Value.SQL_NOT_NULL, 30, false, "C30;" );
		add( Street );
		Apartment = new com.ibm.javart.CharItem( "Apartment", com.ibm.javart.Value.SQL_NOT_NULL, 10, false, "C10;" );
		add( Apartment );
		City = new com.ibm.javart.CharItem( "City", com.ibm.javart.Value.SQL_NOT_NULL, 30, false, "C30;" );
		add( City );
		State = new com.ibm.javart.CharItem( "State", com.ibm.javart.Value.SQL_NOT_NULL, 2, true, "C2;" );
		add( State );
		Postalcode = new com.ibm.javart.CharItem( "Postalcode", com.ibm.javart.Value.SQL_NOT_NULL, 10, false, "C10;" );
		add( Postalcode );
		Directions = new com.ibm.javart.CharItem( "Directions", com.ibm.javart.Value.SQL_NOT_NULL, 255, false, "C255;" );
		add( Directions );
		
		
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		Customer ezeClone = (Customer)super.clone();
		ezeClone.CustomerId = (com.ibm.javart.IntValue)CustomerId.clone();
		ezeClone.add( ezeClone.CustomerId );
		ezeClone.FirstName = (com.ibm.javart.CharValue)FirstName.clone();
		ezeClone.add( ezeClone.FirstName );
		ezeClone.LastName = (com.ibm.javart.CharValue)LastName.clone();
		ezeClone.add( ezeClone.LastName );
		ezeClone.Password = (com.ibm.javart.CharValue)Password.clone();
		ezeClone.add( ezeClone.Password );
		ezeClone.Phone = (com.ibm.javart.CharValue)Phone.clone();
		ezeClone.add( ezeClone.Phone );
		ezeClone.EmailAddress = (com.ibm.javart.CharValue)EmailAddress.clone();
		ezeClone.add( ezeClone.EmailAddress );
		ezeClone.Street = (com.ibm.javart.CharValue)Street.clone();
		ezeClone.add( ezeClone.Street );
		ezeClone.Apartment = (com.ibm.javart.CharValue)Apartment.clone();
		ezeClone.add( ezeClone.Apartment );
		ezeClone.City = (com.ibm.javart.CharValue)City.clone();
		ezeClone.add( ezeClone.City );
		ezeClone.State = (com.ibm.javart.CharValue)State.clone();
		ezeClone.add( ezeClone.State );
		ezeClone.Postalcode = (com.ibm.javart.CharValue)Postalcode.clone();
		ezeClone.add( ezeClone.Postalcode );
		ezeClone.Directions = (com.ibm.javart.CharValue)Directions.clone();
		ezeClone.add( ezeClone.Directions );
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
		ezeProgram._setModified( Customer.this, "CustomerId", CustomerId, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, CustomerId, ezeValue );
		}
	}
	public java.lang.String getFirstName()
	{
		if ( FirstName.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return FirstName.getValueAsString();
		}
	}
	public void setFirstName( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "FirstName", FirstName, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, FirstName, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, FirstName, ezeValue );
		}
	}
	public java.lang.String getFirstName_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( FirstName.getValueAsString() );
	}
	public void setFirstName_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "FirstName", FirstName, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, FirstName, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, FirstName, ezeValue );
		}
	}
	public java.lang.String getLastName()
	{
		if ( LastName.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return LastName.getValueAsString();
		}
	}
	public void setLastName( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "LastName", LastName, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, LastName, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, LastName, ezeValue );
		}
	}
	public java.lang.String getLastName_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( LastName.getValueAsString() );
	}
	public void setLastName_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "LastName", LastName, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, LastName, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, LastName, ezeValue );
		}
	}
	public java.lang.String getPassword()
	{
		if ( Password.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Password.getValueAsString();
		}
	}
	public void setPassword( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Password", Password, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Password, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Password, ezeValue );
		}
	}
	public java.lang.String getPassword_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Password.getValueAsString() );
	}
	public void setPassword_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Password", Password, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Password, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Password, ezeValue );
		}
	}
	public java.lang.String getPhone()
	{
		if ( Phone.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Phone.getValueAsString();
		}
	}
	public void setPhone( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Phone", Phone, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Phone, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Phone, ezeValue );
		}
	}
	public java.lang.String getPhone_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Phone.getValueAsString() );
	}
	public void setPhone_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Phone", Phone, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Phone, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Phone, ezeValue );
		}
	}
	public java.lang.String getEmailAddress()
	{
		if ( EmailAddress.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return EmailAddress.getValueAsString();
		}
	}
	public void setEmailAddress( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "EmailAddress", EmailAddress, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, EmailAddress, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, EmailAddress, ezeValue );
		}
	}
	public java.lang.String getEmailAddress_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( EmailAddress.getValueAsString() );
	}
	public void setEmailAddress_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "EmailAddress", EmailAddress, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, EmailAddress, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, EmailAddress, ezeValue );
		}
	}
	public java.lang.String getStreet()
	{
		if ( Street.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Street.getValueAsString();
		}
	}
	public void setStreet( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Street", Street, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Street, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Street, ezeValue );
		}
	}
	public java.lang.String getStreet_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Street.getValueAsString() );
	}
	public void setStreet_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Street", Street, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Street, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Street, ezeValue );
		}
	}
	public java.lang.String getApartment()
	{
		if ( Apartment.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Apartment.getValueAsString();
		}
	}
	public void setApartment( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Apartment", Apartment, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Apartment, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Apartment, ezeValue );
		}
	}
	public java.lang.String getApartment_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Apartment.getValueAsString() );
	}
	public void setApartment_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Apartment", Apartment, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Apartment, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Apartment, ezeValue );
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
		ezeProgram._setModified( Customer.this, "City", City, ezeValue );
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
		ezeProgram._setModified( Customer.this, "City", City, ezeValue );
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
		ezeProgram._setModified( Customer.this, "State", State, ezeValue );
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
		ezeProgram._setModified( Customer.this, "State", State, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, State, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, State, ezeValue );
		}
	}
	public java.lang.String getPostalcode()
	{
		if ( Postalcode.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Postalcode.getValueAsString();
		}
	}
	public void setPostalcode( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Postalcode", Postalcode, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Postalcode, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Postalcode, ezeValue );
		}
	}
	public java.lang.String getPostalcode_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Postalcode.getValueAsString() );
	}
	public void setPostalcode_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Postalcode", Postalcode, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Postalcode, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Postalcode, ezeValue );
		}
	}
	public java.lang.String getDirections()
	{
		if ( Directions.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return Directions.getValueAsString();
		}
	}
	public void setDirections( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Directions", Directions, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Directions, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Directions, ezeValue );
		}
	}
	public java.lang.String getDirections_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( Directions.getValueAsString() );
	}
	public void setDirections_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Customer.this, "Directions", Directions, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Directions, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, Directions, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new egltui.data.Customer_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
