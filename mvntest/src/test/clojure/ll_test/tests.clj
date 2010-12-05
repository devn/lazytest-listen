(ns ll-test.tests
  (:use [lazytest.describe :only (describe it)]
        [ll-test]))

(describe twice "Sample tests"
          (it "can double a positive integer"
              (= 10 (twice 5)))
          (it "can double a negative integer"
              (= -2 (twice -1)))
          (it "can double 0"
              (= 0 (twice 0))))