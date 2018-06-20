// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui;

public class ConditionHandlingLib_Lib extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final ConditionHandlingLib_Lib ezeProgram;
	public com.ibm.javart.IntValue InvalidDBRecord;
	public com.ibm.javart.IntValue DBRecordNotFound;
	public com.ibm.javart.IntValue RuntimeError;
	public com.ibm.javart.IntValue DataAccessException;
	public com.ibm.javart.StringValue InvalidDBRecordMessage;
	public com.ibm.javart.StringValue DBRecordNotFoundMessage;
	public com.ibm.javart.BooleanValue loaded;
	
	public ConditionHandlingLib_Lib( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "ConditionHandlingLib_Lib", "ConditionHandlingLib", ru, false, true, 7 );
		ezeProgram = this;
		_runUnit().addLibrary( "egltui.ConditionHandlingLib_Lib", this );
		InvalidDBRecord = new com.ibm.javart.IntItem( "InvalidDBRecord", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		DBRecordNotFound = new com.ibm.javart.IntItem( "DBRecordNotFound", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		RuntimeError = new com.ibm.javart.IntItem( "RuntimeError", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		DataAccessException = new com.ibm.javart.IntItem( "DataAccessException", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		InvalidDBRecordMessage = new com.ibm.javart.StringItem( "InvalidDBRecordMessage", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		DBRecordNotFoundMessage = new com.ibm.javart.StringItem( "DBRecordNotFoundMessage", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		loaded = new com.ibm.javart.BooleanItem( "loaded", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		$initConditionHandlingLib_Lib( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return false;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return false;
	}
	protected void _initUnsavedFields() throws java.lang.Exception
	{
		super._initUnsavedFields();
		// InvalidDBRecordMessage = null;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.InvalidDBRecordMessage, com.ibm.javart.ref.Null.NULL );
		// DBRecordNotFoundMessage = null;
		com.ibm.javart.operations.Assign.run( ezeProgram, ezeProgram.DBRecordNotFoundMessage, com.ibm.javart.ref.Null.NULL );
		// InvalidDBRecord = 1;
		ezeProgram.InvalidDBRecord.setValue( (short)1 );
		// DBRecordNotFound = 2;
		ezeProgram.DBRecordNotFound.setValue( (short)2 );
		// RuntimeError = 3;
		ezeProgram.RuntimeError.setValue( (short)3 );
		// DataAccessException = 4;
		ezeProgram.DataAccessException.setValue( (short)4 );
		// loaded = LoadMessages();
		ezeProgram.loaded.setValue( $func_LoadMessages().getValue() );
		// RETURN
	}
	
	
	public com.ibm.javart.BooleanValue $func_LoadMessages() throws java.lang.Exception
	{
		_funcPush( "LoadMessages" );
		com.ibm.javart.BooleanValue $result = new com.ibm.javart.BooleanItem( "BOOLEAN", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		
		// InvalidDBRecordMessage = "Invalid Record cannot be added to database";
		ezeProgram.InvalidDBRecordMessage.setValue( "Invalid Record cannot be added to database" );
		// DBRecordNotFoundMessage = "Database record in table {1} was not found";
		ezeProgram.DBRecordNotFoundMessage.setValue( "Database record in table {1} was not found" );
		// RETURN true
		// $result = true;
		$result.setValue( true );
		_funcPop();
		return $result;
	}
	
	public void $func_HandleSuccess( egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "HandleSuccess" );
		
		// status.succeeded = true;
		status.succeeded.setValue( true );
		// status.statusCode = 0;
		com.ibm.javart.operations.Assign.run( ezeProgram, status.statusCode, (short)0 );
		// status.message = "SQL call succeeded";
		com.ibm.javart.operations.Assign.run( ezeProgram, status.message, "SQL call succeeded" );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_HandleException( egltui.StatusRec status, egl.io.sql.SQLException_Ref exception ) throws java.lang.Exception
	{
		_funcPush( "HandleException" );
		
		// status.succeeded = false;
		status.succeeded.setValue( false );
		// status.statusCode = DataAccessException;
		com.ibm.javart.operations.Assign.run( ezeProgram, status.statusCode, ezeProgram.DataAccessException );
		// status.message = exception.message;
		com.ibm.javart.operations.Assign.run( ezeProgram, status.message, exception.checkedValue( ezeProgram ).message );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_HandleInvalidDBRecord( egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "HandleInvalidDBRecord" );
		
		// status.succeeded = false;
		status.succeeded.setValue( false );
		// status.statusCode = InvalidDBRecord;
		com.ibm.javart.operations.Assign.run( ezeProgram, status.statusCode, ezeProgram.InvalidDBRecord );
		// status.message = InvalidDBRecordMessage;
		com.ibm.javart.operations.Assign.run( ezeProgram, status.message, ezeProgram.InvalidDBRecordMessage );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_HandleDBRecordNotFound( egltui.StatusRec status, com.ibm.javart.StringValue tableName ) throws java.lang.Exception
	{
		_funcPush( "HandleDBRecordNotFound" );
		
		// inserts STRING[0];
		com.ibm.javart.ref.StringArrayRef inserts = new com.ibm.javart.ref.StringArrayRef( "inserts", new com.ibm.javart.arrays.StringArray( "inserts", ezeProgram, 0, 10, Integer.MAX_VALUE, com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING_ARRAY ), com.ibm.javart.Constants.SIGNATURE_STRING_ARRAY );
		// inserts.appendElement(tableName);
		inserts.checkedValue( ezeProgram ).appendElement( ezeProgram, com.ibm.javart.operations.Assign.run( ezeProgram, inserts.value().makeNewElement( ezeProgram ), tableName ) );
		// status.succeeded = false;
		status.succeeded.setValue( false );
		// status.statusCode = DBRecordNotFound;
		com.ibm.javart.operations.Assign.run( ezeProgram, status.statusCode, ezeProgram.DBRecordNotFound );
		// status.message = bindMessage(DBRecordNotFoundMessage, inserts);
		com.ibm.javart.operations.Assign.run( ezeProgram, status.message, $func_bindMessage( com.ibm.javart.operations.Assign.run( ezeProgram, new com.ibm.javart.StringItem( "message", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ), ezeProgram.DBRecordNotFoundMessage ), new com.ibm.javart.ref.StringArrayRef( "inserts", null, com.ibm.javart.Constants.SIGNATURE_STRING_ARRAY ).update( inserts.value() ) ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public com.ibm.javart.StringValue $func_bindMessage( com.ibm.javart.StringValue message, com.ibm.javart.ref.StringArrayRef inserts ) throws java.lang.Exception
	{
		_funcPush( "bindMessage" );
		com.ibm.javart.StringValue $result = new com.ibm.javart.StringItem( "STRING", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		
		// value STRING;
		java.lang.String value = "";
		// value = message;
		value = message.getValue();
		// insertLength INT;
		int insertLength = 0;
		// insertLength = sizeOf(inserts);
		insertLength = com.ibm.javart.operations.AssignToInt.run( ezeProgram, ezeProgram.egl__core__SysLib.size( ezeProgram, inserts.checkedValue( ezeProgram ) ) );
		// messageLength INT;
		int messageLength = 0;
		// i, index, remainder INT;
		int i = 0;
		int index = 0;
		int remainder = 0;
		// for ( i From 1 To insertLength Increment 1 )
		i = (short)1;
		for ( ; (i <= insertLength); i++ )
		{
			// messageLength = StrLib.characterLen(value);
			messageLength = ezeProgram.egl__core__StrLib.characterLen( ezeProgram, value );
			// temp STRING;
			java.lang.String temp = "";
			// substring STRING;
			java.lang.String substring = "";
			// substring = "{" + i + "}";
			substring = (("{" + com.ibm.javart.operations.ConcatValue.run( ezeProgram, i )) + "}");
			// index = StrLib.indexOf(value, substring);
			index = ezeProgram.egl__core__StrLib.indexOf( ezeProgram, value, substring );
			// IF ( index > 0 )
			if ( (index > (short)0) )
			{
				// IF ( index > 1 )
				if ( (index > (short)1) )
				{
					// temp = message[1:index - 1];
					temp = com.ibm.javart.operations.Substring.run( ezeProgram, message, (short)1, com.ibm.javart.operations.ConvertToInt.run( ezeProgram, com.ibm.javart.operations.Subtract.run( ezeProgram, index, (short)1 ) ) );
				}
				// temp = temp + inserts[i];
				temp = (temp + com.ibm.javart.operations.ConcatValue.run( ezeProgram, com.ibm.javart.operations.Subscript.run( ezeProgram, inserts.checkedValue( ezeProgram ), i ) ));
				// remainder = index + StrLib.characterLen(substring);
				remainder = com.ibm.javart.operations.AssignToInt.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, index, ezeProgram.egl__core__StrLib.characterLen( ezeProgram, substring ) ) );
				// IF ( remainder < messageLength )
				if ( (remainder < messageLength) )
				{
					// temp = temp + value[remainder:messageLength];
					temp = (temp + com.ibm.javart.operations.Substring.run( ezeProgram, value, remainder, messageLength ));
				}
				// value = temp;
				value = temp;
			}
		}
		// RETURN value
		// $result = value;
		$result.setValue( value );
		_funcPop();
		return $result;
	}
	
	public void $initConditionHandlingLib_Lib( ConditionHandlingLib_Lib ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// InvalidDBRecord = 1;
		ezeProgram.InvalidDBRecord.setValue( (short)1 );
		// DBRecordNotFound = 2;
		ezeProgram.DBRecordNotFound.setValue( (short)2 );
		// RuntimeError = 3;
		ezeProgram.RuntimeError.setValue( (short)3 );
		// DataAccessException = 4;
		ezeProgram.DataAccessException.setValue( (short)4 );
		// loaded = LoadMessages();
		ezeProgram.loaded.setValue( $func_LoadMessages().getValue() );
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
