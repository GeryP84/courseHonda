// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt3.report;

public class xyzReportProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final xyzReportProgram ezeProgram;
	public com.ibm.javart.ref.ContainerArrayRef customerArray;
	public com.ibm.javart.ref.ContainerArrayRef ordersArray;
	public egltui.StatusRec status;
	public short i;
	public short j;
	public short customerSize;
	public short orderSize;
	public short lineCount;
	public egltui.access.CustomerLib_Lib egltui__access__CustomerLib;
	public egltui.access.OrdersLib_Lib egltui__access__OrdersLib;
	public egltui.opt3.report.xyzRP1FormGroup xyzRP1FormGroup;
	public egltui.opt3.report.xyzRP1FormGroup$CustomerLine xyzRP1FormGroup$CustomerLine;
	public egltui.opt3.report.xyzRP1FormGroup$NoOrdersForm xyzRP1FormGroup$NoOrdersForm;
	public egltui.opt3.report.xyzRP1FormGroup$Trailer xyzRP1FormGroup$Trailer;
	public egltui.opt3.report.xyzRP1FormGroup$OrderLine xyzRP1FormGroup$OrderLine;
	public egltui.opt3.report.xyzRP1FormGroup$Header xyzRP1FormGroup$Header;
	
	public xyzReportProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "xyzReportProgram", "xyzReportProgram", ru, false, true, 2 );
		ezeProgram = this;
		egltui__access__CustomerLib = (egltui.access.CustomerLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.access.CustomerLib_Lib" );
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		egltui__access__OrdersLib = (egltui.access.OrdersLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.access.OrdersLib_Lib" );
		xyzRP1FormGroup = new egltui.opt3.report.xyzRP1FormGroup( "xyzRP1FormGroup" );
		com.ibm.javart.forms.common.Utility.setApp( this );
		xyzRP1FormGroup$CustomerLine = new egltui.opt3.report.xyzRP1FormGroup$CustomerLine(ezeProgram, "xyzRP1FormGroup$CustomerLine" );
		xyzRP1FormGroup$CustomerLine.setFormGroup(xyzRP1FormGroup);
		xyzRP1FormGroup$NoOrdersForm = new egltui.opt3.report.xyzRP1FormGroup$NoOrdersForm(ezeProgram, "xyzRP1FormGroup$NoOrdersForm" );
		xyzRP1FormGroup$NoOrdersForm.setFormGroup(xyzRP1FormGroup);
		xyzRP1FormGroup$Trailer = new egltui.opt3.report.xyzRP1FormGroup$Trailer(ezeProgram, "xyzRP1FormGroup$Trailer" );
		xyzRP1FormGroup$Trailer.setFormGroup(xyzRP1FormGroup);
		xyzRP1FormGroup$OrderLine = new egltui.opt3.report.xyzRP1FormGroup$OrderLine(ezeProgram, "xyzRP1FormGroup$OrderLine" );
		xyzRP1FormGroup$OrderLine.setFormGroup(xyzRP1FormGroup);
		xyzRP1FormGroup$Header = new egltui.opt3.report.xyzRP1FormGroup$Header(ezeProgram, "xyzRP1FormGroup$Header" );
		xyzRP1FormGroup$Header.setFormGroup(xyzRP1FormGroup);
		xyzRP1FormGroup.setPFKeyEquate( true );
		customerArray = new com.ibm.javart.ref.ContainerArrayRef( "customerArray", null, "1Tegltui/data/Customer;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "customerArray", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Customer;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new egltui.data.Customer( "customerArray", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
					};
				};
			}
		};
		ordersArray = new com.ibm.javart.ref.ContainerArrayRef( "ordersArray", null, "1Tegltui/data/Orders;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "ordersArray", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Orders;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new egltui.data.Orders( "ordersArray", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Orders;" );
					};
				};
			}
		};
		status = new egltui.StatusRec( "status", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/StatusRec;" );
		i = 0;
		j = 0;
		customerSize = 0;
		orderSize = 0;
		lineCount = 0;
		$initxyzReportProgram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "xyzReportProgram", "egltui/opt3/report/xyzReportProgram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new xyzReportProgram( ru ) );
		ru.exit();
	}
	
	public void $func_main() throws java.lang.Exception
	{
		_funcPush( "main" );
		
		// StrLib.defaultDateFormat = "MM/dd/yyyy";
		ezeProgram.egl__core__StrLib.defaultDateFormat.setValue( "MM/dd/yyyy" );
		// StrLib.defaultTimeFormat = "HH:mm:ss";
		ezeProgram.egl__core__StrLib.defaultTimeFormat.setValue( "HH:mm:ss" );
		// xyzRP1FormGroup.Header.curDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$Header.curDate, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ) );
		xyzRP1FormGroup$Header.curDate$VariableFormField.useAssignedValue( 0 );
		// xyzRP1FormGroup.Header.curTime = DateTimeLib.currentTime();
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$Header.curTime, ezeProgram.egl__core__DateTimeLib.currentTime( ezeProgram ) );
		xyzRP1FormGroup$Header.curTime$VariableFormField.useAssignedValue( 0 );
		// xyzRP1FormGroup.Header.curPage = 1;
		xyzRP1FormGroup$Header.curPage.setValue( (short)1 );
		xyzRP1FormGroup$Header.curPage$VariableFormField.useAssignedValue( 0 );
		// Print xyzRP1FormGroup.Header;
		xyzRP1FormGroup$Header.print();
		// CustomerLib.GetCustomerListAll(customerArray, status);
		ezeProgram.egltui__access__CustomerLib.$func_GetCustomerListAll__0$T14ace9d72( ezeProgram.customerArray.update( com.ibm.javart.ref.Null.NULL ), ezeProgram.status );
		// customerSize = customerArray.getSize();
		ezeProgram.customerSize = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, ezeProgram.customerArray.checkedValue( ezeProgram ).getSize( ezeProgram ) );
		// for ( i From 1 To customerSize Increment 1 )
		ezeProgram.i = (short)(short)1;
		for ( ; (ezeProgram.i <= ezeProgram.customerSize); ezeProgram.i = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.i, (short)1 ) ) )
		{
			// xyzRP1FormGroup.CustomerLine.CustomerID = customerArray[i].CustomerId;
			xyzRP1FormGroup$CustomerLine.CustomerID.setValue( ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customerArray.checkedValue( ezeProgram ), ezeProgram.i )).CustomerId.getValue() );
			xyzRP1FormGroup$CustomerLine.CustomerID$VariableFormField.useAssignedValue( 0 );
			// xyzRP1FormGroup.CustomerLine.FirstName = customerArray[i].FirstName;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$CustomerLine.FirstName, ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customerArray.checkedValue( ezeProgram ), ezeProgram.i )).FirstName );
			xyzRP1FormGroup$CustomerLine.FirstName$VariableFormField.useAssignedValue( 0 );
			// xyzRP1FormGroup.CustomerLine.LastName = customerArray[i].LastName;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$CustomerLine.LastName, ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customerArray.checkedValue( ezeProgram ), ezeProgram.i )).LastName );
			xyzRP1FormGroup$CustomerLine.LastName$VariableFormField.useAssignedValue( 0 );
			// xyzRP1FormGroup.CustomerLine.State = customerArray[i].State;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$CustomerLine.State, ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customerArray.checkedValue( ezeProgram ), ezeProgram.i )).State );
			xyzRP1FormGroup$CustomerLine.State$VariableFormField.useAssignedValue( 0 );
			// xyzRP1FormGroup.CustomerLine.City = customerArray[i].City;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$CustomerLine.City, ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customerArray.checkedValue( ezeProgram ), ezeProgram.i )).City );
			xyzRP1FormGroup$CustomerLine.City$VariableFormField.useAssignedValue( 0 );
			// xyzRP1FormGroup.CustomerLine.PostalCode = customerArray[i].PostalCode;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$CustomerLine.PostalCode, ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customerArray.checkedValue( ezeProgram ), ezeProgram.i )).Postalcode );
			xyzRP1FormGroup$CustomerLine.PostalCode$VariableFormField.useAssignedValue( 0 );
			// IF ( lineCount + 4 > 60 )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.lineCount, (short)4 ), (short)60, -1 ) > 0) )
			{
				// Print xyzRP1FormGroup.Trailer;
				xyzRP1FormGroup$Trailer.print();
				// xyzRP1FormGroup.Header.curPage = xyzRP1FormGroup.Header.curPage + 1;
				com.ibm.javart.operations.Increment.run( ezeProgram, xyzRP1FormGroup$Header.curPage );
				xyzRP1FormGroup$Header.curPage$VariableFormField.useAssignedValue( 0 );
				// Print xyzRP1FormGroup.Header;
				xyzRP1FormGroup$Header.print();
				// lineCount = 0;
				ezeProgram.lineCount = (short)(short)0;
			}
			// Print xyzRP1FormGroup.CustomerLine;
			xyzRP1FormGroup$CustomerLine.print();
			// lineCount = lineCount + 4;
			ezeProgram.lineCount = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.lineCount, (short)4 ) );
			// OrdersLib.GetCustomerOrdersListAll(xyzRP1FormGroup.CustomerLine.CustomerID, ordersArray, status);
			ezeProgram.egltui__access__OrdersLib.$func_GetCustomerOrdersListAll__1$T12n23612a87( com.ibm.javart.operations.Assign.run( ezeProgram, new com.ibm.javart.IntItem( "CustomerID", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT ), xyzRP1FormGroup$CustomerLine.CustomerID ), ezeProgram.ordersArray.update( com.ibm.javart.ref.Null.NULL ), ezeProgram.status );
			// orderSize = ordersArray.getSize();
			ezeProgram.orderSize = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, ezeProgram.ordersArray.checkedValue( ezeProgram ).getSize( ezeProgram ) );
			// IF ( orderSize == 0 )
			if ( (ezeProgram.orderSize == (short)0) )
			{
				// Print xyzRP1FormGroup.NoOrdersForm;
				xyzRP1FormGroup$NoOrdersForm.print();
				// lineCount = lineCount + 1;
				ezeProgram.lineCount = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.lineCount, (short)1 ) );
			}
			// for ( j From 1 To orderSize Increment 1 )
			ezeProgram.j = (short)(short)1;
			for ( ; (ezeProgram.j <= ezeProgram.orderSize); ezeProgram.j = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.j, (short)1 ) ) )
			{
				// xyzRP1FormGroup.OrderLine.OrderID = ordersArray[j].OrderId;
				xyzRP1FormGroup$OrderLine.OrderID.setValue( ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.ordersArray.checkedValue( ezeProgram ), ezeProgram.j )).OrderId.getValue() );
				xyzRP1FormGroup$OrderLine.OrderID$VariableFormField.useAssignedValue( 0 );
				// xyzRP1FormGroup.OrderLine.OrderDate = ordersArray[j].OrderDate;
				com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$OrderLine.OrderDate, ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.ordersArray.checkedValue( ezeProgram ), ezeProgram.j )).OrderDate );
				xyzRP1FormGroup$OrderLine.OrderDate$VariableFormField.useAssignedValue( 0 );
				// xyzRP1FormGroup.OrderLine.OrderAmount = ordersArray[j].OrderAmount;
				com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$OrderLine.OrderAmount, ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.ordersArray.checkedValue( ezeProgram ), ezeProgram.j )).OrderAmount );
				xyzRP1FormGroup$OrderLine.OrderAmount$VariableFormField.useAssignedValue( 0 );
				// xyzRP1FormGroup.OrderLine.OrderStatus = ordersArray[j].OrderStatus;
				com.ibm.javart.operations.Assign.run( ezeProgram, xyzRP1FormGroup$OrderLine.OrderStatus, ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.ordersArray.checkedValue( ezeProgram ), ezeProgram.j )).OrderStatus );
				xyzRP1FormGroup$OrderLine.OrderStatus$VariableFormField.useAssignedValue( 0 );
				// IF ( lineCount + 2 > 60 )
				if ( (com.ibm.javart.operations.Compare.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.lineCount, (short)2 ), (short)60, -1 ) > 0) )
				{
					// Print xyzRP1FormGroup.Trailer;
					xyzRP1FormGroup$Trailer.print();
					// xyzRP1FormGroup.Header.curPage = xyzRP1FormGroup.Header.curPage + 1;
					com.ibm.javart.operations.Increment.run( ezeProgram, xyzRP1FormGroup$Header.curPage );
					xyzRP1FormGroup$Header.curPage$VariableFormField.useAssignedValue( 0 );
					// Print xyzRP1FormGroup.Header;
					xyzRP1FormGroup$Header.print();
					// lineCount = 0;
					ezeProgram.lineCount = (short)(short)0;
					// xyzRP1FormGroup.CustomerLine.continuedFlag = "continued";
					xyzRP1FormGroup$CustomerLine.continuedFlag.setValue( "continued" );
					xyzRP1FormGroup$CustomerLine.continuedFlag$VariableFormField.useAssignedValue( 0 );
					// Print xyzRP1FormGroup.CustomerLine;
					xyzRP1FormGroup$CustomerLine.print();
					// lineCount = lineCount + 4;
					ezeProgram.lineCount = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.lineCount, (short)4 ) );
					// xyzRP1FormGroup.CustomerLine.continuedFlag = "";
					com.ibm.javart.operations.SetEmpty.run( ezeProgram, xyzRP1FormGroup$CustomerLine.continuedFlag );
					xyzRP1FormGroup$CustomerLine.continuedFlag$VariableFormField.useAssignedValue( 0 );
				}
				// Print xyzRP1FormGroup.OrderLine;
				xyzRP1FormGroup$OrderLine.print();
				// lineCount = lineCount + 2;
				ezeProgram.lineCount = com.ibm.javart.operations.AssignToSmallint.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.lineCount, (short)2 ) );
			}
		}
		// Print xyzRP1FormGroup.Trailer;
		xyzRP1FormGroup$Trailer.print();
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initxyzReportProgram( xyzReportProgram ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// lineCount = 0;
		ezeProgram.lineCount = (short)(short)0;
		// maxBodyLines = 60;
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
