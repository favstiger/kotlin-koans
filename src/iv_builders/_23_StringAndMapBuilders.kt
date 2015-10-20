package iv_builders

import util.TODO
import java.util.HashSet

fun buildStringExample(): String {
    return buildString {
        this.append("Numbers: ")
        for (i in 1..10) {
            // 'this' can be omitted
            append(i)
        }
    }
}

fun todoTask23(): Nothing = TODO(
    """
        Task 23.
        Uncomment the commented code and make it compile.
        Add and implement function 'buildMap' with one parameter (of type extension function) creating a new HashMap,
        building it and returning it as a result.
        Use MutableMap; look through the syntax/javaCollections.kt file for details.
    """,
    references = { syntax.javaCollections.useMutableSet(HashSet())}
)

fun task23(): Map<Int, String> {
    todoTask23()
//    return buildMap {
//        put(0, "0")
//        for (i in 1..10) {
//            put(i, "$i")
//        }
//    }
}
