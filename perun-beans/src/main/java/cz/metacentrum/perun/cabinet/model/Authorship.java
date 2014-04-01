package cz.metacentrum.perun.cabinet.model;

import java.io.Serializable;
import java.util.Date;

import cz.metacentrum.perun.core.api.PerunBean;
import cz.metacentrum.perun.core.api.BeansUtils;

/**
 * Class represents Authorship = connection between
 * publication and it's author.
 *
 * @author Jiri Harazim <harazim@mail.muni.cz>
 * @author Pavel Zlamal <256627@mail.muni.cz>
 */
public class Authorship extends PerunBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column REPORT.id
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	private int id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column REPORT.publicationId
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	private Integer publicationId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column REPORT.userId
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	private Integer userId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column REPORT.createdBy
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	private String createdBy;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column REPORT.createdDate
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	private Date createdDate;

	private Integer createdByUid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column REPORT.id
	 *
	 * @return the value of REPORT.id
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public int getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column REPORT.id
	 *
	 * @param id
	 *            the value for REPORT.id
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column REPORT.publicationId
	 *
	 * @return the value of REPORT.publicationId
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public Integer getPublicationId() {
		return publicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column REPORT.publicationId
	 *
	 * @param publicationId
	 *            the value for REPORT.publicationId
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public void setPublicationId(Integer publicationId) {
		this.publicationId = publicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column REPORT.userId
	 *
	 * @return the value of REPORT.userId
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column REPORT.userId
	 *
	 * @param userId
	 *            the value for REPORT.userId
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column REPORT.createdBy
	 *
	 * @return the value of REPORT.createdBy
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column REPORT.createdBy
	 *
	 * @param createdBy
	 *            the value for REPORT.createdBy
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column REPORT.createdDate
	 *
	 * @return the value of REPORT.createdDate
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column REPORT.createdDate
	 *
	 * @param createdDate
	 *            the value for REPORT.createdDate
	 *
	 * @mbggenerated Fri Nov 04 19:37:17 CET 2011
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Integer getCreatedByUid() {
		return createdByUid;
	}

	public void setCreatedByUid(Integer createdByUid) {
		this.createdByUid = createdByUid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/**
	 * Two report instances are equal iff their id is same (and not null)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Authorship other = (Authorship) obj;
		if (other.id != id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+":[id='" + id + "', userId='" + userId + "', publicationId='" + publicationId + "', createdBy='" + createdBy + "', createdDate='" + createdDate + "', createdByUid='" + createdByUid + "']";
	}

	@Override
	public String serializeToString() {
		String dateString;
		if(getCreatedDate() != null) dateString = BeansUtils.DATE_FORMATTER.format(getCreatedDate());
		else dateString = "\\0";
		return this.getClass().getSimpleName() +":[" +
			"id=<" + getId() + ">" +
			", userId=<" + getUserId() + ">" +
			", publicationId=<" + getPublicationId() + ">" +
			", createdBy=<" + (getCreatedBy() == null ? "\\0" : BeansUtils.createEscaping(getCreatedBy())) + ">" +
			", createdDate=<" + dateString + ">" +
			", createdByUid=<" + ((getCreatedByUid() == null) ? "\\0" : getCreatedByUid()) + ">" +
			"]";
	}

}
