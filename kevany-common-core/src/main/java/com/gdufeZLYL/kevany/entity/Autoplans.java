package com.gdufeZLYL.kevany.entity;

/**
 * @author zzqnxx@foxmail.com
 * @date 2018/10/20 11:07
 */
public class Autoplans {
    public int id;
    public int type;
    public String name;
    public int relateProjId;
    public String description;
    public String content;
    public String different;
    public String maillist;
    public int mailall;
    public int agentType;
    public int istmp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelateProjId() {
        return relateProjId;
    }

    public void setRelateProjId(int relateProjId) {
        this.relateProjId = relateProjId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDifferent() {
        return different;
    }

    public void setDifferent(String different) {
        this.different = different;
    }

    public String getMaillist() {
        return maillist;
    }

    public void setMaillist(String maillist) {
        this.maillist = maillist;
    }

    public int getMailall() {
        return mailall;
    }

    public void setMailall(int mailall) {
        this.mailall = mailall;
    }

    public int getAgentType() {
        return agentType;
    }

    public void setAgentType(int agentType) {
        this.agentType = agentType;
    }

    public int getIstmp() {
        return istmp;
    }

    public void setIstmp(int istmp) {
        this.istmp = istmp;
    }
}
