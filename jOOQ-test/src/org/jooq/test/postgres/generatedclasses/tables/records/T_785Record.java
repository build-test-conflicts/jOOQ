/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String>, org.jooq.test.postgres.generatedclasses.tables.interfaces.IT_785 {

	private static final long serialVersionUID = -443767135;

	/**
	 * Setter for <code>public.t_785.id</code>. 
	 */
	public T_785Record setId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_785.id</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_785.name</code>. 
	 */
	public T_785Record setName(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_785.name</code>. 
	 */
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.t_785.value</code>. 
	 */
	public T_785Record setValue(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_785.value</code>. 
	 */
	@Override
	public java.lang.String getValue() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getValue();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785);
	}

	/**
	 * Create a detached, initialised T_785Record
	 */
	public T_785Record(java.lang.Integer id, java.lang.String name, java.lang.String value) {
		super(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785);

		setValue(0, id);
		setValue(1, name);
		setValue(2, value);
	}
}
