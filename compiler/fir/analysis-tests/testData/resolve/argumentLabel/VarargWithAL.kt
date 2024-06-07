// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER

// One cannot use named form with variadic arguments, therefore you cannot directly use argument label with variadic
// But still we need to check that we do not break variadics by introducing labelled arguments

fun withVararg(vararg toSum: Int, startWith initial: Int, multiplyBy mult: Int): Int {
    var sum = initial
    for (item in toSum) {
        sum += item * mult
    }
    return sum
}

fun caller() {
    withVararg(1, 2, 3, 4, multiplyBy = 3, startWith = 10)
}