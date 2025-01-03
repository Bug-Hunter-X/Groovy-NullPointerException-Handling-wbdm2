def myMethod(a, b) {
  a = a ?: 0 //default to 0 if a is null
  b = b ?: 0 //default to 0 if b is null
  return a + b
}

println myMethod(5, 6) //11
println myMethod(null, 6) //6
println myMethod(5, null) //5
println myMethod(null, null) //0