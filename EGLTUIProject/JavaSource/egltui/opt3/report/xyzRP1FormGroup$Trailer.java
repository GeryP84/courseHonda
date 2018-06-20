// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt3.report;

public class xyzRP1FormGroup$Trailer extends egl.ui.text.PrintForm
{
	private static final long serialVersionUID = 70L;
	
	public egl.ui.text.TuiField $2_1$ConstantFormField;
	
	public xyzRP1FormGroup$Trailer( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		$2_1$ConstantFormField = new egl.ui.text.TuiField( "$2_1$ConstantFormField", this, null );
		$2_1$ConstantFormField.setPosition(0,2,1);
		$2_1$ConstantFormField.setCurrentValue(0,"This is the trailer form",true);
		$2_1$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$2_1$ConstantFormField.setIsComplete();
		addField( $2_1$ConstantFormField );
		setFormGroupClassName("egltui.opt3.report.xyzRP1FormGroup");
		setSize(3,132);
		setIsFloating(false);
		setPosition(62,1);
		signature( "Tegltui/opt3/report/Trailer;" );
	}
	
}
