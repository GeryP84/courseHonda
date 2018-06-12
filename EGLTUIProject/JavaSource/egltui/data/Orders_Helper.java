// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class Orders_Helper extends com.ibm.javart.util.JavartRecordHelper
{
	private static final long serialVersionUID = 70L;
	
	protected com.ibm.javart.resources.Program ezeProgram;
	private java.util.Properties xmlProps = null;
	public Orders_Helper( com.ibm.javart.resources.Program ezeProgram )
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
			jsonNames.put( "OrderId", "OrderId" );
			jsonNames.put( "CustomerId", "CustomerId" );
			jsonNames.put( "OrderAmount", "OrderAmount" );
			jsonNames.put( "OrderDetails", "OrderDetails" );
			jsonNames.put( "OrderDate", "OrderDate" );
			jsonNames.put( "OrderStatus", "OrderStatus" );
		}
		return super.getJsonFieldName( fieldName );
	}
	public String getFormDataFieldName( String fieldName )
	{
		if( formDataNames == null )
		{
			formDataNames = new java.util.HashMap<String, String>();
			formDataNames.put( "OrderId", "OrderId" );
			formDataNames.put( "CustomerId", "CustomerId" );
			formDataNames.put( "OrderAmount", "OrderAmount" );
			formDataNames.put( "OrderDetails", "OrderDetails" );
			formDataNames.put( "OrderDate", "OrderDate" );
			formDataNames.put( "OrderStatus", "OrderStatus" );
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
			xmlProps.put( "XMLRootElement.name", "Orders" );
		}
		return xmlProps;
	}
	
}
