package main

import (
	"math/rand"
	"strings"
	"time"
)

func main() {
	start := time.Now()
	numbers := []string{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}

	var ooo []string

	for {
		rand := random(0, len(numbers))

		if numbers[rand] == "o" {
			ooo = append(ooo, numbers[rand])
		}

		if len(ooo) == 3 {
			res := strings.Join(ooo, "")
			println(res, " ", time.Now().Sub(start)/1000000000, " minutes")
			break
		}
	}
}

func random(min, max int) int {
	rand.Seed(time.Now().Unix())
	return rand.Intn(max-min) + min
}
