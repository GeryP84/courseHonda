// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui;

public class ListSpecification_Helper extends com.ibm.javart.util.JavartRecordHelper
{
	private static final long serialVersionUID = 70L;
	
	protected com.ibm.javart.resources.Program ezeProgram;
	private java.util.Properties xmlProps = null;
	public ListSpecification_Helper( com.ibm.javart.resources.Program ezeProgram )
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
			jsonNames.put( "initialized", "initialized" );
			jsonNames.put( "selectClause", "selectClause" );
			jsonNames.put( "fromTablesWhere", "fromTablesWhere" );
			jsonNames.put( "blockingFactor", "blockingFactor" );
			jsonNames.put( "position", "position" );
			jsonNames.put( "pageCount", "pageCount" );
			jsonNames.put( "rowCount", "rowCount" );
		}
		return super.getJsonFieldName( fieldName );
	}
	public String getFormDataFieldName( String fieldName )
	{
		if( formDataNames == null )
		{
			formDataNames = new java.util.HashMap<String, String>();
			formDataNames.put( "initialized", "initialized" );
			formDataNames.put( "selectClause", "selectClause" );
			formDataNames.put( "fromTablesWhere", "fromTablesWhere" );
			formDataNames.put( "blockingFactor", "blockingFactor" );
			formDataNames.put( "position", "position" );
			formDataNames.put( "pageCount", "pageCount" );
			formDataNames.put( "rowCount", "rowCount" );
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
			xmlProps.put( "XMLRootElement.name", "ListSpecification" );
		}
		return xmlProps;
	}
	
}
