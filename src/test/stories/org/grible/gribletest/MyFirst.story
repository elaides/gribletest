package org.grible.gribletest
import static com.codeborne.selenide.Selenide.open
scenario "Test", {
    then "open google", {
         open("http://google.com")
    }
}