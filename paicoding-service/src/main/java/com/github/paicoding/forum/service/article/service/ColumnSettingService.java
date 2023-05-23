package com.github.paicoding.forum.service.article.service;

import com.github.paicoding.forum.api.model.vo.PageVo;
import com.github.paicoding.forum.api.model.vo.article.ColumnArticleReq;
import com.github.paicoding.forum.api.model.vo.article.ColumnReq;
import com.github.paicoding.forum.api.model.vo.article.SearchColumnArticleReq;
import com.github.paicoding.forum.api.model.vo.article.SearchColumnReq;
import com.github.paicoding.forum.api.model.vo.article.dto.ColumnArticleDTO;
import com.github.paicoding.forum.api.model.vo.article.dto.ColumnDTO;
import com.github.paicoding.forum.api.model.vo.article.dto.SimpleColumnDTO;

import java.util.List;

/**
 * 专栏后台接口
 *
 * @author louzai
 * @date 2022-09-19
 */
public interface ColumnSettingService {

    /**
     * 保存专栏
     *
     * @param columnReq
     */
    void saveColumn(ColumnReq columnReq);

    /**
     * 保存专栏文章
     *
     * @param req
     */
    void saveColumnArticle(ColumnArticleReq req);

    /**
     * 专栏文章排序
     *
     * @param columnArticleReqs
     */
    void sortColumnArticle(List<ColumnArticleReq> columnArticleReqs);

    /**
     * 删除专栏
     *
     * @param columnId
     */
    void deleteColumn(Integer columnId);

    /**
     * 删除专栏文章
     *
     * @param id
     */
    void deleteColumnArticle(Integer id);

    /**
     * 通过关键词，从标题中找出相似的进行推荐，只返回主键 + 标题
     *
     * @param key
     * @return
     */
    List<SimpleColumnDTO> listSimpleColumnBySearchKey(String key);

    PageVo<ColumnDTO> getColumnList(SearchColumnReq req);

    PageVo<ColumnArticleDTO> getColumnArticleList(SearchColumnArticleReq req);

}
