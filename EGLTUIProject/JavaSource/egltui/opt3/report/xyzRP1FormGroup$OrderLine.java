// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt3.report;

public class xyzRP1FormGroup$OrderLine extends egl.ui.text.PrintForm
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.IntValue OrderID;
	public egl.ui.text.TuiField OrderID$VariableFormField;
	public com.ibm.javart.CharValue OrderDate;
	public egl.ui.text.TuiField OrderDate$VariableFormField;
	public com.ibm.javart.NumericDecValue OrderAmount;
	public egl.ui.text.TuiField OrderAmount$VariableFormField;
	public com.ibm.javart.CharValue OrderStatus;
	public egl.ui.text.TuiField OrderStatus$VariableFormField;
	
	public xyzRP1FormGroup$OrderLine( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		OrderID = new com.ibm.javart.IntItem( "OrderID", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( OrderID );
		OrderID$VariableFormField = new egl.ui.text.TuiField( "OrderID$VariableFormField", this, OrderID );
		OrderID$VariableFormField.setLength(9);
		OrderID$VariableFormField.setPosition(0,2,5);
		OrderID$VariableFormField.setCurrentValue(0,"",true);
		OrderID$VariableFormField.setConversionDescriptor(-9);
		OrderID$VariableFormField.setJustify(egl.ui.AlignKind.right);
		OrderID$VariableFormField.setIsComplete();
		addField( OrderID$VariableFormField );
		OrderDate = new com.ibm.javart.CharItem( "OrderDate", com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, true, "C10;" );
		add( OrderDate );
		OrderDate$VariableFormField = new egl.ui.text.TuiField( "OrderDate$VariableFormField", this, OrderDate );
		OrderDate$VariableFormField.setLength(10);
		OrderDate$VariableFormField.setPosition(0,2,18);
		OrderDate$VariableFormField.setCurrentValue(0,"",true);
		OrderDate$VariableFormField.setJustify(egl.ui.AlignKind.left);
		OrderDate$VariableFormField.setDateFormat("MM/dd/yyyy");
		OrderDate$VariableFormField.setIsComplete();
		addField( OrderDate$VariableFormField );
		OrderAmount = new com.ibm.javart.NumericDecItem( "OrderAmount", com.ibm.javart.Value.SQL_NOT_NULLABLE, 8, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d8:2;" );
		add( OrderAmount );
		OrderAmount$VariableFormField = new egl.ui.text.TuiField( "OrderAmount$VariableFormField", this, OrderAmount );
		OrderAmount$VariableFormField.setLength(15);
		OrderAmount$VariableFormField.setPosition(0,2,31);
		OrderAmount$VariableFormField.setCurrentValue(0,"",true);
		OrderAmount$VariableFormField.setConversionDescriptor(-15);
		OrderAmount$VariableFormField.setJustify(egl.ui.AlignKind.right);
		OrderAmount$VariableFormField.setSeparator(true);
		OrderAmount$VariableFormField.setCurrency(true);
		OrderAmount$VariableFormField.setCurrencySymbol("$");
		OrderAmount$VariableFormField.setIsComplete();
		addField( OrderAmount$VariableFormField );
		OrderStatus = new com.ibm.javart.CharItem( "OrderStatus", com.ibm.javart.Value.SQL_NOT_NULLABLE, 12, true, "C12;" );
		add( OrderStatus );
		OrderStatus$VariableFormField = new egl.ui.text.TuiField( "OrderStatus$VariableFormField", this, OrderStatus );
		OrderStatus$VariableFormField.setLength(12);
		OrderStatus$VariableFormField.setPosition(0,2,49);
		OrderStatus$VariableFormField.setCurrentValue(0,"",true);
		OrderStatus$VariableFormField.setJustify(egl.ui.AlignKind.left);
		OrderStatus$VariableFormField.setIsComplete();
		addField( OrderStatus$VariableFormField );
		setFormGroupClassName("egltui.opt3.report.xyzRP1FormGroup");
		setSize(2,132);
		setIsFloating(true);
		setPosition(-1,-1);
		signature( "Tegltui/opt3/report/OrderLine;" );
	}
	
}
