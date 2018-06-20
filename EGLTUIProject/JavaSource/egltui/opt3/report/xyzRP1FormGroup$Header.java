// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt3.report;

public class xyzRP1FormGroup$Header extends egl.ui.text.PrintForm
{
	private static final long serialVersionUID = 70L;
	
	public egl.ui.text.TuiField $1_52$ConstantFormField;
	public egl.ui.text.TuiField $2_120$ConstantFormField;
	public com.ibm.javart.CharValue curDate;
	public egl.ui.text.TuiField curDate$VariableFormField;
	public com.ibm.javart.CharValue curTime;
	public egl.ui.text.TuiField curTime$VariableFormField;
	public com.ibm.javart.SmallNumericValue curPage;
	public egl.ui.text.TuiField curPage$VariableFormField;
	
	public xyzRP1FormGroup$Header( final com.ibm.javart.resources.Program ezeProgram, String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeProgram, ezeName );
		$1_52$ConstantFormField = new egl.ui.text.TuiField( "$1_52$ConstantFormField", this, null );
		$1_52$ConstantFormField.setPosition(0,1,52);
		$1_52$ConstantFormField.setCurrentValue(0,"Customer and Orders Report",true);
		$1_52$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$1_52$ConstantFormField.setIsComplete();
		addField( $1_52$ConstantFormField );
		$2_120$ConstantFormField = new egl.ui.text.TuiField( "$2_120$ConstantFormField", this, null );
		$2_120$ConstantFormField.setPosition(0,2,120);
		$2_120$ConstantFormField.setCurrentValue(0,"Page ",true);
		$2_120$ConstantFormField.setJustify(egl.ui.AlignKind.left);
		$2_120$ConstantFormField.setIsComplete();
		addField( $2_120$ConstantFormField );
		curDate = new com.ibm.javart.CharItem( "curDate", com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, true, "C10;" );
		add( curDate );
		curDate$VariableFormField = new egl.ui.text.TuiField( "curDate$VariableFormField", this, curDate );
		curDate$VariableFormField.setLength(10);
		curDate$VariableFormField.setPosition(0,2,1);
		curDate$VariableFormField.setCurrentValue(0,"",true);
		curDate$VariableFormField.setJustify(egl.ui.AlignKind.left);
		curDate$VariableFormField.setDateFormat(ezeProgram.egl__vg__VGVar.systemGregorianDateFormat.getValueAsString());
		curDate$VariableFormField.setIsComplete();
		addField( curDate$VariableFormField );
		curTime = new com.ibm.javart.CharItem( "curTime", com.ibm.javart.Value.SQL_NOT_NULLABLE, 8, true, "C8;" );
		add( curTime );
		curTime$VariableFormField = new egl.ui.text.TuiField( "curTime$VariableFormField", this, curTime );
		curTime$VariableFormField.setLength(8);
		curTime$VariableFormField.setPosition(0,2,12);
		curTime$VariableFormField.setCurrentValue(0,"",true);
		curTime$VariableFormField.setJustify(egl.ui.AlignKind.left);
		curTime$VariableFormField.setTimeFormat(ezeProgram.egl__core__StrLib.defaultTimeFormat.getValue());
		curTime$VariableFormField.setIsComplete();
		addField( curTime$VariableFormField );
		curPage = new com.ibm.javart.SmallNumericItem( "curPage", com.ibm.javart.Value.SQL_NOT_NULLABLE, 3, com.ibm.javart.Constants.EGL_TYPE_NUM, "N3:0;" );
		add( curPage );
		curPage$VariableFormField = new egl.ui.text.TuiField( "curPage$VariableFormField", this, curPage );
		curPage$VariableFormField.setLength(3);
		curPage$VariableFormField.setPosition(0,2,126);
		curPage$VariableFormField.setCurrentValue(0,"",true);
		curPage$VariableFormField.setJustify(egl.ui.AlignKind.right);
		curPage$VariableFormField.setFillCharacter(" ");
		curPage$VariableFormField.setSign(egl.ui.SignKind.none);
		curPage$VariableFormField.setIsComplete();
		addField( curPage$VariableFormField );
		setFormGroupClassName("egltui.opt3.report.xyzRP1FormGroup");
		setSize(3,132);
		setIsFloating(false);
		setPosition(1,1);
		signature( "Tegltui/opt3/report/Header;" );
	}
	
}
