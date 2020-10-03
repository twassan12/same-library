package com.pinguuid.mi8;

public class SameImpl implements SameAPI {
  public String initialize() {
    return "nothing to say";
  }

  public String initialize(Long when, String why) {
    return "nothing to say at " + when + " because of " + why;
  }

  public String initialize(Long when, String why, String how) {
    return "nothing to say " + how + " at " + when + " because of " + why;
  }
}
