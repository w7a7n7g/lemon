package com.mossle.cms.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CommentVoter .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "COMMENT_VOTER")
public class CommentVoter implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private CommentInfo commentInfo;

    /** null. */
    private String type;

    /** null. */
    private Date createTime;

    /** null. */
    private String userId;

    /** null. */
    private String ip;

    /** null. */
    private String tenantId;

    public CommentVoter() {
    }

    public CommentVoter(Long id) {
        this.id = id;
    }

    public CommentVoter(Long id, CommentInfo commentInfo, String type,
            Date createTime, String userId, String ip, String tenantId) {
        this.id = id;
        this.commentInfo = commentInfo;
        this.type = type;
        this.createTime = createTime;
        this.userId = userId;
        this.ip = ip;
        this.tenantId = tenantId;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INFO_ID")
    public CommentInfo getCommentInfo() {
        return this.commentInfo;
    }

    /**
     * @param commentInfo
     *            null.
     */
    public void setCommentInfo(CommentInfo commentInfo) {
        this.commentInfo = commentInfo;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 10)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Column(name = "IP", length = 50)
    public String getIp() {
        return this.ip;
    }

    /**
     * @param ip
     *            null.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
