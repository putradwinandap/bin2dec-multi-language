package main

import (
	"fmt"
	"math"
)

func main() {
	var binary string
	fmt.Print("Enter binary number: ")
	fmt.Scanln(&binary)

	if len(binary) == 0 || len(binary) > 8 {
		fmt.Println("Input must be 1–8 digits")
		return
	}

	decimal := 0
	pangkat := len(binary) - 1

	for _, char := range binary {

		if char != '0' && char != '1' {
			fmt.Println("Input can only be 0 and 1")
			return
		}

		digit := int(char - '0')
		decimal += digit * int(math.Pow(2, float64(pangkat)))
		pangkat--
	}

	fmt.Println("Decimal result:", decimal)
}
