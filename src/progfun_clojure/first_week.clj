(ns progfun_clojure.first_week)

(defn pascal [rows columns]
  "
  Returns the value of a position in the Pascal Triangle given a row and a column
  "
  (if (> columns rows)
    nil
    (loop [rows-copy rows
           columns-copy columns
           acc 1]
      (if (or (= rows-copy columns-copy) (= columns-copy 0) (= rows-copy 0))
        acc
        (recur (dec rows-copy) (dec columns-copy) (/ (* acc rows-copy) columns-copy))))))
