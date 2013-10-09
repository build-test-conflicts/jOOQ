/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookDao extends org.jooq.impl.DAOImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook, java.lang.Integer> {

	/**
	 * Create a new TBookDao without any configuration
	 */
	public TBookDao() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook.class);
	}

	/**
	 * Create a new TBookDao with an attached configuration
	 */
	public TBookDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.ID, value);
	}

	/**
	 * Fetch records that have <code>AUTHOR_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByAuthorId(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>CO_AUTHOR_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByCoAuthorId(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.CO_AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>DETAILS_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByDetailsId(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.DETAILS_ID, values);
	}

	/**
	 * Fetch records that have <code>TITLE IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByTitle(java.lang.String... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.TITLE, values);
	}

	/**
	 * Fetch records that have <code>PUBLISHED_IN IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByPublishedIn(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.PUBLISHED_IN, values);
	}

	/**
	 * Fetch records that have <code>LANGUAGE_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByLanguageId(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.LANGUAGE_ID, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_TEXT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByContentText(java.lang.String... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.CONTENT_TEXT, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_PDF IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TBook> fetchByContentPdf(byte[]... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.CONTENT_PDF, values);
	}
}
