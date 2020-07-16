import org.apache.commons.net.util.Base64

fun main(args: Array<String>) {
    var hello_encoded = "SGVsbG8gV29ybGQh".toByteArray()
    var hello = String(Base64.decodeBase64(hello_encoded))
    println(hello)
}
