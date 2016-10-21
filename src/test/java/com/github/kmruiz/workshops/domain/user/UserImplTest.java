package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.ad.PublishedAdImpl;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserImplTest {

  private UserImpl user;

  @Before public void setUp() throws Exception {
    user = new UserImpl();
  }

  @Test
  public void when_user_publish_ad_then_returns_a_new_published_ad() {
    String text = "texto";
    PublishedAdImpl publishedAd = (PublishedAdImpl) user.publish(text);
    assertThat(publishedAd.getContent()).isEqualTo(text);
  }

}