// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.menu;

public class xyzMnuFormGroup$Help1 extends egl.ui.text.TextForm
{
	private static final long serialVersionUID = 70L;
	
	public egl.ui.text.TuiField $1_1$ConstantFormField;
	public egl.ui.text.TuiField $1_34$ConstantFormField;
	public egl.ui.text.TuiField $2_1$ConstantFormField;
	public egl.ui.text.TuiField $24_1$ConstantFormField;
	
	public xyzMnuFormGroup$Help1( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		$1_1$ConstantFormField = new egl.ui.text.TuiField( "$1_1$ConstantFormField", this, null );
		$1_1$ConstantFormField.setPosition(0,1,1);
		$1_1$ConstantFormField.setCurrentValue(0,"MNUHELP1",true);
		$1_1$ConstantFormField.setColor(0,egl.ui.ColorKind.green);
		$1_1$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$1_1$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$1_1$ConstantFormField.setIsComplete();
		addField( $1_1$ConstantFormField );
		$1_34$ConstantFormField = new egl.ui.text.TuiField( "$1_34$ConstantFormField", this, null );
		$1_34$ConstantFormField.setLength(14);
		$1_34$ConstantFormField.setPosition(0,1,34);
		$1_34$ConstantFormField.setCurrentValue(0,"XYZ Company",true);
		$1_34$ConstantFormField.setColor(0,egl.ui.ColorKind.yellow);
		$1_34$ConstantFormField.setIntensity(0,egl.ui.IntensityKind.bold);
		$1_34$ConstantFormField.setProtect(0,egl.ui.text.ProtectKind.skipProtect);
		$1_34$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$1_34$ConstantFormField.setIsComplete();
		addField( $1_34$ConstantFormField );
		$2_1$ConstantFormField = new egl.ui.text.TuiField( "$2_1$ConstantFormField", this, null );
		$2_1$ConstantFormField.setPosition(0,2,1);
		$2_1$ConstantFormField.setCurrentValue(0,"This is Help Screen 1",true);
		$2_1$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$2_1$ConstantFormField.setIsComplete();
		addField( $2_1$ConstantFormField );
		$24_1$ConstantFormField = new egl.ui.text.TuiField( "$24_1$ConstantFormField", this, null );
		$24_1$ConstantFormField.setPosition(0,24,1);
		$24_1$ConstantFormField.setCurrentValue(0,"PF1=More Help;  PF2=Return to Menu",true);
		$24_1$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$24_1$ConstantFormField.setIsComplete();
		addField( $24_1$ConstantFormField );
		setFormGroupClassName("egltui.menu.xyzMnuFormGroup");
		setSize(24,80);
		setIsFloating(false);
		setPosition(1,1);
		setHelpKey(egl.ui.PFKeyKind.pf1);
		setHelpFormId("xyzMnuFormGroup$Help2");
		signature( "Tegltui/menu/Help1;" );
	}
	
}
