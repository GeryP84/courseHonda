// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.menu;

public class xyzMenuProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final xyzMenuProgram ezeProgram;
	public egltui.zzz.common.xyzTransferData transferData;
	public com.ibm.javart.CharValue todaysDate;
	public com.ibm.javart.CharValue programToRun;
	public egltui.menu.xyzMnuFormGroup xyzMnuFormGroup;
	public egltui.menu.xyzMnuFormGroup$Menu xyzMnuFormGroup$Menu;
	public egltui.menu.xyzMnuFormGroup$Help1 xyzMnuFormGroup$Help1;
	public egltui.menu.xyzMnuFormGroup$Help2 xyzMnuFormGroup$Help2;
	
	public xyzMenuProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "xyzMenuProgram", "xyzMenuProgram", ru, false, true, 0 );
		ezeProgram = this;
		xyzMnuFormGroup = new egltui.menu.xyzMnuFormGroup( "xyzMnuFormGroup" );
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		com.ibm.javart.forms.common.Utility.setApp( this );
		xyzMnuFormGroup$Menu = new egltui.menu.xyzMnuFormGroup$Menu(ezeProgram, "xyzMnuFormGroup$Menu" );
		xyzMnuFormGroup$Menu.setFormGroup(xyzMnuFormGroup);
		xyzMnuFormGroup$Help1 = new egltui.menu.xyzMnuFormGroup$Help1(ezeProgram, "xyzMnuFormGroup$Help1" );
		xyzMnuFormGroup$Help1.setFormGroup(xyzMnuFormGroup);
		xyzMnuFormGroup$Help2 = new egltui.menu.xyzMnuFormGroup$Help2(ezeProgram, "xyzMnuFormGroup$Help2" );
		xyzMnuFormGroup$Help2.setFormGroup(xyzMnuFormGroup);
		xyzMnuFormGroup$Menu.setHelpForm( xyzMnuFormGroup$Help1 );
		xyzMnuFormGroup$Help1.setHelpForm( xyzMnuFormGroup$Help2 );
		transferData = new egltui.zzz.common.xyzTransferData( "transferData", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/zzz/common/xyzTransferData;" );
		todaysDate = new com.ibm.javart.CharItem( "todaysDate", com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, true, "C10;" );
		programToRun = new com.ibm.javart.CharItem( "programToRun", com.ibm.javart.Value.SQL_NOT_NULLABLE, 30, true, "C30;" );
		$initxyzMenuProgram( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return false;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return false;
	}
	public void _start() throws java.lang.Exception
	{
		$func_main();
	}
	public static com.ibm.javart.resources.StartupInfo _startupInfo()
	{
		return new com.ibm.javart.resources.StartupInfo( "xyzMenuProgram", "egltui/menu/xyzMenuProgram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new xyzMenuProgram( ru ) );
		ru.exit();
	}
	public com.ibm.javart.Container _inputRecord()
	{
		return transferData;
	}
	private java.util.ArrayList<com.ibm.javart.forms.tui.Tui3270Form> eze$3270display;
	public void _3270display( java.util.ArrayList<com.ibm.javart.forms.tui.Tui3270Form> display )
	{
		eze$3270display = display;
	}
	public java.util.ArrayList<com.ibm.javart.forms.tui.Tui3270Form> _3270display()
	{
		return eze$3270display;
	}
	
	public void $func_main() throws java.lang.Exception
	{
		_funcPush( "main" );
		
		// initialize();
		$func_initialize();
		// Converse xyzMnuFormGroup.Menu;
		xyzMnuFormGroup$Menu.converse();
		// While ( ConverseVar.eventKey NOT PF3 && ConverseVar.eventKey NOT PF2 )
		while ( ( !( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF3() ) && !( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF2() ) ) )
		{
			// Case
			// IF ( xyzMnuFormGroup.Menu.MenuOption == 1 )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, xyzMnuFormGroup$Menu.MenuOption, (short)1, 1 ) == 0) )
			{
				// Transfer to Program xyzCustListProgram Passing transferData;
				com.ibm.javart.forms.tui.Tui3270Screen.getDisplay().clearScreen();
				ezeProgram._transferToProgram( "egltui.opt1.custlist.xyzCustListProgram", ezeProgram.transferData );
			}
			else
			{
				// IF ( xyzMnuFormGroup.Menu.MenuOption == 2 )
				if ( (com.ibm.javart.operations.Compare.run( ezeProgram, xyzMnuFormGroup$Menu.MenuOption, (short)2, 1 ) == 0) )
				{
					// Transfer to Program xyzCustDetailProgram Passing transferData;
					com.ibm.javart.forms.tui.Tui3270Screen.getDisplay().clearScreen();
					ezeProgram._transferToProgram( "egltui.opt2.custdetail.xyzCustDetailProgram", ezeProgram.transferData );
				}
				else
				{
					// xyzMnuFormGroup.Menu.formMsg = "Selection not supported - must be 1 or 2";
					xyzMnuFormGroup$Menu.formMSG.setValue( "Selection not supported - must be 1 or 2" );
					xyzMnuFormGroup$Menu.formMSG$VariableFormField.useAssignedValue( 0 );
					// Converse xyzMnuFormGroup.Menu;
					xyzMnuFormGroup$Menu.converse();
				}
			}
		}
		// Case ( ConverseVar.eventKey )
		// IF ( ConverseVar.eventKey IS PF2 )
		if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF2() )
		{
			// Transfer to Program xyzLogonProgram Passing transferData;
			com.ibm.javart.forms.tui.Tui3270Screen.getDisplay().clearScreen();
			ezeProgram._transferToProgram( "egltui.logon.xyzLogonProgram", ezeProgram.transferData );
		}
		else
		{
			// IF ( ConverseVar.eventKey IS PF3 )
			if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF3() )
			{
				// exit program;
				ezeProgram._runUnit().exitProgram();
			}
			else
			{
			}
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_initialize() throws java.lang.Exception
	{
		_funcPush( "initialize" );
		
		// xyzMnuFormGroup.Menu.screenName = "xyzMain";
		xyzMnuFormGroup$Menu.screenName.setValue( "xyzMain" );
		xyzMnuFormGroup$Menu.screenName$VariableFormField.useAssignedValue( 0 );
		// xyzMnuFormGroup.Menu.ScreenTitle = "XYZ Company Main Menu";
		xyzMnuFormGroup$Menu.ScreenTitle.setValue( "XYZ Company Main Menu" );
		xyzMnuFormGroup$Menu.ScreenTitle$VariableFormField.useAssignedValue( 0 );
		// xyzMnuFormGroup.Menu.screenDate = todaysDate;
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzMnuFormGroup$Menu.screenDate, ezeProgram.todaysDate );
		xyzMnuFormGroup$Menu.screenDate$VariableFormField.useAssignedValue( 0 );
		// xyzMnuFormGroup.Menu.firstname = transferData.SiteuserFirstname;
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzMnuFormGroup$Menu.firstname, ezeProgram.transferData.SiteuserFirstname );
		xyzMnuFormGroup$Menu.firstname$VariableFormField.useAssignedValue( 0 );
		// xyzMnuFormGroup.Menu.fkeyLine2 = "F2=Logon;  F3=Exit;  Enter=Select a menu item";
		xyzMnuFormGroup$Menu.fkeyLine2.setValue( "F2=Logon;  F3=Exit;  Enter=Select a menu item" );
		xyzMnuFormGroup$Menu.fkeyLine2$VariableFormField.useAssignedValue( 0 );
		// xyzMnuFormGroup.Menu.MenuLine[1] = "1 - Customer List";
		com.ibm.javart.operations.Subscript.run( ezeProgram, xyzMnuFormGroup$Menu.MenuLine.value(), (short)1 ).setValue( "1 - Customer List" );
		xyzMnuFormGroup$Menu.MenuLine$VariableFormField.useAssignedValue( (short)0 );
		// xyzMnuFormGroup.Menu.MenuLine[2] = "2 - Customer Detail";
		com.ibm.javart.operations.Subscript.run( ezeProgram, xyzMnuFormGroup$Menu.MenuLine.value(), (short)2 ).setValue( "2 - Customer Detail" );
		xyzMnuFormGroup$Menu.MenuLine$VariableFormField.useAssignedValue( (short)1 );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initxyzMenuProgram( xyzMenuProgram ezeProgram ) throws java.lang.Exception
	{
		egl__vg__VGVar.handleOverflow.setValue(1);
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// todaysDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.todaysDate, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ) );
		// RETURN
	}
	
}

