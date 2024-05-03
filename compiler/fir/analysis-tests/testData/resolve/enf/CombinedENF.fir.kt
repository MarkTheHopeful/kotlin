// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER -NOTHING_TO_INLINE

// Tests combining enf with existing parameter modifiers
// Should work, but the implementation is still unstable

inline fun withNoinline(noinline enf name: () -> Unit) {
    name()
}

fun usingNoinline() {
    withNoinline(name = {})
}

fun usingNoinlinePositional() {
    withNoinline(<!POSITIONAL_USED_WITH_ENF!>{}<!>)
}

// You cannot combine varargs with named form as for now
