// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.demogrp;

public class DemoGroup$FormFromRecord extends egl.ui.text.TextForm
{
	private static final long serialVersionUID = 70L;
	
	public egl.ui.text.TuiField $6_5$ConstantFormField;
	public egl.ui.text.TuiField $7_5$ConstantFormField;
	public egl.ui.text.TuiField $8_5$ConstantFormField;
	public egl.ui.text.TuiField $9_5$ConstantFormField;
	public com.ibm.javart.CharValue MessageLine;
	public egl.ui.text.TuiField MessageLine$VariableFormField;
	public com.ibm.javart.CharValue firstName;
	public egl.ui.text.TuiField firstName$VariableFormField;
	public com.ibm.javart.CharValue lastName;
	public egl.ui.text.TuiField lastName$VariableFormField;
	public com.ibm.javart.CharValue city;
	public egl.ui.text.TuiField city$VariableFormField;
	public com.ibm.javart.CharValue state;
	public egl.ui.text.TuiField state$VariableFormField;
	
	public DemoGroup$FormFromRecord( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		$6_5$ConstantFormField = new egl.ui.text.TuiField( "$6_5$ConstantFormField", this, null );
		$6_5$ConstantFormField.setPosition(0,6,5);
		$6_5$ConstantFormField.setCurrentValue(0,"First Name",true);
		$6_5$ConstantFormField.setColor(0,egl.ui.ColorKind.green);
		$6_5$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$6_5$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$6_5$ConstantFormField.setIsComplete();
		addField( $6_5$ConstantFormField );
		$7_5$ConstantFormField = new egl.ui.text.TuiField( "$7_5$ConstantFormField", this, null );
		$7_5$ConstantFormField.setPosition(0,7,5);
		$7_5$ConstantFormField.setCurrentValue(0,"Last Name",true);
		$7_5$ConstantFormField.setColor(0,egl.ui.ColorKind.green);
		$7_5$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$7_5$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$7_5$ConstantFormField.setIsComplete();
		addField( $7_5$ConstantFormField );
		$8_5$ConstantFormField = new egl.ui.text.TuiField( "$8_5$ConstantFormField", this, null );
		$8_5$ConstantFormField.setPosition(0,8,5);
		$8_5$ConstantFormField.setCurrentValue(0,"City",true);
		$8_5$ConstantFormField.setColor(0,egl.ui.ColorKind.green);
		$8_5$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$8_5$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$8_5$ConstantFormField.setIsComplete();
		addField( $8_5$ConstantFormField );
		$9_5$ConstantFormField = new egl.ui.text.TuiField( "$9_5$ConstantFormField", this, null );
		$9_5$ConstantFormField.setPosition(0,9,5);
		$9_5$ConstantFormField.setCurrentValue(0,"State",true);
		$9_5$ConstantFormField.setColor(0,egl.ui.ColorKind.green);
		$9_5$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$9_5$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$9_5$ConstantFormField.setIsComplete();
		addField( $9_5$ConstantFormField );
		MessageLine = new com.ibm.javart.CharItem( "MessageLine", com.ibm.javart.Value.SQL_NOT_NULLABLE, 68, true, "C68;" );
		add( MessageLine );
		MessageLine$VariableFormField = new egl.ui.text.TuiField( "MessageLine$VariableFormField", this, MessageLine );
		MessageLine$VariableFormField.setLength(68);
		MessageLine$VariableFormField.setPosition(0,22,6);
		MessageLine$VariableFormField.setCurrentValue(0,"This is the Message line. ",false);
		MessageLine$VariableFormField.setColor(0,egl.ui.ColorKind.red);
		MessageLine$VariableFormField.setIntensity(0,egl.ui.IntensityKind.bold);
		MessageLine$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		MessageLine$VariableFormField.setBoolean(false);
		MessageLine$VariableFormField.setJustify(egl.ui.AlignKind.left);
		MessageLine$VariableFormField.setLowerCase(false);
		MessageLine$VariableFormField.setMasked(false);
		MessageLine$VariableFormField.setIsComplete();
		addField( MessageLine$VariableFormField );
		firstName = new com.ibm.javart.CharItem( "firstName", com.ibm.javart.Value.SQL_NOT_NULLABLE, 15, true, "C15;" );
		add( firstName );
		firstName$VariableFormField = new egl.ui.text.TuiField( "firstName$VariableFormField", this, firstName );
		firstName$VariableFormField.setLength(15);
		firstName$VariableFormField.setPosition(0,6,17);
		firstName$VariableFormField.setCurrentValue(0,"",true);
		firstName$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		firstName$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		firstName$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		firstName$VariableFormField.setJustify(egl.ui.AlignKind.left);
		firstName$VariableFormField.setIsComplete();
		addField( firstName$VariableFormField );
		lastName = new com.ibm.javart.CharItem( "lastName", com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, "C20;" );
		add( lastName );
		lastName$VariableFormField = new egl.ui.text.TuiField( "lastName$VariableFormField", this, lastName );
		lastName$VariableFormField.setLength(20);
		lastName$VariableFormField.setPosition(0,7,16);
		lastName$VariableFormField.setCurrentValue(0,"",true);
		lastName$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		lastName$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		lastName$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		lastName$VariableFormField.setJustify(egl.ui.AlignKind.left);
		lastName$VariableFormField.setIsComplete();
		addField( lastName$VariableFormField );
		city = new com.ibm.javart.CharItem( "city", com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, "C20;" );
		add( city );
		city$VariableFormField = new egl.ui.text.TuiField( "city$VariableFormField", this, city );
		city$VariableFormField.setLength(20);
		city$VariableFormField.setPosition(0,8,11);
		city$VariableFormField.setCurrentValue(0,"",true);
		city$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		city$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		city$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		city$VariableFormField.setJustify(egl.ui.AlignKind.left);
		city$VariableFormField.setIsComplete();
		addField( city$VariableFormField );
		state = new com.ibm.javart.CharItem( "state", com.ibm.javart.Value.SQL_NOT_NULLABLE, 2, true, "C2;" );
		add( state );
		state$VariableFormField = new egl.ui.text.TuiField( "state$VariableFormField", this, state );
		state$VariableFormField.setLength(2);
		state$VariableFormField.setPosition(0,9,12);
		state$VariableFormField.setCurrentValue(0,"",true);
		state$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		state$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		state$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		state$VariableFormField.setJustify(egl.ui.AlignKind.left);
		state$VariableFormField.setIsComplete();
		addField( state$VariableFormField );
		setFormGroupClassName("egltui.demogrp.DemoGroup");
		setSize(24,80);
		setIsFloating(false);
		setPosition(1,1);
		setHelpKey(egl.ui.PFKeyKind.pf1);
		setMessageField(MessageLine$VariableFormField);
		addDeviceSize(24,80);
		signature( "Tegltui/demogrp/FormFromRecord;" );
	}
	
}