// Build options from EGLTUIProjectJavaBuildOptions, \\EGLTUIProject\\EGLSource\\EGLTUIProject.eglbld
//
//	bidiConversionTable = 
//	bind = 
//	blanksAsZero = NO
//	buildPlan = YES
//	byteArrayOperationsForStructuredRecords = 0
//	cachePreparedStatements = NO
//	cancelAfterTransfer = NO
//	checkNumericOverflow = YES
//	checkToTransaction = YES
//	checkType = NONE
//	cicsEntries = NONE
//	cicsj2cTimeout = -1
//	clientCodeSet = IBM-850
//	commentLevel = 1
//	currencyLocation = NONE
//	currencySymbol = 
//	data = 31
//	dbContentSeparator = 
//	dbms = DERBY
//	debugTrace = NO
//	decimalSymbol = 
//	defaultDateFormat = 
//	defaultMoneyFormat = 
//	defaultNumericFormat = 
//	defaultTimeFormat = 
//	defaultTimeStampFormat = 
//	deploymentDescriptor = 
//	destDirectory = 
//	destHost = 
//	destLibrary = QGPL
//	destPort = 
//	destUserID = 
//	eliminateSystemDependentCode = YES
//	enableJavaWrapperGen = NO
//	endCommarea = NO
//	errorDestination = 
//	fillWithNulls = YES
//	formServicePgmType = 
//	genDDSFile = NO
//	genDataTables = YES
//	genDirectory = 
//	genFixedLengthSqlLike = NO
//	genFormGroup = YES
//	genHelpFormGroup = YES
//	genProject = EGLTUIProject
//	genProperties = GLOBAL
//	genResourceBundle = YES
//	genReturnImmediate = NO
//	genRunFile = YES
//	genVGUIRecords = YES
//	imsFastPath = NO
//	imsLogID = NOLOG
//	imsPSB = 
//	includeLineNumbers = NO
//	j2ee = NO
//	j2eeLevel = 1.3
//	leftAlign = YES
//	linkEdit = 
//	linkage = 
//	math = COBOL
//	maxNumericDigits = 31
//	mfsExtendedAttr = YES
//	mfsIgnore = NO
//	mfsUseTestLibrary = NO
//	minSubstringLength = 1
//	msgTablePrefix = 
//	positiveSignIndicator = F
//	prep = YES
//	prepareAllSQLStatements = NO
//	preparedStatementCacheSize = -1
//	printDestination = PROGRAMCONTROLLED
//	projectID = 
//	reservedWord = 
//	resourceAssociations = 
//	resourceBundleLocale = 
//	restartTransactionID = 
//	restoreCurrentMsgOnError = YES
//	returnTransaction = 
//	separatorSymbol = 
//	serverCodeSet = IBM-037
//	serverType = 
//	sessionBeanID = 
//	setFormItemFull = YES
//	spaADF = NO
//	spaSize = 0
//	spaStatusBytePosition = 0
//	spacesZero = NO
//	sqlAccessColumnsAsBytes = NO
//	sqlCommitControl = 
//	sqlDB = jdbc:derby:C:\\EGLDerbyDB;create=true
//	sqlErrorTrace = NO
//	sqlID = 
//	sqlIOTrace = NO
//	sqlJDBCDriverClass = org.apache.derby.jdbc.EmbeddedDriver
//	sqlJNDIName = 
//	sqlSchema = 
//	sqlValidationConnectionURL = jdbc:derby:C:\\EGLDerbyDB;create=true
//	startTransactionID = 
//	statementTrace = NO
//	synchOnPgmTransfer = YES
//	synchOnTrxTransfer = NO
//	sysCodes = NO
//	system = WIN
//	targetNLS = ENU
//	tempDirectory = 
//	templateDir = 
//	transferErrorTransaction = 
//	truncateExtraDecimals = YES
//	twaOffset = 0
//	useCurrentSchema = NO
//	useXctlForTransfer = NO
//	userMessageFile = 
//	v60NumWithDateBehavior = NO
//	v60DecimalBehavior = NO
//	v60NumWithCharBehavior = NO
//	v60SQLNullableBehavior = NO
//	vagCompatibility = NO
//	v71AddBehavior = NO
//	validateBlankDateFields = YES
//	validateMixedItems = YES
//	validateOnlyIfModified = NO
//	validateSQLStatements = NO
//	vseLibrary = 
//	workDBType = AUX
//	wrapperCompatibility = CURRENT
//	wrapperPackageName = 
