// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class Siteuser_Helper extends com.ibm.javart.util.JavartRecordHelper
{
	private static final long serialVersionUID = 70L;
	
	protected com.ibm.javart.resources.Program ezeProgram;
	private java.util.Properties xmlProps = null;
	public Siteuser_Helper( com.ibm.javart.resources.Program ezeProgram )
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
			jsonNames.put( "SiteuserId", "SiteuserId" );
			jsonNames.put( "Firstname", "Firstname" );
			jsonNames.put( "Lastname", "Lastname" );
			jsonNames.put( "UserId", "UserId" );
			jsonNames.put( "PassWord", "PassWord" );
			jsonNames.put( "StreetAddress", "StreetAddress" );
			jsonNames.put( "City", "City" );
			jsonNames.put( "State", "State" );
			jsonNames.put( "Zip", "Zip" );
			jsonNames.put( "SuType", "SuType" );
			jsonNames.put( "ReceiveUpdates", "ReceiveUpdates" );
			jsonNames.put( "JoinClub", "JoinClub" );
			jsonNames.put( "Comments", "Comments" );
		}
		return super.getJsonFieldName( fieldName );
	}
	public String getFormDataFieldName( String fieldName )
	{
		if( formDataNames == null )
		{
			formDataNames = new java.util.HashMap<String, String>();
			formDataNames.put( "SiteuserId", "SiteuserId" );
			formDataNames.put( "Firstname", "Firstname" );
			formDataNames.put( "Lastname", "Lastname" );
			formDataNames.put( "UserId", "UserId" );
			formDataNames.put( "PassWord", "PassWord" );
			formDataNames.put( "StreetAddress", "StreetAddress" );
			formDataNames.put( "City", "City" );
			formDataNames.put( "State", "State" );
			formDataNames.put( "Zip", "Zip" );
			formDataNames.put( "SuType", "SuType" );
			formDataNames.put( "ReceiveUpdates", "ReceiveUpdates" );
			formDataNames.put( "JoinClub", "JoinClub" );
			formDataNames.put( "Comments", "Comments" );
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
			xmlProps.put( "XMLRootElement.name", "Siteuser" );
		}
		return xmlProps;
	}
	
}
