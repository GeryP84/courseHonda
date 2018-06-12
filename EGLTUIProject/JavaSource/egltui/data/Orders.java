// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.data;

public class Orders extends com.ibm.javart.IoContainer
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.IntValue OrderId;
	public com.ibm.javart.IntValue CustomerId;
	public com.ibm.javart.NumericDecValue OrderAmount;
	public com.ibm.javart.CharValue OrderDetails;
	public com.ibm.javart.DateValue OrderDate;
	public com.ibm.javart.CharValue OrderStatus;
	
	public Orders() throws com.ibm.javart.JavartException
	{
		this( "Orders", null, com.ibm.javart.util.ServiceUtilities.programInstance("Orders", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Orders;" );
	}
	public Orders( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		OrderId = new com.ibm.javart.IntItem( "OrderId", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( OrderId );
		CustomerId = new com.ibm.javart.IntItem( "CustomerId", com.ibm.javart.Value.SQL_NOT_NULL, com.ibm.javart.Constants.SIGNATURE_INT );
		add( CustomerId );
		OrderAmount = new com.ibm.javart.NumericDecItem( "OrderAmount", com.ibm.javart.Value.SQL_NOT_NULL, 8, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d8:2;" );
		add( OrderAmount );
		OrderDetails = new com.ibm.javart.CharItem( "OrderDetails", com.ibm.javart.Value.SQL_NOT_NULL, 111, false, "C111;" );
		add( OrderDetails );
		OrderDate = new com.ibm.javart.DateItem( "OrderDate", com.ibm.javart.Value.SQL_NOT_NULL, com.ibm.javart.Constants.SIGNATURE_DATE );
		add( OrderDate );
		OrderStatus = new com.ibm.javart.CharItem( "OrderStatus", com.ibm.javart.Value.SQL_NOT_NULL, 12, true, "C12;" );
		add( OrderStatus );
		
		
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		Orders ezeClone = (Orders)super.clone();
		ezeClone.OrderId = (com.ibm.javart.IntValue)OrderId.clone();
		ezeClone.add( ezeClone.OrderId );
		ezeClone.CustomerId = (com.ibm.javart.IntValue)CustomerId.clone();
		ezeClone.add( ezeClone.CustomerId );
		ezeClone.OrderAmount = (com.ibm.javart.NumericDecValue)OrderAmount.clone();
		ezeClone.add( ezeClone.OrderAmount );
		ezeClone.OrderDetails = (com.ibm.javart.CharValue)OrderDetails.clone();
		ezeClone.add( ezeClone.OrderDetails );
		ezeClone.OrderDate = (com.ibm.javart.DateValue)OrderDate.clone();
		ezeClone.add( ezeClone.OrderDate );
		ezeClone.OrderStatus = (com.ibm.javart.CharValue)OrderStatus.clone();
		ezeClone.add( ezeClone.OrderStatus );
		return ezeClone;
	}
	
	public int getOrderId()
	{
		return OrderId.getValue();
	}
	public void setOrderId( int ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, OrderId, ezeValue );
	}
	public java.lang.Integer getOrderId_AsInteger()
	{
		return new java.lang.Integer( OrderId.getValue() );
	}
	public void setOrderId_AsInteger( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderId", OrderId, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderId, ezeValue );
		}
	}
	public java.lang.Integer getCustomerId()
	{
		if ( CustomerId.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return new java.lang.Integer( CustomerId.getValue() );
		}
	}
	public void setCustomerId( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "CustomerId", CustomerId, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, CustomerId, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, CustomerId, ezeValue );
		}
	}
	public java.math.BigDecimal getOrderAmount() throws com.ibm.javart.JavartException
	{
		if ( OrderAmount.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return OrderAmount.getValue( ezeProgram );
		}
	}
	public void setOrderAmount( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderAmount", OrderAmount, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderAmount, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderAmount, ezeValue );
		}
	}
	public java.lang.String getOrderDetails()
	{
		if ( OrderDetails.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return OrderDetails.getValueAsString();
		}
	}
	public void setOrderDetails( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderDetails", OrderDetails, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDetails, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDetails, ezeValue );
		}
	}
	public java.lang.String getOrderDetails_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( OrderDetails.getValueAsString() );
	}
	public void setOrderDetails_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderDetails", OrderDetails, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDetails, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDetails, ezeValue );
		}
	}
	public java.util.Calendar getOrderDate() throws com.ibm.javart.JavartException
	{
		if ( OrderDate.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return OrderDate.getValue( ezeProgram );
		}
	}
	public void setOrderDate( java.util.Calendar ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderDate", OrderDate, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDate, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDate, ezeValue );
		}
	}
	public java.util.Date getOrderDate_AsDate() throws com.ibm.javart.JavartException
	{
		if ( OrderDate.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return OrderDate.getValue( ezeProgram ).getTime();
		}
	}
	public void setOrderDate_AsDate( java.util.Date ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderDate", OrderDate, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDate, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			java.util.Calendar ezeTemp = com.ibm.javart.util.DateTimeUtil.getBaseCalendar();
			ezeTemp.setTime( ezeValue );
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderDate, ezeTemp );
		}
	}
	public java.lang.String getOrderStatus()
	{
		if ( OrderStatus.getNullStatus() == com.ibm.javart.Value.SQL_NULL )
		{
			return null;
		}
		else
		{
			return OrderStatus.getValueAsString();
		}
	}
	public void setOrderStatus( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderStatus", OrderStatus, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderStatus, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderStatus, ezeValue );
		}
	}
	public java.lang.String getOrderStatus_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( OrderStatus.getValueAsString() );
	}
	public void setOrderStatus_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( Orders.this, "OrderStatus", OrderStatus, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderStatus, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, OrderStatus, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new egltui.data.Orders_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
