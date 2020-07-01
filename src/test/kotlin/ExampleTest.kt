import org.junit.jupiter.api.Test

inline fun example() {
    Runnable { println("test") }
}

fun example2(r: () -> Unit) {
    Runnable(r)
}

class ExampleTest {
    @Test
    fun name() {
        println(Class.forName("ExampleTestKt\$example\$1").isAnonymousClass) // prints "true"
        println(Class.forName("ExampleTestKt\$sam\$java_lang_Runnable\$0").isAnonymousClass)
    }
}
