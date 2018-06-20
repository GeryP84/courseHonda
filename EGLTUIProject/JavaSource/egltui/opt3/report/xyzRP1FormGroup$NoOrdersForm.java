// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt3.report;

public class xyzRP1FormGroup$NoOrdersForm extends egl.ui.text.PrintForm
{
	private static final long serialVersionUID = 70L;
	
	public egl.ui.text.TuiField $1_8$ConstantFormField;
	
	public xyzRP1FormGroup$NoOrdersForm( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		$1_8$ConstantFormField = new egl.ui.text.TuiField( "$1_8$ConstantFormField", this, null );
		$1_8$ConstantFormField.setPosition(0,1,8);
		$1_8$ConstantFormField.setCurrentValue(0,"No orders for this customer",true);
		$1_8$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$1_8$ConstantFormField.setIsComplete();
		addField( $1_8$ConstantFormField );
		setFormGroupClassName("egltui.opt3.report.xyzRP1FormGroup");
		setSize(1,132);
		setIsFloating(true);
		setPosition(-1,-1);
		signature( "Tegltui/opt3/report/NoOrdersForm;" );
	}
	
}
