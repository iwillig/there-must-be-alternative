(ns alternative.main-test
  (:require
   #_[alternative.main :as main]
   [clojure.test :as t]
   #_[matcher-combinators.matchers :as m]
   [matcher-combinators.test]))

(t/deftest test-okay
  (t/testing "testing"
    (t/is (match? {} #{}))))
