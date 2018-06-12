// Generated at Mon Jun 11 21:44:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.demogrp;

public class DemoProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final DemoProgram ezeProgram;
	public egltui.demogrp.DemoGroup DemoGroup;
	public egltui.demogrp.DemoGroup$Form1 DemoGroup$Form1;
	
	public DemoProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "DemoProgram", "DemoProgram", ru, false, true, 0 );
		ezeProgram = this;
		DemoGroup = new egltui.demogrp.DemoGroup( "DemoGroup" );
		com.ibm.javart.forms.common.Utility.setApp( this );
		DemoGroup$Form1 = new egltui.demogrp.DemoGroup$Form1(ezeProgram, "DemoGroup$Form1" );
		DemoGroup$Form1.setFormGroup(DemoGroup);
		DemoGroup$Form1.setHelpKey(egl.ui.PFKeyKind.pf1);
		DemoGroup$Form1.setValidationBypassKeys(new com.ibm.javart.IntValue[]{egl.ui.PFKeyKind.pf2});
		DemoGroup.setPFKeyEquate( true );
		$initDemoProgram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "DemoProgram", "egltui/demogrp/DemoProgram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new DemoProgram( ru ) );
		ru.exit();
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
		
		// While ( ConverseVar.eventKey NOT PF3 )
		while ( !( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF3() ) )
		{
			// Converse DemoGroup.Form1;
			DemoGroup$Form1.converse();
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initDemoProgram( DemoProgram ezeProgram ) throws java.lang.Exception
	{
		egl__vg__VGVar.handleOverflow.setValue(1);
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
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
