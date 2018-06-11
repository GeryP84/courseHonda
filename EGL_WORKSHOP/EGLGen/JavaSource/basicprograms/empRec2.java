// Generated at Mon Jun 11 17:12:55 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package basicprograms;

public class empRec2 extends com.ibm.javart.OverlayContainer
{
	private static final long serialVersionUID = 70L;
	
	
	private static byte[] ezeInitialData;
	private static byte[] ezeEmptyData;
	
	public com.ibm.javart.CharValue emp;
	public com.ibm.javart.CharValue emp__lastName;
	public com.ibm.javart.CharValue emp__firstName;
	public com.ibm.javart.CharValue emp__empId;
	public com.ibm.javart.NumericValue emp__empPhone;
	public com.ibm.javart.SmallNumericValue emp__partTimeInd;
	public com.ibm.javart.CharValue pay;
	public com.ibm.javart.NumericDecValue pay__grossPay;
	public com.ibm.javart.NumericDecValue pay__ytdGrossPay;
	public com.ibm.javart.NumericDecValue pay__fedTax;
	public com.ibm.javart.NumericDecValue pay__ytdFedTax;
	public com.ibm.javart.NumericDecValue pay__netPay;
	public com.ibm.javart.NumericDecValue pay__ytdNetPay;
	public com.ibm.javart.NumericDecValue pay__stockPurchPerc;
	public com.ibm.javart.NumericDecValue pay__four01KPerc;
	public com.ibm.javart.CharValue rpt;
	public com.ibm.javart.DateValue rpt__currDate;
	public com.ibm.javart.DateValue rpt__periodEndDate;
	public com.ibm.javart.TimestampValue rpt__reportTimeStamp;
	public com.ibm.javart.SmallNumericValue rpt__payPeriod;
	
