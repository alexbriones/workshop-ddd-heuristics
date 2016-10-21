package com.github.kmruiz.workshops.domain;

public class UserImpl implements User {
  private Long id;

  @Override
  public Ad publish(String text) {
    return new PublishedAd(text);
  }
}
