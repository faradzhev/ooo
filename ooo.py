# -*- coding: utf-8 -*-
import sys

alphabet = {
	1: ' ', 2: '0', 3: '1', 4: '2', 5: '3', 6: '4', 7: '5', 8: '6', 9: '7', 10: '8', 
	11: '9', 12: 'a', 13: 'b', 14: 'c', 15: 'd', 16: 'e', 17: 'f', 18: 'g', 19: 'h', 
	20: 'i', 21: 'j', 22: 'k', 23: 'l', 24: 'm', 25: 'n', 26: 'o', 27: 'p', 28: 'q', 
	29: 'r', 30: 's', 31: 't', 32: 'u', 33: 'v', 34: 'w', 35: 'x', 36: 'y', 37: 'z'
}


def ooo_iter(minutes):
	minutes = minutes % 10
	yield alphabet[2]
	yield alphabet[26]
	yield alphabet[2]
	yield alphabet[1]
	yield alphabet[minutes+2]
	yield alphabet[24]

if __name__ == "__main__":
	try:
		if len(sys.argv) > 1:
			minutes = int(sys.argv[1])
		else:
			minutes = 5
	except ValueError as e:
		minutes = 0

	result = "".join([el for el in ooo_iter(minutes)])
	
	if sys.version_info[0] > 2:
		exec("print(result)")
	else:
		exec("print result")
