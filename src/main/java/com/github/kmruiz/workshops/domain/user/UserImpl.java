package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.ad.AdPublisher;
import com.github.kmruiz.workshops.domain.ad.PublishedAd;
import com.github.kmruiz.workshops.domain.ad.PublishedAdImpl;

public class UserImpl implements User, AdPublisher {
  private Long id;

  @Override
  public PublishedAd publish(String text) {
    return new PublishedAdImpl(text);
  }
}
