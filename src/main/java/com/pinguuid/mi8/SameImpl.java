package com.pinguuid.mi8;

public class SameImpl implements SameAPI {
  public String init() {
    return "nothing to say";
  }

  public String init(Long when, String why) {
    return "nothing to say at " + when + " because of " + why;
  }

  public String init(Long when, String why, String how) {
    return "nothing to say " + how + " at " + when + " because of " + why;
  }
}
