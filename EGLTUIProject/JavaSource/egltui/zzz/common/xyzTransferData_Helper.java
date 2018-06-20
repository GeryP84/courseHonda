// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.zzz.common;

public class xyzTransferData_Helper extends com.ibm.javart.util.JavartRecordHelper
{
	private static final long serialVersionUID = 70L;
	
	protected com.ibm.javart.resources.Program ezeProgram;
	public xyzTransferData_Helper( com.ibm.javart.resources.Program ezeProgram )
	{
		this.ezeProgram = ezeProgram;
	}
	public com.ibm.javart.json.ValueNode toJSON(com.ibm.javart.Container container ) throws com.ibm.javart.JavartException
	{
		return toJSON((egltui.zzz.common.xyzTransferData) container);
	}
	public void fromJSON(com.ibm.javart.json.ValueNode node, com.ibm.javart.Container container ) throws com.ibm.javart.JavartException
	{
		fromJSON(node, (egltui.zzz.common.xyzTransferData) container);
	}
	
	public com.ibm.javart.json.ValueNode toJSON(egltui.zzz.common.xyzTransferData structure ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.json.ObjectNode obj = new com.ibm.javart.json.ObjectNode();
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("SiteuserFirstname", true),new com.ibm.javart.json.StringNode(structure.getSiteuserFirstname(), false)));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("CustomerId", true),new com.ibm.javart.json.IntegerNode(structure.getCustomerId())));
		return obj;
		
	}
	public egltui.zzz.common.xyzTransferData fromJSON(com.ibm.javart.json.ValueNode node, egltui.zzz.common.xyzTransferData structure ) throws com.ibm.javart.JavartException
	{
		if (!(node instanceof com.ibm.javart.json.ObjectNode))
		{
			String ezeErrMessage = com.ibm.javart.util.JavartUtil.errorMessage( ezeProgram, com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, null );
			throw new com.ibm.javart.JavartException(com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, ezeErrMessage );
		}
		com.ibm.javart.json.ObjectNode obj = (com.ibm.javart.json.ObjectNode) node;
		structure.setSiteuserFirstname(((com.ibm.javart.json.StringNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "SiteuserFirstname", com.ibm.javart.json.JsonUtilities.EMPTY_STRING_NODE)).toJava());
		structure.setCustomerId(java.lang.Integer.parseInt(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "CustomerId", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue()));
		return structure;
		
	}public String getFormDataFieldName( String fieldName )
	{
		if( formDataNames == null )
		{
			formDataNames = new java.util.HashMap<String, String>();
			formDataNames.put( "SiteuserFirstname", "SiteuserFirstname" );
			formDataNames.put( "CustomerId", "CustomerId" );
		}
		return super.getFormDataFieldName( fieldName );
	}
	
}
