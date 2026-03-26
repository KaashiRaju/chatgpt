package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Reply {

    @Id
    private int replyId;
    private String user;
    private String replyContent;
    private String replyType;
    private String visibility;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article articleObj;   // ✅ KEEP THIS NAME

    public Reply() {}

    public Reply(int replyId, String user, String replyContent,
                 String replyType, String visibility, Article articleObj) {
        this.replyId = replyId;
        this.user = user;
        this.replyContent = replyContent;
        this.replyType = replyType;
        this.visibility = visibility;
        this.articleObj = articleObj;
    }

    public int getReplyId() { return replyId; }
    public void setReplyId(int replyId) { this.replyId = replyId; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getReplyContent() { return replyContent; }
    public void setReplyContent(String replyContent) { this.replyContent = replyContent; }

    public String getReplyType() { return replyType; }
    public void setReplyType(String replyType) { this.replyType = replyType; }

    public String getVisibility() { return visibility; }
    public void setVisibility(String visibility) { this.visibility = visibility; }

    public Article getArticleObj() { return articleObj; }
    public void setArticleObj(Article articleObj) { this.articleObj = articleObj; }
}
