package com.silverabel.resultsAPI.voteCount;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class VoteCountController {

    private final VoteCountRepository repository;

    public VoteCountController(VoteCountRepository repository) {
        this.repository = repository;
    }

    @MessageMapping("/votes")
    @SendTo("/response/votes")
    public List<VoteCount> getVotes() {
        return (List<VoteCount>) repository.findAll();
    }
}
