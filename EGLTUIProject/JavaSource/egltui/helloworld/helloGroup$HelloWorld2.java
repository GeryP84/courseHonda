// Generated at Mon Jun 11 21:44:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.helloworld;

public class helloGroup$HelloWorld2 extends egl.ui.text.TextForm
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.CharValue OutputField;
	public egl.ui.text.TuiField OutputField$VariableFormField;
	public com.ibm.javart.CharValue OutputField2;
	public egl.ui.text.TuiField OutputField2$VariableFormField;
	public com.ibm.javart.CharValue FKeyLabel;
	public egl.ui.text.TuiField FKeyLabel$VariableFormField;
	
	public helloGroup$HelloWorld2( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		OutputField = new com.ibm.javart.CharItem( "OutputField", com.ibm.javart.Value.SQL_NOT_NULLABLE, 35, true, "C35;" );
		add( OutputField );
		OutputField$VariableFormField = new egl.ui.text.TuiField( "OutputField$VariableFormField", this, OutputField );
		OutputField$VariableFormField.setLength(35);
		OutputField$VariableFormField.setPosition(0,1,9);
		OutputField$VariableFormField.setCurrentValue(0,"Hello World !!!!  THIS IS SCREEN 2",false);
		OutputField$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		OutputField$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		OutputField$VariableFormField.setJustify(egl.ui.AlignKind.left);
		OutputField$VariableFormField.setIsComplete();
		addField( OutputField$VariableFormField );
		OutputField2 = new com.ibm.javart.CharItem( "OutputField2", com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, "C20;" );
		add( OutputField2 );
		OutputField2$VariableFormField = new egl.ui.text.TuiField( "OutputField2$VariableFormField", this, OutputField2 );
		OutputField2$VariableFormField.setLength(20);
		OutputField2$VariableFormField.setPosition(0,6,19);
		OutputField2$VariableFormField.setCurrentValue(0,"",true);
		OutputField2$VariableFormField.setHighlight(0,egl.ui.HighlightKind.underline);
		OutputField2$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		OutputField2$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.noProtect);
		OutputField2$VariableFormField.setJustify(egl.ui.AlignKind.left);
		OutputField2$VariableFormField.setIsComplete();
		addField( OutputField2$VariableFormField );
		FKeyLabel = new com.ibm.javart.CharItem( "FKeyLabel", com.ibm.javart.Value.SQL_NOT_NULLABLE, 34, true, "C34;" );
		add( FKeyLabel );
		FKeyLabel$VariableFormField = new egl.ui.text.TuiField( "FKeyLabel$VariableFormField", this, FKeyLabel );
		FKeyLabel$VariableFormField.setLength(34);
		FKeyLabel$VariableFormField.setPosition(0,20,20);
		FKeyLabel$VariableFormField.setCurrentValue(0,"Press Enter to return to screen 1",false);
		FKeyLabel$VariableFormField.setColor(0,egl.ui.ColorKind.green);
		FKeyLabel$VariableFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		FKeyLabel$VariableFormField.setJustify(egl.ui.AlignKind.left);
		FKeyLabel$VariableFormField.setIsComplete();
		addField( FKeyLabel$VariableFormField );
		setFormGroupClassName("egltui.helloworld.helloGroup");
		setSize(24,80);
		setIsFloating(false);
		setPosition(1,1);
		signature( "Tegltui/helloworld/HelloWorld2;" );
	}
	
}
