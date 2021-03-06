/*
Copyright 2010 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */


package com.thoughtworks.selenium.webdriven.commands;

import com.thoughtworks.selenium.webdriven.SeleneseCommand;

import org.openqa.selenium.WebDriver;

public class IsConfirmationPresent extends SeleneseCommand<Boolean> {
  private final AlertOverride alertOverride;

  public IsConfirmationPresent(AlertOverride alertOverride) {
    this.alertOverride = alertOverride;
  }

  @Override
  protected Boolean handleSeleneseCommand(WebDriver driver, String locator, String value) {
    return alertOverride.isConfirmationPresent(driver);
  }
}
