// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.access;

public class CustomerLib_Lib extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final CustomerLib_Lib ezeProgram;
	public egltui.ConditionHandlingLib_Lib egltui__ConditionHandlingLib;
	
	public CustomerLib_Lib( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "CustomerLib_Lib", "CustomerLib", ru, false, true, 6 );
		ezeProgram = this;
		_runUnit().addLibrary( "egltui.access.CustomerLib_Lib", this );
		egltui__ConditionHandlingLib = (egltui.ConditionHandlingLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.ConditionHandlingLib_Lib" );
		$initCustomerLib_Lib( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return false;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return false;
	}
	
	public void $func_AddCustomer( egltui.data.Customer newRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "AddCustomer" );
		
		// IF ( IsValid(newRecord) )
		if ( $func_IsValid( newRecord ).getValue() )
		{
			// TRY 
			try
			{
				if ( false )
				{
					com.ibm.javart.util.JavartUtil.beginTry();
				}
				// ADD newRecord;
				{
					java.sql.PreparedStatement $stmt = null;
					try
					{
						com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "ADD", newRecord );
						String $sql = "insert into EGL.CUSTOMER " + "(EGL.CUSTOMER.CUSTOMERID, EGL.CUSTOMER.FIRSTNAME, EGL.CUSTOMER.LASTNAME, EGL.CUSTOMER.PASSWORD, EGL.CUSTOMER.PHONE, EGL.CUSTOMER.EMAILADDRESS, EGL.CUSTOMER.STREET, EGL.CUSTOMER.APARTMENT, EGL.CUSTOMER.CITY, EGL.CUSTOMER.\"STATE\", EGL.CUSTOMER.POSTALCODE, EGL.CUSTOMER.DIRECTIONS) " + "values ( " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ") ";
						$stmt = $con.getConnection().prepareStatement( $sql );
						$stmt.setInt( 1, newRecord.CustomerId.getValue() );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.FirstName, $stmt, 2, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.LastName, $stmt, 3, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.Password, $stmt, 4, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.Phone, $stmt, 5, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.EmailAddress, $stmt, 6, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.Street, $stmt, 7, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.Apartment, $stmt, 8, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.City, $stmt, 9, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.State, $stmt, 10, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.Postalcode, $stmt, 11, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.Directions, $stmt, 12, true, java.sql.Types.VARCHAR, ezeProgram );
						int $count = $stmt.executeUpdate();
						com.ibm.javart.sql.Sql.end( ezeProgram, "ADD", newRecord, $count, $stmt, true, false, false, false );
					}
					catch ( java.sql.SQLException $sqlx )
					{
						com.ibm.javart.sql.Sql.fail( ezeProgram, "ADD", $sqlx, newRecord, $stmt, true, 0, false );
					}
				}
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
			catch ( egl.io.sql.SQLException_Ex eze$Temp7 )
			{
				egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp7.getRecord() );
				// ConditionHandlingLib.HandleException(status, exception);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
			}
		}
		else
		{
			// ConditionHandlingLib.HandleInvalidDBRecord(status);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleInvalidDBRecord( status );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_AddCustomerList__0$T14ace9d72( com.ibm.javart.ref.ContainerArrayRef newRecordList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "AddCustomerList" );
		
		// for ( i From 1 To newRecordList.getSize() Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp1: for ( ; (i <= newRecordList.checkedValue( ezeProgram ).getSize( ezeProgram )); i++ )
			{
				// AddCustomer(newRecordList[i], status);
				$func_AddCustomer( ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, newRecordList.checkedValue( ezeProgram ), i )), status );
				// IF ( status.succeeded )
				Leze$Temp2: if ( status.succeeded.getValue() )
				{
					//  Continue ;
					if ( true ) { continue Leze$Temp1; }
				}
				else
				{
					// exit;
					if ( true ) { break Leze$Temp2; }
				}
			}
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_GetCustomer( egltui.data.Customer searchRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetCustomer" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get searchRecord;
			{
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", searchRecord );
					com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
					if ( searchRecord.currentResultSetId() > 0 )
					{
						$resultSet = $resultSets[ searchRecord.currentResultSetId() ];
						if ( $resultSet != null )
						{
							$resultSets[ searchRecord.currentResultSetId() ] = null;
							$resultSet.close();
						}
						searchRecord.currentResultSetId( 0 );
					}
					
					String $sql = "select EGL.CUSTOMER.CUSTOMERID, EGL.CUSTOMER.FIRSTNAME, EGL.CUSTOMER.LASTNAME, EGL.CUSTOMER.PASSWORD, EGL.CUSTOMER.PHONE, EGL.CUSTOMER.EMAILADDRESS, EGL.CUSTOMER.STREET, EGL.CUSTOMER.APARTMENT, EGL.CUSTOMER.CITY, EGL.CUSTOMER.\"STATE\", EGL.CUSTOMER.POSTALCODE, EGL.CUSTOMER.DIRECTIONS "
					+ "from EGL.CUSTOMER " + "where EGL.CUSTOMER.CUSTOMERID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, searchRecord.CustomerId.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.CustomerId, $results, 1, false, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.FirstName, $results, 2, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.LastName, $results, 3, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Password, $results, 4, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Phone, $results, 5, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.EmailAddress, $results, 6, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Street, $results, 7, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Apartment, $results, 8, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.City, $results, 9, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.State, $results, 10, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Postalcode, $results, 11, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Directions, $results, 12, true, $columns, ezeProgram ) || $truncation;
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", searchRecord, 0, null, false, false, $truncation, false );
					}
					else
					{
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", searchRecord, 0, null, false, false, false, true );
					}
				}
				catch ( java.sql.SQLException $sqlx )
				{
					if ( $resultSet != null )
					{
						try
						{
							$resultSet.close();
						}
						catch ( java.sql.SQLException $sqlx2 )
						{
						}
					}
					com.ibm.javart.sql.Sql.fail( ezeProgram, "GET", $sqlx, searchRecord, null, false, 0, false );
				}
			}
			// IF ( SysVar.sqlData.sqlca.sqlcode == 100 )
			if ( (ezeProgram.egl__core__SysVar.sqlData.sqlca__sqlcode.getValue() == (short)100) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.CUSTOMER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.CUSTOMER" ) );
			}
			else
			{
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
		}
		catch ( egl.io.sql.SQLException_Ex eze$Temp8 )
		{
			egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp8.getRecord() );
			// ConditionHandlingLib.HandleException(status, exception);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_GetCustomerListAll__0$T14ace9d72( com.ibm.javart.ref.ContainerArrayRef customerArray, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetCustomerListAll" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get customerArray;
			{
				int $maxSize = java.lang.Integer.MAX_VALUE;
				if ( !com.ibm.javart.operations.IsNull.run( ezeProgram, customerArray ) )
				{
					$maxSize = customerArray.value().getMaxSize();
				}
				customerArray.createNewValue( ezeProgram );
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
				com.ibm.javart.arrays.ContainerArray $array = customerArray.value();
				customerArray.value().setMaxSize( ezeProgram, $maxSize );
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", customerArray.value() );
					String $sql = "select EGL.CUSTOMER.CUSTOMERID, EGL.CUSTOMER.FIRSTNAME, EGL.CUSTOMER.LASTNAME, EGL.CUSTOMER.PASSWORD, EGL.CUSTOMER.PHONE, EGL.CUSTOMER.EMAILADDRESS, EGL.CUSTOMER.STREET, EGL.CUSTOMER.APARTMENT, EGL.CUSTOMER.CITY, EGL.CUSTOMER.\"STATE\", EGL.CUSTOMER.POSTALCODE, EGL.CUSTOMER.DIRECTIONS "
					+ "from EGL.CUSTOMER " + "order by EGL.CUSTOMER.CUSTOMERID asc ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					$resultSets[ 0 ] = $resultSet;
					$array.ioStatus( 0 );
					for ( int $i = 0; $i < $maxSize && com.ibm.javart.sql.Sql.nextArrayResult( ezeProgram, $array, $resultSet, $i == 0, false ); $i++ )
					{
						egltui.data.Customer $rec = (egltui.data.Customer)$array.makeNewElement( ezeProgram );
						$array.appendObject( ezeProgram, $rec );
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.CustomerId, $results, 1, false, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.FirstName, $results, 2, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.LastName, $results, 3, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Password, $results, 4, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Phone, $results, 5, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.EmailAddress, $results, 6, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Street, $results, 7, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Apartment, $results, 8, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.City, $results, 9, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.State, $results, 10, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Postalcode, $results, 11, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Directions, $results, 12, true, $columns, ezeProgram );
					}
					if ( $resultSets[ 0 ] != null )
					{
						boolean $more = $resultSet.getResultSet().next();
						$resultSets[ 0 ] = null;
						$resultSet.close();
						com.ibm.javart.sql.Sql.endGetArray( ezeProgram, $array, !$more, false );
					}
					else
					{
						com.ibm.javart.sql.Sql.endGetArray( ezeProgram, $array, $array.ioStatus() == 0, false );
					}
				}
				catch ( java.sql.SQLException $sqlx )
				{
					if ( $resultSet != null )
					{
						$resultSets[ 0 ] = null;
						try
						{
							$resultSet.close();
						}
						catch ( java.sql.SQLException $sqlx2 )
						{
						}
					}
					com.ibm.javart.sql.Sql.fail( ezeProgram, "GET", $sqlx, $array, null, false, 0, false );
				}
			}
			// IF ( customerArray.getSize() == 0 )
			if ( (customerArray.checkedValue( ezeProgram ).getSize( ezeProgram ) == (short)0) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.CUSTOMER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.CUSTOMER" ) );
			}
			else
			{
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
		}
		catch ( egl.io.sql.SQLException_Ex eze$Temp9 )
		{
			egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp9.getRecord() );
			// ConditionHandlingLib.HandleException(status, exception);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_GetCustomerList__1$T14ace9d72( egltui.ListSpecification listSpec, com.ibm.javart.ref.ContainerArrayRef listOut, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetCustomerList" );
		
		// customerList Customer[0];
		com.ibm.javart.ref.ContainerArrayRef customerList = new com.ibm.javart.ref.ContainerArrayRef( "customerList", new com.ibm.javart.arrays.ContainerArray( "customerList", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Customer;" )
		{
			private static final long serialVersionUID = 70L;
			
			public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				return new egltui.data.Customer( "customerList", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
			};
		}, "1Tegltui/data/Customer;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "customerList", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Customer;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new egltui.data.Customer( "customerList", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
					};
				};
			}
		};
		// temp Customer;
		egltui.data.Customer temp = new egltui.data.Customer( "temp", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Customer;" );
		// i INT;
		int i = 0;
		// i = 1;
		i = (short)1;
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// IF ( !listSpec.initialized )
			if ( !(listSpec.initialized.getValue()) )
			{
				// Prepare selectStatement from "SELECT EGL.CUSTOMER.* " + listSpec.fromTablesWhere;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "PREPARE", null );
					if ( ezeProgram._preparedStatements()[ 1 ] != null )
					{
						ezeProgram._preparedStatements()[ 1 ].close();
					}
					String $sql = ("SELECT EGL.CUSTOMER.* " + listSpec.fromTablesWhere.getValue());
					ezeProgram._preparedStatements()[ 1 ] = com.ibm.javart.sql.Sql.prepare( $sql, 1, com.ibm.javart.sql.Sql.EXECUTE_QUERY, false, 0, null, $con, ezeProgram );
					com.ibm.javart.sql.Sql.end( ezeProgram, "PREPARE", null, 0, null, false, false, false, false );
				}
				catch ( java.sql.SQLException $sqlx )
				{
					com.ibm.javart.sql.Sql.fail( ezeProgram, "PREPARE", $sqlx, null, null, false, 0, false );
				}
				// Prepare getRowCount from "SELECT COUNT(*) " + listSpec.fromTablesWhere;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "PREPARE", null );
					if ( ezeProgram._preparedStatements()[ 2 ] != null )
					{
						ezeProgram._preparedStatements()[ 2 ].close();
					}
					String $sql = ("SELECT COUNT(*) " + listSpec.fromTablesWhere.getValue());
					ezeProgram._preparedStatements()[ 2 ] = com.ibm.javart.sql.Sql.prepare( $sql, 2, com.ibm.javart.sql.Sql.EXECUTE_QUERY, false, 0, null, $con, ezeProgram );
					com.ibm.javart.sql.Sql.end( ezeProgram, "PREPARE", null, 0, null, false, false, false, false );
				}
				catch ( java.sql.SQLException $sqlx )
				{
					com.ibm.javart.sql.Sql.fail( ezeProgram, "PREPARE", $sqlx, null, null, false, 0, false );
				}
				// Get WITH getRowCount into listSpec.rowCount;
				{
					java.sql.PreparedStatement $prepStmt = null;
					com.ibm.javart.sql.JavartResultSet $resultSet = null;
					try
					{
						com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET" , null );
						com.ibm.javart.sql.JavartPreparedStatement $stmt = ezeProgram._preparedStatements()[ 2 ];
						if ( $stmt == null )
						{
							com.ibm.javart.sql.Sql.failNoPreparedStatement( ezeProgram, "GET", null, 2 );
						}
						$prepStmt = $stmt.getStatement();
						java.sql.ResultSet $newResults = $prepStmt.executeQuery();
						$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, null );
						$resultSet.setJavartStatement( $stmt );
						if ( $resultSet.next( ezeProgram ) )
						{
							boolean $truncation = false;
							java.sql.ResultSet $results = $resultSet.getResultSet();
							int $columns = $results.getMetaData().getColumnCount();
							com.ibm.javart.sql.SqlHostVars.getInt( listSpec.rowCount, $results, 1, false, $columns, ezeProgram );
							$resultSet.close();
							com.ibm.javart.sql.Sql.end( ezeProgram, "GET", null, 0, null, false, false, $truncation, false );
						}
						else
						{
							$resultSet.close();
							com.ibm.javart.sql.Sql.end( ezeProgram, "GET", null, 0, null, false, false, false, true );
						}
					}
					catch ( java.sql.SQLException $sqlx )
					{
						if ( $resultSet != null )
						{
							try
							{
								$resultSet.close();
							}
							catch ( java.sql.SQLException $sqlx2 )
							{
							}
						}
						com.ibm.javart.sql.Sql.fail( ezeProgram, "GET", $sqlx, null, $prepStmt, true, 0, false );
					}
				}
				// listSpec.pageCount = listSpec.rowCount / listSpec.blockingFactor;
				com.ibm.javart.operations.Assign.run( ezeProgram, listSpec.pageCount, com.ibm.javart.operations.Divide.run( ezeProgram, listSpec.rowCount, listSpec.blockingFactor ) );
				// IF ( listSpec.rowCount % listSpec.blockingFactor != 0 )
				if ( (com.ibm.javart.operations.ConvertToInt.run( ezeProgram, com.ibm.javart.operations.Remainder.run( ezeProgram, listSpec.rowCount, listSpec.blockingFactor ) ) != (short)0) )
				{
					// listSpec.pageCount = listSpec.pageCount + 1;
					com.ibm.javart.operations.Increment.run( ezeProgram, listSpec.pageCount );
				}
				// listSpec.initialized = true;
				listSpec.initialized.setValue( true );
			}
			// IF ( listSpec.rowCount == 0 )
			if ( (listSpec.rowCount.getValue() == (short)0) )
			{
				// RETURN
				if ( true )
				{
					_funcPop();
					return;
				}
			}
			// IF ( listSpec.position > listSpec.rowCount )
			if ( (listSpec.position.getValue() > listSpec.rowCount.getValue()) )
			{
				// listSpec.position = listSpec.pageCount - 1 * listSpec.blockingFactor + 1;
				com.ibm.javart.operations.Assign.run( ezeProgram, listSpec.position, com.ibm.javart.operations.Add.run( ezeProgram, com.ibm.javart.operations.Multiply.run( ezeProgram, com.ibm.javart.operations.Subtract.run( ezeProgram, listSpec.pageCount, (short)1 ), listSpec.blockingFactor ), (short)1 ) );
			}
			// IF ( listSpec.position + listSpec.blockingFactor > listSpec.rowCount )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, listSpec.position, listSpec.blockingFactor ), listSpec.rowCount, -1 ) > 0) )
			{
				// customerList.resize(listSpec.rowCount - listSpec.position + 1);
				customerList.checkedValue( ezeProgram ).resize( ezeProgram, com.ibm.javart.operations.ConvertToInt.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, com.ibm.javart.operations.Subtract.run( ezeProgram, listSpec.rowCount, listSpec.position ), (short)1 ) ) );
			}
			else
			{
				// customerList.resize(listSpec.blockingFactor);
				customerList.checkedValue( ezeProgram ).resize( ezeProgram, listSpec.blockingFactor.getValue() );
			}
			// Open resultSet SCROLL WITH selectStatement;
			{
				java.sql.PreparedStatement $prepStmt = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "OPEN", null );
					com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
					com.ibm.javart.sql.JavartResultSet $resultSet = $resultSets[1];
					if ( $resultSet != null )
					{
						$resultSets[1] = null;
						$resultSet.close();
					}
					com.ibm.javart.sql.JavartPreparedStatement $stmt = ezeProgram._preparedStatements()[1];
					if ( $stmt == null )
					{
						com.ibm.javart.sql.Sql.failNoPreparedStatement( ezeProgram, "OPEN", null, 1 );
					}
					$prepStmt = $stmt.getStatement( false, true, false );
					java.sql.ResultSet $newResults;
					$prepStmt.execute();
					$newResults = $prepStmt.getResultSet();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 1, $newResults, $con, null, null );
					$resultSet.setJavartStatement( $stmt );
					$resultSet.setScrollable();
					$resultSets[ 1 ] = $resultSet;
					com.ibm.javart.sql.Sql.end( ezeProgram, "OPEN", null, 0, $prepStmt, false, false, false, false );
				}
				catch ( java.sql.SQLException $sqlx )
				{
					com.ibm.javart.sql.Sql.fail( ezeProgram, "OPEN", $sqlx, null, $prepStmt, false, 1, true );
				}
			}
			// Get ABSOLUTE (listSpec.position) from resultSet into temp.CustomerId, temp.firstName, temp.lastName, temp.Password, temp.Phone, temp.EmailAddress, tem...
			{
				int $position = listSpec.position.getValue();
				com.ibm.javart.sql.Sql.begin2( ezeProgram, "GET ABSOLUTE" );
				com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
				com.ibm.javart.sql.JavartResultSet $resultSet = $resultSets[ 1 ];
				{
					if ( $resultSet != null )
					{
						try
						{
							if ( $resultSet.absolute( ezeProgram, $position ) )
							{
								boolean $truncation = false;
								java.sql.ResultSet $results = $resultSet.getResultSet();
								int $columns = $results.getMetaData().getColumnCount();
								com.ibm.javart.sql.SqlHostVars.getInt( temp.CustomerId, $results, 1, false, $columns, ezeProgram );
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.FirstName, $results, 2, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.LastName, $results, 3, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Password, $results, 4, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Phone, $results, 5, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.EmailAddress, $results, 6, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Street, $results, 7, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Apartment, $results, 8, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.City, $results, 9, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.State, $results, 10, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Postalcode, $results, 11, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Directions, $results, 12, true, $columns, ezeProgram ) || $truncation;
								com.ibm.javart.sql.Sql.end( ezeProgram, "GET ABSOLUTE", null, ezeProgram.egl__core__SysVar.sqlData.getsqlca__sqlerrd()[2], null, false, false, $truncation, false );
							}
							else
							{
								if ( !$resultSet.isScrollable() )
								{
									$resultSets[ 1 ] = null;
									$resultSet.close();
								}
								com.ibm.javart.sql.Sql.end( ezeProgram, "GET ABSOLUTE", null, 0, null, false, false, false, true );
							}
						}
						catch ( java.sql.SQLException $sqlx )
						{
							com.ibm.javart.sql.Sql.fail( ezeProgram, "GET ABSOLUTE", $sqlx, null, null, false, 1, false );
						}
					}
					else
					{
						com.ibm.javart.sql.Sql.failNoResultSet( ezeProgram, "GET ABSOLUTE", null, 1 );
					}
				}
			}
			// customerList[i] = temp;
			com.ibm.javart.operations.Assign.run( ezeProgram, ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, customerList.checkedValue( ezeProgram ), i )), temp );
			// IF ( listSpec.position + 1 <= listSpec.rowCount )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, listSpec.position, (short)1 ), listSpec.rowCount, 1 ) <= 0) )
			{
				// for ( i From 2 To customerList.getSize() Increment 1 )
				i = (short)2;
				for ( ; (i <= customerList.checkedValue( ezeProgram ).getSize( ezeProgram )); i++ )
				{
					// Get NEXT from resultSet into temp.CustomerId, temp.firstName, temp.lastName, temp.Password, temp.Phone, temp.EmailAddress, temp.Street, temp.Apartment...
					{
						com.ibm.javart.sql.Sql.begin2( ezeProgram, "GET NEXT" );
						com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
						com.ibm.javart.sql.JavartResultSet $resultSet = $resultSets[ 1 ];
						{
							if ( $resultSet != null )
							{
								try
								{
									if ( $resultSet.next( ezeProgram ) )
									{
										boolean $truncation = false;
										java.sql.ResultSet $results = $resultSet.getResultSet();
										int $columns = $results.getMetaData().getColumnCount();
										com.ibm.javart.sql.SqlHostVars.getInt( temp.CustomerId, $results, 1, false, $columns, ezeProgram );
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.FirstName, $results, 2, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.LastName, $results, 3, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Password, $results, 4, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Phone, $results, 5, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.EmailAddress, $results, 6, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Street, $results, 7, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Apartment, $results, 8, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.City, $results, 9, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.State, $results, 10, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Postalcode, $results, 11, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Directions, $results, 12, true, $columns, ezeProgram ) || $truncation;
										com.ibm.javart.sql.Sql.end( ezeProgram, "GET NEXT", null, ezeProgram.egl__core__SysVar.sqlData.getsqlca__sqlerrd()[2], null, false, false, $truncation, false );
									}
									else
									{
										if ( !$resultSet.isScrollable() )
										{
											$resultSets[ 1 ] = null;
											$resultSet.close();
										}
										com.ibm.javart.sql.Sql.end( ezeProgram, "GET NEXT", null, 0, null, false, false, false, true );
									}
								}
								catch ( java.sql.SQLException $sqlx )
								{
									com.ibm.javart.sql.Sql.fail( ezeProgram, "GET NEXT", $sqlx, null, null, false, 1, false );
								}
							}
							else
							{
								com.ibm.javart.sql.Sql.failNoResultSet( ezeProgram, "GET NEXT", null, 1 );
							}
						}
					}
					// customerList[i] = temp;
					com.ibm.javart.operations.Assign.run( ezeProgram, ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, customerList.checkedValue( ezeProgram ), i )), temp );
				}
			}
			// ConditionHandlingLib.HandleSuccess(status);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			// listSpec.position = listSpec.position + customerList.getSize();
			com.ibm.javart.operations.Assign.run( ezeProgram, listSpec.position, com.ibm.javart.operations.Add.run( ezeProgram, listSpec.position, customerList.checkedValue( ezeProgram ).getSize( ezeProgram ) ) );
			// listOut = customerList;
			listOut.update( customerList.value() );
		}
		catch ( egl.io.sql.SQLException_Ex eze$Temp10 )
		{
			egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp10.getRecord() );
			// ConditionHandlingLib.HandleException(status, exception);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_UpdateCustomer( egltui.data.Customer updateRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "UpdateCustomer" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// IF ( IsValid(updateRecord) )
			if ( $func_IsValid( updateRecord ).getValue() )
			{
				// Replace updateRecord NOCURSOR;
				{
					java.sql.PreparedStatement $stmt = null;
					try
					{
						com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "REPLACE", updateRecord );
						boolean $forceNrf = false;
						int $count = 0;
						String $sql = "update EGL.CUSTOMER " + "set EGL.CUSTOMER.FIRSTNAME = " + "? " + ", EGL.CUSTOMER.LASTNAME = " + "? " + ", EGL.CUSTOMER.PASSWORD = " + "? " + ", EGL.CUSTOMER.PHONE = " + "? " + ", EGL.CUSTOMER.EMAILADDRESS = " + "? " + ", EGL.CUSTOMER.STREET = " + "? " + ", EGL.CUSTOMER.APARTMENT = " + "? " + ", EGL.CUSTOMER.CITY = " + "? " + ", EGL.CUSTOMER.\"STATE\" = " + "? " + ", EGL.CUSTOMER.POSTALCODE = " + "? " + ", EGL.CUSTOMER.DIRECTIONS = " + "? " + "where EGL.CUSTOMER.CUSTOMERID = " + "? ";
						$stmt = $con.getConnection().prepareStatement( $sql );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.FirstName, $stmt, 1, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.LastName, $stmt, 2, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.Password, $stmt, 3, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.Phone, $stmt, 4, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.EmailAddress, $stmt, 5, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.Street, $stmt, 6, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.Apartment, $stmt, 7, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.City, $stmt, 8, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.State, $stmt, 9, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.Postalcode, $stmt, 10, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.Directions, $stmt, 11, true, java.sql.Types.VARCHAR, ezeProgram );
						$stmt.setInt( 12, updateRecord.CustomerId.getValue() );
						$count = $stmt.executeUpdate();
						$forceNrf = ($count == 0);
						com.ibm.javart.sql.Sql.end( ezeProgram, "REPLACE", updateRecord, $count, $stmt, true, false, false, $forceNrf );
					}
					catch ( java.sql.SQLException $sqlx )
					{
						com.ibm.javart.sql.Sql.fail( ezeProgram, "REPLACE", $sqlx, updateRecord, $stmt, true, 0, false );
					}
				}
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
		}
		catch ( egl.io.sql.SQLException_Ex eze$Temp11 )
		{
			egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp11.getRecord() );
			// ConditionHandlingLib.HandleException(status, exception);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_UpdateCustomerList__0$T14ace9d72( com.ibm.javart.ref.ContainerArrayRef customerList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "UpdateCustomerList" );
		
		// sz INT;
		int sz = 0;
		// sz = customerList.getSize();
		sz = customerList.checkedValue( ezeProgram ).getSize( ezeProgram );
		// for ( i From 1 To sz Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp3: for ( ; (i <= sz); i++ )
			{
				// UpdateCustomer(customerList[i], status);
				$func_UpdateCustomer( ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, customerList.checkedValue( ezeProgram ), i )), status );
				// IF ( status.succeeded )
				Leze$Temp4: if ( status.succeeded.getValue() )
				{
					//  Continue ;
					if ( true ) { continue Leze$Temp3; }
				}
				else
				{
					// exit;
					if ( true ) { break Leze$Temp4; }
				}
			}
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_DeleteCustomer( egltui.data.Customer deletionRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "DeleteCustomer" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Delete deletionRecord NOCURSOR;
			{
				java.sql.PreparedStatement $stmt = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "DELETE", deletionRecord );
					boolean $forceNrf = false;
					int $count = 0;
					String $sql = "delete " + "from EGL.CUSTOMER " + "where EGL.CUSTOMER.CUSTOMERID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, deletionRecord.CustomerId.getValue() );
					$count = $stmt.executeUpdate();
					$forceNrf = ($count == 0);
					com.ibm.javart.sql.Sql.end( ezeProgram, "DELETE", deletionRecord, $count, $stmt, true, false, false, $forceNrf );
				}
				catch ( java.sql.SQLException $sqlx )
				{
					com.ibm.javart.sql.Sql.fail( ezeProgram, "DELETE", $sqlx, deletionRecord, $stmt, true, 0, false );
				}
			}
			// ConditionHandlingLib.HandleSuccess(status);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
		}
		catch ( egl.io.sql.SQLException_Ex eze$Temp12 )
		{
			egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp12.getRecord() );
			// ConditionHandlingLib.HandleException(status, exception);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $func_DeleteCustomerList__0$T14ace9d72( com.ibm.javart.ref.ContainerArrayRef customerList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "DeleteCustomerList" );
		
		// sz INT;
		int sz = 0;
		// sz = customerList.getSize();
		sz = customerList.checkedValue( ezeProgram ).getSize( ezeProgram );
		// for ( i From 1 To sz Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp5: for ( ; (i <= sz); i++ )
			{
				// DeleteCustomer(customerList[i], status);
				$func_DeleteCustomer( ((egltui.data.Customer)com.ibm.javart.operations.Subscript.run( ezeProgram, customerList.checkedValue( ezeProgram ), i )), status );
				// IF ( status.succeeded )
				Leze$Temp6: if ( status.succeeded.getValue() )
				{
					//  Continue ;
					if ( true ) { continue Leze$Temp5; }
				}
				else
				{
					// exit;
					if ( true ) { break Leze$Temp6; }
				}
			}
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public com.ibm.javart.BooleanValue $func_Exists( com.ibm.javart.IntValue CustomerId ) throws java.lang.Exception
	{
		_funcPush( "Exists" );
		com.ibm.javart.BooleanValue $result = new com.ibm.javart.BooleanItem( "BOOLEAN", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		
		// TRY 
		try
		{
			// Get into CustomerId;
			{
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", null );
					String $sql = "select CUSTOMERID "
					+ "from EGL.CUSTOMER " + "where CUSTOMERID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, CustomerId.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( CustomerId, $results, 1, false, $columns, ezeProgram );
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", null, 0, null, false, false, $truncation, false );
					}
					else
					{
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", null, 0, null, false, false, false, true );
					}
				}
				catch ( java.sql.SQLException $sqlx )
				{
					if ( $resultSet != null )
					{
						try
						{
							$resultSet.close();
						}
						catch ( java.sql.SQLException $sqlx2 )
						{
						}
					}
					com.ibm.javart.sql.Sql.fail( ezeProgram, "GET", $sqlx, null, null, false, 0, false );
				}
			}
			// IF ( SysVar.sqlData.sqlca.sqlcode == 0 )
			if ( (ezeProgram.egl__core__SysVar.sqlData.sqlca__sqlcode.getValue() == (short)0) )
			{
				// RETURN true
				if ( true )
				{
					// $result = true;
					$result.setValue( true );
					_funcPop();
					return $result;
				}
			}
			else
			{
				// RETURN false
				if ( true )
				{
					// $result = false;
					$result.setValue( false );
					_funcPop();
					return $result;
				}
			}
		}
		catch ( java.lang.Exception eze$Temp13 )
		{
			com.ibm.javart.util.JavartUtil.anyExceptionHandler( ezeProgram, eze$Temp13, "exception" );
			// RETURN false
			if ( true )
			{
				// $result = false;
				$result.setValue( false );
				_funcPop();
				return $result;
			}
		}
		// RETURN BOOLEAN
		_funcPop();
		return $result;
	}
	
	public com.ibm.javart.BooleanValue $func_IsValid( egltui.data.Customer testRecord ) throws java.lang.Exception
	{
		_funcPush( "IsValid" );
		com.ibm.javart.BooleanValue $result = new com.ibm.javart.BooleanItem( "BOOLEAN", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		
		// RETURN true
		// $result = true;
		$result.setValue( true );
		_funcPop();
		return $result;
	}
	
	public void $func_GetLastCustomer( egltui.data.Customer searchRecord, com.ibm.javart.Storage $outsearchRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetLastCustomer" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// lastCustomer LastCustomer;
			egltui.data.LastCustomer lastCustomer = new egltui.data.LastCustomer( "lastCustomer", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/LastCustomer;" );
			// maxCustId INT;
			com.ibm.javart.IntValue maxCustId = new com.ibm.javart.IntItem( "maxCustId", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
			// Get lastCustomer into maxCustId;
			{
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", lastCustomer );
					com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
					if ( lastCustomer.currentResultSetId() > 0 )
					{
						$resultSet = $resultSets[ lastCustomer.currentResultSetId() ];
						if ( $resultSet != null )
						{
							$resultSets[ lastCustomer.currentResultSetId() ] = null;
							$resultSet.close();
						}
						lastCustomer.currentResultSetId( 0 );
					}
					
					String $sql = "select max(EGL.CUSTOMER.CUSTOMERID) "
					+ "from EGL.CUSTOMER ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( maxCustId, $results, 1, false, $columns, ezeProgram );
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", lastCustomer, 0, null, false, false, $truncation, false );
					}
					else
					{
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", lastCustomer, 0, null, false, false, false, true );
					}
				}
				catch ( java.sql.SQLException $sqlx )
				{
					if ( $resultSet != null )
					{
						try
						{
							$resultSet.close();
						}
						catch ( java.sql.SQLException $sqlx2 )
						{
						}
					}
					com.ibm.javart.sql.Sql.fail( ezeProgram, "GET", $sqlx, lastCustomer, null, false, 0, false );
				}
			}
			// IF ( maxCustId == 0 )
			if ( (maxCustId.getValue() == (short)0) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.CUSTOMER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.CUSTOMER" ) );
			}
			else
			{
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
			// Set searchRecord empty;
			com.ibm.javart.operations.SetEmpty.run( ezeProgram, searchRecord );
			// searchRecord.CustomerId = maxCustId;
			searchRecord.CustomerId.setValue( maxCustId.getValue() );
			// Get searchRecord;
			{
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", searchRecord );
					com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
					if ( searchRecord.currentResultSetId() > 0 )
					{
						$resultSet = $resultSets[ searchRecord.currentResultSetId() ];
						if ( $resultSet != null )
						{
							$resultSets[ searchRecord.currentResultSetId() ] = null;
							$resultSet.close();
						}
						searchRecord.currentResultSetId( 0 );
					}
					
					String $sql = "select EGL.CUSTOMER.CUSTOMERID, EGL.CUSTOMER.FIRSTNAME, EGL.CUSTOMER.LASTNAME, EGL.CUSTOMER.PASSWORD, EGL.CUSTOMER.PHONE, EGL.CUSTOMER.EMAILADDRESS, EGL.CUSTOMER.STREET, EGL.CUSTOMER.APARTMENT, EGL.CUSTOMER.CITY, EGL.CUSTOMER.\"STATE\", EGL.CUSTOMER.POSTALCODE, EGL.CUSTOMER.DIRECTIONS "
					+ "from EGL.CUSTOMER " + "where EGL.CUSTOMER.CUSTOMERID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, searchRecord.CustomerId.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.CustomerId, $results, 1, false, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.FirstName, $results, 2, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.LastName, $results, 3, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Password, $results, 4, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Phone, $results, 5, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.EmailAddress, $results, 6, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Street, $results, 7, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Apartment, $results, 8, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.City, $results, 9, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.State, $results, 10, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Postalcode, $results, 11, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Directions, $results, 12, true, $columns, ezeProgram ) || $truncation;
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", searchRecord, 0, null, false, false, $truncation, false );
					}
					else
					{
						$resultSet.close();
						com.ibm.javart.sql.Sql.end( ezeProgram, "GET", searchRecord, 0, null, false, false, false, true );
					}
				}
				catch ( java.sql.SQLException $sqlx )
				{
					if ( $resultSet != null )
					{
						try
						{
							$resultSet.close();
						}
						catch ( java.sql.SQLException $sqlx2 )
						{
						}
					}
					com.ibm.javart.sql.Sql.fail( ezeProgram, "GET", $sqlx, searchRecord, null, false, 0, false );
				}
			}
			// IF ( SysVar.sqlData.sqlca.sqlcode == 100 )
			if ( (ezeProgram.egl__core__SysVar.sqlData.sqlca__sqlcode.getValue() == (short)100) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.CUSTOMER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.CUSTOMER" ) );
			}
			else
			{
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
		}
		catch ( egl.io.sql.SQLException_Ex eze$Temp14 )
		{
			egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp14.getRecord() );
			// ConditionHandlingLib.HandleException(status, exception);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
		}
		// RETURN
		com.ibm.javart.operations.Assign.run( ezeProgram, $outsearchRecord, searchRecord );
		_funcPop();
		return;
	}
	
	public void $func_GetCustomerListStartName__1$T14ace9d72( com.ibm.javart.CharValue startName, com.ibm.javart.ref.ContainerArrayRef customerArray, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetCustomerListStartName" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get customerArray;
			{
				int $maxSize = java.lang.Integer.MAX_VALUE;
				if ( !com.ibm.javart.operations.IsNull.run( ezeProgram, customerArray ) )
				{
					$maxSize = customerArray.value().getMaxSize();
				}
				customerArray.createNewValue( ezeProgram );
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
				com.ibm.javart.arrays.ContainerArray $array = customerArray.value();
				customerArray.value().setMaxSize( ezeProgram, $maxSize );
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", customerArray.value() );
					String $sql = "select EGL.CUSTOMER.CUSTOMERID, EGL.CUSTOMER.FIRSTNAME, EGL.CUSTOMER.LASTNAME, EGL.CUSTOMER.PASSWORD, EGL.CUSTOMER.PHONE, EGL.CUSTOMER.EMAILADDRESS, EGL.CUSTOMER.STREET, EGL.CUSTOMER.APARTMENT, EGL.CUSTOMER.CITY, EGL.CUSTOMER.\"STATE\", EGL.CUSTOMER.POSTALCODE, EGL.CUSTOMER.DIRECTIONS "
					+ "from EGL.CUSTOMER " + "where EGL.CUSTOMER.LASTNAME > " + "? " + "order by EGL.CUSTOMER.LASTNAME, EGL.CUSTOMER.FIRSTNAME asc ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setString( 1, startName.getValueAsString() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					$resultSets[ 0 ] = $resultSet;
					$array.ioStatus( 0 );
					for ( int $i = 0; $i < $maxSize && com.ibm.javart.sql.Sql.nextArrayResult( ezeProgram, $array, $resultSet, $i == 0, false ); $i++ )
					{
						egltui.data.Customer $rec = (egltui.data.Customer)$array.makeNewElement( ezeProgram );
						$array.appendObject( ezeProgram, $rec );
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.CustomerId, $results, 1, false, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.FirstName, $results, 2, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.LastName, $results, 3, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Password, $results, 4, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Phone, $results, 5, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.EmailAddress, $results, 6, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Street, $results, 7, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Apartment, $results, 8, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.City, $results, 9, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.State, $results, 10, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Postalcode, $results, 11, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Directions, $results, 12, true, $columns, ezeProgram );
					}
					if ( $resultSets[ 0 ] != null )
					{
						boolean $more = $resultSet.getResultSet().next();
						$resultSets[ 0 ] = null;
						$resultSet.close();
						com.ibm.javart.sql.Sql.endGetArray( ezeProgram, $array, !$more, false );
					}
					else
					{
						com.ibm.javart.sql.Sql.endGetArray( ezeProgram, $array, $array.ioStatus() == 0, false );
					}
				}
				catch ( java.sql.SQLException $sqlx )
				{
					if ( $resultSet != null )
					{
						$resultSets[ 0 ] = null;
						try
						{
							$resultSet.close();
						}
						catch ( java.sql.SQLException $sqlx2 )
						{
						}
					}
					com.ibm.javart.sql.Sql.fail( ezeProgram, "GET", $sqlx, $array, null, false, 0, false );
				}
			}
			// IF ( customerArray.getSize() == 0 )
			if ( (customerArray.checkedValue( ezeProgram ).getSize( ezeProgram ) == (short)0) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.CUSTOMER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.CUSTOMER" ) );
			}
			else
			{
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
		}
		catch ( egl.io.sql.SQLException_Ex eze$Temp15 )
		{
			egl.io.sql.SQLException_Ref exception = new egl.io.sql.SQLException_Ref( "exception", (egl.io.sql.SQLException)eze$Temp15.getRecord() );
			// ConditionHandlingLib.HandleException(status, exception);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleException( status, exception );
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initCustomerLib_Lib( CustomerLib_Lib ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		java.util.HashMap<java.lang.String, java.lang.Integer> $resultsMap = new java.util.HashMap<java.lang.String, java.lang.Integer>();
		$resultsMap.put( "RESULTSET", java.lang.Integer.valueOf( 1 ) );
		java.util.HashMap<java.lang.String, java.lang.Integer> $stmtsMap = new java.util.HashMap<java.lang.String, java.lang.Integer>();
		$stmtsMap.put( "SELECTSTATEMENT", java.lang.Integer.valueOf( 1 ) );
		$stmtsMap.put( "GETROWCOUNT", java.lang.Integer.valueOf( 2 ) );
		_sqlSetup( 1, 2, $resultsMap, $stmtsMap );
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
