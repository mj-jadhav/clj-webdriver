(defproject clj-webdriver "0.5.0-SNAPSHOT"
  :description "Clojure wrapper around Selenium-WebDriver library"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.seleniumhq.selenium/selenium-server "2.16.0"]
                 [com.opera/operadriver "0.8.1"]
                 [org.clojure/core.cache "0.5.0"]
                 [org.clojure/tools.logging "0.2.3"]]
  :dev-dependencies [[criterium "0.2.0"]
                     [codox "0.3.3"]
                     [marginalia "0.3.2"]
                     [ring "0.3.7"]
                     [enlive "1.0.0"]
                     [net.cgrand/moustache "1.0.0"]])
