package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.ad.PublishedAd;
import com.github.kmruiz.workshops.domain.ad.PublishedAdImpl;

public class UserImpl implements User {
  private Long id;

  public UserImpl(Long id) {
    this.id = id;
  }

  @Override
  public PublishedAd publish(String text) {
    return new PublishedAdImpl(text);
  }
}
