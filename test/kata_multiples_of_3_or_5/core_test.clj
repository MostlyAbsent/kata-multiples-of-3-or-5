(ns kata-multiples-of-3-or-5.core-test
  (:require [clojure.test :refer :all]
            [kata-multiples-of-3-or-5.core :refer :all]))

(deftest test-input-10
  (is (= 23 (solution 10))))

(deftest test-input-negative
  (is (= 0 (solution (rand-int -50)))))
