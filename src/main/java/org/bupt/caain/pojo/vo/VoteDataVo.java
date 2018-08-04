package org.bupt.caain.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.bupt.caain.pojo.po.Expert;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VoteDataVo {

    private Expert expert;
    private String reason;
    private List<VoteAwardVo> voteAwards;

    public Expert getExpert() {
        return expert;
    }

    public void setExpert(Expert expert) {
        this.expert = expert;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<VoteAwardVo> getVoteAwards() {
        return voteAwards;
    }

    public void setVoteAwards(List<VoteAwardVo> voteAwards) {
        this.voteAwards = voteAwards;
    }
}
