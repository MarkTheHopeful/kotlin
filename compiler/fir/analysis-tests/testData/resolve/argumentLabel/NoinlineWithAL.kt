// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER -NOTHING_TO_INLINE

// Combining AL with vararg, fails to compile, implementation is yet unstable
// The problem is with the way how I pass the parameters to the proxy function, probably

inline fun withNoinline(noinline label name: () -> Unit) {
    name()
}

fun usingNoinline() {
    withNoinline(label = {})
}
