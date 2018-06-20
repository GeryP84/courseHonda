// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.demogrp;

public class DemoGroup$Form1 extends egl.ui.text.TextForm
{
	private static final long serialVersionUID = 70L;
	
	public egl.ui.text.TuiField $2_14$ConstantFormField;
	public egl.ui.text.TuiField $1_26$ConstantFormField;
	public egl.ui.text.TuiField $4_7$ConstantFormField;
	public egl.ui.text.TuiField $5_7$ConstantFormField;
	public egl.ui.text.TuiField $6_7$ConstantFormField;
	public com.ibm.javart.CharValue Input1;
	public egl.ui.text.TuiField Input1$VariableFormField;
	public com.ibm.javart.CharValue Output1;
	public egl.ui.text.TuiField Output1$VariableFormField;
	public com.ibm.javart.ref.CharArrayRef Array1;
	public egl.ui.text.TuiField Array1$VariableFormField;
	public com.ibm.javart.CharValue Message1;
	public egl.ui.text.TuiField Message1$VariableFormField;
	public com.ibm.javart.ref.CharArrayRef Array2;
	public egl.ui.text.TuiField Array2$VariableFormField;
	public com.ibm.javart.ref.CharArrayRef Array3;
	public egl.ui.text.TuiField Array3$VariableFormField;
	public com.ibm.javart.CharValue PasswordField;
	public egl.ui.text.TuiField PasswordField$VariableFormField;
	public com.ibm.javart.CharValue FKeyLine1;
	public egl.ui.text.TuiField FKeyLine1$VariableFormField;
	
