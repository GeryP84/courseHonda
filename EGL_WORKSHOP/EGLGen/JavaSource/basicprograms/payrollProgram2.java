// Generated at Mon Jun 11 17:12:55 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package basicprograms;

public class payrollProgram2 extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final payrollProgram2 ezeProgram;
	public basicprograms.empRec2 empRecin;
	public basicprograms.empRec2 empRecout;
	public com.ibm.javart.ref.ContainerArrayRef empRecArray;
	
	public payrollProgram2( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "payrollProgram2", "payrollProgram2", ru, false, true, 6 );
		ezeProgram = this;
		egl__core__DateTimeLib = (egl.core.DateTimeLib_Lib)ezeProgram._runUnit().loadLibrary( "egl.core.DateTimeLib_Lib" );
		empRecin = new basicprograms.empRec2( "empRecin", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, false, "TbasicPrograms/empRec2;" );
		empRecout = new basicprograms.empRec2( "empRecout", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, false, "TbasicPrograms/empRec2;" );
		empRecArray = new com.ibm.javart.ref.ContainerArrayRef( "empRecArray", new com.ibm.javart.arrays.ContainerArray( "empRecArray", ezeProgram, 0, 10, Integer.MAX_VALUE, "1TbasicPrograms/empRec2;" )
		{
			private static final long serialVersionUID = 70L;
			
			public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				return new basicprograms.empRec2( "empRecArray", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "TbasicPrograms/empRec2;" );
			};
		}, "1TbasicPrograms/empRec2;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "empRecArray", ezeProgram, 0, 10, Integer.MAX_VALUE, "1TbasicPrograms/empRec2;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new basicprograms.empRec2( "empRecArray", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "TbasicPrograms/empRec2;" );
					};
				};
			}
		};
		$initpayrollProgram2( this );
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
		return new com.ibm.javart.resources.StartupInfo( "payrollProgram2", "basicprograms/payrollProgram2.properties", false );
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
	public static payrollProgram2 _libraryCallInstance( com.ibm.javart.resources.RunUnit ezeRU ) throws java.lang.Exception
	{
		payrollProgram2 eze = (payrollProgram2)ezeRU.getLibrary( "basicprograms.payrollProgram2" );
		if ( eze == null )
		{
			eze = new payrollProgram2( ezeRU );
			ezeRU.addLibrary( "basicprograms.payrollProgram2", eze );
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
		// simpleIfElse();
		$func_simpleIfElse();
		// compoundIfElse();
		$func_compoundIfElse();
		// inTest();
		$func_inTest();
		// forLoop();
		$func_forLoop();
		// whileLoopMatches();
		$func_whileLoopMatches();
		// ret INT;
		int ret = 0;
		// ret = continueExitReturn();
		ret = $func_continueExitReturn();
		// SysLib.writeStdout(ret);
		System.out.println( ret );
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// exceptionRef();
			$func_exceptionRef();
		}
		catch ( egl.core.IndexOutOfBoundsException_Ex eze$Temp5 )
		{
			egl.core.IndexOutOfBoundsException_Ref exception = new egl.core.IndexOutOfBoundsException_Ref( "exception", (egl.core.IndexOutOfBoundsException)eze$Temp5.getRecord() );
			// SysLib.writeStdout(exception.messageID);
			System.out.println( exception.checkedValue( ezeProgram ).messageID.getValue() );
			// SysLib.writeStdout(exception.message);
			System.out.println( exception.checkedValue( ezeProgram ).message.getValue() );
		}
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
	
	public void $func_simpleIfElse() throws java.lang.Exception
	{
		_funcPush( "simpleIfElse" );
		
		// IF ( empRecArray[1].pay.grossPay > empRecArray[2].pay.grossPay )
		if ( (com.ibm.javart.operations.CompareStruct.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__grossPay, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)2 )).pay__grossPay, -1 ) > 0) )
		{
			// SysLib.writeStdout("1's grossPay > 2's");
			System.out.println( "1's grossPay > 2's" );
		}
		else
		{
			// SysLib.writeStdout("2's grossPay > 1's");
			System.out.println( "2's grossPay > 1's" );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_compoundIfElse() throws java.lang.Exception
	{
		_funcPush( "compoundIfElse" );
		
		// IF ( empRecArray[1].emp.partTimeInd == 1 && empRecArray[1].pay.netPay < 100000 || empRecArray[1].pay.ytdFedTax > 50000 )
		if ( ( ( (com.ibm.javart.operations.Compare.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).emp__partTimeInd, (short)1, 1 ) == 0) && (com.ibm.javart.operations.Compare.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__netPay, 100000, 1 ) < 0) ) || (com.ibm.javart.operations.Compare.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__ytdFedTax, 50000, -1 ) > 0) ) )
		{
			// empRecArray[1].pay.ytdGrossPay = empRecArray[1].pay.ytdGrossPay + empRecArray[1].pay.netPay;
			com.ibm.javart.operations.Assign.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__ytdGrossPay, com.ibm.javart.operations.Add.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__ytdGrossPay, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__netPay ) );
			// SysLib.writeStdout(empRecArray[1].pay.ytdGrossPay as STRING);
			System.out.println( com.ibm.javart.operations.ConvertToString.run( ezeProgram, ( (com.ibm.javart.StringValue)com.ibm.javart.operations.As.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__ytdGrossPay, new com.ibm.javart.StringItem( "eze$Temp6", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ) ) ) ) );
		}
		else
		{
			// empRecArray[1].pay.ytdGrossPay = empRecArray[1].pay.ytdGrossPay + empRecArray[1].pay.netPay * .8;
			com.ibm.javart.operations.Assign.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__ytdGrossPay, com.ibm.javart.operations.Add.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__ytdGrossPay, com.ibm.javart.operations.Multiply.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)1 )).pay__netPay, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x8, } ), 1 ) ) ) );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_inTest() throws java.lang.Exception
	{
		_funcPush( "inTest" );
		
		// IF ( "Smith" IN empRecArray.emp.lastName )
		if ( $eze$Temp1( com.ibm.javart.operations.Assign.run( ezeProgram, new com.ibm.javart.StringItem( "eze$Temp7", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ), "Smith" ), (short)1 ) )
		{
			// SysLib.writeStdout("Smith is EmpID: " + empRecArray[SysVar.arrayIndex].emp.empId);
			System.out.println( ("Smith is EmpID: " + com.ibm.javart.flat.FlatCharItem.toString( ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), ezeProgram.egl__core__SysVar.arrayIndex.getValue() )).buffer(), ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), ezeProgram.egl__core__SysVar.arrayIndex.getValue() )).emp__empId.getOffset(), 6 )) );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	private boolean $eze$Temp1( com.ibm.javart.StringValue eze$Temp2, int eze$Temp3 ) throws java.lang.Exception
	{
		com.ibm.javart.arrays.ContainerArray $array = ezeProgram.empRecArray.checkedValue( ezeProgram );
		for ( int $size = $array.size(); eze$Temp3 <= $size; eze$Temp3++ )
		{
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, $array, eze$Temp3 )).emp__lastName, eze$Temp2, 1 ) == 0) )
			{
				ezeProgram.egl__core__SysVar.arrayIndex.setValue( eze$Temp3 );
				return true;
			}
		}
		ezeProgram.egl__core__SysVar.arrayIndex.setValue( 0 );
		return false;
	}
	
	public void $func_whileLoopMatches() throws java.lang.Exception
	{
		_funcPush( "whileLoopMatches" );
		
		// i INT;
		int i = 0;
		// i = 1;
		i = (short)1;
		// While ( i < 4 )
		while ( (i < (short)4) )
		{
			// IF ( empRecArray[i].emp.empId MATCHES "[0-9][A-Z][0-9][0-9][0-9][0-9]" )
			if ( com.ibm.javart.operations.Matches.run( ezeProgram, com.ibm.javart.flat.FlatCharItem.toString( ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).buffer(), ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).emp__empId.getOffset(), 6 ), "[0-9][A-Z][0-9][0-9][0-9][0-9]", '\\' ) )
			{
				// SysLib.writeStdout(i as STRING + " " + empRecArray[i].emp.empId);
				System.out.println( ((com.ibm.javart.operations.ConcatValue.run( ezeProgram, ( (com.ibm.javart.StringValue)com.ibm.javart.operations.As.run( ezeProgram, i, new com.ibm.javart.StringItem( "eze$Temp8", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ) ) ) ) + " ") + com.ibm.javart.flat.FlatCharItem.toString( ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).buffer(), ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).emp__empId.getOffset(), 6 )) );
			}
			// i = i + 1;
			i++;
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_forLoop() throws java.lang.Exception
	{
		_funcPush( "forLoop" );
		
		// tmpTot, tmpMax, tmpMin, avg DECIMAL(9,2);
		com.ibm.javart.NumericDecValue tmpTot = new com.ibm.javart.NumericDecItem( "tmpTot", com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d9:2;" );
		com.ibm.javart.NumericDecValue tmpMax = new com.ibm.javart.NumericDecItem( "tmpMax", com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d9:2;" );
		com.ibm.javart.NumericDecValue tmpMin = new com.ibm.javart.NumericDecItem( "tmpMin", com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d9:2;" );
		com.ibm.javart.NumericDecValue avg = new com.ibm.javart.NumericDecItem( "avg", com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d9:2;" );
		// i INT;
		int i = 0;
		// tmpMin = 9999999.99;
		com.ibm.javart.operations.Assign.run( ezeProgram, tmpMin, new java.math.BigDecimal( new java.math.BigInteger( new byte[] { 0x3b, (byte)0x9a, (byte)0xc9, (byte)0xff, } ), 2 ) );
		// sz INT;
		int sz = 0;
		// sz = sizeOf(empRecArray);
		sz = com.ibm.javart.operations.AssignToInt.run( ezeProgram, ezeProgram.egl__core__SysLib.size( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ) ) );
		// for ( i From 1 To sz Increment 1 )
		i = (short)1;
		for ( ; (i <= sz); i++ )
		{
			// IF ( empRecArray[i].pay.grossPay > tmpMax )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).pay__grossPay, tmpMax, -1 ) > 0) )
			{
				// tmpMax = empRecArray[i].pay.grossPay;
				com.ibm.javart.operations.Assign.run( ezeProgram, tmpMax, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).pay__grossPay );
			}
			// IF ( empRecArray[i].pay.grossPay < tmpMin )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).pay__grossPay, tmpMin, 1 ) < 0) )
			{
				// tmpMin = empRecArray[i].pay.grossPay;
				com.ibm.javart.operations.Assign.run( ezeProgram, tmpMin, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).pay__grossPay );
			}
			// tmpTot = tmpTot + empRecArray[i].pay.grossPay;
			com.ibm.javart.operations.Assign.run( ezeProgram, tmpTot, com.ibm.javart.operations.Add.run( ezeProgram, tmpTot, ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), i )).pay__grossPay ) );
		}
		// avg = tmpTot / sz;
		com.ibm.javart.operations.Assign.run( ezeProgram, avg, com.ibm.javart.operations.Divide.run( ezeProgram, tmpTot, sz ) );
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_exceptionRef() throws java.lang.Exception
	{
		_funcPush( "exceptionRef" );
		
		// currPayPer INT;
		int currPayPer = 0;
		// currPayPer = empRecArray[4].rpt.payPeriod;
		currPayPer = ((basicprograms.empRec2)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.empRecArray.checkedValue( ezeProgram ), (short)4 )).rpt__payPeriod.getValue( ezeProgram );
		// RETURN
		_funcPop();
		return;
	}
	
	public int $func_continueExitReturn() throws java.lang.Exception
	{
		_funcPush( "continueExitReturn" );
		int $result = 0;
		
		// h INT;
		int h = 0;
		// for ( j From 1 To 10 Increment 1 )
		{
			int j = 0;
			j = (short)1;
			Leze$Temp4: for ( ; (j <= (short)10); j++ )
			{
				// h = h + 1;
				h++;
				// IF ( j == 5 )
				if ( (j == (short)5) )
				{
					//  Continue ;
					if ( true ) { continue Leze$Temp4; }
				}
				else
				{
					// SysLib.writeStdout(j as STRING);
					System.out.println( com.ibm.javart.operations.ConvertToString.run( ezeProgram, ( (com.ibm.javart.StringValue)com.ibm.javart.operations.As.run( ezeProgram, j, new com.ibm.javart.StringItem( "eze$Temp9", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ) ) ) ) );
					// IF ( j == 8 )
					if ( (j == (short)8) )
					{
						// exit for;
						if ( true ) { break Leze$Temp4; }
					}
				}
			}
		}
		// RETURN -3
		// $result = -3;
		$result = (short)-3;
		_funcPop();
		return $result;
	}
	
	public void $initpayrollProgram2( payrollProgram2 ezeProgram ) throws java.lang.Exception
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
