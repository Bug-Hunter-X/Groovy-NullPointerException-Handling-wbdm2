def myMethod(a, b) {
  if (a == null || b == null) {
    return null //this will cause unexpected behavior if not handled properly
  }
  return a + b
}

println myMethod(5, 6) //11
println myMethod(null, 6) //null
println myMethod(5, null) //null
println myMethod(null, null) //null