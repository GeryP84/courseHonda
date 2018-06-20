// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.helloworld;

public class helloGroup$HelloWorld1 extends egl.ui.text.TextForm
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.CharValue OutputField;
	public egl.ui.text.TuiField OutputField$VariableFormField;
	public com.ibm.javart.CharValue InputField;
	public egl.ui.text.TuiField InputField$VariableFormField;
	public com.ibm.javart.CharValue FKeyLabel;
	public egl.ui.text.TuiField FKeyLabel$VariableFormField;
	
	public helloGroup$HelloWorld1( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		OutputField = new com.ibm.javart.CharItem( "OutputField", com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, "C20;" );
		add( OutputField );
		OutputField$VariableFormField = new egl.ui.text.TuiField( "OutputField$VariableFormField", this, OutputField );
		OutputField$VariableFormField.setLength(20);
		OutputField$VariableFormField.setPosition(0,3,12);
		OutputField$VariableFormField.setCurrentValue(0,"Hello World !!!!",false);
		OutputField$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		OutputField$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		OutputField$VariableFormField.setJustify(egl.ui.AlignKind.left);
		OutputField$VariableFormField.setIsComplete();
		addField( OutputField$VariableFormField );
		InputField = new com.ibm.javart.CharItem( "InputField", com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, "C20;" );
		add( InputField );
		InputField$VariableFormField = new egl.ui.text.TuiField( "InputField$VariableFormField", this, InputField );
		InputField$VariableFormField.setLength(20);
		InputField$VariableFormField.setPosition(0,6,15);
		InputField$VariableFormField.setCurrentValue(0,"",true);
		InputField$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		InputField$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		InputField$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		InputField$VariableFormField.setJustify(egl.ui.AlignKind.left);
		InputField$VariableFormField.setIsComplete();
		addField( InputField$VariableFormField );
		FKeyLabel = new com.ibm.javart.CharItem( "FKeyLabel", com.ibm.javart.Value.SQL_NOT_NULLABLE, 25, true, "C25;" );
		add( FKeyLabel );
		FKeyLabel$VariableFormField = new egl.ui.text.TuiField( "FKeyLabel$VariableFormField", this, FKeyLabel );
		FKeyLabel$VariableFormField.setLength(25);
		FKeyLabel$VariableFormField.setPosition(0,20,19);
		FKeyLabel$VariableFormField.setCurrentValue(0,"Press F5 for next screen",false);
		FKeyLabel$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		FKeyLabel$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		FKeyLabel$VariableFormField.setJustify(egl.ui.AlignKind.left);
		FKeyLabel$VariableFormField.setIsComplete();
		addField( FKeyLabel$VariableFormField );
		setFormGroupClassName("egltui.helloworld.helloGroup");
		setSize(24,80);
		setIsFloating(false);
		setPosition(1,1);
		signature( "Tegltui/helloworld/HelloWorld1;" );
	}
	
}
