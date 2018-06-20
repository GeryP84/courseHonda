// Generated at Tue Jun 12 15:21:45 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui.access;

public class SiteuserLib_Lib extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final SiteuserLib_Lib ezeProgram;
	public egltui.ConditionHandlingLib_Lib egltui__ConditionHandlingLib;
	
	public SiteuserLib_Lib( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "SiteuserLib_Lib", "SiteuserLib", ru, false, true, 6 );
		ezeProgram = this;
		_runUnit().addLibrary( "egltui.access.SiteuserLib_Lib", this );
		egltui__ConditionHandlingLib = (egltui.ConditionHandlingLib_Lib)ezeProgram._runUnit().loadLibrary( "egltui.ConditionHandlingLib_Lib" );
		$initSiteuserLib_Lib( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return false;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return false;
	}
	
	public void $func_AddSiteuser( egltui.data.Siteuser newRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "AddSiteuser" );
		
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
						String $sql = "insert into EGL.SITEUSER " + "(EGL.SITEUSER.SITEUSER_ID, EGL.SITEUSER.FIRSTNAME, EGL.SITEUSER.LASTNAME, EGL.SITEUSER.USER_ID, EGL.SITEUSER.PASS_WORD, EGL.SITEUSER.STREET_ADDRESS, EGL.SITEUSER.CITY, EGL.SITEUSER.\"STATE\", EGL.SITEUSER.ZIP, EGL.SITEUSER.SU_TYPE, EGL.SITEUSER.RECEIVE_UPDATES, EGL.SITEUSER.JOIN_CLUB, EGL.SITEUSER.COMMENTS) " + "values ( " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ", " + "? " + ") ";
						$stmt = $con.getConnection().prepareStatement( $sql );
						$stmt.setInt( 1, newRecord.SiteuserId.getValue() );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.Firstname, $stmt, 2, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.Lastname, $stmt, 3, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.UserId, $stmt, 4, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.PassWord, $stmt, 5, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.StreetAddress, $stmt, 6, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.City, $stmt, 7, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.State, $stmt, 8, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( newRecord.Zip, $stmt, 9, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setInt( newRecord.SuType, $stmt, 10, true );
						com.ibm.javart.sql.SqlHostVars.setInt( newRecord.ReceiveUpdates, $stmt, 11, true );
						com.ibm.javart.sql.SqlHostVars.setInt( newRecord.JoinClub, $stmt, 12, true );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( newRecord.Comments, $stmt, 13, true, java.sql.Types.VARCHAR, ezeProgram );
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
	
	public void $func_AddSiteuserList__0$T14efaed26( com.ibm.javart.ref.ContainerArrayRef newRecordList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "AddSiteuserList" );
		
		// for ( i From 1 To newRecordList.getSize() Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp1: for ( ; (i <= newRecordList.checkedValue( ezeProgram ).getSize( ezeProgram )); i++ )
			{
				// AddSiteuser(newRecordList[i], status);
				$func_AddSiteuser( ((egltui.data.Siteuser)com.ibm.javart.operations.Subscript.run( ezeProgram, newRecordList.checkedValue( ezeProgram ), i )), status );
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
	
	public void $func_GetSiteuser( egltui.data.Siteuser searchRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetSiteuser" );
		
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
					
					String $sql = "select EGL.SITEUSER.SITEUSER_ID, EGL.SITEUSER.FIRSTNAME, EGL.SITEUSER.LASTNAME, EGL.SITEUSER.USER_ID, EGL.SITEUSER.PASS_WORD, EGL.SITEUSER.STREET_ADDRESS, EGL.SITEUSER.CITY, EGL.SITEUSER.\"STATE\", EGL.SITEUSER.ZIP, EGL.SITEUSER.SU_TYPE, EGL.SITEUSER.RECEIVE_UPDATES, EGL.SITEUSER.JOIN_CLUB, EGL.SITEUSER.COMMENTS "
					+ "from EGL.SITEUSER " + "where EGL.SITEUSER.SITEUSER_ID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, searchRecord.SiteuserId.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.SiteuserId, $results, 1, false, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Firstname, $results, 2, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Lastname, $results, 3, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.UserId, $results, 4, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.PassWord, $results, 5, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.StreetAddress, $results, 6, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.City, $results, 7, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.State, $results, 8, true, $columns, ezeProgram ) || $truncation;
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Zip, $results, 9, true, $columns, ezeProgram ) || $truncation;
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.SuType, $results, 10, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.ReceiveUpdates, $results, 11, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.JoinClub, $results, 12, true, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Comments, $results, 13, true, $columns, ezeProgram ) || $truncation;
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
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.SITEUSER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.SITEUSER" ) );
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
	
	public void $func_GetSiteuserListAll__0$T14efaed26( com.ibm.javart.ref.ContainerArrayRef siteuserArray, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetSiteuserListAll" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get siteuserArray;
			{
				int $maxSize = java.lang.Integer.MAX_VALUE;
				if ( !com.ibm.javart.operations.IsNull.run( ezeProgram, siteuserArray ) )
				{
					$maxSize = siteuserArray.value().getMaxSize();
				}
				siteuserArray.createNewValue( ezeProgram );
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				com.ibm.javart.sql.JavartResultSet[] $resultSets = ezeProgram._resultSets();
				com.ibm.javart.arrays.ContainerArray $array = siteuserArray.value();
				siteuserArray.value().setMaxSize( ezeProgram, $maxSize );
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", siteuserArray.value() );
					String $sql = "select EGL.SITEUSER.SITEUSER_ID, EGL.SITEUSER.FIRSTNAME, EGL.SITEUSER.LASTNAME, EGL.SITEUSER.USER_ID, EGL.SITEUSER.PASS_WORD, EGL.SITEUSER.STREET_ADDRESS, EGL.SITEUSER.CITY, EGL.SITEUSER.\"STATE\", EGL.SITEUSER.ZIP, EGL.SITEUSER.SU_TYPE, EGL.SITEUSER.RECEIVE_UPDATES, EGL.SITEUSER.JOIN_CLUB, EGL.SITEUSER.COMMENTS "
					+ "from EGL.SITEUSER " + "order by EGL.SITEUSER.SITEUSER_ID asc ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					$resultSets[ 0 ] = $resultSet;
					$array.ioStatus( 0 );
					for ( int $i = 0; $i < $maxSize && com.ibm.javart.sql.Sql.nextArrayResult( ezeProgram, $array, $resultSet, $i == 0, false ); $i++ )
					{
						egltui.data.Siteuser $rec = (egltui.data.Siteuser)$array.makeNewElement( ezeProgram );
						$array.appendObject( ezeProgram, $rec );
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.SiteuserId, $results, 1, false, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Firstname, $results, 2, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Lastname, $results, 3, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.UserId, $results, 4, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.PassWord, $results, 5, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.StreetAddress, $results, 6, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.City, $results, 7, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.State, $results, 8, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Zip, $results, 9, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.SuType, $results, 10, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.ReceiveUpdates, $results, 11, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getInt( $rec.JoinClub, $results, 12, true, $columns, ezeProgram );
						com.ibm.javart.sql.SqlHostVars.getChar( $rec.Comments, $results, 13, true, $columns, ezeProgram );
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
			// IF ( siteuserArray.getSize() == 0 )
			if ( (siteuserArray.checkedValue( ezeProgram ).getSize( ezeProgram ) == (short)0) )
			{
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.SITEUSER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.SITEUSER" ) );
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
	
	public void $func_GetSiteuserList__1$T14efaed26( egltui.ListSpecification listSpec, com.ibm.javart.ref.ContainerArrayRef listOut, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "GetSiteuserList" );
		
		// siteuserList Siteuser[0];
		com.ibm.javart.ref.ContainerArrayRef siteuserList = new com.ibm.javart.ref.ContainerArrayRef( "siteuserList", new com.ibm.javart.arrays.ContainerArray( "siteuserList", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Siteuser;" )
		{
			private static final long serialVersionUID = 70L;
			
			public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				return new egltui.data.Siteuser( "siteuserList", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Siteuser;" );
			};
		}, "1Tegltui/data/Siteuser;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "siteuserList", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Tegltui/data/Siteuser;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new egltui.data.Siteuser( "siteuserList", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Siteuser;" );
					};
				};
			}
		};
		// temp Siteuser;
		egltui.data.Siteuser temp = new egltui.data.Siteuser( "temp", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/data/Siteuser;" );
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
				// Prepare selectStatement from "SELECT EGL.SITEUSER.* " + listSpec.fromTablesWhere;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "PREPARE", null );
					if ( ezeProgram._preparedStatements()[ 1 ] != null )
					{
						ezeProgram._preparedStatements()[ 1 ].close();
					}
					String $sql = ("SELECT EGL.SITEUSER.* " + listSpec.fromTablesWhere.getValue());
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
				// siteuserList.resize(listSpec.rowCount - listSpec.position + 1);
				siteuserList.checkedValue( ezeProgram ).resize( ezeProgram, com.ibm.javart.operations.ConvertToInt.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, com.ibm.javart.operations.Subtract.run( ezeProgram, listSpec.rowCount, listSpec.position ), (short)1 ) ) );
			}
			else
			{
				// siteuserList.resize(listSpec.blockingFactor);
				siteuserList.checkedValue( ezeProgram ).resize( ezeProgram, listSpec.blockingFactor.getValue() );
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
			// Get ABSOLUTE (listSpec.position) from resultSet into temp.SiteuserId, temp.firstName, temp.lastName, temp.userId, temp.Password, temp.StreetAddress, t...
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
								com.ibm.javart.sql.SqlHostVars.getInt( temp.SiteuserId, $results, 1, false, $columns, ezeProgram );
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Firstname, $results, 2, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Lastname, $results, 3, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.UserId, $results, 4, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.PassWord, $results, 5, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.StreetAddress, $results, 6, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.City, $results, 7, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.State, $results, 8, true, $columns, ezeProgram ) || $truncation;
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Zip, $results, 9, true, $columns, ezeProgram ) || $truncation;
								com.ibm.javart.sql.SqlHostVars.getInt( temp.SuType, $results, 10, true, $columns, ezeProgram );
								com.ibm.javart.sql.SqlHostVars.getInt( temp.ReceiveUpdates, $results, 11, true, $columns, ezeProgram );
								com.ibm.javart.sql.SqlHostVars.getInt( temp.JoinClub, $results, 12, true, $columns, ezeProgram );
								$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Comments, $results, 13, true, $columns, ezeProgram ) || $truncation;
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
			// siteuserList[i] = temp;
			com.ibm.javart.operations.Assign.run( ezeProgram, ((egltui.data.Siteuser)com.ibm.javart.operations.Subscript.run( ezeProgram, siteuserList.checkedValue( ezeProgram ), i )), temp );
			// IF ( listSpec.position + 1 <= listSpec.rowCount )
			if ( (com.ibm.javart.operations.Compare.run( ezeProgram, com.ibm.javart.operations.Add.run( ezeProgram, listSpec.position, (short)1 ), listSpec.rowCount, 1 ) <= 0) )
			{
				// for ( i From 2 To siteuserList.getSize() Increment 1 )
				i = (short)2;
				for ( ; (i <= siteuserList.checkedValue( ezeProgram ).getSize( ezeProgram )); i++ )
				{
					// Get NEXT from resultSet into temp.SiteuserId, temp.firstName, temp.lastName, temp.userId, temp.Password, temp.StreetAddress, temp.CITY, temp.STATE, te...
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
										com.ibm.javart.sql.SqlHostVars.getInt( temp.SiteuserId, $results, 1, false, $columns, ezeProgram );
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Firstname, $results, 2, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Lastname, $results, 3, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.UserId, $results, 4, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.PassWord, $results, 5, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.StreetAddress, $results, 6, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.City, $results, 7, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.State, $results, 8, true, $columns, ezeProgram ) || $truncation;
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Zip, $results, 9, true, $columns, ezeProgram ) || $truncation;
										com.ibm.javart.sql.SqlHostVars.getInt( temp.SuType, $results, 10, true, $columns, ezeProgram );
										com.ibm.javart.sql.SqlHostVars.getInt( temp.ReceiveUpdates, $results, 11, true, $columns, ezeProgram );
										com.ibm.javart.sql.SqlHostVars.getInt( temp.JoinClub, $results, 12, true, $columns, ezeProgram );
										$truncation = com.ibm.javart.sql.SqlHostVars.getChar( temp.Comments, $results, 13, true, $columns, ezeProgram ) || $truncation;
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
					// siteuserList[i] = temp;
					com.ibm.javart.operations.Assign.run( ezeProgram, ((egltui.data.Siteuser)com.ibm.javart.operations.Subscript.run( ezeProgram, siteuserList.checkedValue( ezeProgram ), i )), temp );
				}
			}
			// ConditionHandlingLib.HandleSuccess(status);
			ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			// listSpec.position = listSpec.position + siteuserList.getSize();
			com.ibm.javart.operations.Assign.run( ezeProgram, listSpec.position, com.ibm.javart.operations.Add.run( ezeProgram, listSpec.position, siteuserList.checkedValue( ezeProgram ).getSize( ezeProgram ) ) );
			// listOut = siteuserList;
			listOut.update( siteuserList.value() );
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
	
	public void $func_UpdateSiteuser( egltui.data.Siteuser updateRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "UpdateSiteuser" );
		
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
						String $sql = "update EGL.SITEUSER " + "set EGL.SITEUSER.FIRSTNAME = " + "? " + ", EGL.SITEUSER.LASTNAME = " + "? " + ", EGL.SITEUSER.USER_ID = " + "? " + ", EGL.SITEUSER.PASS_WORD = " + "? " + ", EGL.SITEUSER.STREET_ADDRESS = " + "? " + ", EGL.SITEUSER.CITY = " + "? " + ", EGL.SITEUSER.\"STATE\" = " + "? " + ", EGL.SITEUSER.ZIP = " + "? " + ", EGL.SITEUSER.SU_TYPE = " + "? " + ", EGL.SITEUSER.RECEIVE_UPDATES = " + "? " + ", EGL.SITEUSER.JOIN_CLUB = " + "? " + ", EGL.SITEUSER.COMMENTS = " + "? " + "where EGL.SITEUSER.SITEUSER_ID = " + "? ";
						$stmt = $con.getConnection().prepareStatement( $sql );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.Firstname, $stmt, 1, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.Lastname, $stmt, 2, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.UserId, $stmt, 3, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.PassWord, $stmt, 4, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.StreetAddress, $stmt, 5, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.City, $stmt, 6, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.State, $stmt, 7, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setChar( updateRecord.Zip, $stmt, 8, true, java.sql.Types.CHAR );
						com.ibm.javart.sql.SqlHostVars.setInt( updateRecord.SuType, $stmt, 9, true );
						com.ibm.javart.sql.SqlHostVars.setInt( updateRecord.ReceiveUpdates, $stmt, 10, true );
						com.ibm.javart.sql.SqlHostVars.setInt( updateRecord.JoinClub, $stmt, 11, true );
						com.ibm.javart.sql.SqlHostVars.setCharClipped( updateRecord.Comments, $stmt, 12, true, java.sql.Types.VARCHAR, ezeProgram );
						$stmt.setInt( 13, updateRecord.SiteuserId.getValue() );
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
	
	public void $func_UpdateSiteuserList__0$T14efaed26( com.ibm.javart.ref.ContainerArrayRef siteuserList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "UpdateSiteuserList" );
		
		// sz INT;
		int sz = 0;
		// sz = siteuserList.getSize();
		sz = siteuserList.checkedValue( ezeProgram ).getSize( ezeProgram );
		// for ( i From 1 To sz Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp3: for ( ; (i <= sz); i++ )
			{
				// UpdateSiteuser(siteuserList[i], status);
				$func_UpdateSiteuser( ((egltui.data.Siteuser)com.ibm.javart.operations.Subscript.run( ezeProgram, siteuserList.checkedValue( ezeProgram ), i )), status );
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
	
	public void $func_DeleteSiteuser( egltui.data.Siteuser deletionRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "DeleteSiteuser" );
		
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
					String $sql = "delete " + "from EGL.SITEUSER " + "where EGL.SITEUSER.SITEUSER_ID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, deletionRecord.SiteuserId.getValue() );
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
	
	public void $func_DeleteSiteuserList__0$T14efaed26( com.ibm.javart.ref.ContainerArrayRef siteuserList, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "DeleteSiteuserList" );
		
		// sz INT;
		int sz = 0;
		// sz = siteuserList.getSize();
		sz = siteuserList.checkedValue( ezeProgram ).getSize( ezeProgram );
		// for ( i From 1 To sz Increment 1 )
		{
			int i = 0;
			i = (short)1;
			Leze$Temp5: for ( ; (i <= sz); i++ )
			{
				// DeleteSiteuser(siteuserList[i], status);
				$func_DeleteSiteuser( ((egltui.data.Siteuser)com.ibm.javart.operations.Subscript.run( ezeProgram, siteuserList.checkedValue( ezeProgram ), i )), status );
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
	
	public com.ibm.javart.BooleanValue $func_Exists( com.ibm.javart.IntValue SiteuserId ) throws java.lang.Exception
	{
		_funcPush( "Exists" );
		com.ibm.javart.BooleanValue $result = new com.ibm.javart.BooleanItem( "BOOLEAN", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		
		// TRY 
		try
		{
			// Get into SiteuserId;
			{
				java.sql.PreparedStatement $stmt = null;
				com.ibm.javart.sql.JavartResultSet $resultSet = null;
				try
				{
					com.ibm.javart.sql.DbConnection $con = com.ibm.javart.sql.Sql.begin( ezeProgram, "GET", null );
					String $sql = "select SITEUSER_ID "
					+ "from EGL.SITEUSER " + "where SITEUSER_ID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					$stmt.setInt( 1, SiteuserId.getValue() );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( SiteuserId, $results, 1, false, $columns, ezeProgram );
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
	
	public com.ibm.javart.BooleanValue $func_IsValid( egltui.data.Siteuser testRecord ) throws java.lang.Exception
	{
		_funcPush( "IsValid" );
		com.ibm.javart.BooleanValue $result = new com.ibm.javart.BooleanItem( "BOOLEAN", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		
		// RETURN true
		// $result = true;
		$result.setValue( true );
		_funcPop();
		return $result;
	}
	
	public void $func_VerifyUserID( egltui.data.Siteuser searchRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "VerifyUserID" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get searchRecord into searchRecord.SiteuserId, searchRecord.FirstName;
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
					
					String $sql = "select EGL.SITEUSER.SITEUSER_ID, EGL.SITEUSER.FIRSTNAME "
					+ "from EGL.SITEUSER " + "where EGL.SITEUSER.USER_ID = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					com.ibm.javart.sql.SqlHostVars.setChar( searchRecord.UserId, $stmt, 1, true, java.sql.Types.CHAR );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.SiteuserId, $results, 1, false, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Firstname, $results, 2, true, $columns, ezeProgram ) || $truncation;
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
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.SITEUSER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.SITEUSER" ) );
			}
			else
			{
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
			// SysLib.commit();
			ezeProgram.egl__core__SysLib.commit( ezeProgram );
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
	
	public void $func_VerifyUserIDPassword( egltui.data.Siteuser searchRecord, egltui.StatusRec status ) throws java.lang.Exception
	{
		_funcPush( "VerifyUserIDPassword" );
		
		// TRY 
		try
		{
			if ( false )
			{
				com.ibm.javart.util.JavartUtil.beginTry();
			}
			// Get searchRecord into searchRecord.SiteuserId, searchRecord.FirstName;
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
					
					String $sql = "select EGL.SITEUSER.SITEUSER_ID, EGL.SITEUSER.FIRSTNAME "
					+ "from EGL.SITEUSER " + "where EGL.SITEUSER.USER_ID = " + "? " + "and EGL.SITEUSER.PASS_WORD = " + "? ";
					$stmt = $con.getConnection().prepareStatement( $sql );
					com.ibm.javart.sql.SqlHostVars.setChar( searchRecord.UserId, $stmt, 1, true, java.sql.Types.CHAR );
					com.ibm.javart.sql.SqlHostVars.setChar( searchRecord.PassWord, $stmt, 2, true, java.sql.Types.CHAR );
					java.sql.ResultSet $newResults = $stmt.executeQuery();
					$resultSet = new com.ibm.javart.sql.JavartResultSet( 0, $newResults, $con, null, $stmt );
					if ( $resultSet.next( ezeProgram ) )
					{
						boolean $truncation = false;
						java.sql.ResultSet $results = $resultSet.getResultSet();
						int $columns = $results.getMetaData().getColumnCount();
						com.ibm.javart.sql.SqlHostVars.getInt( searchRecord.SiteuserId, $results, 1, false, $columns, ezeProgram );
						$truncation = com.ibm.javart.sql.SqlHostVars.getChar( searchRecord.Firstname, $results, 2, true, $columns, ezeProgram ) || $truncation;
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
				// ConditionHandlingLib.HandleDBRecordNotFound(status, "EGL.SITEUSER");
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleDBRecordNotFound( status, com.ibm.javart.util.ItemFactory.createString( ezeProgram, "tableName", false, "EGL.SITEUSER" ) );
			}
			else
			{
				// ConditionHandlingLib.HandleSuccess(status);
				ezeProgram.egltui__ConditionHandlingLib.$func_HandleSuccess( status );
			}
			// SysLib.commit();
			ezeProgram.egl__core__SysLib.commit( ezeProgram );
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
	
	public void $initSiteuserLib_Lib( SiteuserLib_Lib ezeProgram ) throws java.lang.Exception
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