	public DemoGroup$Form1( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		$2_14$ConstantFormField = new egl.ui.text.TuiField( "$2_14$ConstantFormField", this, null );
		$2_14$ConstantFormField.setLength(49);
		$2_14$ConstantFormField.setPosition(0,2,14);
		$2_14$ConstantFormField.setCurrentValue(0,"This is the screen Title Line.  It is a Constant.",true);
		$2_14$ConstantFormField.setHighlight(0,egl.ui.HighlightKind.reverse);
		$2_14$ConstantFormField.setColor(0,egl.ui.ColorKind.green);
		$2_14$ConstantFormField.setIntensity(0,egl.ui.IntensityKind.bold);
		$2_14$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$2_14$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$2_14$ConstantFormField.setIsComplete();
		addField( $2_14$ConstantFormField );
		$1_26$ConstantFormField = new egl.ui.text.TuiField( "$1_26$ConstantFormField", this, null );
		$1_26$ConstantFormField.setPosition(0,1,26);
		$1_26$ConstantFormField.setCurrentValue(0,"This is Another Title Line.",true);
		$1_26$ConstantFormField.setColor(0,egl.ui.ColorKind.yellow);
		$1_26$ConstantFormField.setIntensity(0,egl.ui.IntensityKind.bold);
		$1_26$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$1_26$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$1_26$ConstantFormField.setIsComplete();
		addField( $1_26$ConstantFormField );
		$4_7$ConstantFormField = new egl.ui.text.TuiField( "$4_7$ConstantFormField", this, null );
		$4_7$ConstantFormField.setPosition(0,4,7);
		$4_7$ConstantFormField.setCurrentValue(0,"Label Field",true);
		$4_7$ConstantFormField.setColor(0,egl.ui.ColorKind.green);
		$4_7$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$4_7$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$4_7$ConstantFormField.setIsComplete();
		addField( $4_7$ConstantFormField );
		$5_7$ConstantFormField = new egl.ui.text.TuiField( "$5_7$ConstantFormField", this, null );
		$5_7$ConstantFormField.setPosition(0,5,7);
		$5_7$ConstantFormField.setCurrentValue(0,"Instructions Field",true);
		$5_7$ConstantFormField.setColor(0,egl.ui.ColorKind.cyan);
		$5_7$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$5_7$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$5_7$ConstantFormField.setIsComplete();
		addField( $5_7$ConstantFormField );
		$6_7$ConstantFormField = new egl.ui.text.TuiField( "$6_7$ConstantFormField", this, null );
		$6_7$ConstantFormField.setPosition(0,6,7);
		$6_7$ConstantFormField.setCurrentValue(0,"Help Field. Note the properties for these fields.",true);
		$6_7$ConstantFormField.setColor(0,egl.ui.ColorKind.yellow);
		$6_7$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$6_7$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$6_7$ConstantFormField.setIsComplete();
		addField( $6_7$ConstantFormField );
		Input1 = new com.ibm.javart.CharItem( "Input1", com.ibm.javart.Value.SQL_NOT_NULLABLE, 24, true, "C24;" );
		add( Input1 );
		Input1$VariableFormField = new egl.ui.text.TuiField( "Input1$VariableFormField", this, Input1 );
		Input1$VariableFormField.setLength(24);
		Input1$VariableFormField.setPosition(0,7,7);
		Input1$VariableFormField.setCurrentValue(0,"Input Field",false);
		Input1$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		Input1$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		Input1$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		Input1$VariableFormField.setJustify(egl.ui.AlignKind.left);
		Input1$VariableFormField.setInputRequired(true);
		Input1$VariableFormField.setMinInput(3);
		Input1$VariableFormField.setIsComplete();
		addField( Input1$VariableFormField );
		Output1 = new com.ibm.javart.CharItem( "Output1", com.ibm.javart.Value.SQL_NOT_NULLABLE, 32, true, "C32;" );
		add( Output1 );
		Output1$VariableFormField = new egl.ui.text.TuiField( "Output1$VariableFormField", this, Output1 );
		Output1$VariableFormField.setLength(32);
		Output1$VariableFormField.setPosition(0,7,32);
		Output1$VariableFormField.setCurrentValue(0,"Output Field",false);
		Output1$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		Output1$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		Output1$VariableFormField.setJustify(egl.ui.AlignKind.left);
		Output1$VariableFormField.setIsComplete();
		addField( Output1$VariableFormField );
		Array1 = new com.ibm.javart.ref.CharArrayRef( "Array1", new com.ibm.javart.arrays.CharArray( "Array1", ezeProgram, 2, 10, Integer.MAX_VALUE, com.ibm.javart.Value.SQL_NOT_NULLABLE, 57, "1C57;" ), "1C57;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.CharArray( "Array1", ezeProgram, 0, 10, Integer.MAX_VALUE, com.ibm.javart.Value.SQL_NOT_NULLABLE, 57, "1C57;" );
			}
		};
		add( Array1 );
		Array1$VariableFormField = new egl.ui.text.TuiField( "Array1$VariableFormField", this, Array1 );
		Array1$VariableFormField.setLength(57);
		Array1$VariableFormField.setPosition(0,13,7);
		Array1$VariableFormField.setCurrentValue(0,"",true);
		Array1$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		Array1$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		Array1$VariableFormField.setPosition(1,14,7);
		Array1$VariableFormField.setCurrentValue(1,"Vertical Array, ELement 2",false);
		Array1$VariableFormField.setColor(1,egl.ui.ColorKind.green);
		Array1$VariableFormField.setProtect(1,egl.ui.text.ProtectKind.noProtect);
		Array1$VariableFormField.setJustify(egl.ui.AlignKind.left);
		Array1$VariableFormField.setIsComplete();
		addField( Array1$VariableFormField );
		Message1 = new com.ibm.javart.CharItem( "Message1", com.ibm.javart.Value.SQL_NOT_NULLABLE, 68, true, "C68;" );
		add( Message1 );
		Message1$VariableFormField = new egl.ui.text.TuiField( "Message1$VariableFormField", this, Message1 );
		Message1$VariableFormField.setLength(68);
		Message1$VariableFormField.setPosition(0,21,7);
		Message1$VariableFormField.setCurrentValue(0,"This is the Message Line",false);
		Message1$VariableFormField.setColor(0,egl.ui.ColorKind.red);
		Message1$VariableFormField.setIntensity(0,egl.ui.IntensityKind.bold);
		Message1$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		Message1$VariableFormField.setJustify(egl.ui.AlignKind.left);
		Message1$VariableFormField.setIsComplete();
		addField( Message1$VariableFormField );
		Array2 = new com.ibm.javart.ref.CharArrayRef( "Array2", new com.ibm.javart.arrays.CharArray( "Array2", ezeProgram, 3, 10, Integer.MAX_VALUE, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, "1C20;" ), "1C20;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.CharArray( "Array2", ezeProgram, 0, 10, Integer.MAX_VALUE, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, "1C20;" );
			}
		};
		add( Array2 );
		Array2$VariableFormField = new egl.ui.text.TuiField( "Array2$VariableFormField", this, Array2 );
		Array2$VariableFormField.setLength(20);
		Array2$VariableFormField.setPosition(0,12,7);
		Array2$VariableFormField.setCurrentValue(0,"Row Array, Element 1",false);
		Array2$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		Array2$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		Array2$VariableFormField.setPosition(1,12,32);
		Array2$VariableFormField.setCurrentValue(1,"Row Array, Element 2",false);
		Array2$VariableFormField.setColor(1,egl.ui.ColorKind.green);
		Array2$VariableFormField.setProtect(1,egl.ui.text.ProtectKind.skipProtect);
		Array2$VariableFormField.setPosition(2,12,57);
		Array2$VariableFormField.setCurrentValue(2,"Row Array, Element 3",false);
		Array2$VariableFormField.setColor(2,egl.ui.ColorKind.green);
		Array2$VariableFormField.setProtect(2,egl.ui.text.ProtectKind.skipProtect);
		Array2$VariableFormField.setJustify(egl.ui.AlignKind.left);
		Array2$VariableFormField.setIsComplete();
		addField( Array2$VariableFormField );
		Array3 = new com.ibm.javart.ref.CharArrayRef( "Array3", new com.ibm.javart.arrays.CharArray( "Array3", ezeProgram, 9, 10, Integer.MAX_VALUE, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, "1C20;" ), "1C20;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.CharArray( "Array3", ezeProgram, 0, 10, Integer.MAX_VALUE, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, "1C20;" );
			}
		};
		add( Array3 );
		Array3$VariableFormField = new egl.ui.text.TuiField( "Array3$VariableFormField", this, Array3 );
		Array3$VariableFormField.setLength(20);
		Array3$VariableFormField.setPosition(0,15,7);
		Array3$VariableFormField.setCurrentValue(0,"",true);
		Array3$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(1,16,7);
		Array3$VariableFormField.setCurrentValue(1,"",true);
		Array3$VariableFormField.setColor(1,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(1,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(2,17,7);
		Array3$VariableFormField.setCurrentValue(2,"",true);
		Array3$VariableFormField.setColor(2,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(2,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(3,15,32);
		Array3$VariableFormField.setCurrentValue(3,"",true);
		Array3$VariableFormField.setColor(3,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(3,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(4,16,32);
		Array3$VariableFormField.setCurrentValue(4,"",true);
		Array3$VariableFormField.setColor(4,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(4,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(5,17,32);
		Array3$VariableFormField.setCurrentValue(5,"",true);
		Array3$VariableFormField.setColor(5,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(5,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(6,15,57);
		Array3$VariableFormField.setCurrentValue(6,"",true);
		Array3$VariableFormField.setColor(6,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(6,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(7,16,57);
		Array3$VariableFormField.setCurrentValue(7,"",true);
		Array3$VariableFormField.setColor(7,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(7,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setPosition(8,17,57);
		Array3$VariableFormField.setCurrentValue(8,"",true);
		Array3$VariableFormField.setColor(8,egl.ui.ColorKind.green);
		Array3$VariableFormField.setProtect(8,egl.ui.text.ProtectKind.skipProtect);
		Array3$VariableFormField.setJustify(egl.ui.AlignKind.left);
		Array3$VariableFormField.setIsComplete();
		addField( Array3$VariableFormField );
		PasswordField = new com.ibm.javart.CharItem( "PasswordField", com.ibm.javart.Value.SQL_NOT_NULLABLE, 15, true, "C15;" );
		add( PasswordField );
		PasswordField$VariableFormField = new egl.ui.text.TuiField( "PasswordField$VariableFormField", this, PasswordField );
		PasswordField$VariableFormField.setLength(15);
		PasswordField$VariableFormField.setPosition(0,18,7);
		PasswordField$VariableFormField.setCurrentValue(0,"Password Field",false);
		PasswordField$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		PasswordField$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		PasswordField$VariableFormField.setIntensity(0,egl.ui.IntensityKind.invisible);
		PasswordField$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		PasswordField$VariableFormField.setJustify(egl.ui.AlignKind.left);
		PasswordField$VariableFormField.setIsComplete();
		addField( PasswordField$VariableFormField );
		FKeyLine1 = new com.ibm.javart.CharItem( "FKeyLine1", com.ibm.javart.Value.SQL_NOT_NULLABLE, 69, true, "C69;" );
		add( FKeyLine1 );
		FKeyLine1$VariableFormField = new egl.ui.text.TuiField( "FKeyLine1$VariableFormField", this, FKeyLine1 );
		FKeyLine1$VariableFormField.setLength(69);
		FKeyLine1$VariableFormField.setPosition(0,23,1);
		FKeyLine1$VariableFormField.setCurrentValue(0,"Function Key Line 1 - This is a Variable Field.",false);
		FKeyLine1$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		FKeyLine1$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		FKeyLine1$VariableFormField.setJustify(egl.ui.AlignKind.left);
		FKeyLine1$VariableFormField.setIsComplete();
		addField( FKeyLine1$VariableFormField );
		setFormGroupClassName("egltui.demogrp.DemoGroup");
		setSize(24,80);
		setIsFloating(false);
		setPosition(1,1);
		setMessageField(Message1$VariableFormField);
		signature( "Tegltui/demogrp/Form1;" );
	}
	
}
