// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.demogrp;

public class DemoGroup extends egl.ui.text.TuiFormGroup
{
	private static final long serialVersionUID = 70L;
	
	
	public DemoGroup( String ezeName ) throws com.ibm.javart.JavartException
	{
		super( ezeName, "Tegltui/demogrp/DemoGroup;" );
		setValidationBypassKeys(new com.ibm.javart.IntValue[]{egl.ui.PFKeyKind.pf2});
		setHelpKey(egl.ui.PFKeyKind.pf1);
		setPFKeyEquate(true);
		addScreenFloatingArea(24,80, 0, 0, 0, 0);
		
	}
}
