package com.silverabel.resultsAPI.answer;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class AnswerController {

    private final AnswerRepository repository;

    public AnswerController(AnswerRepository repository) {
        this.repository = repository;
    }

    @MessageMapping("/answers")
    @SendTo("/response/answers")
    public List<Answer> getAnswers() {
        return (List<Answer>) repository.findAll();
    }
}
