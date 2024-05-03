(ns alternative.main
  (:require
   [com.stuartsierra.component :as component]))

(defrecord Database []
  component/Lifecycle
  (start [_self])
  (stop  [_self]))

(defrecord HTTPServer []
  component/Lifecycle
  (start [_self])
  (stop  [_self]))

(defn base-system
  []
  (component/system-map
   :database (->Database)))

(defn dev-system
  [])

(defn test-system
  [])
