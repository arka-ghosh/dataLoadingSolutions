/**
 * @(#) ColumnDefinition.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.cassandra;

import com.squareup.javapoet.TypeName;

/**
 * A Cassandra column definition in Java.
 * 
 * @author Arka Ghosh
 * @since Aug 18, 2015
 * @version 1.0
 */
public class ColumnDefinition
{
	private final String entityFieldName;
	private final String databaseFieldName;
	private final TypeName entityDataType;
	private boolean isPartitionKey = false;
	private Integer partitionKeyOrdinal = null;

	/**
	 * The constructor to instantiate the final fields.
	 * 
	 * @param entityFieldName - the entity field name
	 * @param databaseFieldName - the database field name
	 * @param entityDataType - the entity data type
	 */
	ColumnDefinition(String entityFieldName, String databaseFieldName, TypeName entityDataType)
	{
		this.entityFieldName = entityFieldName;
		this.databaseFieldName = databaseFieldName;
		this.entityDataType = entityDataType;
	}

	/**
	 * Method to access isPartitionKey
	 * 
	 * @return the isPartitionKey
	 */
	public boolean isPartitionKey()
	{
		return isPartitionKey;
	}

	/**
	 * Method to mutate isPartitionKey.
	 * 
	 * @param isPartitionKey the isPartitionKey to set
	 */
	void setPartitionKey(boolean isPartitionKey)
	{
		this.isPartitionKey = isPartitionKey;
	}

	/**
	 * Method to access partitionKeyOrdinal
	 * 
	 * @return the partitionKeyOrdinal
	 */
	public Integer getPartitionKeyOrdinal()
	{
		return partitionKeyOrdinal;
	}

	/**
	 * Method to mutate partitionKeyOrdinal.
	 * 
	 * @param partitionKeyOrdinal the partitionKeyOrdinal to set
	 */
	void setPartitionKeyOrdinal(Integer partitionKeyOrdinal)
	{
		this.partitionKeyOrdinal = partitionKeyOrdinal;
	}

	/**
	 * Method to access entityFieldName
	 * 
	 * @return the entityFieldName
	 */
	public String getEntityFieldName()
	{
		return entityFieldName;
	}

	/**
	 * Method to access databaseFieldName
	 * 
	 * @return the databaseFieldName
	 */
	public String getDatabaseFieldName()
	{
		return databaseFieldName;
	}

	/**
	 * Method to access entityDataType
	 * 
	 * @return the entityDataType
	 */
	public TypeName getEntityDataType()
	{
		return entityDataType;
	}

	/**
	 * hashCode
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((databaseFieldName == null) ? 0 : databaseFieldName.hashCode());
		result = prime * result + ((entityDataType == null) ? 0 : entityDataType.hashCode());
		result = prime * result + ((entityFieldName == null) ? 0 : entityFieldName.hashCode());
		result = prime * result + (isPartitionKey ? 1231 : 1237);
		result = prime * result + ((partitionKeyOrdinal == null) ? 0 : partitionKeyOrdinal.hashCode());
		return result;
	}

	/**
	 * equals
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColumnDefinition other = (ColumnDefinition) obj;
		if (databaseFieldName == null) {
			if (other.databaseFieldName != null)
				return false;
		} else if (!databaseFieldName.equals(other.databaseFieldName))
			return false;
		if (entityDataType == null) {
			if (other.entityDataType != null)
				return false;
		} else if (!entityDataType.equals(other.entityDataType))
			return false;
		if (entityFieldName == null) {
			if (other.entityFieldName != null)
				return false;
		} else if (!entityFieldName.equals(other.entityFieldName))
			return false;
		if (isPartitionKey != other.isPartitionKey)
			return false;
		if (partitionKeyOrdinal == null) {
			if (other.partitionKeyOrdinal != null)
				return false;
		} else if (!partitionKeyOrdinal.equals(other.partitionKeyOrdinal))
			return false;
		return true;
	}

	/**
	 * toString
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("ColumnDefinition [entityFieldName=");
		builder.append(entityFieldName);
		builder.append(", databaseFieldName=");
		builder.append(databaseFieldName);
		builder.append(", entityDataType=");
		builder.append(entityDataType);
		builder.append(", isPartitionKey=");
		builder.append(isPartitionKey);
		builder.append(", partitionKeyOrdinal=");
		builder.append(partitionKeyOrdinal);
		builder.append("]");
		return builder.toString();
	}

}
