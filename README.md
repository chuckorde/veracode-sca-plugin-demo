# Veracode SCA Gradle/Kotlin Demo

This repo contains a basic Kotlin project for demonstrating the Veracode SCA Agent plugin.

```
$ git clone git@github.com:chuckorde/veracode-sca-plugin-demo.git
$ cd veracode-sca-plugin-demo
$ cat src/main/kotlin/main.kt 
import org.apache.commons.net.util.Base64

fun main(args: Array<String>) {
    var hello_encoded = "SGVsbG8gV29ybGQh".toByteArray()
    var hello = String(Base64.decodeBase64(hello_encoded))
    println(hello)
}

$ ./gradlew build
$ java -jar build/libs/veracode-sca-plugin-demo.jar 
Hello World!
```