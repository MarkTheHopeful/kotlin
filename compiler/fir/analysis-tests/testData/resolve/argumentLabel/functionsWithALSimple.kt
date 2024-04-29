// FIR_IDENTICAL
//  !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -UNUSED_ANONYMOUS_PARAMETER

// Function with AL, should compile, implementation is yet unstable
fun fa(label name: Int) {}

fun fb(label name: Int, secondLabel secondName: String) {}

fun fc(label name: Int, usual: String) {}

fun fd(before: Double, label name: Int) {}

fun ga(outside inside: String): String {
    return inside
}

fun gb(outside inside: String): String {
    return <!UNRESOLVED_REFERENCE!>outside<!>
}

fun ha(outside inside: Int): Int {
    return inside
}

fun hb(regular: Int): Int {
    return ha(outside = regular)
}

fun hc(regular: Int): Int {
    return ha(<!NO_VALUE_FOR_PARAMETER!><!NAMED_PARAMETER_NOT_FOUND!>inside<!> = regular)<!>
}
