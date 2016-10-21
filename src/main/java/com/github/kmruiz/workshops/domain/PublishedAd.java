package com.github.kmruiz.workshops.domain;

public class PublishedAd implements Ad {
  String content;

  public PublishedAd(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
