package com.zq.zqbagu.esdao;

import com.zq.zqbagu.model.dto.post.PostEsDTO;
import com.zq.zqbagu.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 题目ES操作
 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

    List<QuestionEsDTO>  findByUserId(Long userId);
}
