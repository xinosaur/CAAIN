package org.bupt.caain.pojo.po;

public class Expert {

    //    自增主键
    private int id;

    //    专家编号
    private String num;

    //    专家IP
    private String ip;

    //    是否已投票
    private int voted;

    public Expert(String num, String ip, int voted) {
        this.num = num;
        this.ip = ip;
        this.voted = voted;
    }

    public Expert() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getVoted() {
        return voted;
    }

    public void setVoted(int voted) {
        this.voted = voted;
    }

    @Override
    public String toString() {
        return "Expert{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
