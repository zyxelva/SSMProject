package com.java.mapper;

import com.java.mapper.BlogFriend;

public interface BlogFriendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_friend
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_friend
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    int insert(BlogFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_friend
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    int insertSelective(BlogFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_friend
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    BlogFriend selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_friend
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    int updateByPrimaryKeySelective(BlogFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_friend
     *
     * @mbg.generated Thu Mar 22 11:54:28 CST 2018
     */
    int updateByPrimaryKey(BlogFriend record);
}