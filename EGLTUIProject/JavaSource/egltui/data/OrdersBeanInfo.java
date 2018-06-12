// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class OrdersBeanInfo extends com.ibm.javart.util.JavartBeanInfo
{
	private static final long serialVersionUID = 70L;
	
	protected void initProperties() {
		addProperty( "OrderId", "getOrderId_AsInteger", "setOrderId_AsInteger" );
		addProperty( "CustomerId" );
		addProperty( "OrderAmount" );
		addProperty( "OrderDetails", "getOrderDetails_AsString", "setOrderDetails_AsString" );
		addProperty( "OrderDate", "getOrderDate_AsDate", "setOrderDate_AsDate" );
		addProperty( "OrderStatus", "getOrderStatus_AsString", "setOrderStatus_AsString" );
		addProperty( "ezeIdx" );
	}
}
