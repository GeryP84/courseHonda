// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class Customer_Helper extends com.ibm.javart.util.JavartRecordHelper
{
	private static final long serialVersionUID = 70L;
	
	protected com.ibm.javart.resources.Program ezeProgram;
	private java.util.Properties xmlProps = null;
	public Customer_Helper( com.ibm.javart.resources.Program ezeProgram )
	{
		this.ezeProgram = ezeProgram;
	}
	public com.ibm.javart.json.ValueNode toJSON(com.ibm.javart.Container container ) throws com.ibm.javart.JavartException
	{
		return null;
	}
	public void fromJSON(com.ibm.javart.json.ValueNode node, com.ibm.javart.Container container ) throws com.ibm.javart.JavartException
	{
	}
	public String getJsonFieldName( String fieldName )
	{
		if( jsonNames == null )
		{
			jsonNames = new java.util.HashMap<java.lang.String, java.lang.String>();
			jsonNames.put( "CustomerId", "CustomerId" );
			jsonNames.put( "FirstName", "FirstName" );
			jsonNames.put( "LastName", "LastName" );
			jsonNames.put( "Password", "Password" );
			jsonNames.put( "Phone", "Phone" );
			jsonNames.put( "EmailAddress", "EmailAddress" );
			jsonNames.put( "Street", "Street" );
			jsonNames.put( "Apartment", "Apartment" );
			jsonNames.put( "City", "City" );
			jsonNames.put( "State", "State" );
			jsonNames.put( "Postalcode", "Postalcode" );
			jsonNames.put( "Directions", "Directions" );
		}
		return super.getJsonFieldName( fieldName );
	}
	public String getFormDataFieldName( String fieldName )
	{
		if( formDataNames == null )
		{
			formDataNames = new java.util.HashMap<String, String>();
			formDataNames.put( "CustomerId", "CustomerId" );
			formDataNames.put( "FirstName", "FirstName" );
			formDataNames.put( "LastName", "LastName" );
			formDataNames.put( "Password", "Password" );
			formDataNames.put( "Phone", "Phone" );
			formDataNames.put( "EmailAddress", "EmailAddress" );
			formDataNames.put( "Street", "Street" );
			formDataNames.put( "Apartment", "Apartment" );
			formDataNames.put( "City", "City" );
			formDataNames.put( "State", "State" );
			formDataNames.put( "Postalcode", "Postalcode" );
			formDataNames.put( "Directions", "Directions" );
		}
		return super.getFormDataFieldName( fieldName );
	}
	public java.util.Properties XMLProperties()
	{
		if(xmlProps == null)
		{
			xmlProps = new java.util.Properties();
			xmlFields = new java.util.HashMap<String, String>();
			xmlProps.put( "XMLRootElement", "" );
			xmlProps.put( "XMLRootElement.name", "Customer" );
		}
		return xmlProps;
	}
	
}
