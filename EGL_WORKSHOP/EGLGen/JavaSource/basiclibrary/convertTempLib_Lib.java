// Generated at Tue Jun 19 11:55:55 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package basiclibrary;

public class convertTempLib_Lib extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final convertTempLib_Lib ezeProgram;
	
	public convertTempLib_Lib( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "convertTempLib_Lib", "convertTempLib", ru, false, true, 7 );
		ezeProgram = this;
		_runUnit().addLibrary( "basiclibrary.convertTempLib_Lib", this );
		$initconvertTempLib_Lib( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return false;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return false;
	}
	
	public void $func_celsiusToFahrenheit( basiclibrary.tempRec rec ) throws java.lang.Exception
	{
		_funcPush( "celsiusToFahrenheit" );
		
		// rec.tempF = 1.80000000000000000000000000000000 * rec.tempC + 32;
		com.ibm.javart.operations.Assign.run( ezeProgram, rec.tempF, com.ibm.javart.operations.Add.run( ezeProgram, com.ibm.javart.operations.Multiply.run( ezeProgram, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x8, (byte)0xdf, (byte)0xeb, 0x5e, 0x42, 0x71, (byte)0x8a, 0x37, 0x48, (byte)0xb5, 0x0, 0x0, 0x0, 0x0, } ), 32 ), rec.tempC ), (short)32 ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_fahrenheitToCelsius( basiclibrary.tempRec rec ) throws java.lang.Exception
	{
		_funcPush( "fahrenheitToCelsius" );
		
		// rec.tempC = 0.55555555555555555555555555555556 * rec.tempF - 32;
		com.ibm.javart.operations.Assign.run( ezeProgram, rec.tempC, com.ibm.javart.operations.Subtract.run( ezeProgram, com.ibm.javart.operations.Multiply.run( ezeProgram, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x2, (byte)0xbd, 0x35, (byte)0xae, 0x79, (byte)0xa4, (byte)0x9f, (byte)0x98, (byte)0xf6, (byte)0xd5, (byte)0xe3, (byte)0x8e, 0x38, (byte)0xe4, } ), 32 ), rec.tempF ), (short)32 ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initconvertTempLib_Lib( convertTempLib_Lib ezeProgram ) throws java.lang.Exception
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
