// Generated at Mon Jun 11 21:44:46 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.allcustomers;

public class allCustomersProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final allCustomersProgram ezeProgram;
	public com.ibm.javart.ref.ContainerArrayRef customers;
	public egltui.data.Customer customer;
	public egltui.StatusRec status;
	public int i;
	public int size;
	public com.ibm.javart.CharValue startingName;
	public egltui.allcustomers.allCustomersFormGroup allCustomersFormGroup;
	public egltui.access.CustomerLib_Lib egltui__access__CustomerLib;
	public egltui.allcustomers.allCustomersFormGroup$custList allCustomersFormGroup$custList;
	
	public allCustomersProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "allCustomersProgram", "allCustomersProgram", ru, false, true, 0 );
		ezeProgram = this;
		allCustomersFormGroup = new egltui.allcustomers.allCustomersFormGroup( "allCustomersFormGroup" );
		egltui__access__CustomerLib = (egltui.access.CustomerLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.access.CustomerLib_Lib" );
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		com.ibm.javart.forms.common.Utility.setApp( this );
		allCustomersFormGroup$custList = new egltui.allcustomers.allCustomersFormGroup$custList(ezeProgram, "allCustomersFormGroup$custList" );
		allCustomersFormGroup$custList.setFormGroup(allCustomersFormGroup);
		customers = new com.ibm.javart.ref.ContainerArrayRef( "customers", null, "1Tegltui/data/Customer;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "customers", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Customer;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new egltui.data.Customer( "customers", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
					};
				};
			}
		};
		customer = new egltui.data.Customer( "customer", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
		status = new egltui.StatusRec( "status", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/StatusRec;" );
		i = 0;
		size = 0;
		startingName = new com.ibm.javart.CharItem( "startingName", com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, "C20;" );
		$initallCustomersProgram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "allCustomersProgram", "egltui/allcustomers/allCustomersProgram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new allCustomersProgram( ru ) );
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
		_funcPush( "Main" );
		
		// initialize();
		$func_initialize();
		// CustomerLib.GetCustomerListAll(customers, status);
		ezeProgram.egltui__access__CustomerLib.$func_GetCustomerListAll__0$T14ace9d72( ezeProgram.customers.update( com.ibm.javart.ref.Null.NULL ), ezeProgram.status );
		// movetoform();
		$func_movetoform();
		// converseForm();
		$func_converseForm();
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_initialize() throws java.lang.Exception
	{
		_funcPush( "initialize" );
		
		// allCustomersFormGroup.custList.screenName = "AllCust";
		allCustomersFormGroup$custList.screenName.setValue( "AllCust" );
		allCustomersFormGroup$custList.screenName$VariableFormField.useAssignedValue( 0 );
		// allCustomersFormGroup.custList.screenDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.Assign.run( ezeProgram, allCustomersFormGroup$custList.screenDate, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ) );
		allCustomersFormGroup$custList.screenDate$VariableFormField.useAssignedValue( 0 );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_movetoform() throws java.lang.Exception
	{
		_funcPush( "movetoform" );
		
		// size = customers.getSize();
		ezeProgram.size = ezeProgram.customers.checkedValue( ezeProgram ).getSize( ezeProgram );
		// IF ( size > 15 )
		if ( (ezeProgram.size > (short)15) )
		{
			// size = 15;
			ezeProgram.size = (short)15;
		}
		// for ( i From 1 To size Increment 1 )
		ezeProgram.i = (short)1;
		for ( ; (ezeProgram.i <= ezeProgram.size); ezeProgram.i++ )
		{
			// allCustomersFormGroup.custList.firstName[i] = customers[i].FirstName;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.firstName.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).FirstName );
			allCustomersFormGroup$custList.firstName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// allCustomersFormGroup.custList.lastName[i] = customers[i].LastName;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.lastName.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).LastName );
			allCustomersFormGroup$custList.lastName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// allCustomersFormGroup.custList.state[i] = customers[i].State;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.state.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).State );
			allCustomersFormGroup$custList.state$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// allCustomersFormGroup.custList.city[i] = customers[i].City;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.city.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).City );
			allCustomersFormGroup$custList.city$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
		}
		// for ( i From size + 1 To 15 Increment 1 )
		ezeProgram.i = com.ibm.javart.operations.AssignToInt.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.size, (short)1 ) );
		for ( ; (ezeProgram.i <= (short)15); ezeProgram.i++ )
		{
			// allCustomersFormGroup.custList.firstName[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.firstName.value(), ezeProgram.i ) );
			allCustomersFormGroup$custList.firstName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// allCustomersFormGroup.custList.lastName[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.lastName.value(), ezeProgram.i ) );
			allCustomersFormGroup$custList.lastName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// allCustomersFormGroup.custList.state[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.state.value(), ezeProgram.i ) );
			allCustomersFormGroup$custList.state$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// allCustomersFormGroup.custList.city[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, allCustomersFormGroup$custList.city.value(), ezeProgram.i ) );
			allCustomersFormGroup$custList.city$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
		}
		// allCustomersFormGroup.custList.StartName = "";
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, allCustomersFormGroup$custList.StartName );
		allCustomersFormGroup$custList.StartName$VariableFormField.useAssignedValue( 0 );
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
			// Converse allCustomersFormGroup.custList;
			allCustomersFormGroup$custList.converse();
			// Case
			// IF ( ConverseVar.eventKey IS Enter )
			if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isEnter() )
			{
				// IF ( allCustomersFormGroup.custList.StartName != "" )
				if ( (com.ibm.javart.operations.Compare.run( ezeProgram, allCustomersFormGroup$custList.StartName, "", 0 ) != 0) )
				{
					// startingName = allCustomersFormGroup.custList.startName;
					com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.startingName, allCustomersFormGroup$custList.StartName );
					// CustomerLib.GetCustomerListStartName(startingName, customers, status);
					ezeProgram.egltui__access__CustomerLib.$func_GetCustomerListStartName__1$T14ace9d72( ezeProgram.startingName, ezeProgram.customers.update( com.ibm.javart.ref.Null.NULL ), ezeProgram.status );
					// IF ( status.succeeded )
					if ( ezeProgram.status.succeeded.getValue() )
					{
						// movetoform();
						$func_movetoform();
					}
					else
					{
						// allCustomersFormGroup.custList.formMSG = "Problem retrieving data";
						allCustomersFormGroup$custList.formMSG.setValue( "Problem retrieving data" );
						allCustomersFormGroup$custList.formMSG$VariableFormField.useAssignedValue( 0 );
					}
				}
				else
				{
					// allCustomersFormGroup.custList.formMSG = "Please enter a few characters of the last name";
					allCustomersFormGroup$custList.formMSG.setValue( "Please enter a few characters of the last name" );
					allCustomersFormGroup$custList.formMSG$VariableFormField.useAssignedValue( 0 );
				}
			}
			else
			{
				// allCustomersFormGroup.custList.formMSG = "Please enter a few characters of the last name";
				allCustomersFormGroup$custList.formMSG.setValue( "Please enter a few characters of the last name" );
				allCustomersFormGroup$custList.formMSG$VariableFormField.useAssignedValue( 0 );
			}
		}
		// Case ( ConverseVar.eventKey )
		// IF ( ConverseVar.eventKey IS PF3 )
		if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF3() )
		{
			// exit program;
			ezeProgram._runUnit().exitProgram();
		}
		else
		{
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initallCustomersProgram( allCustomersProgram ezeProgram ) throws java.lang.Exception
	{
		egl__vg__VGVar.handleOverflow.setValue(1);
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// linesOnScreen = 15;
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
