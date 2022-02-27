@file:JvmName("StringFunctions") //JVM 에 생성될 클래스 이름 지정

package strings

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/*
아래와 같이 생성됨
public final class StringFunctions {
   @NotNull
   public static final String joinToString(@NotNull Collection collection, @NotNull String separator, @NotNull String prefix, @NotNull String postfix) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      Intrinsics.checkNotNullParameter(separator, "separator");
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      Intrinsics.checkNotNullParameter(postfix, "postfix");
      StringBuilder result = new StringBuilder(prefix);
      int index = 0;
 */
