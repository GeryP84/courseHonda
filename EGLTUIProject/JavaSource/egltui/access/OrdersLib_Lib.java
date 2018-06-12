// Generated at Mon Jun 11 21:44:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.access;

public class OrdersLib_Lib extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final OrdersLib_Lib ezeProgram;
	public egltui.ConditionHandlingLib_Lib egltui__ConditionHandlingLib;
	
	public OrdersLib_Lib( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "OrdersLib_Lib", "OrdersLib", ru, false, true, 6 );
		ezeProgram = this;
		_runUnit().addLibrary( "egltui.access.OrdersLib_Lib", this );
		egltui__ConditionHandlingLib = (egltui.ConditionHandlingLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.ConditionHandlingLib_Lib" );
		$initOrdersLib_Lib( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return false;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return false;
	}
	
	public void $func_AddOrders( egltui.data.Orders newRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "AddOrders" );
		
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
						String $sql = "insert into EGL.ORDERS " + "(EGL.ORDERS.ORDERID, EGL.ORDERS.CUSTOMERID, EGL.ORDERS.ORDERAMOUNT, EGL.ORDERS.ORDERDETAILS, EGL.ORDERS.ORDERDATE, EGL.ORDERS.ORDERSTATUS) " + "values ( " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ") ";
						$stmt = $con.getConnection().prepareStatement( $sql );
						$stmt.setInt( 1, newRecord.OrderId.getValue() );
						com.ibm.javart.sql.SqlHostVars.setInt( newRecord.CustomerId, $stmt, 2, true );
						com.ibm.javart.sql.SqlHostVars.setNumericDec( newRecord.OrderAmount, $stmt, 3, true, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.OrderDetails, $stmt, 4, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setDate( newRecord.OrderDate, $stmt, 5, true, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.OrderStatus, $stmt, 6, true, java.sql.Types.CHAR );
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
	
	public void $func_AddOrdersList__0$T12n23612a87( com.ibm.javart.ref.ContainerArrayRef newRecordList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "AddOrdersList" );
		
		// for ( i From 1 To newRecordList.getSize() Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp1: for ( ; (i <= newRecordList.checkedValue( ezeProgram ).getSize( ezeProgram )); i++ )
			{
				// AddOrders(newRecordList[i], status);
				$func_AddOrders( ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, newRecordList.checkedValue( ezeProgram ), i )), status );
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
	
	public void $func_GetOrders( egltui.data.Orders searchRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetOrders" );
		
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
					
					String $sql = "select EGL.ORDERS.ORDERID, EGL.ORDERS.CUSTOMERID, EGL.ORDERS.ORDERAMOUNT, EGL.ORDERS.ORDERDETAILS, EGL.ORDERS.ORDERDATE, EGL.ORDERS.ORDERSTATUS "
					+ "from EGL.ORDERS " + "where EGL.ORDERS.ORDERID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, searchRecord.OrderId.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.OrderId, $results, 1, false, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.CustomerId, $results, 2, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getNumericDec( searchRecord.OrderAmount, $results, 3, true, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.OrderDetails, $results, 4, true, $columns, ezeProgram ) || $truncation;
						com.ibm.javart.sql.SqlHostVars.getDate( searchRecord.OrderDate, $results, 5, true, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.OrderStatus, $results, 6, true, $columns, ezeProgram ) || $truncation;
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
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.ORDERS");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.ORDERS" ) );
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
	
	public void $func_GetOrdersListAll__0$T12n23612a87( com.ibm.javart.ref.ContainerArrayRef ordersArray, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetOrdersListAll" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get ordersArray;
			{
				int $maxSize = java.lang.Integer.MAX_VALUE;
				if ( !com.ibm.javart.operations.IsNull.run( ezeProgram, ordersArray ) )
				{
					$maxSize = ordersArray.value().getMaxSize();
				}
				ordersArray.createNewValue( ezeProgram );
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
				com.ibm.javart.arrays.ContainerArray $array = ordersArray.value();
				ordersArray.value().setMaxSize( ezeProgram, $maxSize );
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", ordersArray.value() );
					String $sql = "select EGL.ORDERS.ORDERID, EGL.ORDERS.CUSTOMERID, EGL.ORDERS.ORDERAMOUNT, EGL.ORDERS.ORDERDETAILS, EGL.ORDERS.ORDERDATE, EGL.ORDERS.ORDERSTATUS "
					+ "from EGL.ORDERS " + "order by EGL.ORDERS.ORDERID asc ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					$resultSets[ 0 ] = $resultSet;
					$array.ioStatus( 0 );
					for ( int $i = 0; $i < $maxSize && com.ibm.javart.sql.Sql.nextArrayResult( ezeProgram, $array, $resultSet, $i == 0, false ); $i++ )
					{
						egltui.data.Orders $rec = (egltui.data.Orders)$array.makeNewElement( ezeProgram );
						$array.appendObject( ezeProgram, $rec );
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.OrderId, $results, 1, false, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.CustomerId, $results, 2, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getNumericDec( $rec.OrderAmount, $results, 3, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.OrderDetails, $results, 4, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getDate( $rec.OrderDate, $results, 5, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.OrderStatus, $results, 6, true, $columns, ezeProgram );
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
			// IF ( ordersArray.getSize() == 0 )
			if ( (ordersArray.checkedValue( ezeProgram ).getSize( ezeProgram ) == (short)0) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.ORDERS");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.ORDERS" ) );
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
	
	public void $func_GetOrdersList__1$T12n23612a87( egltui.ListSpecification listSpec, com.ibm.javart.ref.ContainerArrayRef listOut, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetOrdersList" );
		
		// ordersList Orders[0];
		com.ibm.javart.ref.ContainerArrayRef ordersList = new com.ibm.javart.ref.ContainerArrayRef( "ordersList", new com.ibm.javart.arrays.ContainerArray( "ordersList", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Orders;" )
		{
			private static final long serialVersionUID = 70L;
			
			public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				return new egltui.data.Orders( "ordersList", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Orders;" );
			};
		}, "1Tegltui/data/Orders;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "ordersList", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Orders;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new egltui.data.Orders( "ordersList", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Orders;" );
					};
				};
			}
		};
		// temp Orders;
		egltui.data.Orders temp = new egltui.data.Orders( "temp", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Orders;" );
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
				// Prepare selectStatement from "SELECT EGL.ORDERS.* " + listSpec.fromTablesWhere;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "PREPARE", null );
					if ( ezeProgram._preparedStatements()[ 1 ] != null )
					{
						ezeProgram._preparedStatements()[ 1 ].close();
					}
					String $sql = ("SELECT EGL.ORDERS.* " + listSpec.fromTablesWhere.getValue());
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
				// ordersList.resize(listSpec.rowCount - listSpec.position + 1);
				ordersList.checkedValue( ezeProgram ).resize( ezeProgram, com.ibm.javart.operations.ConvertToInt.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, com.ibm.javart.operations.Subtract.run( ezeProgram, listSpec.rowCount, listSpec.position ), (short)1 ) ) );
			}
			else
			{
				// ordersList.resize(listSpec.blockingFactor);
				ordersList.checkedValue( ezeProgram ).resize( ezeProgram, listSpec.blockingFactor.getValue() );
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
			// Get ABSOLUTE (listSpec.position) from resultSet into temp.ORDERID, temp.CUSTOMERID, temp.ORDERAMOUNT, temp.ORDERDETAILS, temp.ORDERDATE, temp.ORDERSTA...
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
								com.ibm.javart.sql.SqlHostVars.getInt( temp.OrderId, $results, 1, false, $columns, ezeProgram );
								com.ibm.javart.sql.SqlHostVars.getInt( temp.CustomerId, $results, 2, true, $columns, ezeProgram );
								com.ibm.javart.sql.SqlHostVars.getNumericDec( temp.OrderAmount, $results, 3, true, $columns, ezeProgram );
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.OrderDetails, $results, 4, true, $columns, ezeProgram ) || $truncation;
								com.ibm.javart.sql.SqlHostVars.getDate( temp.OrderDate, $results, 5, true, $columns, ezeProgram );
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.OrderStatus, $results, 6, true, $columns, ezeProgram ) || $truncation;
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
			// ordersList[i] = temp;
			com.ibm.javart.operations.Assign.run( ezeProgram, ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ordersList.checkedValue( ezeProgram ), i )), temp );
			// IF ( listSpec.position + 1 <= listSpec.rowCount )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, listSpec.position, (short)1 ), listSpec.rowCount, 1 ) <= 0) )
			{
				// for ( i From 2 To ordersList.getSize() Increment 1 )
				i = (short)2;
				for ( ; (i <= ordersList.checkedValue( ezeProgram ).getSize( ezeProgram )); i++ )
				{
					// Get NEXT from resultSet into temp.ORDERID, temp.CUSTOMERID, temp.ORDERAMOUNT, temp.ORDERDETAILS, temp.ORDERDATE, temp.ORDERSTATUS;
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
										com.ibm.javart.sql.SqlHostVars.getInt( temp.OrderId, $results, 1, false, $columns, ezeProgram );
										com.ibm.javart.sql.SqlHostVars.getInt( temp.CustomerId, $results, 2, true, $columns, ezeProgram );
										com.ibm.javart.sql.SqlHostVars.getNumericDec( temp.OrderAmount, $results, 3, true, $columns, ezeProgram );
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.OrderDetails, $results, 4, true, $columns, ezeProgram ) || $truncation;
										com.ibm.javart.sql.SqlHostVars.getDate( temp.OrderDate, $results, 5, true, $columns, ezeProgram );
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.OrderStatus, $results, 6, true, $columns, ezeProgram ) || $truncation;
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
					// ordersList[i] = temp;
					com.ibm.javart.operations.Assign.run( ezeProgram, ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ordersList.checkedValue( ezeProgram ), i )), temp );
				}
			}
			// ConditionHandlingLib.HandleSuccess(status);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			// listSpec.position = listSpec.position + ordersList.getSize();
			com.ibm.javart.operations.Assign.run( ezeProgram, listSpec.position, com.ibm.javart.operations.Add.run( ezeProgram, listSpec.position, ordersList.checkedValue( ezeProgram ).getSize( ezeProgram ) ) );
			// listOut = ordersList;
			listOut.update( ordersList.value() );
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
	
	public void $func_UpdateOrders( egltui.data.Orders updateRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "UpdateOrders" );
		
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
						String $sql = "update EGL.ORDERS " + "set EGL.ORDERS.CUSTOMERID = " + "? " + ", EGL.ORDERS.ORDERAMOUNT = " + "? " + ", EGL.ORDERS.ORDERDETAILS = " + "? " + ", EGL.ORDERS.ORDERDATE = " + "? " + ", EGL.ORDERS.ORDERSTATUS = " + "? " + "where EGL.ORDERS.ORDERID = " + "? ";
						$stmt = $con.getConnection().prepareStatement( $sql );
						com.ibm.javart.sql.SqlHostVars.setInt( updateRecord.CustomerId, $stmt, 1, true );
						com.ibm.javart.sql.SqlHostVars.setNumericDec( updateRecord.OrderAmount, $stmt, 2, true, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.OrderDetails, $stmt, 3, true, java.sql.Types.VARCHAR, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setDate( updateRecord.OrderDate, $stmt, 4, true, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.OrderStatus, $stmt, 5, true, java.sql.Types.CHAR );
						$stmt.setInt( 6, updateRecord.OrderId.getValue() );
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
	
	public void $func_UpdateOrdersList__0$T12n23612a87( com.ibm.javart.ref.ContainerArrayRef ordersList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "UpdateOrdersList" );
		
		// sz INT;
		int sz = 0;
		// sz = ordersList.getSize();
		sz = ordersList.checkedValue( ezeProgram ).getSize( ezeProgram );
		// for ( i From 1 To sz Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp3: for ( ; (i <= sz); i++ )
			{
				// UpdateOrders(ordersList[i], status);
				$func_UpdateOrders( ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ordersList.checkedValue( ezeProgram ), i )), status );
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
	
	public void $func_DeleteOrders( egltui.data.Orders deletionRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "DeleteOrders" );
		
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
					String $sql = "delete " + "from EGL.ORDERS " + "where EGL.ORDERS.ORDERID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, deletionRecord.OrderId.getValue() );
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
	
	public void $func_DeleteOrdersList__0$T12n23612a87( com.ibm.javart.ref.ContainerArrayRef ordersList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "DeleteOrdersList" );
		
		// sz INT;
		int sz = 0;
		// sz = ordersList.getSize();
		sz = ordersList.checkedValue( ezeProgram ).getSize( ezeProgram );
		// for ( i From 1 To sz Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp5: for ( ; (i <= sz); i++ )
			{
				// DeleteOrders(ordersList[i], status);
				$func_DeleteOrders( ((egltui.data.Orders)com.ibm.javart.operations.Subscript.run( ezeProgram, ordersList.checkedValue( ezeProgram ), i )), status );
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
	
	public com.ibm.javart.BooleanValue $func_Exists( com.ibm.javart.IntValue OrderId ) throws java.lang.Exception
	{
		_funcPush( "Exists" );
		com.ibm.javart.BooleanValue $result = new com.ibm.javart.BooleanItem( "BOOLEAN", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		
		// TRY 
		try
		{
			// Get into OrderId;
			{
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", null );
					String $sql = "select ORDERID "
					+ "from EGL.ORDERS " + "where ORDER_ID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, OrderId.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( OrderId, $results, 1, false, $columns, ezeProgram );
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
	
	public com.ibm.javart.BooleanValue $func_IsValid( egltui.data.Orders testRecord ) throws java.lang.Exception
	{
		_funcPush( "IsValid" );
		com.ibm.javart.BooleanValue $result = new com.ibm.javart.BooleanItem( "BOOLEAN", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		
		// RETURN true
		// $result = true;
		$result.setValue( true );
		_funcPop();
		return $result;
	}
	
	public void $func_GetCustomerOrdersListAll__1$T12n23612a87( com.ibm.javart.IntValue CustomerID, com.ibm.javart.ref.ContainerArrayRef ordersArray, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetCustomerOrdersListAll" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get ordersArray;
			{
				int $maxSize = java.lang.Integer.MAX_VALUE;
				if ( !com.ibm.javart.operations.IsNull.run( ezeProgram, ordersArray ) )
				{
					$maxSize = ordersArray.value().getMaxSize();
				}
				ordersArray.createNewValue( ezeProgram );
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
				com.ibm.javart.arrays.ContainerArray $array = ordersArray.value();
				ordersArray.value().setMaxSize( ezeProgram, $maxSize );
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", ordersArray.value() );
					String $sql = "select EGL.ORDERS.ORDERID, EGL.ORDERS.CUSTOMERID, EGL.ORDERS.ORDERAMOUNT, EGL.ORDERS.ORDERDETAILS, EGL.ORDERS.ORDERDATE, EGL.ORDERS.ORDERSTATUS "
					+ "from EGL.ORDERS " + "where EGL.ORDERS.CUSTOMERID = " + "? " + "order by EGL.ORDERS.ORDER_ID asc ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, CustomerID.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					$resultSets[ 0 ] = $resultSet;
					$array.ioStatus( 0 );
					for ( int $i = 0; $i < $maxSize && com.ibm.javart.sql.Sql.nextArrayResult( ezeProgram, $array, $resultSet, $i == 0, false ); $i++ )
					{
						egltui.data.Orders $rec = (egltui.data.Orders)$array.makeNewElement( ezeProgram );
						$array.appendObject( ezeProgram, $rec );
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.OrderId, $results, 1, false, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.CustomerId, $results, 2, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getNumericDec( $rec.OrderAmount, $results, 3, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.OrderDetails, $results, 4, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getDate( $rec.OrderDate, $results, 5, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.OrderStatus, $results, 6, true, $columns, ezeProgram );
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
			// IF ( ordersArray.getSize() == 0 )
			if ( (ordersArray.checkedValue( ezeProgram ).getSize( ezeProgram ) == (short)0) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.ORDERS");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.ORDERS" ) );
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
		_funcPop();
		return;
	}
	
	public void $initOrdersLib_Lib( OrdersLib_Lib ezeProgram ) throws java.lang.Exception
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
