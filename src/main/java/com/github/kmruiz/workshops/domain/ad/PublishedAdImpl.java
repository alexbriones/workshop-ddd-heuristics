package com.github.kmruiz.workshops.domain.ad;

public class PublishedAdImpl implements PublishedAd {
  String content;

  public PublishedAdImpl(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
