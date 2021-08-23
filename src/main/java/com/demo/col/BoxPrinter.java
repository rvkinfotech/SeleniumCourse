package com.demo.col;

public class BoxPrinter<T> {

	 private T val;
	 public BoxPrinter(T arg) {
	 val = arg;
	 }
	 public String toString() {
	 return "[" + val + "]";
	 }
}
