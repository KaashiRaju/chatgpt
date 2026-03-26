package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

@Entity
public class Article {

    @Id
    private int articleId;
    private String author;
    private String articleTitle;
    private String articleContent;
    private String articleType;
    private String tag;
    private int likesCount;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<Reply> replyList;

    public Article() {}

    public Article(int articleId, String author, String articleTitle,
                   String articleContent, String articleType,
                   String tag, int likesCount, List<Reply> replyList) {
        this.articleId = articleId;
        this.author = author;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleType = articleType;
        this.tag = tag;
        this.likesCount = likesCount;
        this.replyList = replyList;
    }

    // Getters & Setters
    public int getArticleId() { return articleId; }
    public void setArticleId(int articleId) { this.articleId = articleId; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getArticleTitle() { return articleTitle; }
    public void setArticleTitle(String articleTitle) { this.articleTitle = articleTitle; }

    public String getArticleContent() { return articleContent; }
    public void setArticleContent(String articleContent) { this.articleContent = articleContent; }

    public String getArticleType() { return articleType; }
    public void setArticleType(String articleType) { this.articleType = articleType; }

    public String getTag() { return tag; }
    public void setTag(String tag) { this.tag = tag; }

    public int getLikesCount() { return likesCount; }
    public void setLikesCount(int likesCount) { this.likesCount = likesCount; }

    public List<Reply> getReplyList() { return replyList; }
    public void setReplyList(List<Reply> replyList) { this.replyList = replyList; }
}