	public empRec2( java.lang.String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, java.lang.String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus, 151, 151 );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		ensureCapacity( 20 );
		if ( ezeInitialData == null )
		{
			emp = new com.ibm.javart.OverlayCharItem( "emp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 57, true, false, false, 0, 0, "C57;", true );
			add(emp);
			emp__lastName = new com.ibm.javart.OverlayCharItem( "emp.lastName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 0, 0, "C20;", true );
			add(emp__lastName);
			emp__firstName = new com.ibm.javart.OverlayCharItem( "emp.firstName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 20, 20, "C20;", true );
			add(emp__firstName);
			emp__empId = new com.ibm.javart.OverlayCharItem( "emp.empId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 6, true, true, false, 40, 40, "C6;", true );
			add(emp__empId);
			emp__empPhone = new com.ibm.javart.OverlayNumericItem( "emp.empPhone", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 46, 46, "N10:0;", true );
			add(emp__empPhone);
			emp__partTimeInd = new com.ibm.javart.OverlaySmallNumericItem( "emp.partTimeInd", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 1, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 56, 56, "N1:0;", true );
			add(emp__partTimeInd);
			pay = new com.ibm.javart.OverlayCharItem( "pay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 62, true, false, false, 57, 57, "C62;", true );
			add(pay);
			pay__grossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.grossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 57, 57, "N9:2;", true );
			add(pay__grossPay);
			pay__ytdGrossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdGrossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 66, 66, "N9:2;", true );
			add(pay__ytdGrossPay);
			pay__fedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.fedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 75, 75, "N9:2;", true );
			add(pay__fedTax);
			pay__ytdFedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdFedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 84, 84, "N9:2;", true );
			add(pay__ytdFedTax);
			pay__netPay = new com.ibm.javart.OverlayNumericDecItem( "pay.netPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 93, 93, "N9:2;", true );
			add(pay__netPay);
			pay__ytdNetPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdNetPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 102, 102, "N9:2;", true );
			add(pay__ytdNetPay);
			pay__stockPurchPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.stockPurchPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 111, 111, "N4:2;", true );
			add(pay__stockPurchPerc);
			pay__four01KPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.four01KPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 115, 115, "N4:2;", true );
			add(pay__four01KPerc);
			rpt = new com.ibm.javart.OverlayCharItem( "rpt", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 32, true, false, false, 119, 119, "C32;", true );
			add(rpt);
			rpt__currDate = new com.ibm.javart.OverlayDateItem( "rpt.currDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 119, 119, com.ibm.javart.Constants.SIGNATURE_DATE, true );
			add(rpt__currDate);
			rpt__periodEndDate = new com.ibm.javart.OverlayDateItem( "rpt.periodEndDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 127, 127, com.ibm.javart.Constants.SIGNATURE_DATE, true );
			add(rpt__periodEndDate);
			rpt__reportTimeStamp = new com.ibm.javart.OverlayTimestampItem( "rpt.reportTimeStamp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 0, 5, 14, "yyyy-MM-dd HH:mm:ss", true, false, 135, 135, "J'yyyyMMddHHmmss';", true );
			add(rpt__reportTimeStamp);
			rpt__payPeriod = new com.ibm.javart.OverlaySmallNumericItem( "rpt.payPeriod", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 149, 149, "N2:0;", true );
			add(rpt__payPeriod);
			
			ezeEmptyData = new byte[ 151 ];
			System.arraycopy( byteStorage().getBytes(), 0, ezeEmptyData, 0, 151 );
			
			ezeInitialData = ezeEmptyData;
		}
		else
		{
			emp = new com.ibm.javart.OverlayCharItem( "emp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 57, true, false, false, 0, 0, "C57;", false );
			add(emp);
			emp__lastName = new com.ibm.javart.OverlayCharItem( "emp.lastName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 0, 0, "C20;", false );
			add(emp__lastName);
			emp__firstName = new com.ibm.javart.OverlayCharItem( "emp.firstName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 20, 20, "C20;", false );
			add(emp__firstName);
			emp__empId = new com.ibm.javart.OverlayCharItem( "emp.empId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 6, true, true, false, 40, 40, "C6;", false );
			add(emp__empId);
			emp__empPhone = new com.ibm.javart.OverlayNumericItem( "emp.empPhone", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 46, 46, "N10:0;", false );
			add(emp__empPhone);
			emp__partTimeInd = new com.ibm.javart.OverlaySmallNumericItem( "emp.partTimeInd", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 1, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 56, 56, "N1:0;", false );
			add(emp__partTimeInd);
			pay = new com.ibm.javart.OverlayCharItem( "pay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 62, true, false, false, 57, 57, "C62;", false );
			add(pay);
			pay__grossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.grossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 57, 57, "N9:2;", false );
			add(pay__grossPay);
			pay__ytdGrossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdGrossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 66, 66, "N9:2;", false );
			add(pay__ytdGrossPay);
			pay__fedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.fedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 75, 75, "N9:2;", false );
			add(pay__fedTax);
			pay__ytdFedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdFedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 84, 84, "N9:2;", false );
			add(pay__ytdFedTax);
			pay__netPay = new com.ibm.javart.OverlayNumericDecItem( "pay.netPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 93, 93, "N9:2;", false );
			add(pay__netPay);
			pay__ytdNetPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdNetPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 102, 102, "N9:2;", false );
			add(pay__ytdNetPay);
			pay__stockPurchPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.stockPurchPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 111, 111, "N4:2;", false );
			add(pay__stockPurchPerc);
			pay__four01KPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.four01KPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 115, 115, "N4:2;", false );
			add(pay__four01KPerc);
			rpt = new com.ibm.javart.OverlayCharItem( "rpt", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 32, true, false, false, 119, 119, "C32;", false );
			add(rpt);
			rpt__currDate = new com.ibm.javart.OverlayDateItem( "rpt.currDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 119, 119, com.ibm.javart.Constants.SIGNATURE_DATE, false );
			add(rpt__currDate);
			rpt__periodEndDate = new com.ibm.javart.OverlayDateItem( "rpt.periodEndDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 127, 127, com.ibm.javart.Constants.SIGNATURE_DATE, false );
			add(rpt__periodEndDate);
			rpt__reportTimeStamp = new com.ibm.javart.OverlayTimestampItem( "rpt.reportTimeStamp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 0, 5, 14, "yyyy-MM-dd HH:mm:ss", true, false, 135, 135, "J'yyyyMMddHHmmss';", false );
			add(rpt__reportTimeStamp);
			rpt__payPeriod = new com.ibm.javart.OverlaySmallNumericItem( "rpt.payPeriod", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 149, 149, "N2:0;", false );
			add(rpt__payPeriod);
			ezeSetInitial( ezeProgram );
		}
	}
	
	
	
	public empRec2() throws com.ibm.javart.JavartException
	{
		this( "empRec2", null, com.ibm.javart.util.ServiceUtilities.programInstance("empRec2", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "TbasicPrograms/empRec2;" );
	}
	
	public empRec2( java.lang.String ezeName, com.ibm.javart.Container ezeContainer, com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, boolean ezeRedefinedFlag, java.lang.String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus, 151, 151 );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		ensureCapacity( 20 );
		if ( ezeRedefinedFlag )
		{
			emp = new com.ibm.javart.OverlayCharItem( "emp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 57, true, false, false, 0, 0, "C57;", false );
			add(emp);
			emp__lastName = new com.ibm.javart.OverlayCharItem( "emp.lastName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 0, 0, "C20;", false );
			add(emp__lastName);
			emp__firstName = new com.ibm.javart.OverlayCharItem( "emp.firstName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 20, 20, "C20;", false );
			add(emp__firstName);
			emp__empId = new com.ibm.javart.OverlayCharItem( "emp.empId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 6, true, true, false, 40, 40, "C6;", false );
			add(emp__empId);
			emp__empPhone = new com.ibm.javart.OverlayNumericItem( "emp.empPhone", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 46, 46, "N10:0;", false );
			add(emp__empPhone);
			emp__partTimeInd = new com.ibm.javart.OverlaySmallNumericItem( "emp.partTimeInd", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 1, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 56, 56, "N1:0;", false );
			add(emp__partTimeInd);
			pay = new com.ibm.javart.OverlayCharItem( "pay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 62, true, false, false, 57, 57, "C62;", false );
			add(pay);
			pay__grossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.grossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 57, 57, "N9:2;", false );
			add(pay__grossPay);
			pay__ytdGrossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdGrossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 66, 66, "N9:2;", false );
			add(pay__ytdGrossPay);
			pay__fedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.fedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 75, 75, "N9:2;", false );
			add(pay__fedTax);
			pay__ytdFedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdFedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 84, 84, "N9:2;", false );
			add(pay__ytdFedTax);
			pay__netPay = new com.ibm.javart.OverlayNumericDecItem( "pay.netPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 93, 93, "N9:2;", false );
			add(pay__netPay);
			pay__ytdNetPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdNetPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 102, 102, "N9:2;", false );
			add(pay__ytdNetPay);
			pay__stockPurchPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.stockPurchPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 111, 111, "N4:2;", false );
			add(pay__stockPurchPerc);
			pay__four01KPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.four01KPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 115, 115, "N4:2;", false );
			add(pay__four01KPerc);
			rpt = new com.ibm.javart.OverlayCharItem( "rpt", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 32, true, false, false, 119, 119, "C32;", false );
			add(rpt);
			rpt__currDate = new com.ibm.javart.OverlayDateItem( "rpt.currDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 119, 119, com.ibm.javart.Constants.SIGNATURE_DATE, false );
			add(rpt__currDate);
			rpt__periodEndDate = new com.ibm.javart.OverlayDateItem( "rpt.periodEndDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 127, 127, com.ibm.javart.Constants.SIGNATURE_DATE, false );
			add(rpt__periodEndDate);
			rpt__reportTimeStamp = new com.ibm.javart.OverlayTimestampItem( "rpt.reportTimeStamp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 0, 5, 14, "yyyy-MM-dd HH:mm:ss", true, false, 135, 135, "J'yyyyMMddHHmmss';", false );
			add(rpt__reportTimeStamp);
			rpt__payPeriod = new com.ibm.javart.OverlaySmallNumericItem( "rpt.payPeriod", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 149, 149, "N2:0;", false );
			add(rpt__payPeriod);
		}
		else
		{
			emp = new com.ibm.javart.OverlayCharItem( "emp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 57, true, false, false, 0, 0, "C57;", true );
			add(emp);
			emp__lastName = new com.ibm.javart.OverlayCharItem( "emp.lastName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 0, 0, "C20;", true );
			add(emp__lastName);
			emp__firstName = new com.ibm.javart.OverlayCharItem( "emp.firstName", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 20, true, true, false, 20, 20, "C20;", true );
			add(emp__firstName);
			emp__empId = new com.ibm.javart.OverlayCharItem( "emp.empId", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 6, true, true, false, 40, 40, "C6;", true );
			add(emp__empId);
			emp__empPhone = new com.ibm.javart.OverlayNumericItem( "emp.empPhone", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 10, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 46, 46, "N10:0;", true );
			add(emp__empPhone);
			emp__partTimeInd = new com.ibm.javart.OverlaySmallNumericItem( "emp.partTimeInd", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 1, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 56, 56, "N1:0;", true );
			add(emp__partTimeInd);
			pay = new com.ibm.javart.OverlayCharItem( "pay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 62, true, false, false, 57, 57, "C62;", true );
			add(pay);
			pay__grossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.grossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 57, 57, "N9:2;", true );
			add(pay__grossPay);
			pay__ytdGrossPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdGrossPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 66, 66, "N9:2;", true );
			add(pay__ytdGrossPay);
			pay__fedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.fedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 75, 75, "N9:2;", true );
			add(pay__fedTax);
			pay__ytdFedTax = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdFedTax", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 84, 84, "N9:2;", true );
			add(pay__ytdFedTax);
			pay__netPay = new com.ibm.javart.OverlayNumericDecItem( "pay.netPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 93, 93, "N9:2;", true );
			add(pay__netPay);
			pay__ytdNetPay = new com.ibm.javart.OverlayNumericDecItem( "pay.ytdNetPay", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 102, 102, "N9:2;", true );
			add(pay__ytdNetPay);
			pay__stockPurchPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.stockPurchPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 111, 111, "N4:2;", true );
			add(pay__stockPurchPerc);
			pay__four01KPerc = new com.ibm.javart.OverlayNumericDecItem( "pay.four01KPerc", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 4, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 115, 115, "N4:2;", true );
			add(pay__four01KPerc);
			rpt = new com.ibm.javart.OverlayCharItem( "rpt", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 32, true, false, false, 119, 119, "C32;", true );
			add(rpt);
			rpt__currDate = new com.ibm.javart.OverlayDateItem( "rpt.currDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 119, 119, com.ibm.javart.Constants.SIGNATURE_DATE, true );
			add(rpt__currDate);
			rpt__periodEndDate = new com.ibm.javart.OverlayDateItem( "rpt.periodEndDate", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, true, false, 127, 127, com.ibm.javart.Constants.SIGNATURE_DATE, true );
			add(rpt__periodEndDate);
			rpt__reportTimeStamp = new com.ibm.javart.OverlayTimestampItem( "rpt.reportTimeStamp", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 0, 5, 14, "yyyy-MM-dd HH:mm:ss", true, false, 135, 135, "J'yyyyMMddHHmmss';", true );
			add(rpt__reportTimeStamp);
			rpt__payPeriod = new com.ibm.javart.OverlaySmallNumericItem( "rpt.payPeriod", this, com.ibm.javart.Value.SQL_NOT_NULLABLE, 2, com.ibm.javart.Constants.EGL_TYPE_NUM, true, false, 149, 149, "N2:0;", true );
			add(rpt__payPeriod);
			ezeSetInitial( ezeProgram );
		}
	}
	
	
	
	
	public java.lang.Object clone() throws java.lang.CloneNotSupportedException
	{
		empRec2 ezeClone = (empRec2)super.clone();
		ezeClone.emp = (com.ibm.javart.CharValue)emp.clone();
		((com.ibm.javart.OverlayCharItem)ezeClone.emp).setContainer( ezeClone );
		ezeClone.add( ezeClone.emp );
		ezeClone.emp__lastName = (com.ibm.javart.CharValue)emp__lastName.clone();
		((com.ibm.javart.OverlayCharItem)ezeClone.emp__lastName).setContainer( ezeClone );
		ezeClone.add( ezeClone.emp__lastName );
		ezeClone.emp__firstName = (com.ibm.javart.CharValue)emp__firstName.clone();
		((com.ibm.javart.OverlayCharItem)ezeClone.emp__firstName).setContainer( ezeClone );
		ezeClone.add( ezeClone.emp__firstName );
		ezeClone.emp__empId = (com.ibm.javart.CharValue)emp__empId.clone();
		((com.ibm.javart.OverlayCharItem)ezeClone.emp__empId).setContainer( ezeClone );
		ezeClone.add( ezeClone.emp__empId );
		ezeClone.emp__empPhone = (com.ibm.javart.NumericValue)emp__empPhone.clone();
		((com.ibm.javart.OverlayNumericItem)ezeClone.emp__empPhone).setContainer( ezeClone );
		ezeClone.add( ezeClone.emp__empPhone );
		ezeClone.emp__partTimeInd = (com.ibm.javart.SmallNumericValue)emp__partTimeInd.clone();
		((com.ibm.javart.OverlaySmallNumericItem)ezeClone.emp__partTimeInd).setContainer( ezeClone );
		ezeClone.add( ezeClone.emp__partTimeInd );
		ezeClone.pay = (com.ibm.javart.CharValue)pay.clone();
		((com.ibm.javart.OverlayCharItem)ezeClone.pay).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay );
		ezeClone.pay__grossPay = (com.ibm.javart.NumericDecValue)pay__grossPay.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__grossPay).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__grossPay );
		ezeClone.pay__ytdGrossPay = (com.ibm.javart.NumericDecValue)pay__ytdGrossPay.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__ytdGrossPay).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__ytdGrossPay );
		ezeClone.pay__fedTax = (com.ibm.javart.NumericDecValue)pay__fedTax.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__fedTax).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__fedTax );
		ezeClone.pay__ytdFedTax = (com.ibm.javart.NumericDecValue)pay__ytdFedTax.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__ytdFedTax).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__ytdFedTax );
		ezeClone.pay__netPay = (com.ibm.javart.NumericDecValue)pay__netPay.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__netPay).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__netPay );
		ezeClone.pay__ytdNetPay = (com.ibm.javart.NumericDecValue)pay__ytdNetPay.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__ytdNetPay).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__ytdNetPay );
		ezeClone.pay__stockPurchPerc = (com.ibm.javart.NumericDecValue)pay__stockPurchPerc.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__stockPurchPerc).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__stockPurchPerc );
		ezeClone.pay__four01KPerc = (com.ibm.javart.NumericDecValue)pay__four01KPerc.clone();
		((com.ibm.javart.OverlayNumericDecItem)ezeClone.pay__four01KPerc).setContainer( ezeClone );
		ezeClone.add( ezeClone.pay__four01KPerc );
		ezeClone.rpt = (com.ibm.javart.CharValue)rpt.clone();
		((com.ibm.javart.OverlayCharItem)ezeClone.rpt).setContainer( ezeClone );
		ezeClone.add( ezeClone.rpt );
		ezeClone.rpt__currDate = (com.ibm.javart.DateValue)rpt__currDate.clone();
		((com.ibm.javart.OverlayDateItem)ezeClone.rpt__currDate).setContainer( ezeClone );
		ezeClone.add( ezeClone.rpt__currDate );
		ezeClone.rpt__periodEndDate = (com.ibm.javart.DateValue)rpt__periodEndDate.clone();
		((com.ibm.javart.OverlayDateItem)ezeClone.rpt__periodEndDate).setContainer( ezeClone );
		ezeClone.add( ezeClone.rpt__periodEndDate );
		ezeClone.rpt__reportTimeStamp = (com.ibm.javart.TimestampValue)rpt__reportTimeStamp.clone();
		((com.ibm.javart.OverlayTimestampItem)ezeClone.rpt__reportTimeStamp).setContainer( ezeClone );
		ezeClone.add( ezeClone.rpt__reportTimeStamp );
		ezeClone.rpt__payPeriod = (com.ibm.javart.SmallNumericValue)rpt__payPeriod.clone();
		((com.ibm.javart.OverlaySmallNumericItem)ezeClone.rpt__payPeriod).setContainer( ezeClone );
		ezeClone.add( ezeClone.rpt__payPeriod );
		return ezeClone;
	}
	
	private _1 ezeempBean;
	private _2 ezepayBean;
	private _3 ezerptBean;
	public _1 getemp()
	{
		if ( ezeempBean == null )
		{
			ezeempBean = new _1();
		}
		return ezeempBean;
	}
	public _2 getpay()
	{
		if ( ezepayBean == null )
		{
			ezepayBean = new _2();
		}
		return ezepayBean;
	}
	public _3 getrpt()
	{
		if ( ezerptBean == null )
		{
			ezerptBean = new _3();
		}
		return ezerptBean;
	}
	
	public class _1 implements java.io.Serializable
	{
		private static final long serialVersionUID = 70L;
		
		public java.lang.String getlastName()
		{
			return emp__lastName.getValueAsString();
		}
		public void setlastName( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.lastName", emp__lastName, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__lastName, ezeValue );
			}
		}
		public java.lang.String getlastName_AsString() throws com.ibm.javart.JavartException
		{
			return com.ibm.javart.util.StringUtil.clip( emp__lastName.getValueAsString() );
		}
		public void setlastName_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.lastName", emp__lastName, ezeValue );
			if ( ezeValue == null )
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__lastName, com.ibm.javart.ref.Null.NULL );
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__lastName, ezeValue );
			}
		}
		public java.lang.String getfirstName()
		{
			return emp__firstName.getValueAsString();
		}
		public void setfirstName( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.firstName", emp__firstName, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__firstName, ezeValue );
			}
		}
		public java.lang.String getfirstName_AsString() throws com.ibm.javart.JavartException
		{
			return com.ibm.javart.util.StringUtil.clip( emp__firstName.getValueAsString() );
		}
		public void setfirstName_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.firstName", emp__firstName, ezeValue );
			if ( ezeValue == null )
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__firstName, com.ibm.javart.ref.Null.NULL );
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__firstName, ezeValue );
			}
		}
		public java.lang.String getempId()
		{
			return emp__empId.getValueAsString();
		}
		public void setempId( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.empId", emp__empId, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__empId, ezeValue );
			}
		}
		public java.lang.String getempId_AsString() throws com.ibm.javart.JavartException
		{
			return com.ibm.javart.util.StringUtil.clip( emp__empId.getValueAsString() );
		}
		public void setempId_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.empId", emp__empId, ezeValue );
			if ( ezeValue == null )
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__empId, com.ibm.javart.ref.Null.NULL );
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__empId, ezeValue );
			}
		}
		public java.math.BigDecimal getempPhone() throws com.ibm.javart.JavartException
		{
			return java.math.BigDecimal.valueOf( (long)emp__empPhone.getValue( ezeProgram ) );
		}
		public void setempPhone( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.empPhone", emp__empPhone, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__empPhone, ezeValue );
			}
		}
		public java.math.BigDecimal getpartTimeInd() throws com.ibm.javart.JavartException
		{
			return java.math.BigDecimal.valueOf( (long)emp__partTimeInd.getValue( ezeProgram ) );
		}
		public void setpartTimeInd( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "emp.partTimeInd", emp__partTimeInd, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, emp__partTimeInd, ezeValue );
			}
		}
	}
	
	public class _2 implements java.io.Serializable
	{
		private static final long serialVersionUID = 70L;
		
		public java.math.BigDecimal getgrossPay() throws com.ibm.javart.JavartException
		{
			return pay__grossPay.getValue( ezeProgram );
		}
		public void setgrossPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.grossPay", pay__grossPay, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__grossPay, ezeValue );
			}
		}
		public java.math.BigDecimal getytdGrossPay() throws com.ibm.javart.JavartException
		{
			return pay__ytdGrossPay.getValue( ezeProgram );
		}
		public void setytdGrossPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.ytdGrossPay", pay__ytdGrossPay, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__ytdGrossPay, ezeValue );
			}
		}
		public java.math.BigDecimal getfedTax() throws com.ibm.javart.JavartException
		{
			return pay__fedTax.getValue( ezeProgram );
		}
		public void setfedTax( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.fedTax", pay__fedTax, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__fedTax, ezeValue );
			}
		}
		public java.math.BigDecimal getytdFedTax() throws com.ibm.javart.JavartException
		{
			return pay__ytdFedTax.getValue( ezeProgram );
		}
		public void setytdFedTax( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.ytdFedTax", pay__ytdFedTax, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__ytdFedTax, ezeValue );
			}
		}
		public java.math.BigDecimal getnetPay() throws com.ibm.javart.JavartException
		{
			return pay__netPay.getValue( ezeProgram );
		}
		public void setnetPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.netPay", pay__netPay, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__netPay, ezeValue );
			}
		}
		public java.math.BigDecimal getytdNetPay() throws com.ibm.javart.JavartException
		{
			return pay__ytdNetPay.getValue( ezeProgram );
		}
		public void setytdNetPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.ytdNetPay", pay__ytdNetPay, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__ytdNetPay, ezeValue );
			}
		}
		public java.math.BigDecimal getstockPurchPerc() throws com.ibm.javart.JavartException
		{
			return pay__stockPurchPerc.getValue( ezeProgram );
		}
		public void setstockPurchPerc( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.stockPurchPerc", pay__stockPurchPerc, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__stockPurchPerc, ezeValue );
			}
		}
		public java.math.BigDecimal getfour01KPerc() throws com.ibm.javart.JavartException
		{
			return pay__four01KPerc.getValue( ezeProgram );
		}
		public void setfour01KPerc( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "pay.four01KPerc", pay__four01KPerc, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, pay__four01KPerc, ezeValue );
			}
		}
	}
	
	public class _3 implements java.io.Serializable
	{
		private static final long serialVersionUID = 70L;
		
		public java.util.Calendar getcurrDate() throws com.ibm.javart.JavartException
		{
			return rpt__currDate.getValue( ezeProgram );
		}
		public void setcurrDate( java.util.Calendar ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "rpt.currDate", rpt__currDate, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, rpt__currDate, ezeValue );
			}
		}
		public java.util.Date getcurrDate_AsDate() throws com.ibm.javart.JavartException
		{
			return rpt__currDate.getValue( ezeProgram ).getTime();
		}
		public void setcurrDate_AsDate( java.util.Date ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "rpt.currDate", rpt__currDate, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				java.util.Calendar ezeTemp = com.ibm.javart.util.DateTimeUtil.getBaseCalendar();
				ezeTemp.setTime( ezeValue );
				com.ibm.javart.operations.Assign.run( ezeProgram, rpt__currDate, ezeTemp );
			}
		}
		public java.util.Calendar getperiodEndDate() throws com.ibm.javart.JavartException
		{
			return rpt__periodEndDate.getValue( ezeProgram );
		}
		public void setperiodEndDate( java.util.Calendar ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "rpt.periodEndDate", rpt__periodEndDate, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, rpt__periodEndDate, ezeValue );
			}
		}
		public java.util.Date getperiodEndDate_AsDate() throws com.ibm.javart.JavartException
		{
			return rpt__periodEndDate.getValue( ezeProgram ).getTime();
		}
		public void setperiodEndDate_AsDate( java.util.Date ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "rpt.periodEndDate", rpt__periodEndDate, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				java.util.Calendar ezeTemp = com.ibm.javart.util.DateTimeUtil.getBaseCalendar();
				ezeTemp.setTime( ezeValue );
				com.ibm.javart.operations.Assign.run( ezeProgram, rpt__periodEndDate, ezeTemp );
			}
		}
		public java.util.Calendar getreportTimeStamp() throws com.ibm.javart.JavartException
		{
			com.ibm.javart.TimestampData ezeData = rpt__reportTimeStamp.getValue( ezeProgram );
			java.util.Calendar ezeCal = (java.util.Calendar)ezeData.calendar.clone();
			ezeCal.set( java.util.Calendar.MILLISECOND, ezeData.microseconds / 1000 );
			return ezeCal;
		}
		public void setreportTimeStamp( java.util.Calendar ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "rpt.reportTimeStamp", rpt__reportTimeStamp, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, rpt__reportTimeStamp, ezeValue );
			}
		}
		public java.math.BigDecimal getpayPeriod() throws com.ibm.javart.JavartException
		{
			return java.math.BigDecimal.valueOf( (long)rpt__payPeriod.getValue( ezeProgram ) );
		}
		public void setpayPeriod( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
		{
			ezeProgram._setModified( empRec2.this, "rpt.payPeriod", rpt__payPeriod, ezeValue );
			if ( ezeValue == null )
			{
				throw new java.lang.NullPointerException();
			}
			else
			{
				com.ibm.javart.operations.Assign.run( ezeProgram, rpt__payPeriod, ezeValue );
			}
		}
	}
	public java.lang.String getemp__lastName()
	{
		return emp__lastName.getValueAsString();
	}
	public void setemp__lastName( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, emp__lastName, ezeValue );
		}
	}
	public java.lang.String getemp__firstName()
	{
		return emp__firstName.getValueAsString();
	}
	public void setemp__firstName( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, emp__firstName, ezeValue );
		}
	}
	public java.lang.String getemp__empId()
	{
		return emp__empId.getValueAsString();
	}
	public void setemp__empId( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, emp__empId, ezeValue );
		}
	}
	public java.math.BigDecimal getemp__empPhone() throws com.ibm.javart.JavartException
	{
		return java.math.BigDecimal.valueOf( (long)emp__empPhone.getValue( ezeProgram ) );
	}
	public void setemp__empPhone( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, emp__empPhone, ezeValue );
		}
	}
	public java.math.BigDecimal getemp__partTimeInd() throws com.ibm.javart.JavartException
	{
		return java.math.BigDecimal.valueOf( (long)emp__partTimeInd.getValue( ezeProgram ) );
	}
	public void setemp__partTimeInd( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, emp__partTimeInd, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__grossPay() throws com.ibm.javart.JavartException
	{
		return pay__grossPay.getValue( ezeProgram );
	}
	public void setpay__grossPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__grossPay, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__ytdGrossPay() throws com.ibm.javart.JavartException
	{
		return pay__ytdGrossPay.getValue( ezeProgram );
	}
	public void setpay__ytdGrossPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__ytdGrossPay, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__fedTax() throws com.ibm.javart.JavartException
	{
		return pay__fedTax.getValue( ezeProgram );
	}
	public void setpay__fedTax( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__fedTax, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__ytdFedTax() throws com.ibm.javart.JavartException
	{
		return pay__ytdFedTax.getValue( ezeProgram );
	}
	public void setpay__ytdFedTax( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__ytdFedTax, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__netPay() throws com.ibm.javart.JavartException
	{
		return pay__netPay.getValue( ezeProgram );
	}
	public void setpay__netPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__netPay, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__ytdNetPay() throws com.ibm.javart.JavartException
	{
		return pay__ytdNetPay.getValue( ezeProgram );
	}
	public void setpay__ytdNetPay( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__ytdNetPay, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__stockPurchPerc() throws com.ibm.javart.JavartException
	{
		return pay__stockPurchPerc.getValue( ezeProgram );
	}
	public void setpay__stockPurchPerc( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__stockPurchPerc, ezeValue );
		}
	}
	public java.math.BigDecimal getpay__four01KPerc() throws com.ibm.javart.JavartException
	{
		return pay__four01KPerc.getValue( ezeProgram );
	}
	public void setpay__four01KPerc( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pay__four01KPerc, ezeValue );
		}
	}
	public java.util.Calendar getrpt__currDate() throws com.ibm.javart.JavartException
	{
		return rpt__currDate.getValue( ezeProgram );
	}
	public void setrpt__currDate( java.util.Calendar ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, rpt__currDate, ezeValue );
		}
	}
	public java.util.Calendar getrpt__periodEndDate() throws com.ibm.javart.JavartException
	{
		return rpt__periodEndDate.getValue( ezeProgram );
	}
	public void setrpt__periodEndDate( java.util.Calendar ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, rpt__periodEndDate, ezeValue );
		}
	}
	public java.util.Calendar getrpt__reportTimeStamp() throws com.ibm.javart.JavartException
	{
		com.ibm.javart.TimestampData ezeData = rpt__reportTimeStamp.getValue( ezeProgram );
		java.util.Calendar ezeCal = (java.util.Calendar)ezeData.calendar.clone();
		ezeCal.set( java.util.Calendar.MILLISECOND, ezeData.microseconds / 1000 );
		return ezeCal;
	}
	public void setrpt__reportTimeStamp( java.util.Calendar ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, rpt__reportTimeStamp, ezeValue );
		}
	}
	public java.math.BigDecimal getrpt__payPeriod() throws com.ibm.javart.JavartException
	{
		return java.math.BigDecimal.valueOf( (long)rpt__payPeriod.getValue( ezeProgram ) );
	}
	public void setrpt__payPeriod( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, rpt__payPeriod, ezeValue );
		}
	}
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if ( ezeHelper == null )
		{
			ezeHelper = new basicprograms.empRec2_Helper( ezeProgram );
		}
		return ezeHelper;
	}
	public void ezeSetEmpty( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
	{
		if ( ezeEmptyData == null )
		{
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, this );
			ezeEmptyData = new byte[ 151 ];
			System.arraycopy( byteStorage().getBytes(), 0, ezeEmptyData, 0, 151 );
		}
		else
		{
			byteStorage().setPosition( 0 );
			byteStorage().storeBytes( ezeEmptyData );
		}
	}
	public void ezeSetInitial( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
	{
		if ( ezeInitialData == null )
		{
			ezeSetEmpty( ezeProgram );
			ezeInitialData = ezeEmptyData;
		}
		else
		{
			byteStorage().setPosition( 0 );
			byteStorage().storeBytes( ezeInitialData );
		}
	}
	
}
