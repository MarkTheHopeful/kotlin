// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER

// Tests placing enf in other places
// Probably should work, but the implementation is still unstable

class A(val a: String) {
    fun f(enf b: String): String {
        return a + b
    }
}

fun test() {
    val a = A("Hello")
    a.f(b = ", World!")
    a.f(<!POSITIONAL_USED_WITH_ENF!>", World!"<!>)
}

// You cannot combine varargs with named form as for now
