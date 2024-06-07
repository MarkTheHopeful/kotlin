// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER -NOTHING_TO_INLINE

// Combining AL with noinline. Works

inline fun withNoinline(noinline label name: () -> Unit) {
    name()
}

fun usingNoinline() {
    withNoinline(label = {})
}
