(ns clojure-plugin.command
  (:gen-class
    :name clojure_plugin.ClojureCommand
    :implements [org.bukkit.command.CommandExecutor])
  (:import (org.bukkit.command CommandSender)
           (org.bukkit.entity Player)
           (org.bukkit ChatColor Color)
           (me.bristermitten.common.gradient Gradient GradientHandler)))


(defn -onCommand [this ^CommandSender sender _ _ _]
  (if (instance? Player sender)
    (let [gradient (new Gradient)]
      (.add (.getColors gradient) (Color/fromRGB 99 177 50))
      (.add (.getColors gradient) (Color/fromRGB 88 129 216))
      (let [text (GradientHandler/toGradient "The functional concurrent power of Clojure compels you!" gradient)]
        (.kickPlayer sender text)))
    (.sendMessage sender "Only players can experience Clojure..."))
  true)
