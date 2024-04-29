// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER -NOTHING_TO_INLINE

// Function without AL, should just work
fun f() {}

fun fa(a: Int) {}

fun fb(): Int {
    return 3;
}

fun fc(a: Int, b: String, vararg c: Int): Int {
    var sum = 0
    for (ci in c) {
        sum += ci
    }
    return sum;
}

val ff: (test: Int) -> Unit = {}

val fg: ((test: Int) -> Unit) -> Unit = {}

val fh: (((test: Int) -> Unit) -> Unit) -> Unit = {}

val fab: (((<!UNSUPPORTED!>vararg<!> test: Int) -> Unit) -> Unit) -> Unit = {}

inline fun fd(noinline notInlined: () -> Int): Int {
    return notInlined()
}
