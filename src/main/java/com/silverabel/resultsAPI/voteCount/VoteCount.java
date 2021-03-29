package com.silverabel.resultsAPI.voteCount;

import javax.persistence.*;

@Entity
@Table(name = "vote_count")
public class VoteCount {

    @Id
    private Integer answer_id;
    private Long count;

    public VoteCount() {
    }

    public VoteCount(Integer answer_id, Long count) {
        this.answer_id = answer_id;
        this.count = count;
    }

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "VoteCount{" +
                "answer_id=" + answer_id +
                ", count=" + count +
                '}';
    }
}
