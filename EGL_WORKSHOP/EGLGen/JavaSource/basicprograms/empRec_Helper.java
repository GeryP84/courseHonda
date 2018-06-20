// Generated at Tue Jun 12 15:21:47 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package basicprograms;

public class empRec_Helper extends com.ibm.javart.util.JavartRecordHelper
{
	private static final long serialVersionUID = 70L;
	
	protected com.ibm.javart.resources.Program ezeProgram;
	public empRec_Helper( com.ibm.javart.resources.Program ezeProgram )
	{
		this.ezeProgram = ezeProgram;
	}
	public com.ibm.javart.json.ValueNode toJSON(com.ibm.javart.Container container ) throws com.ibm.javart.JavartException
	{
		return toJSON((basicprograms.empRec) container);
	}
	public void fromJSON(com.ibm.javart.json.ValueNode node, com.ibm.javart.Container container ) throws com.ibm.javart.JavartException
	{
		fromJSON(node, (basicprograms.empRec) container);
	}
	
	public com.ibm.javart.json.ValueNode toJSON(basicprograms.empRec structure ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.json.ObjectNode obj = new com.ibm.javart.json.ObjectNode();
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("emp", true),toJSON(structure.getemp())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("pay", true),toJSON(structure.getpay())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("rpt", true),toJSON(structure.getrpt())));
		return obj;
		
	}
	public com.ibm.javart.json.ValueNode toJSON(basicprograms.empRec._1 structure ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.json.ObjectNode obj = new com.ibm.javart.json.ObjectNode();
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("lastName", true),new com.ibm.javart.json.StringNode(structure.getlastName(), false)));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("firstName", true),new com.ibm.javart.json.StringNode(structure.getfirstName(), false)));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("empId", true),new com.ibm.javart.json.StringNode(structure.getempId(), false)));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("empPhone", true),new com.ibm.javart.json.DecimalNode(structure.getempPhone())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("partTimeInd", true),new com.ibm.javart.json.DecimalNode(structure.getpartTimeInd())));
		return obj;
		
	}
	public com.ibm.javart.json.ValueNode toJSON(basicprograms.empRec._2 structure ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.json.ObjectNode obj = new com.ibm.javart.json.ObjectNode();
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("grossPay", true),new com.ibm.javart.json.DecimalNode(structure.getgrossPay())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("ytdGrossPay", true),new com.ibm.javart.json.DecimalNode(structure.getytdGrossPay())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("fedTax", true),new com.ibm.javart.json.DecimalNode(structure.getfedTax())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("ytdFedTax", true),new com.ibm.javart.json.DecimalNode(structure.getytdFedTax())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("netPay", true),new com.ibm.javart.json.DecimalNode(structure.getnetPay())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("ytdNetPay", true),new com.ibm.javart.json.DecimalNode(structure.getytdNetPay())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("stockPurchPerc", true),new com.ibm.javart.json.DecimalNode(structure.getstockPurchPerc())));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("four01KPerc", true),new com.ibm.javart.json.DecimalNode(structure.getfour01KPerc())));
		return obj;
		
	}
	public com.ibm.javart.json.ValueNode toJSON(basicprograms.empRec._3 structure ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.json.ObjectNode obj = new com.ibm.javart.json.ObjectNode();
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("currDate", true),new com.ibm.javart.json.StringNode(structure.getcurrDate(), false)));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("periodEndDate", true),new com.ibm.javart.json.StringNode(structure.getperiodEndDate(), false)));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("reportTimeStamp", true),new com.ibm.javart.json.StringNode(structure.getreportTimeStamp(), false)));
		obj.addPair(new com.ibm.javart.json.NameValuePairNode(new com.ibm.javart.json.StringNode("payPeriod", true),new com.ibm.javart.json.DecimalNode(structure.getpayPeriod())));
		return obj;
		
	}
	public basicprograms.empRec fromJSON(com.ibm.javart.json.ValueNode node, basicprograms.empRec structure ) throws com.ibm.javart.JavartException
	{
		if (!(node instanceof com.ibm.javart.json.ObjectNode))
		{
			String ezeErrMessage = com.ibm.javart.util.JavartUtil.errorMessage( ezeProgram, com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, null );
			throw new com.ibm.javart.JavartException(com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, ezeErrMessage );
		}
		com.ibm.javart.json.ObjectNode obj = (com.ibm.javart.json.ObjectNode) node;
		fromJSON(com.ibm.javart.json.JsonUtilities.getValueNode(obj, "emp", com.ibm.javart.json.NullNode.NULL), structure.getemp());
		fromJSON(com.ibm.javart.json.JsonUtilities.getValueNode(obj, "pay", com.ibm.javart.json.NullNode.NULL), structure.getpay());
		fromJSON(com.ibm.javart.json.JsonUtilities.getValueNode(obj, "rpt", com.ibm.javart.json.NullNode.NULL), structure.getrpt());
		return structure;
		
	}
	public basicprograms.empRec._1 fromJSON(com.ibm.javart.json.ValueNode node, basicprograms.empRec._1 structure ) throws com.ibm.javart.JavartException
	{
		if (!(node instanceof com.ibm.javart.json.ObjectNode))
		{
			String ezeErrMessage = com.ibm.javart.util.JavartUtil.errorMessage( ezeProgram, com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, null );
			throw new com.ibm.javart.JavartException(com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, ezeErrMessage );
		}
		com.ibm.javart.json.ObjectNode obj = (com.ibm.javart.json.ObjectNode) node;
		structure.setlastName(((com.ibm.javart.json.StringNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "lastName", com.ibm.javart.json.JsonUtilities.EMPTY_STRING_NODE)).toJava());
		structure.setfirstName(((com.ibm.javart.json.StringNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "firstName", com.ibm.javart.json.JsonUtilities.EMPTY_STRING_NODE)).toJava());
		structure.setempId(((com.ibm.javart.json.StringNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "empId", com.ibm.javart.json.JsonUtilities.EMPTY_STRING_NODE)).toJava());
		structure.setempPhone((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "empPhone", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setpartTimeInd((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "partTimeInd", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		return structure;
		
	}
	public basicprograms.empRec._2 fromJSON(com.ibm.javart.json.ValueNode node, basicprograms.empRec._2 structure ) throws com.ibm.javart.JavartException
	{
		if (!(node instanceof com.ibm.javart.json.ObjectNode))
		{
			String ezeErrMessage = com.ibm.javart.util.JavartUtil.errorMessage( ezeProgram, com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, null );
			throw new com.ibm.javart.JavartException(com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, ezeErrMessage );
		}
		com.ibm.javart.json.ObjectNode obj = (com.ibm.javart.json.ObjectNode) node;
		structure.setgrossPay((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "grossPay", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setytdGrossPay((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "ytdGrossPay", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setfedTax((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "fedTax", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setytdFedTax((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "ytdFedTax", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setnetPay((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "netPay", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setytdNetPay((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "ytdNetPay", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setstockPurchPerc((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "stockPurchPerc", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		structure.setfour01KPerc((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "four01KPerc", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		return structure;
		
	}
	public basicprograms.empRec._3 fromJSON(com.ibm.javart.json.ValueNode node, basicprograms.empRec._3 structure ) throws com.ibm.javart.JavartException
	{
		if (!(node instanceof com.ibm.javart.json.ObjectNode))
		{
			String ezeErrMessage = com.ibm.javart.util.JavartUtil.errorMessage( ezeProgram, com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, null );
			throw new com.ibm.javart.JavartException(com.ibm.javart.messages.Message.SOA_E_WS_PROXY_PARMETERS_JSON2EGL, ezeErrMessage );
		}
		com.ibm.javart.json.ObjectNode obj = (com.ibm.javart.json.ObjectNode) node;
		structure.setcurrDate(((com.ibm.javart.json.StringNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "currDate", com.ibm.javart.json.JsonUtilities.EMPTY_STRING_NODE)).toCalendar());
		structure.setperiodEndDate(((com.ibm.javart.json.StringNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "periodEndDate", com.ibm.javart.json.JsonUtilities.EMPTY_STRING_NODE)).toCalendar());
		structure.setreportTimeStamp(((com.ibm.javart.json.StringNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "reportTimeStamp", com.ibm.javart.json.JsonUtilities.EMPTY_STRING_NODE)).toCalendar());
		structure.setpayPeriod((new java.math.BigDecimal(((com.ibm.javart.json.NumberNode)com.ibm.javart.json.JsonUtilities.getValueNode(obj, "payPeriod", com.ibm.javart.json.JsonUtilities.ZERO_NUMERIC_NODE)).getStringValue())));
		return structure;
		
	}public String getFormDataFieldName( String fieldName )
	{
		if( formDataNames == null )
		{
			formDataNames = new java.util.HashMap<String, String>();
			formDataNames.put( "emp", "emp" );
			formDataNames.put( "pay", "pay" );
			formDataNames.put( "rpt", "rpt" );
		}
		return super.getFormDataFieldName( fieldName );
	}
	
}
