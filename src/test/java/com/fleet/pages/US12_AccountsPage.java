package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_AccountsPage {
    public US12_AccountsPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

@FindBy(xpath = "//i[@class='fa-filter hide-text']")
public WebElement filterButton;


}
