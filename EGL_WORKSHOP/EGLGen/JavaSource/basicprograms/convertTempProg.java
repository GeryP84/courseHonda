// Generated at Tue Jun 19 11:55:55 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package basicprograms;

public class convertTempProg extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final convertTempProg ezeProgram;
	public basiclibrary.tempRec rec;
	public basiclibrary.convertTempLib_Lib BasicLibrary__convertTempLib;
	
	public convertTempProg( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "convertTempProg", "convertTempProg", ru, false, true, 7 );
		ezeProgram = this;
		BasicLibrary__convertTempLib = (basiclibrary.convertTempLib_Lib)ezeProgram._runUnit().loadLibrary( "basiclibrary.convertTempLib_Lib" );
		rec = new basiclibrary.tempRec( "rec", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "TBasicLibrary/tempRec;" );
		$initconvertTempProg( this );
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
		return new com.ibm.javart.resources.StartupInfo( "convertTempProg", "basicprograms/convertTempProg.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new convertTempProg( ru ) );
		ru.exit();
	}
	
	public void $func_main() throws java.lang.Exception
	{
		_funcPush( "main" );
		
		// convertFahrenheitToCelsius();
		$func_convertFahrenheitToCelsius();
		// convertCelsiusToFahrenheit();
		$func_convertCelsiusToFahrenheit();
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_convertFahrenheitToCelsius() throws java.lang.Exception
	{
		_funcPush( "convertFahrenheitToCelsius" );
		
		// Set rec empty;
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.rec );
		// rec.tempF = 100;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.rec.tempF, (short)100 );
		// convertTempLib.fahrenheitToCelsius(rec);
		ezeProgram.BasicLibrary__convertTempLib.$func_fahrenheitToCelsius( ezeProgram.rec );
		// SysLib.writeStdout("" + rec.tempF + "° Fahrenheit equals " + rec.tempC + "° Celsius.");
		System.out.println( (((com.ibm.javart.operations.ConcatValue.run( ezeProgram, ezeProgram.rec.tempF ) + "\u00b0 Fahrenheit equals ") + com.ibm.javart.operations.ConcatValue.run( ezeProgram, ezeProgram.rec.tempC )) + "\u00b0 Celsius.") );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_convertCelsiusToFahrenheit() throws java.lang.Exception
	{
		_funcPush( "convertCelsiusToFahrenheit" );
		
		// Set rec empty;
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.rec );
		// rec.tempC = 25;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.rec.tempC, (short)25 );
		// convertTempLib.celsiusToFahrenheit(rec);
		ezeProgram.BasicLibrary__convertTempLib.$func_celsiusToFahrenheit( ezeProgram.rec );
		// SysLib.writeStdout("" + rec.tempC + "° Celsius equals " + rec.tempF + "° Fahrenteit.");
		System.out.println( (((com.ibm.javart.operations.ConcatValue.run( ezeProgram, ezeProgram.rec.tempC ) + "\u00b0 Celsius equals ") + com.ibm.javart.operations.ConcatValue.run( ezeProgram, ezeProgram.rec.tempF )) + "\u00b0 Fahrenteit.") );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initconvertTempProg( convertTempProg ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// RETURN
	}
	
}

// Build options from EGL_WORKSHOPJavaBuildOptions, \\EGL_WORKSHOP\\EGLSource\\EGL_WORKSHOP.eglbld
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
//	deploymentDescriptor = EGL_WORKSHOP
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
//	genProject = EGL_WORKSHOP
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
