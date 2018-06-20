// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt2.custdetail;

public class xyzCustDetailProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final xyzCustDetailProgram ezeProgram;
	public egltui.zzz.common.xyzTransferData transferData;
	public egltui.data.Customer customer;
	public egltui.StatusRec status;
	public int i;
	public int size;
	public egltui.opt2.custdetail.xyzCD1FormGroup xyzCD1FormGroup;
	public egltui.access.CustomerLib_Lib egltui__access__CustomerLib;
	public egltui.opt2.custdetail.xyzCD1FormGroup$custDetail xyzCD1FormGroup$custDetail;
	
	public xyzCustDetailProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "xyzCustDetailProgram", "xyzCustDetailProgram", ru, false, true, 0 );
		ezeProgram = this;
		xyzCD1FormGroup = new egltui.opt2.custdetail.xyzCD1FormGroup( "xyzCD1FormGroup" );
		egltui__access__CustomerLib = (egltui.access.CustomerLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.access.CustomerLib_Lib" );
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		com.ibm.javart.forms.common.Utility.setApp( this );
		xyzCD1FormGroup$custDetail = new egltui.opt2.custdetail.xyzCD1FormGroup$custDetail(ezeProgram, "xyzCD1FormGroup$custDetail" );
		xyzCD1FormGroup$custDetail.setFormGroup(xyzCD1FormGroup);
		transferData = new egltui.zzz.common.xyzTransferData( "transferData", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/zzz/common/xyzTransferData;" );
		customer = new egltui.data.Customer( "customer", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
		status = new egltui.StatusRec( "status", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/StatusRec;" );
		i = 0;
		size = 0;
		$initxyzCustDetailProgram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "xyzCustDetailProgram", "egltui/opt2/custdetail/xyzCustDetailProgram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new xyzCustDetailProgram( ru ) );
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
		_funcPush( "Main" );
		
		// initialize();
		$func_initialize();
		// IF ( transferData.CustomerId > 0 )
		if ( (ezeProgram.transferData.CustomerId.getValue() > (short)0) )
		{
			// customer.CustomerId = transferData.CustomerId;
			ezeProgram.customer.CustomerId.setValue( ezeProgram.transferData.CustomerId.getValue() );
			// ActionSelect();
			$func_ActionSelect();
		}
		// converseForm();
		$func_converseForm();
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_initialize() throws java.lang.Exception
	{
		_funcPush( "initialize" );
		
		// xyzCD1FormGroup.custDetail.screenName = "xyzCD1";
		xyzCD1FormGroup$custDetail.screenName.setValue( "xyzCD1" );
		xyzCD1FormGroup$custDetail.screenName$VariableFormField.useAssignedValue( 0 );
		// xyzCD1FormGroup.custDetail.screenDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.screenDate, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ) );
		xyzCD1FormGroup$custDetail.screenDate$VariableFormField.useAssignedValue( 0 );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_converseForm() throws java.lang.Exception
	{
		_funcPush( "converseForm" );
		
		// While ( ConverseVar.eventKey NOT PF3 && ConverseVar.eventKey NOT PF2 )
		while ( ( !( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF3() ) && !( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF2() ) ) )
		{
			// Converse xyzCD1FormGroup.custDetail;
			xyzCD1FormGroup$custDetail.converse();
			// Case
			// IF ( ConverseVar.eventKey IS Enter )
			if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isEnter() )
			{
				// Case ( xyzCD1FormGroup.custDetail.Action )
				// IF ( xyzCD1FormGroup.custDetail.Action == "S" )
				if ( (com.ibm.javart.operations.Compare.run( ezeProgram, xyzCD1FormGroup$custDetail.Action, "S", 1 ) == 0) )
				{
					// IF ( xyzCD1FormGroup.custDetail.CustomerId > 0 )
					if ( (xyzCD1FormGroup$custDetail.CustomerId.getValue() > (short)0) )
					{
						// customer.CustomerId = xyzCD1FormGroup.custDetail.CustomerId;
						ezeProgram.customer.CustomerId.setValue( xyzCD1FormGroup$custDetail.CustomerId.getValue() );
						// ActionSelect();
						$func_ActionSelect();
					}
					else
					{
						// xyzCD1FormGroup.custDetail.formMSG = "CustomerID <= 0";
						xyzCD1FormGroup$custDetail.formMSG.setValue( "CustomerID <= 0" );
						xyzCD1FormGroup$custDetail.formMSG$VariableFormField.useAssignedValue( 0 );
					}
				}
				else
				{
					// xyzCD1FormGroup.custDetail.formMSG = "Action not supported yet";
					xyzCD1FormGroup$custDetail.formMSG.setValue( "Action not supported yet" );
					xyzCD1FormGroup$custDetail.formMSG$VariableFormField.useAssignedValue( 0 );
				}
			}
			else
			{
				// IF ( ConverseVar.eventKey IS PF4 )
				if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF4() )
				{
					// transferData.CustomerId = 0;
					ezeProgram.transferData.CustomerId.setValue( (short)0 );
					// Transfer to Program xyzCustListProgram Passing transferData;
					com.ibm.javart.forms.tui.Tui3270Screen.getDisplay().clearScreen();
					ezeProgram._transferToProgram( "egltui.opt1.custlist.xyzCustListProgram", ezeProgram.transferData );
				}
				else
				{
					// xyzCD1FormGroup.custDetail.formMSG = "Please set an action code";
					xyzCD1FormGroup$custDetail.formMSG.setValue( "Please set an action code" );
					xyzCD1FormGroup$custDetail.formMSG$VariableFormField.useAssignedValue( 0 );
				}
			}
		}
		// Case ( ConverseVar.eventKey )
		// IF ( ConverseVar.eventKey IS PF2 )
		if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF2() )
		{
			// transferData.CustomerId = 0;
			ezeProgram.transferData.CustomerId.setValue( (short)0 );
			// Transfer to Program xyzMenuProgram Passing transferData;
			com.ibm.javart.forms.tui.Tui3270Screen.getDisplay().clearScreen();
			ezeProgram._transferToProgram( "egltui.menu.xyzMenuProgram", ezeProgram.transferData );
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
	
	public void $func_ActionSelect() throws java.lang.Exception
	{
		_funcPush( "ActionSelect" );
		
		// CustomerLib.GetCustomer(customer, status);
		ezeProgram.egltui__access__CustomerLib.$func_GetCustomer( ezeProgram.customer, ezeProgram.status );
		// IF ( status.succeeded )
		if ( ezeProgram.status.succeeded.getValue() )
		{
			// xyzCD1FormGroup.custDetail.CustomerId = customer.CustomerId;
			xyzCD1FormGroup$custDetail.CustomerId.setValue( ezeProgram.customer.CustomerId.getValue() );
			xyzCD1FormGroup$custDetail.CustomerId$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.FirstName = customer.FirstName;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.FirstName, ezeProgram.customer.FirstName );
			xyzCD1FormGroup$custDetail.FirstName$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.LastName = customer.LastName;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.LastName, ezeProgram.customer.LastName );
			xyzCD1FormGroup$custDetail.LastName$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.Password = customer.Password;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.Password, ezeProgram.customer.Password );
			xyzCD1FormGroup$custDetail.Password$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.Phone = customer.Phone;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.Phone, ezeProgram.customer.Phone );
			xyzCD1FormGroup$custDetail.Phone$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.EmailAddress = customer.EmailAddress;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.EmailAddress, ezeProgram.customer.EmailAddress );
			xyzCD1FormGroup$custDetail.EmailAddress$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.Street = customer.Street;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.Street, ezeProgram.customer.Street );
			xyzCD1FormGroup$custDetail.Street$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.Apartment = customer.Apartment;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.Apartment, ezeProgram.customer.Apartment );
			xyzCD1FormGroup$custDetail.Apartment$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.City = customer.City;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.City, ezeProgram.customer.City );
			xyzCD1FormGroup$custDetail.City$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.State = customer.State;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.State, ezeProgram.customer.State );
			xyzCD1FormGroup$custDetail.State$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.Postalcode = customer.Postalcode;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.Postalcode, ezeProgram.customer.Postalcode );
			xyzCD1FormGroup$custDetail.Postalcode$VariableFormField.useAssignedValue( 0 );
			// xyzCD1FormGroup.custDetail.Directions = customer.Directions;
			com.ibm.javart.operations.Assign.run( ezeProgram, xyzCD1FormGroup$custDetail.Directions, ezeProgram.customer.Directions );
			xyzCD1FormGroup$custDetail.Directions$VariableFormField.useAssignedValue( 0 );
		}
		else
		{
			// xyzCD1FormGroup.custDetail.formMSG = "Problem retrieving data";
			xyzCD1FormGroup$custDetail.formMSG.setValue( "Problem retrieving data" );
			xyzCD1FormGroup$custDetail.formMSG$VariableFormField.useAssignedValue( 0 );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initxyzCustDetailProgram( xyzCustDetailProgram ezeProgram ) throws java.lang.Exception
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
