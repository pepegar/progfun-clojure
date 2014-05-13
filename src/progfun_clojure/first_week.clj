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

(defn- string-to-value-vector [string]
  "
  returns a value vector containing +1 or -1 values given a string.
  +1 represents '(' and -1 represents ')'
  "
  (map #(if (= \( %) 1 -1) 
       (filter #(or (= \( %) (= \) %)) (vec string))))

(defn balance [characters]
  "
  returns wether a string is balanced on parentheses or not
  "
    (loop [only-parens (string-to-value-vector characters)
           acc 0]
      (if (< acc 0)
        false
        (if (empty? only-parens)
          (= acc 0)
          (recur (rest only-parens) (+ acc (first only-parens)))))))
