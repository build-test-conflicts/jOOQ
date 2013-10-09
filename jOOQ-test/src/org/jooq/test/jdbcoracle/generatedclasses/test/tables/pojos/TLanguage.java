/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguage implements org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITLanguage {

	private static final long serialVersionUID = 2045271140;

	private java.lang.String  cd;
	private java.lang.String  description;
	private java.lang.String  descriptionEnglish;
	private java.lang.Integer id;

	public TLanguage() {}

	public TLanguage(
		java.lang.String  cd,
		java.lang.String  description,
		java.lang.String  descriptionEnglish,
		java.lang.Integer id
	) {
		this.cd = cd;
		this.description = description;
		this.descriptionEnglish = descriptionEnglish;
		this.id = id;
	}

	@Override
	public java.lang.String getCd() {
		return this.cd;
	}

	@Override
	public void setCd(java.lang.String cd) {
		this.cd = cd;
	}

	@Override
	public java.lang.String getDescription() {
		return this.description;
	}

	@Override
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	@Override
	public java.lang.String getDescriptionEnglish() {
		return this.descriptionEnglish;
	}

	@Override
	public void setDescriptionEnglish(java.lang.String descriptionEnglish) {
		this.descriptionEnglish = descriptionEnglish;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITLanguage from) {
		setCd(from.getCd());
		setDescription(from.getDescription());
		setDescriptionEnglish(from.getDescriptionEnglish());
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITLanguage> E into(E into) {
		into.from(this);
		return into;
	}
}
