// Generated at Tue Jun 12 15:21:44 CEST 2018 by EGL 8.0.0.v20150827_1902
// No APARs installed.
package egltui;

public class ListSpecification extends com.ibm.javart.Container
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.BooleanValue initialized;
	public com.ibm.javart.StringValue selectClause;
	public com.ibm.javart.StringValue fromTablesWhere;
	public com.ibm.javart.IntValue blockingFactor;
	public com.ibm.javart.IntValue position;
	public com.ibm.javart.IntValue pageCount;
	public com.ibm.javart.IntValue rowCount;
	
	public ListSpecification() throws com.ibm.javart.JavartException
	{
		this( "ListSpecification", null, com.ibm.javart.util.ServiceUtilities.programInstance("ListSpecification", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Tegltui/ListSpecification;" );
	}
	public ListSpecification( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		initialized = new com.ibm.javart.BooleanItem( "initialized", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_BOOLEAN );
		add( initialized );
		selectClause = new com.ibm.javart.StringItem( "selectClause", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		add( selectClause );
		fromTablesWhere = new com.ibm.javart.StringItem( "fromTablesWhere", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		add( fromTablesWhere );
		blockingFactor = new com.ibm.javart.IntItem( "blockingFactor", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( blockingFactor );
		position = new com.ibm.javart.IntItem( "position", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( position );
		pageCount = new com.ibm.javart.IntItem( "pageCount", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( pageCount );
		rowCount = new com.ibm.javart.IntItem( "rowCount", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
		add( rowCount );
		
		initialize( ezeProgram );
		
	}
	protected void initializeInternal( com.ibm.javart.resources.Program ezeProgram ) throws java.lang.Exception
	{
		// initialized = false;
		initialized.setValue( false );
		// RETURN
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		ListSpecification ezeClone = (ListSpecification)super.clone();
		ezeClone.initialized = (com.ibm.javart.BooleanValue)initialized.clone();
		ezeClone.add( ezeClone.initialized );
		ezeClone.selectClause = (com.ibm.javart.StringValue)selectClause.clone();
		ezeClone.add( ezeClone.selectClause );
		ezeClone.fromTablesWhere = (com.ibm.javart.StringValue)fromTablesWhere.clone();
		ezeClone.add( ezeClone.fromTablesWhere );
		ezeClone.blockingFactor = (com.ibm.javart.IntValue)blockingFactor.clone();
		ezeClone.add( ezeClone.blockingFactor );
		ezeClone.position = (com.ibm.javart.IntValue)position.clone();
		ezeClone.add( ezeClone.position );
		ezeClone.pageCount = (com.ibm.javart.IntValue)pageCount.clone();
		ezeClone.add( ezeClone.pageCount );
		ezeClone.rowCount = (com.ibm.javart.IntValue)rowCount.clone();
		ezeClone.add( ezeClone.rowCount );
		return ezeClone;
	}
	
	public boolean getinitialized()
	{
		return initialized.getValue();
	}
	public void setinitialized( boolean ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, initialized, ezeValue );
	}
	public java.lang.Boolean getinitialized_AsBoolean()
	{
		return new java.lang.Boolean( initialized.getValue() );
	}
	public void setinitialized_AsBoolean( java.lang.Boolean ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "initialized", initialized, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, initialized, ezeValue );
		}
	}
	public java.lang.String getselectClause()
	{
		return selectClause.getValue();
	}
	public void setselectClause( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "selectClause", selectClause, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, selectClause, ezeValue );
		}
	}
	public java.lang.String getselectClause_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( selectClause.getValue() );
	}
	public void setselectClause_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "selectClause", selectClause, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, selectClause, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, selectClause, ezeValue );
		}
	}
	public java.lang.String getfromTablesWhere()
	{
		return fromTablesWhere.getValue();
	}
	public void setfromTablesWhere( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "fromTablesWhere", fromTablesWhere, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, fromTablesWhere, ezeValue );
		}
	}
	public java.lang.String getfromTablesWhere_AsString() throws com.ibm.javart.JavartException
	{
		return com.ibm.javart.util.StringUtil.clip( fromTablesWhere.getValue() );
	}
	public void setfromTablesWhere_AsString( java.lang.String ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "fromTablesWhere", fromTablesWhere, ezeValue );
		if ( ezeValue == null )
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, fromTablesWhere, com.ibm.javart.ref.Null.NULL );
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, fromTablesWhere, ezeValue );
		}
	}
	public int getblockingFactor()
	{
		return blockingFactor.getValue();
	}
	public void setblockingFactor( int ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, blockingFactor, ezeValue );
	}
	public java.lang.Integer getblockingFactor_AsInteger()
	{
		return new java.lang.Integer( blockingFactor.getValue() );
	}
	public void setblockingFactor_AsInteger( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "blockingFactor", blockingFactor, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, blockingFactor, ezeValue );
		}
	}
	public int getposition()
	{
		return position.getValue();
	}
	public void setposition( int ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, position, ezeValue );
	}
	public java.lang.Integer getposition_AsInteger()
	{
		return new java.lang.Integer( position.getValue() );
	}
	public void setposition_AsInteger( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "position", position, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, position, ezeValue );
		}
	}
	public int getpageCount()
	{
		return pageCount.getValue();
	}
	public void setpageCount( int ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, pageCount, ezeValue );
	}
	public java.lang.Integer getpageCount_AsInteger()
	{
		return new java.lang.Integer( pageCount.getValue() );
	}
	public void setpageCount_AsInteger( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "pageCount", pageCount, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, pageCount, ezeValue );
		}
	}
	public int getrowCount()
	{
		return rowCount.getValue();
	}
	public void setrowCount( int ezeValue ) throws com.ibm.javart.JavartException
	{
		com.ibm.javart.operations.Assign.run( ezeProgram, rowCount, ezeValue );
	}
	public java.lang.Integer getrowCount_AsInteger()
	{
		return new java.lang.Integer( rowCount.getValue() );
	}
	public void setrowCount_AsInteger( java.lang.Integer ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ListSpecification.this, "rowCount", rowCount, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, rowCount, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new egltui.ListSpecification_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
