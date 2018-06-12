// Generated at Mon Jun 11 21:44:46 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.logon;

public class xyzLogonProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final xyzLogonProgram ezeProgram;
	public egltui.data.Siteuser siteuser;
	public egltui.StatusRec status;
	public egltui.zzz.common.xyzTransferData transferData;
	public com.ibm.javart.CharValue todaysDate;
	public int nbrTry;
	public egltui.logon.xyzLogFormGroup xyzLogFormGroup;
	public egltui.access.SiteuserLib_Lib egltui__access__SiteuserLib;
	public egltui.logon.xyzLogFormGroup$Login xyzLogFormGroup$Login;
	
	public xyzLogonProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "xyzLogonProgram", "xyzLogonProgram", ru, false, true, 0 );
		ezeProgram = this;
		xyzLogFormGroup = new egltui.logon.xyzLogFormGroup( "xyzLogFormGroup" );
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		egltui__access__SiteuserLib = (egltui.access.SiteuserLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.access.SiteuserLib_Lib" );
		com.ibm.javart.forms.common.Utility.setApp( this );
		xyzLogFormGroup$Login = new egltui.logon.xyzLogFormGroup$Login(ezeProgram, "xyzLogFormGroup$Login" );
		xyzLogFormGroup$Login.setFormGroup(xyzLogFormGroup);
		siteuser = new egltui.data.Siteuser( "siteuser", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Siteuser;" );
		status = new egltui.StatusRec( "status", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/StatusRec;" );
		transferData = new egltui.zzz.common.xyzTransferData( "transferData", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/zzz/common/xyzTransferData;" );
		todaysDate = new com.ibm.javart.CharItem( "todaysDate", com.ibm.javart.Value.SQL_NOT_NULLABLE, 12, true, "C12;" );
		nbrTry = 0;
		$initxyzLogonProgram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "xyzLogonProgram", "egltui/logon/xyzLogonProgram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new xyzLogonProgram( ru ) );
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
		
		// nbrTry = 1;
		ezeProgram.nbrTry = (short)1;
		// todaysDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.todaysDate, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ) );
		// xyzLogFormGroup.Login.todaysDate = todaysDate;
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzLogFormGroup$Login.todaysDate, ezeProgram.todaysDate );
		xyzLogFormGroup$Login.todaysDate$VariableFormField.useAssignedValue( 0 );
		// mapTime CHAR(10);
		com.ibm.javart.CharValue mapTime = new com.ibm.javart.CharItem( "mapTime", com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, true, "C10;" );
		// mapTime = DateTimeLib.currentTime();
		com.ibm.javart.operations.Assign.run( ezeProgram, mapTime, ezeProgram.egl__core__DateTimeLib.currentTime( ezeProgram ) );
		// xyzLogFormGroup.Login.mapTime = mapTime;
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzLogFormGroup$Login.mapTime, mapTime );
		xyzLogFormGroup$Login.mapTime$VariableFormField.useAssignedValue( 0 );
		// xyzLogFormGroup.Login.userName = "";
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, xyzLogFormGroup$Login.userName );
		xyzLogFormGroup$Login.userName$VariableFormField.useAssignedValue( 0 );
		// xyzLogFormGroup.Login.passWord = "";
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, xyzLogFormGroup$Login.passWord );
		xyzLogFormGroup$Login.passWord$VariableFormField.useAssignedValue( 0 );
		// xyzLogFormGroup.Login.formMSG = "Please enter your username and password";
		xyzLogFormGroup$Login.formMSG.setValue( "Please enter your username and password" );
		xyzLogFormGroup$Login.formMSG$VariableFormField.useAssignedValue( 0 );
		// While ( true )
		Leze$Temp1: while ( com.ibm.javart.util.JavartUtil.alwaysTrue() )
		{
			// Converse xyzLogFormGroup.Login;
			xyzLogFormGroup$Login.converse();
			// IF ( ConverseVar.eventKey IS PF3 )
			if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF3() )
			{
				// exit program;
				ezeProgram._runUnit().exitProgram();
			}
			// IF ( xyzLogFormGroup.Login.userName == "" )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, xyzLogFormGroup$Login.userName, "", 1 ) == 0) )
			{
				// xyzLogFormGroup.Login.formMSG = "Please enter a username";
				xyzLogFormGroup$Login.formMSG.setValue( "Please enter a username" );
				xyzLogFormGroup$Login.formMSG$VariableFormField.useAssignedValue( 0 );
				// Set xyzLogFormGroup.Login.userName cursor;
				xyzLogFormGroup$Login.userName$VariableFormField.beginSetStatement( true );
				xyzLogFormGroup$Login.userName$VariableFormField.setInitialCursor( 0, true );
				xyzLogFormGroup$Login.userName$VariableFormField.endSetStatement();
				//  Continue  while;
				if ( true ) { continue Leze$Temp1; }
			}
			// IF ( xyzLogFormGroup.Login.passWord == "" )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, xyzLogFormGroup$Login.passWord, "", 1 ) == 0) )
			{
				// xyzLogFormGroup.Login.formMSG = "Please enter a password";
				xyzLogFormGroup$Login.formMSG.setValue( "Please enter a password" );
				xyzLogFormGroup$Login.formMSG$VariableFormField.useAssignedValue( 0 );
				// Set xyzLogFormGroup.Login.passWord cursor;
				xyzLogFormGroup$Login.passWord$VariableFormField.beginSetStatement( true );
				xyzLogFormGroup$Login.passWord$VariableFormField.setInitialCursor( 0, true );
				xyzLogFormGroup$Login.passWord$VariableFormField.endSetStatement();
				//  Continue  while;
				if ( true ) { continue Leze$Temp1; }
			}
			// siteuser.UserId = xyzLogFormGroup.Login.userName;
			com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.siteuser.UserId, xyzLogFormGroup$Login.userName );
			// siteuser.PassWord = xyzLogFormGroup.Login.passWord;
			com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.siteuser.PassWord, xyzLogFormGroup$Login.passWord );
			// ValidateLogon();
			$func_ValidateLogon();
			// IF ( xyzLogFormGroup.Login.formMSG != "" )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, xyzLogFormGroup$Login.formMSG, "", 0 ) != 0) )
			{
				//  Continue  while;
				if ( true ) { continue Leze$Temp1; }
			}
			else
			{
				// TRY 
				try
				{
					// transferData.SiteuserFirstname = siteuser.Firstname;
					com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.transferData.SiteuserFirstname, ezeProgram.siteuser.Firstname );
					// Transfer to Program xyzMenuProgram Passing transferData;
					com.ibm.javart.forms.tui.Tui3270Screen.getDisplay().clearScreen();
					ezeProgram._transferToProgram( "egltui.menu.xyzMenuProgram", ezeProgram.transferData );
				}
				catch ( java.lang.Exception eze$Temp2 )
				{
					com.ibm.javart.util.JavartUtil.anyExceptionHandler( ezeProgram, eze$Temp2, "exception" );
					// SysLib.writeStdout("Transfer to Menu Failed");
					System.out.println( "Transfer to Menu Failed" );
				}
			}
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_ValidateLogon() throws java.lang.Exception
	{
		_funcPush( "ValidateLogon" );
		
		// xyzLogFormGroup.Login.formMSG = "";
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, xyzLogFormGroup$Login.formMSG );
		xyzLogFormGroup$Login.formMSG$VariableFormField.useAssignedValue( 0 );
		// IF ( nbrTry > 3 )
		if ( (ezeProgram.nbrTry > (short)3) )
		{
			// xyzLogFormGroup.Login.formMSG = "You must be trying to hack in.  Get Lost!";
			xyzLogFormGroup$Login.formMSG.setValue( "You must be trying to hack in.  Get Lost!" );
			xyzLogFormGroup$Login.formMSG$VariableFormField.useAssignedValue( 0 );
			// RETURN
			if ( true )
			{
				_funcPop();
				return;
			}
		}
		// SiteuserLib.VerifyUserID(siteuser, status);
		ezeProgram.egltui__access__SiteuserLib.$func_VerifyUserID( ezeProgram.siteuser, ezeProgram.status );
		// IF ( !status.succeeded )
		if ( !(ezeProgram.status.succeeded.getValue()) )
		{
			// xyzLogFormGroup.Login.formMSG = "Invalid User ID";
			xyzLogFormGroup$Login.formMSG.setValue( "Invalid User ID" );
			xyzLogFormGroup$Login.formMSG$VariableFormField.useAssignedValue( 0 );
			// nbrTry = nbrTry + 1;
			ezeProgram.nbrTry++;
			// RETURN
			if ( true )
			{
				_funcPop();
				return;
			}
		}
		// SiteuserLib.VerifyUserIDPassword(siteuser, status);
		ezeProgram.egltui__access__SiteuserLib.$func_VerifyUserIDPassword( ezeProgram.siteuser, ezeProgram.status );
		// IF ( !status.succeeded )
		if ( !(ezeProgram.status.succeeded.getValue()) )
		{
			// xyzLogFormGroup.Login.formMSG = "Invalid Password";
			xyzLogFormGroup$Login.formMSG.setValue( "Invalid Password" );
			xyzLogFormGroup$Login.formMSG$VariableFormField.useAssignedValue( 0 );
			// nbrTry = nbrTry + 1;
			ezeProgram.nbrTry++;
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initxyzLogonProgram( xyzLogonProgram ezeProgram ) throws java.lang.Exception
	{
		egl__vg__VGVar.handleOverflow.setValue(1);
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// nbrTry = 0;
		ezeProgram.nbrTry = (short)0;
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
