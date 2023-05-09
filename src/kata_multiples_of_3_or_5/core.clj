(ns kata-multiples-of-3-or-5.core)

(defn divisible-by [num div]
  (zero? (mod num div)))

(defn divisible-by-3-or-5 [num]
  (or (divisible-by num 3)
      (divisible-by num 5)))

(defn solution [number]
  (if (pos-int? number)
    (reduce + (filter divisible-by-3-or-5 (range 1 number)))
    0))

(defn solution [number]
  (if (and (int? number) (pos? number))
    (reduce + (filter divisible-by-3-or-5 (range 1 number)))
    0))
