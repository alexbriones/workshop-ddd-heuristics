package com.github.kmruiz.workshops.domain.ad;

public interface AdPublisher extends Ad {
  PublishedAd publish(String text);
}
