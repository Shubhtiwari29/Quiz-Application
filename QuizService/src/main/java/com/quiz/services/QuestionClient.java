package com.quiz.services;

import com.quiz.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8082",value = "Question-Client")
//SINCE WE HAVE USED LOAD BALANCER IN THIS SERVICE SO WE DON'T NEED TO USE THE ABOVE URL AND FORMAT,
//IN CASE OF MULTIPLE INSTANCES ARE UP, THE SERVER WILL IDENTIFY THE SERVICE BASED ON THE SERVICE NAME.
//SO EVEN ANY OF THE INSTANCES IS DOWN, IT WOULDN'T AFFECT THE API CALLS.
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

//

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);
}
