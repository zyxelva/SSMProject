package com.java.mapper;

import java.util.Date;

public class BlogArticle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.id
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_type
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private Integer articleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_title
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private String articleTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_content
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private String articleContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_info
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private String articleInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_count
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private Integer articleCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_from
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private Integer articleFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_belong
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private Integer articleBelong;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.create_by
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.create_time
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.id
     *
     * @return the value of blog_article.id
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.id
     *
     * @param id the value for blog_article.id
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_type
     *
     * @return the value of blog_article.article_type
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public Integer getArticleType() {
        return articleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_type
     *
     * @param articleType the value for blog_article.article_type
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_title
     *
     * @return the value of blog_article.article_title
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_title
     *
     * @param articleTitle the value for blog_article.article_title
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_content
     *
     * @return the value of blog_article.article_content
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_content
     *
     * @param articleContent the value for blog_article.article_content
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_info
     *
     * @return the value of blog_article.article_info
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public String getArticleInfo() {
        return articleInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_info
     *
     * @param articleInfo the value for blog_article.article_info
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setArticleInfo(String articleInfo) {
        this.articleInfo = articleInfo == null ? null : articleInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_count
     *
     * @return the value of blog_article.article_count
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public Integer getArticleCount() {
        return articleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_count
     *
     * @param articleCount the value for blog_article.article_count
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_from
     *
     * @return the value of blog_article.article_from
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public Integer getArticleFrom() {
        return articleFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_from
     *
     * @param articleFrom the value for blog_article.article_from
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setArticleFrom(Integer articleFrom) {
        this.articleFrom = articleFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_belong
     *
     * @return the value of blog_article.article_belong
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public Integer getArticleBelong() {
        return articleBelong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_belong
     *
     * @param articleBelong the value for blog_article.article_belong
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setArticleBelong(Integer articleBelong) {
        this.articleBelong = articleBelong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.create_by
     *
     * @return the value of blog_article.create_by
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.create_by
     *
     * @param createBy the value for blog_article.create_by
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.create_time
     *
     * @return the value of blog_article.create_time
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.create_time
     *
     * @param createTime the value for blog_article.create_time
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}