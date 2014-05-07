(ns progfun-clojure.firs_week_spec
  (:require [progfun_clojure.first_week :refer :all]
            [speclj.core :refer :all]))

(describe "pascal triangle"

  (it "tests if the an incorrect call returns nil"
    (should (nil? (pascal 2 3)))
    (should (nil? (pascal 2 3))))

  (it "tests if the pascal function returns correct numbers"
    (should= 2 (pascal 2 1))
    (should= 3 (pascal 3 1))
    (should= 4 (pascal 4 1))
    (should= 3 (pascal 3 2))))

(run-specs)
