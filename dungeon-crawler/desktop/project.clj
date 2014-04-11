(defproject dungeon-crawler "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  
  :dependencies [[com.badlogicgames.gdx/gdx "1.0-SNAPSHOT"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.0-SNAPSHOT"]
                 [com.badlogicgames.gdx/gdx-platform "1.0-SNAPSHOT"
                  :classifier "natives-desktop"]
                 [org.clojure/clojure "1.6.0"]
                 [play-clj "0.3.0-SNAPSHOT"]]
  :repositories [["sonatype"
                  "https://oss.sonatype.org/content/repositories/snapshots/"]]
  
  :source-paths ["src" "src-common"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [dungeon-crawler.core.desktop-launcher]
  :main dungeon-crawler.core.desktop-launcher)
