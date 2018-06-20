// Generated at Tue Jun 12 15:21:48 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package kbprograms;

public class kbprogram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final kbprogram ezeProgram;
	public com.ibm.javart.NumericDecValue amount;
	public com.ibm.javart.NumericDecValue principal;
	public double interest;
	public int nbrYears;
	
	public kbprogram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "kbprogram", "kbprogram", ru, false, true, 7 );
		ezeProgram = this;
		amount = new com.ibm.javart.NumericDecItem( "amount", com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d9:2;" );
		principal = new com.ibm.javart.NumericDecItem( "principal", com.ibm.javart.Value.SQL_NOT_NULLABLE, 7, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d7:2;" );
		interest = 0;
		nbrYears = 0;
		$initkbprogram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "kbprogram", "kbprograms/kbprogram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new kbprogram( ru ) );
		ru.exit();
	}
	
	public void $func_main() throws java.lang.Exception
	{
		_funcPush( "main" );
		
		// amount = 0;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.amount, (short)0 );
		// principal = 10000.01;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.principal, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0xf, 0x42, 0x41, } ), 2 ) );
		// interest = 0.05;
		ezeProgram.interest = 0.05;
		// nbrYears = 10;
		ezeProgram.nbrYears = (short)10;
		// calculateSimpleInterest();
		$func_calculateSimpleInterest();
		// calculatePrincipal();
		$func_calculatePrincipal();
		// calculateInterestRate();
		$func_calculateInterestRate();
		// calculateNbrCompoundingPeriods();
		$func_calculateNbrCompoundingPeriods();
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_calculateSimpleInterest() throws java.lang.Exception
	{
		_funcPush( "calculateSimpleInterest" );
		
		// amount = principal * 1 + nbrYears * interest;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.amount, com.ibm.javart.operations.Multiply.run( ezeProgram, ezeProgram.principal, com.ibm.javart.operations.Add.run( ezeProgram, (short)1, com.ibm.javart.operations.Multiply.run( ezeProgram, ezeProgram.nbrYears, ezeProgram.interest ) ) ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_calculatePrincipal() throws java.lang.Exception
	{
		_funcPush( "calculatePrincipal" );
		
		// principal = amount / 1 + nbrYears * interest;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.principal, com.ibm.javart.operations.Divide.run( ezeProgram, ezeProgram.amount, com.ibm.javart.operations.Add.run( ezeProgram, (short)1, com.ibm.javart.operations.Multiply.run( ezeProgram, ezeProgram.nbrYears, ezeProgram.interest ) ) ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_calculateInterestRate() throws java.lang.Exception
	{
		_funcPush( "calculateInterestRate" );
		
		// interest = amount / principal - 1 / nbrYears;
		ezeProgram.interest = com.ibm.javart.operations.AssignToFloat.run( ezeProgram, com.ibm.javart.operations.Divide.run( ezeProgram, com.ibm.javart.operations.Subtract.run( ezeProgram, com.ibm.javart.operations.Divide.run( ezeProgram, ezeProgram.amount, ezeProgram.principal ), (short)1 ), ezeProgram.nbrYears ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_calculateNbrCompoundingPeriods() throws java.lang.Exception
	{
		_funcPush( "calculateNbrCompoundingPeriods" );
		
		// nbrYears = amount / principal - 1 / interest;
		ezeProgram.nbrYears = com.ibm.javart.operations.AssignToInt.run( ezeProgram, com.ibm.javart.operations.Divide.run( ezeProgram, com.ibm.javart.operations.Subtract.run( ezeProgram, com.ibm.javart.operations.Divide.run( ezeProgram, ezeProgram.amount, ezeProgram.principal ), (short)1 ), ezeProgram.interest ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initkbprogram( kbprogram ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DB2 );
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
//	dbms = DB2
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
//	sqlDB = jdbc:db2://localhost:50000/SAMPLE
//	sqlErrorTrace = NO
//	sqlID = 
//	sqlIOTrace = NO
//	sqlJDBCDriverClass = com.ibm.db2.jcc.DB2Driver
//	sqlJNDIName = 
//	sqlSchema = 
//	sqlValidationConnectionURL = jdbc:db2://localhost:50000/SAMPLE
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
