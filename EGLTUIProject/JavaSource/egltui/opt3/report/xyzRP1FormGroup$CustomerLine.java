// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt3.report;

public class xyzRP1FormGroup$CustomerLine extends egl.ui.text.PrintForm
{
	private static final long serialVersionUID = 70L;
	
	public egl.ui.text.TuiField $4_6$ConstantFormField;
	public com.ibm.javart.IntValue CustomerID;
	public egl.ui.text.TuiField CustomerID$VariableFormField;
	public com.ibm.javart.CharValue FirstName;
	public egl.ui.text.TuiField FirstName$VariableFormField;
	public com.ibm.javart.CharValue LastName;
	public egl.ui.text.TuiField LastName$VariableFormField;
	public com.ibm.javart.CharValue City;
	public egl.ui.text.TuiField City$VariableFormField;
	public com.ibm.javart.CharValue State;
	public egl.ui.text.TuiField State$VariableFormField;
	public com.ibm.javart.CharValue PostalCode;
	public egl.ui.text.TuiField PostalCode$VariableFormField;
	public com.ibm.javart.CharValue continuedFlag;
	public egl.ui.text.TuiField continuedFlag$VariableFormField;
	
	public xyzRP1FormGroup$CustomerLine( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		$4_6$ConstantFormField = new egl.ui.text.TuiField( "$4_6$ConstantFormField", this, null );
		$4_6$ConstantFormField.setPosition(0,4,6);
		$4_6$ConstantFormField.setCurrentValue(0,"Order ID   Order Date       Order Amount   Order Status",true);
		$4_6$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$4_6$ConstantFormField.setIsComplete();
		addField( $4_6$ConstantFormField );
		CustomerID = new com.ibm.javart.IntItem( "CustomerID", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( CustomerID );
		CustomerID$VariableFormField = new egl.ui.text.TuiField( "CustomerID$VariableFormField", this, CustomerID );
		CustomerID$VariableFormField.setLength(9);
		CustomerID$VariableFormField.setPosition(0,2,1);
		CustomerID$VariableFormField.setCurrentValue(0,"",true);
		CustomerID$VariableFormField.setConversionDescriptor(-9);
		CustomerID$VariableFormField.setJustify(egl.ui.AlignKind.right);
		CustomerID$VariableFormField.setFillCharacter("0");
		CustomerID$VariableFormField.setIsComplete();
		addField( CustomerID$VariableFormField );
		FirstName = new com.ibm.javart.CharItem( "FirstName", com.ibm.javart.Value.SQL_NOT_NULLABLE, 30, true, "C30;" );
		add( FirstName );
		FirstName$VariableFormField = new egl.ui.text.TuiField( "FirstName$VariableFormField", this, FirstName );
		FirstName$VariableFormField.setLength(30);
		FirstName$VariableFormField.setPosition(0,2,12);
		FirstName$VariableFormField.setCurrentValue(0,"",true);
		FirstName$VariableFormField.setJustify(egl.ui.AlignKind.left);
		FirstName$VariableFormField.setIsComplete();
		addField( FirstName$VariableFormField );
		LastName = new com.ibm.javart.CharItem( "LastName", com.ibm.javart.Value.SQL_NOT_NULLABLE, 30, true, "C30;" );
		add( LastName );
		LastName$VariableFormField = new egl.ui.text.TuiField( "LastName$VariableFormField", this, LastName );
		LastName$VariableFormField.setLength(30);
		LastName$VariableFormField.setPosition(0,2,44);
		LastName$VariableFormField.setCurrentValue(0,"",true);
		LastName$VariableFormField.setJustify(egl.ui.AlignKind.left);
		LastName$VariableFormField.setIsComplete();
		addField( LastName$VariableFormField );
		City = new com.ibm.javart.CharItem( "City", com.ibm.javart.Value.SQL_NOT_NULLABLE, 30, true, "C30;" );
		add( City );
		City$VariableFormField = new egl.ui.text.TuiField( "City$VariableFormField", this, City );
		City$VariableFormField.setLength(30);
		City$VariableFormField.setPosition(0,3,12);
		City$VariableFormField.setCurrentValue(0,"",true);
		City$VariableFormField.setJustify(egl.ui.AlignKind.left);
		City$VariableFormField.setIsComplete();
		addField( City$VariableFormField );
		State = new com.ibm.javart.CharItem( "State", com.ibm.javart.Value.SQL_NOT_NULLABLE, 2, true, "C2;" );
		add( State );
		State$VariableFormField = new egl.ui.text.TuiField( "State$VariableFormField", this, State );
		State$VariableFormField.setLength(2);
		State$VariableFormField.setPosition(0,3,44);
		State$VariableFormField.setCurrentValue(0,"",true);
		State$VariableFormField.setJustify(egl.ui.AlignKind.left);
		State$VariableFormField.setIsComplete();
		addField( State$VariableFormField );
		PostalCode = new com.ibm.javart.CharItem( "PostalCode", com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, true, "C10;" );
		add( PostalCode );
		PostalCode$VariableFormField = new egl.ui.text.TuiField( "PostalCode$VariableFormField", this, PostalCode );
		PostalCode$VariableFormField.setLength(10);
		PostalCode$VariableFormField.setPosition(0,3,48);
		PostalCode$VariableFormField.setCurrentValue(0,"",true);
		PostalCode$VariableFormField.setJustify(egl.ui.AlignKind.left);
		PostalCode$VariableFormField.setIsComplete();
		addField( PostalCode$VariableFormField );
		continuedFlag = new com.ibm.javart.CharItem( "continuedFlag", com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, true, "C9;" );
		add( continuedFlag );
		continuedFlag$VariableFormField = new egl.ui.text.TuiField( "continuedFlag$VariableFormField", this, continuedFlag );
		continuedFlag$VariableFormField.setLength(9);
		continuedFlag$VariableFormField.setPosition(0,1,78);
		continuedFlag$VariableFormField.setCurrentValue(0,"",true);
		continuedFlag$VariableFormField.setJustify(egl.ui.AlignKind.left);
		continuedFlag$VariableFormField.setIsComplete();
		addField( continuedFlag$VariableFormField );
		setFormGroupClassName("egltui.opt3.report.xyzRP1FormGroup");
		setSize(4,132);
		setIsFloating(true);
		setPosition(-1,-1);
		signature( "Tegltui/opt3/report/CustomerLine;" );
	}
	
}
