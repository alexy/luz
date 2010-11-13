(defproject luz "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.apache.lucene/lucene-core "2.9.1"]
                 [org.mongodb/mongo-java-driver "2.4-SNAPSHOT"]
                 [congomongo "0.1.3-SNAPSHOT"]
                 ]
;  :dev-dependencies [[leiningen/lein-swank "1.1.0"]]
  :namespaces :all
  :main MailIndex)
