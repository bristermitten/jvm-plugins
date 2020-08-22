(ns clojure-plugin.plugin
  (:gen-class
    :name clojure_plugin.Clojure-plugin
    :extends clojure_plugin.ClojurePlugin)
  (:import (org.bukkit.plugin.java JavaPlugin)
           (clojure_plugin ClojureCommand)))

(set! *warn-on-reflection* true)

(defn -onEnable [^JavaPlugin this]
  (.. this (getLogger) (info "Hello from Clojure!"))
  (.. this (getCommand "clojure") (setExecutor (new ClojureCommand))))

