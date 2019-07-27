package designpatterns.proxy.virtual

fun main() {
    val icon = ImageProxy("http://my.avatar.net/jpg")
    icon.paintIcon()
}