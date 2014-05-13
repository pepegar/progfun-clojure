(ns progfun-clojure.firs_week_spec
  (:require [progfun_clojure.first_week :refer :all]
            [speclj.core :refer :all]))

(describe "Pascal Triangle"
  (it "tests if the an incorrect call returns nil"
    (should (nil? (pascal 2 3)))
    (should (nil? (pascal 2 3))))

  (it "tests if the pascal function returns correct numbers"
    (should= 2 (pascal 2 1))
    (should= 3 (pascal 3 1))
    (should= 4 (pascal 4 1))
    (should= 3 (pascal 3 2))))

(describe "Balance Characters"
  (it "tests that balancing an unbalanced string returns false"
    (should (false? (balance "(")))
    (should (false? (balance ")")))
    (should (false? (balance ":("))))

  (it "tests that balance on a balanced string returns true"
    (should (true? (balance "((()))")))
    (should (true? (balance "(()(()))")))))

(run-specs)
