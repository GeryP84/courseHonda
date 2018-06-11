// Generated at Mon Jun 11 17:12:55 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package basicprograms;

public class payrollProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final payrollProgram ezeProgram;
	public basicprograms.empRec empRecin;
	public basicprograms.empRec empRecout;
	public com.ibm.javart.ref.ContainerArrayRef empRecArray;
	
	public payrollProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "payrollProgram", "payrollProgram", ru, false, true, 7 );
		ezeProgram = this;
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		empRecin = new basicprograms.empRec( "empRecin", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, false, "TbasicPrograms/empRec;" );
		empRecout = new basicprograms.empRec( "empRecout", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, false, "TbasicPrograms/empRec;" );
		empRecArray = new com.ibm.javart.ref.ContainerArrayRef( "empRecArray", new com.ibm.javart.arrays.ContainerArray( "empRecArray", ezeProgram, 0, 10, Integer.MAX_VALUE, "1TbasicPrograms/empRec;" )
		{
			private static final long serialVersionUID = 70L;
			
			public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				return new basicprograms.empRec( "empRecArray", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "TbasicPrograms/empRec;" );
			};
		}, "1TbasicPrograms/empRec;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "empRecArray", ezeProgram, 0, 10, Integer.MAX_VALUE, "1TbasicPrograms/empRec;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new basicprograms.empRec( "empRecArray", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "TbasicPrograms/empRec;" );
					};
				};
			}
		};
		$initpayrollProgram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "payrollProgram", "basicprograms/payrollProgram.properties", false );
	}
	public com.ibm.javart.JavartSerializable[] _parameters() throws com.ibm.javart.JavartException
	{
		return new com.ibm.javart.JavartSerializable[] {  };
	}
	
	private int ezeRetainOnExit;
	public boolean _retainOnLocalExit( int action ) throws com.ibm.javart.JavartException
	{
		switch ( action )
		{
			case 0:
			ezeRetainOnExit = 1;
			_initSavedSysVars();
			_initUnsavedSysVars();
			break;
			case 1:
			if ( ezeRetainOnExit == 2 ) ezeRetainOnExit = 1;
			break;
			case 2:
			if ( ezeRetainOnExit == 1 ) ezeRetainOnExit = 2;
			break;
		}
		return ezeRetainOnExit == 2;
	}
	
	public void _initNonIoData() throws java.lang.Exception
	{
		// Set empRecin, empRecout, empRecArray initial;
		ezeProgram.empRecin.ezeSetInitial( ezeProgram );
		ezeProgram.empRecout.ezeSetInitial( ezeProgram );
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ) );
	}
	public static payrollProgram _libraryCallInstance( com.ibm.javart.resources.RunUnit ezeRU ) throws java.lang.Exception
	{
		payrollProgram eze = (payrollProgram)ezeRU.getLibrary( "basicprograms.payrollProgram" );
		if ( eze == null )
		{
			eze = new payrollProgram( ezeRU );
			ezeRU.addLibrary( "basicprograms.payrollProgram", eze );
		}
		return eze;
	}
	
	public void $func_main() throws java.lang.Exception
	{
		_funcPush( "main" );
		
		// Set empRecin empty;
		ezeProgram.empRecin.ezeSetEmpty( ezeProgram );
		// Set empRecout empty;
		ezeProgram.empRecout.ezeSetEmpty( ezeProgram );
		// assignEmpVals();
		$func_assignEmpVals();
		// fieldMoves();
		$func_fieldMoves();
		// groupMoves();
		$func_groupMoves();
		// recordMoves();
		$func_recordMoves();
		// loadArray();
		$func_loadArray();
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_fieldMoves() throws java.lang.Exception
	{
		_funcPush( "fieldMoves" );
		
		// empRecout.emp.lastName = empRecin.emp.lastName;
		java.lang.System.arraycopy( ezeProgram.empRecin.buffer(), ezeProgram.empRecin.emp__lastName.getOffset(), ezeProgram.empRecout.buffer(), ezeProgram.empRecout.emp__lastName.getOffset(), 20 );
		// empRecout.pay.grossPay = empRecin.pay.grossPay;
		com.ibm.javart.operations.DecimalOperations.moveNum( ezeProgram, ezeProgram.empRecout.buffer(), ezeProgram.empRecout.pay__grossPay.getOffset(), 9, com.ibm.javart.Constants.EGL_TYPE_NUM, ezeProgram.empRecin.buffer(), ezeProgram.empRecin.pay__grossPay.getOffset(), 9, com.ibm.javart.Constants.EGL_TYPE_NUM, true, "grossPay", "grossPay", 0 );
		// empRecout.emp.partTimeInd = empRecin.emp.partTimeInd;
		com.ibm.javart.operations.DecimalOperations.moveNum( ezeProgram, ezeProgram.empRecout.buffer(), ezeProgram.empRecout.emp__partTimeInd.getOffset(), 1, com.ibm.javart.Constants.EGL_TYPE_NUM, ezeProgram.empRecin.buffer(), ezeProgram.empRecin.emp__partTimeInd.getOffset(), 1, com.ibm.javart.Constants.EGL_TYPE_NUM, true, "partTimeInd", "partTimeInd", 0 );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_groupMoves() throws java.lang.Exception
	{
		_funcPush( "groupMoves" );
		
		// Set empRecout empty;
		ezeProgram.empRecout.ezeSetEmpty( ezeProgram );
		// empRecout.emp = empRecin.emp;
		java.lang.System.arraycopy( ezeProgram.empRecin.buffer(), ezeProgram.empRecin.emp.getOffset(), ezeProgram.empRecout.buffer(), ezeProgram.empRecout.emp.getOffset(), 57 );
		// empRecout.pay = empRecin.pay;
		java.lang.System.arraycopy( ezeProgram.empRecin.buffer(), ezeProgram.empRecin.pay.getOffset(), ezeProgram.empRecout.buffer(), ezeProgram.empRecout.pay.getOffset(), 62 );
		// empRecout.rpt = empRecin.rpt;
		java.lang.System.arraycopy( ezeProgram.empRecin.buffer(), ezeProgram.empRecin.rpt.getOffset(), ezeProgram.empRecout.buffer(), ezeProgram.empRecout.rpt.getOffset(), 32 );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_recordMoves() throws java.lang.Exception
	{
		_funcPush( "recordMoves" );
		
		// Set empRecout empty;
		ezeProgram.empRecout.ezeSetEmpty( ezeProgram );
		// empRecout = empRecin;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecout, ezeProgram.empRecin );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_assignEmpVals() throws java.lang.Exception
	{
		_funcPush( "assignEmpVals" );
		
		// empRecin.emp.lastName = "Irving";
		ezeProgram.empRecin.emp__lastName.setValue( "Irving" );
		// empRecin.emp.firstName = "Julian";
		ezeProgram.empRecin.emp__firstName.setValue( "Julian" );
		// empRecin.emp.empId = "1X43T6";
		ezeProgram.empRecin.emp__empId.setValue( "1X43T6" );
		// empRecin.emp.empPhone = 2126784343;
		ezeProgram.empRecin.emp__empPhone.setValue( 2126784343 );
		// empRecin.emp.partTimeInd = 0;
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecin.emp__partTimeInd );
		// empRecin.pay.grossPay = 98765.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__grossPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x96, (byte)0xb4, 0x3f, } ), 2 ) );
		// empRecin.pay.ytdGrossPay = 98765.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdGrossPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x96, (byte)0xb4, 0x3f, } ), 2 ) );
		// empRecin.pay.fedTax = 98765.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__fedTax, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x96, (byte)0xb4, 0x3f, } ), 2 ) );
		// empRecin.pay.ytdFedTax = 98765.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdFedTax, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x96, (byte)0xb4, 0x3f, } ), 2 ) );
		// empRecin.pay.netPay = 98765.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__netPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x96, (byte)0xb4, 0x3f, } ), 2 ) );
		// empRecin.pay.ytdNetPay = 98765.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdNetPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x96, (byte)0xb4, 0x3f, } ), 2 ) );
		// empRecin.pay.stockPurchPerc = 4.5;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__stockPurchPerc, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x2d, } ), 1 ) );
		// empRecin.pay.four01KPerc = 11.0;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__four01KPerc, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x6e, } ), 1 ) );
		// empRecin.rpt.currDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecin.rpt__currDate );
		// empRecin.rpt.periodEndDate = DateTimeLib.currentDate() + 30;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.rpt__periodEndDate, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ), (short)30 ) );
		// empRecin.rpt.reportTimeStamp = DateTimeLib.currentTimeStamp();
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecin.rpt__reportTimeStamp );
		// empRecin.rpt.payPeriod = 4;
		ezeProgram.empRecin.rpt__payPeriod.setValue( (short)4 );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_loadArray() throws java.lang.Exception
	{
		_funcPush( "loadArray" );
		
		// empRecArray.appendElement(empRecin);
		ezeProgram.empRecArray.checkedValue( ezeProgram ).appendElement( ezeProgram, com.ibm.javart.operations.Assign.run( ezeProgram, (com.ibm.javart.OverlayContainer)ezeProgram.empRecArray.value().makeNewElement( ezeProgram ), ezeProgram.empRecin ) );
		// empRecin.emp.lastName = "Hudak";
		ezeProgram.empRecin.emp__lastName.setValue( "Hudak" );
		// empRecin.emp.firstName = "William";
		ezeProgram.empRecin.emp__firstName.setValue( "William" );
		// empRecin.emp.empId = "289483";
		ezeProgram.empRecin.emp__empId.setValue( "289483" );
		// empRecin.emp.empPhone = 8602283788;
		ezeProgram.empRecin.emp__empPhone.setValue( 8602283788L );
		// empRecin.emp.partTimeInd = 1;
		ezeProgram.empRecin.emp__partTimeInd.setValue( (short)1 );
		// empRecin.pay.grossPay = 12122.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__grossPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x12, 0x7f, 0x53, } ), 2 ) );
		// empRecin.pay.ytdGrossPay = 93242.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdGrossPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x8e, 0x46, (byte)0xd3, } ), 2 ) );
		// empRecin.pay.fedTax = 13865.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__fedTax, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x15, 0x28, 0x2f, } ), 2 ) );
		// empRecin.pay.ytdFedTax = 5522.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdFedTax, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x8, 0x6d, 0x33, } ), 2 ) );
		// empRecin.pay.netPay = 987367.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__netPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x5, (byte)0xe2, (byte)0x9a, 0x67, } ), 2 ) );
		// empRecin.pay.ytdNetPay = 83456.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdNetPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x7f, 0x58, 0x2b, } ), 2 ) );
		// empRecin.pay.stockPurchPerc = 2.0;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__stockPurchPerc, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x14, } ), 1 ) );
		// empRecin.pay.four01KPerc = 8.5;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__four01KPerc, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x55, } ), 1 ) );
		// empRecin.rpt.currDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecin.rpt__currDate );
		// empRecin.rpt.periodEndDate = DateTimeLib.currentDate() + 30;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.rpt__periodEndDate, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ), (short)30 ) );
		// empRecin.rpt.reportTimeStamp = DateTimeLib.currentTimeStamp();
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecin.rpt__reportTimeStamp );
		// empRecin.rpt.payPeriod = 4;
		ezeProgram.empRecin.rpt__payPeriod.setValue( (short)4 );
		// empRecArray.appendElement(empRecin);
		ezeProgram.empRecArray.checkedValue( ezeProgram ).appendElement( ezeProgram, com.ibm.javart.operations.Assign.run( ezeProgram, (com.ibm.javart.OverlayContainer)ezeProgram.empRecArray.value().makeNewElement( ezeProgram ), ezeProgram.empRecin ) );
		// empRecin.emp.lastName = "Smith";
		ezeProgram.empRecin.emp__lastName.setValue( "Smith" );
		// empRecin.emp.firstName = "MaryLou";
		ezeProgram.empRecin.emp__firstName.setValue( "MaryLou" );
		// empRecin.emp.empId = "4h4673";
		ezeProgram.empRecin.emp__empId.setValue( "4h4673" );
		// empRecin.emp.empPhone = 6157236235;
		ezeProgram.empRecin.emp__empPhone.setValue( 6157236235L );
		// empRecin.emp.partTimeInd = 1;
		ezeProgram.empRecin.emp__partTimeInd.setValue( (short)1 );
		// empRecin.pay.grossPay = 12312.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__grossPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x12, (byte)0xc9, (byte)0x8b, } ), 2 ) );
		// empRecin.pay.ytdGrossPay = 53423.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdGrossPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x51, (byte)0x84, (byte)0x87, } ), 2 ) );
		// empRecin.pay.fedTax = 231.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__fedTax, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x5a, 0x67, } ), 2 ) );
		// empRecin.pay.ytdFedTax = 531.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdFedTax, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0xcf, (byte)0x97, } ), 2 ) );
		// empRecin.pay.netPay = 23423.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__netPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x23, (byte)0xbd, (byte)0xc7, } ), 2 ) );
		// empRecin.pay.ytdNetPay = 78564.43;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__ytdNetPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x77, (byte)0xe1, 0x3b, } ), 2 ) );
		// empRecin.pay.stockPurchPerc = 1.0;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__stockPurchPerc, java.math.BigDecimal.ONE );
		// empRecin.pay.four01KPerc = 15.0;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.pay__four01KPerc, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x0, (byte)0x96, } ), 1 ) );
		// empRecin.rpt.currDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecin.rpt__currDate );
		// empRecin.rpt.periodEndDate = DateTimeLib.currentDate() + 30;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.empRecin.rpt__periodEndDate, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ), (short)30 ) );
		// empRecin.rpt.reportTimeStamp = DateTimeLib.currentTimeStamp();
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, ezeProgram.empRecin.rpt__reportTimeStamp );
		// empRecin.rpt.payPeriod = 4;
		ezeProgram.empRecin.rpt__payPeriod.setValue( (short)4 );
		// empRecArray.appendElement(empRecin);
		ezeProgram.empRecArray.checkedValue( ezeProgram ).appendElement( ezeProgram, com.ibm.javart.operations.Assign.run( ezeProgram, (com.ibm.javart.OverlayContainer)ezeProgram.empRecArray.value().makeNewElement( ezeProgram ), ezeProgram.empRecin ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initpayrollProgram( payrollProgram ezeProgram ) throws java.lang.Exception
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
