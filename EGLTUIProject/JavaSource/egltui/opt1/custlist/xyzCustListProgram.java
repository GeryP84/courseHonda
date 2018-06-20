// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.opt1.custlist;

public class xyzCustListProgram extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final xyzCustListProgram ezeProgram;
	public egltui.zzz.common.xyzTransferData transferData;
	public com.ibm.javart.ref.ContainerArrayRef customers;
	public egltui.StatusRec status;
	public int i;
	public int size;
	public com.ibm.javart.CharValue startingName;
	public egltui.opt1.custlist.xyzCL1FormGroup xyzCL1FormGroup;
	public egltui.access.CustomerLib_Lib egltui__access__CustomerLib;
	public egltui.opt1.custlist.xyzCL1FormGroup$custList xyzCL1FormGroup$custList;
	
	public xyzCustListProgram( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "xyzCustListProgram", "xyzCustListProgram", ru, false, true, 0 );
		ezeProgram = this;
		xyzCL1FormGroup = new egltui.opt1.custlist.xyzCL1FormGroup( "xyzCL1FormGroup" );
		egltui__access__CustomerLib = (egltui.access.CustomerLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.access.CustomerLib_Lib" );
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		com.ibm.javart.forms.common.Utility.setApp( this );
		xyzCL1FormGroup$custList = new egltui.opt1.custlist.xyzCL1FormGroup$custList(ezeProgram, "xyzCL1FormGroup$custList" );
		xyzCL1FormGroup$custList.setFormGroup(xyzCL1FormGroup);
		transferData = new egltui.zzz.common.xyzTransferData( "transferData", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/zzz/common/xyzTransferData;" );
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
		status = new egltui.StatusRec( "status", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/StatusRec;" );
		i = 0;
		size = 0;
		startingName = new com.ibm.javart.CharItem( "startingName", com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, "C20;" );
		$initxyzCustListProgram( this );
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
		return new com.ibm.javart.resources.StartupInfo( "xyzCustListProgram", "egltui/opt1/custlist/xyzCustListProgram.properties", false );
	}
	public static void main( String[] args ) throws java.lang.Exception
	{
		com.ibm.javart.resources.StartupInfo info = _startupInfo();
		info.setArgs( args );
		com.ibm.javart.resources.RunUnit ru = new com.ibm.javart.resources.RunUnit( info );
		ru.start( new xyzCustListProgram( ru ) );
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
		
		// xyzCL1FormGroup.custList.screenName = "xyzCL1";
		xyzCL1FormGroup$custList.screenName.setValue( "xyzCL1" );
		xyzCL1FormGroup$custList.screenName$VariableFormField.useAssignedValue( 0 );
		// xyzCL1FormGroup.custList.screenDate = DateTimeLib.currentDate();
		com.ibm.javart.operations.Assign.run( ezeProgram, xyzCL1FormGroup$custList.screenDate, ezeProgram.egl__core__DateTimeLib.currentDate( ezeProgram ) );
		xyzCL1FormGroup$custList.screenDate$VariableFormField.useAssignedValue( 0 );
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
			// xyzCL1FormGroup.custList.firstName[i] = customers[i].FirstName;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.firstName.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).FirstName );
			xyzCL1FormGroup$custList.firstName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// xyzCL1FormGroup.custList.lastName[i] = customers[i].LastName;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.lastName.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).LastName );
			xyzCL1FormGroup$custList.lastName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// xyzCL1FormGroup.custList.state[i] = customers[i].State;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.state.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).State );
			xyzCL1FormGroup$custList.state$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// xyzCL1FormGroup.custList.city[i] = customers[i].City;
			com.ibm.javart.operations.Assign.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.city.value(), ezeProgram.i ), ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).City );
			xyzCL1FormGroup$custList.city$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
		}
		// for ( i From size + 1 To 15 Increment 1 )
		ezeProgram.i = com.ibm.javart.operations.AssignToInt.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, ezeProgram.size, (short)1 ) );
		for ( ; (ezeProgram.i <= (short)15); ezeProgram.i++ )
		{
			// xyzCL1FormGroup.custList.firstName[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.firstName.value(), ezeProgram.i ) );
			xyzCL1FormGroup$custList.firstName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// xyzCL1FormGroup.custList.lastName[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.lastName.value(), ezeProgram.i ) );
			xyzCL1FormGroup$custList.lastName$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// xyzCL1FormGroup.custList.state[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.state.value(), ezeProgram.i ) );
			xyzCL1FormGroup$custList.state$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
			// xyzCL1FormGroup.custList.city[i] = "";
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, xyzCL1FormGroup$custList.city.value(), ezeProgram.i ) );
			xyzCL1FormGroup$custList.city$VariableFormField.useAssignedValue( ezeProgram.i - 1 );
		}
		// xyzCL1FormGroup.custList.StartName = "";
		com.ibm.javart.operations.SetEmpty.run( ezeProgram, xyzCL1FormGroup$custList.StartName );
		xyzCL1FormGroup$custList.StartName$VariableFormField.useAssignedValue( 0 );
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
			// Converse xyzCL1FormGroup.custList;
			xyzCL1FormGroup$custList.converse();
			// Case
			// IF ( ConverseVar.eventKey IS Enter )
			if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isEnter() )
			{
				// IF ( xyzCL1FormGroup.custList.StartName != "" )
				if ( (com.ibm.javart.operations.Compare.run( ezeProgram, xyzCL1FormGroup$custList.StartName, "", 0 ) != 0) )
				{
					// startingName = xyzCL1FormGroup.custList.startName;
					com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.startingName, xyzCL1FormGroup$custList.StartName );
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
						// xyzCL1FormGroup.custList.formMSG = "Problem retrieving data";
						xyzCL1FormGroup$custList.formMSG.setValue( "Problem retrieving data" );
						xyzCL1FormGroup$custList.formMSG$VariableFormField.useAssignedValue( 0 );
					}
				}
				else
				{
					// xyzCL1FormGroup.custList.formMSG = "Please enter a few characters of the last name";
					xyzCL1FormGroup$custList.formMSG.setValue( "Please enter a few characters of the last name" );
					xyzCL1FormGroup$custList.formMSG$VariableFormField.useAssignedValue( 0 );
				}
			}
			else
			{
				// IF ( ConverseVar.eventKey IS PF5 )
				if ( ezeProgram.egl__ui__text__ConverseVar.EZEAID.isPF5() )
				{
					// i = 1;
					ezeProgram.i = (short)1;
					// While ( i <= 15 )
					while ( (ezeProgram.i <= (short)15) )
					{
						// IF ( xyzCL1FormGroup.custList.lastName[i] IS cursor )
						if ( xyzCL1FormGroup$custList.lastName$VariableFormField.isCurrentInForm( ezeProgram.i - 1 ) )
						{
							// transferData.CustomerId = customers[i].customerID;
							ezeProgram.transferData.CustomerId.setValue( ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.customers.checkedValue( ezeProgram ), ezeProgram.i )).CustomerId.getValue() );
							// Transfer to Program xyzCustDetailProgram Passing transferData;
							com.ibm.javart.forms.tui.Tui3270Screen.getDisplay().clearScreen();
							ezeProgram._transferToProgram( "egltui.opt2.custdetail.xyzCustDetailProgram", ezeProgram.transferData );
						}
						else
						{
							// i = i + 1;
							ezeProgram.i++;
						}
					}
				}
				else
				{
					// xyzCL1FormGroup.custList.formMSG = "Please enter a few characters of the last name";
					xyzCL1FormGroup$custList.formMSG.setValue( "Please enter a few characters of the last name" );
					xyzCL1FormGroup$custList.formMSG$VariableFormField.useAssignedValue( 0 );
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
	
	public void $initxyzCustListProgram( xyzCustListProgram ezeProgram ) throws java.lang.Exception
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
