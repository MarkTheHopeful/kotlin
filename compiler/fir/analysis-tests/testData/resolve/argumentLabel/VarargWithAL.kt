// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER

// Combining AL with vararg, fails to compile, implementation is yet unstable
// The problem is with the way how I pass the parameters to the proxy function, probably

fun withVararg(vararg label name: Int): Int {
    var sum = 0
    for (item in name) {
        sum += item
    }
    return sum
}