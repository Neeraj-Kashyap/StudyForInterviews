package com.telusko.quizapp.dao;

import com.telusko.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// When we use DAO, we mention Repository annotation
@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

    //fetch data and handling it can be done by using JpaRepository

}
