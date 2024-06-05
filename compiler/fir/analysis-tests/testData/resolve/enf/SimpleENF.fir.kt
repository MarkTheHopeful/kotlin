// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER

// Simple tests for the Enforced Named Form feature
// Should work, but the implementation is still unstable

fun fa(enf a: Int) {}

fun fb(enf a: Int, enf b: String) {}

fun fc(a: Int, enf b: Array<String>) {}

fun fd(enf a: Char, b: String) {}

fun gaa() {
    fa(a = 10)
}

fun gab() {
    fa(<!POSITIONAL_USED_WITH_ENF!>10<!>)
}

fun gba() {
    fb(a = 10, b = "Hello")
}

fun gbb() {
    fb(a = 10, <!POSITIONAL_USED_WITH_ENF!>"Hello"<!>)
}

fun gbc() {
    fb(<!POSITIONAL_USED_WITH_ENF!>10<!>, b = "Hello")
}

fun gca() {
    fc(10, b = emptyArray())
}

fun gcb() {
    fc(10, emptyArray<!POSITIONAL_USED_WITH_ENF!>()<!>)
}

fun gda() {
    fd(<!POSITIONAL_USED_WITH_ENF!>'a'<!>, b = "")
}

fun gdb() {
    fd(a = 'a', "")
}

fun gdc() {
    fd(<!POSITIONAL_USED_WITH_ENF!>'a'<!>, "")
}
